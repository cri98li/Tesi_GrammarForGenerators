package Testsuite.Compare.Algebra;

import java.util.LinkedList;
import java.util.List;

public class Enum_Assertion implements Assertion{

	private final List<Object> _enum;
	
	public Enum_Assertion(List<Object> _enum) {
		this._enum = _enum;
	}

	public Enum_Assertion() {
		_enum = new LinkedList<>();
	}
	
	public void add(Object obj) {
		_enum.add(obj);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Enum_Assertion that = (Enum_Assertion) o;

		if(_enum != null)
			if(that._enum != null) {
				List<Object> check = new LinkedList<>();
				check.addAll(_enum);
				check.removeAll(that._enum);
				if(check.size() != 0) return false;
			} else return false; //caso uno null, l'altro no

		return true;
	}

	@Override
	public int hashCode() {
		return _enum != null ? _enum.hashCode() : 0;
	}
}
