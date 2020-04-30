package Testsuite.Compare.Algebra.ANTLR4;

public class AntlrBoolean implements AntlrValue{

	private final boolean value;
	
	public AntlrBoolean(boolean value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "AntlrBoolean [" + value + "]";
	}

	@Override
	public Boolean getValue() {
		return value;
	}

}
