package Testsuite.Compare.Algebra;

import java.util.LinkedList;
import java.util.List;

public class Or_Assertion implements Assertion{
	private final List<Assertion> orList;
	
	public Or_Assertion() {
		this.orList = new LinkedList<>();
	}
	
	public void add(Assertion assertion) {
		orList.add(assertion);
	}
	
	public void add(Or_Assertion assertion) {
		addAll(assertion.orList);
	}
	
	public void addAll(List<Assertion> list) {
		orList.addAll(list);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Or_Assertion that = (Or_Assertion) o;

		if(orList != null)
			if(that.orList != null) {
				List<Assertion> check = new LinkedList<>();
				check.addAll(orList);
				check.removeAll(that.orList);
				if(check.size() != 0) return false;
			} else return false; //caso uno null, l'altro no

		return true;
	}

	@Override
	public int hashCode() {
		return orList != null ? orList.hashCode() : 0;
	}
}
