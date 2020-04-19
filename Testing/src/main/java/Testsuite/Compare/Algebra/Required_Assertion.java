package Testsuite.Compare.Algebra;

import java.util.LinkedList;
import java.util.List;


public class Required_Assertion implements Assertion{
	private final List<String> reqList;
	
	public Required_Assertion() {
		reqList = new LinkedList<>();
	}
	
	public Required_Assertion(List<String> list) {
		this.reqList = list;
	}
	
	public void add(String str) {
		reqList.add(str);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Required_Assertion that = (Required_Assertion) o;

		if(reqList != null)
			if(that.reqList != null) {
				List<String> check = new LinkedList<>();
				check.addAll(reqList);
				check.removeAll(that.reqList);
				if(check.size() != 0) return false;
			} else return false; //caso uno null, l'altro no

		return true;
	}

	@Override
	public int hashCode() {
		return reqList != null ? reqList.hashCode() : 0;
	}
}
