package Testsuite.Compare.Algebra;

import java.util.LinkedList;
import java.util.List;

public class Xor_Assertion implements Assertion{
	private final List<Assertion> xorList;
	
	public Xor_Assertion() {
		this.xorList = new LinkedList<>();
	}
	
	public void add(Assertion assertion) {
		xorList.add(assertion);
	}
	
	public void add(Xor_Assertion assertion) {
		addAll(assertion.xorList);
	}
	
	public void addAll(List<Assertion> list) {
		xorList.addAll(list);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Xor_Assertion that = (Xor_Assertion) o;

		return xorList != null ? xorList.equals(that.xorList) : that.xorList == null;
	}

	@Override
	public int hashCode() {
		return xorList != null ? xorList.hashCode() : 0;
	}
}
