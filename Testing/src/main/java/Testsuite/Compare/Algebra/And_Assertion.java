package Testsuite.Compare.Algebra;

import java.util.LinkedList;
import java.util.List;

public class And_Assertion implements Assertion{
	private final List<Assertion> andList;
	private boolean duplicates;
	
	public And_Assertion() {
		this.andList = new LinkedList<>();
		duplicates = false;
	}

	public void addAll(List<Assertion> list) {
		for(Assertion assertion : list) 
			duplicates |= andList.contains(assertion);
		andList.addAll(list);
	}
	
	public void add(Assertion assertion) {
		duplicates |= andList.contains(assertion);
		andList.add(assertion);
	}
	
	public void add(And_Assertion assertion) {
		addAll(assertion.andList);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		And_Assertion that = (And_Assertion) o;

		if (duplicates != that.duplicates) return false;
		if(andList != null)
			if(that.andList != null) {
				List<Assertion> check = new LinkedList<>();
				check.addAll(andList);
				check.removeAll(that.andList);
				if(check.size() != 0) return false;
			} else return false; //caso uno null, l'altro no

		return true;
	}

	@Override
	public int hashCode() {
		int result = andList != null ? andList.hashCode() : 0;
		result = 31 * result + (duplicates ? 1 : 0);
		return result;
	}
}
