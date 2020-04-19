package Testsuite.Compare.Algebra;

public class Names_Assertion implements Assertion{
	private final Assertion names;
	
	public Names_Assertion(Assertion names) {
		this.names = names;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Names_Assertion that = (Names_Assertion) o;

		return names != null ? names.equals(that.names) : that.names == null;
	}

	@Override
	public int hashCode() {
		return names != null ? names.hashCode() : 0;
	}
}
