package Testsuite.Compare.Algebra;

public class Boolean_Assertion implements Assertion{
	private final boolean value;
	
	public Boolean_Assertion(boolean value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Boolean_Assertion that = (Boolean_Assertion) o;
		return value == that.value;
	}

	public boolean getValue(){return value;}

	@Override
	public int hashCode() {
		return (value ? 1 : 0);
	}
}
