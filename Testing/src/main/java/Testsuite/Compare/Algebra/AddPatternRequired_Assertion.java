package Testsuite.Compare.Algebra;

import java.util.LinkedList;
import java.util.List;

public class AddPatternRequired_Assertion implements Assertion{
	@Override
	public String toString() {
		return "AddPatternRequired_Assertion [nameList=" + nameList + ", additionalProperties=" + additionalProperties
				+ "]";
	}

	private List<String> nameList; 
	private Assertion additionalProperties;

	public AddPatternRequired_Assertion() {
		nameList = new LinkedList<>();
	}
	
	public AddPatternRequired_Assertion(List<String> nameList, Assertion additionalProperties) {
		this.nameList = nameList;
		this.additionalProperties = additionalProperties;
	}

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}

	public void setAdditionalProperties(Assertion additionalProperties) {
		this.additionalProperties = additionalProperties;
	}
	
	public void addName(String name) {
		nameList.add(name);
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		AddPatternRequired_Assertion that = (AddPatternRequired_Assertion) o;

		if(additionalProperties != null)
			if(that.additionalProperties != null) {
				List<String> check = new LinkedList<>();
				check.addAll(nameList);
				check.removeAll(that.nameList);
				if(check.size() != 0) return false;
			} else return false; //caso uno null, l'altro no

		return additionalProperties != null ? additionalProperties.equals(that.additionalProperties) : that.additionalProperties == null;
	}

	@Override
	public int hashCode() {
		int result = nameList != null ? nameList.hashCode() : 0;
		result = 31 * result + (additionalProperties != null ? additionalProperties.hashCode() : 0);
		return result;
	}
}
