package Testsuite.Compare.Algebra;


public class NotMof_Assertion implements Assertion {
	private final Object notMof;
	
	public NotMof_Assertion(Object notMof) {
		this.notMof = notMof;
	}

	@Override
	public String toString() {
		return "NotMof_Assertion [" + notMof + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		NotMof_Assertion that = (NotMof_Assertion) o;

		return notMof != null ? notMof.equals(that.notMof) : that.notMof == null;
	}

	@Override
	public int hashCode() {
		return notMof != null ? notMof.hashCode() : 0;
	}
}
