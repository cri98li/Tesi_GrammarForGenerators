package Testsuite.Compare.Algebra;

public class IfThenElse_Assertion implements Assertion{
	private final Assertion ifStatement;
    private final Assertion thenStatement;
    private final Assertion elseStatement;

	public IfThenElse_Assertion(Assertion ifStatement, Assertion thenStatement, Assertion elseStatement) {
		this.ifStatement = ifStatement;
		this.thenStatement = thenStatement;
		this.elseStatement = elseStatement;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		IfThenElse_Assertion that = (IfThenElse_Assertion) o;

		if (ifStatement != null ? !ifStatement.equals(that.ifStatement) : that.ifStatement != null) return false;
		if (thenStatement != null ? !thenStatement.equals(that.thenStatement) : that.thenStatement != null)
			return false;
		return elseStatement != null ? elseStatement.equals(that.elseStatement) : that.elseStatement == null;
	}

	@Override
	public int hashCode() {
		int result = ifStatement != null ? ifStatement.hashCode() : 0;
		result = 31 * result + (thenStatement != null ? thenStatement.hashCode() : 0);
		result = 31 * result + (elseStatement != null ? elseStatement.hashCode() : 0);
		return result;
	}
}
