package Testsuite.Compare.Algebra.ANTLR4;

public class AntlrDouble implements AntlrValue{
	private final Double value;
	
	public AntlrDouble(Double value) {
		this.value = value;
	}

	@Override
	public Object getValue() {
		return value;
	}

}
