package Testsuite.Compare.Algebra;


public class ExName_Assertion implements Assertion{
	private final Assertion names;
	
	public ExName_Assertion(Assertion names) {
		this.names = names;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		ExName_Assertion that = (ExName_Assertion) o;

		return names != null ? names.equals(that.names) : that.names == null;
	}

	@Override
	public int hashCode() {
		return names != null ? names.hashCode() : 0;
	}
}
