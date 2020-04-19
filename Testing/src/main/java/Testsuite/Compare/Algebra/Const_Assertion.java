package Testsuite.Compare.Algebra;

public class Const_Assertion implements Assertion{
	
	private final Object value;

	public Const_Assertion(Object value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Const_Assertion that = (Const_Assertion) o;

		return value != null ? value.equals(that.value) : that.value == null;
	}

	@Override
	public int hashCode() {
		return value != null ? value.hashCode() : 0;
	}
}
