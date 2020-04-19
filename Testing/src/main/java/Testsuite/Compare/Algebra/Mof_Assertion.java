package Testsuite.Compare.Algebra;

public class Mof_Assertion implements Assertion{
	private final Long mof;
	
	public Mof_Assertion(Long mof) {
		this.mof = mof;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Mof_Assertion that = (Mof_Assertion) o;

		return mof != null ? mof.equals(that.mof) : that.mof == null;
	}

	@Override
	public int hashCode() {
		return mof != null ? mof.hashCode() : 0;
	}
}
