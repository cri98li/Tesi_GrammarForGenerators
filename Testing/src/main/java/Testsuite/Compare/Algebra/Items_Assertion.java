package Testsuite.Compare.Algebra;

import java.util.LinkedList;
import java.util.List;

//TODO: pensare ad items di jsonObject
public class Items_Assertion implements Assertion{

	private List<Assertion> itemsArray;
	private Assertion additionalItems;
	
	public Items_Assertion() {
	}

	public Items_Assertion(List<Assertion> itemsArray, Assertion additionalItems) {
		this.itemsArray = itemsArray;
		this.additionalItems = additionalItems;
	}

	public void add(Assertion assertion) {
		if(itemsArray == null) itemsArray = new LinkedList<>();
		itemsArray.add(assertion);
	}

	public void setAdditionalItems(Assertion additionalItems) {
		this.additionalItems = additionalItems;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Items_Assertion that = (Items_Assertion) o;

		if(itemsArray != null)
			if(that.itemsArray != null) {
				List<Assertion> check = new LinkedList<>();
				check.addAll(itemsArray);
				check.removeAll(that.itemsArray);
				if(check.size() != 0) return false;
			} else return false; //caso uno null, l'altro no
		return additionalItems != null ? additionalItems.equals(that.additionalItems) : that.additionalItems == null;
	}

	@Override
	public int hashCode() {
		int result = itemsArray != null ? itemsArray.hashCode() : 0;
		result = 31 * result + (additionalItems != null ? additionalItems.hashCode() : 0);
		return result;
	}
}
