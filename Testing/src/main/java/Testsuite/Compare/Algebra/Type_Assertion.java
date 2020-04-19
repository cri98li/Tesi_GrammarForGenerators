package Testsuite.Compare.Algebra;

import java.util.LinkedList;
import java.util.List;


public class Type_Assertion implements Assertion{
	private final List<String> types;
	
	public Type_Assertion() {
		types = new LinkedList<>();
	}
	
	public void add(String toAdd) {
		types.add(toAdd);
	}

	@Override
	public String toString() {
		return "Type_Assertion [" + types + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Type_Assertion that = (Type_Assertion) o;

		if(types != null)
			if(that.types != null) {
				List<String> check = new LinkedList<>();
				check.addAll(types);
				check.removeAll(that.types);
				if(check.size() != 0) return false;
			} else return false; //caso uno null, l'altro no

		return true;
	}

	@Override
	public int hashCode() {
		return types != null ? types.hashCode() : 0;
	}
}
  