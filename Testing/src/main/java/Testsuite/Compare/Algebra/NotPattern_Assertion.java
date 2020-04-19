package Testsuite.Compare.Algebra;


public class NotPattern_Assertion implements Assertion{
	private String notPattern;
	
	public NotPattern_Assertion() {	}

	public NotPattern_Assertion(String pattern) {
		this.notPattern = pattern;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		NotPattern_Assertion that = (NotPattern_Assertion) o;

		return notPattern != null ? notPattern.equals(that.notPattern) : that.notPattern == null;
	}

	@Override
	public int hashCode() {
		return notPattern != null ? notPattern.hashCode() : 0;
	}
}
