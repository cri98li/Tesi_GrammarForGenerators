package Testsuite.Compare.Algebra;


public class Ref_Assertion implements Assertion{
	private final String ref;
	
	public Ref_Assertion(String ref) {
		this.ref = ref;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Ref_Assertion that = (Ref_Assertion) o;

		return ref != null ? ref.equals(that.ref) : that.ref == null;
	}

	@Override
	public int hashCode() {
		return ref != null ? ref.hashCode() : 0;
	}
}
