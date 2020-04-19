package Testsuite.Compare.Algebra;


public class Pattern_Assertion implements Assertion {
	private String pattern;

	public Pattern_Assertion() {
	}

	public Pattern_Assertion(String pattern) {
		this.pattern = pattern;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Pattern_Assertion that = (Pattern_Assertion) o;

		return pattern != null ? pattern.equals(that.pattern) : that.pattern == null;
	}

	@Override
	public int hashCode() {
		return pattern != null ? pattern.hashCode() : 0;
	}
}
