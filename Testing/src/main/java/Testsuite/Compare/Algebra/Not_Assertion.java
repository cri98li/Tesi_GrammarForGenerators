package Testsuite.Compare.Algebra;

public class Not_Assertion implements Assertion{
	
	private final Assertion not;
	
	public Not_Assertion(Assertion not) {
		this.not = not;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Not_Assertion that = (Not_Assertion) o;

		return not != null ? not.equals(that.not) : that.not == null;
	}

	@Override
	public int hashCode() {
		return not != null ? not.hashCode() : 0;
	}
}
