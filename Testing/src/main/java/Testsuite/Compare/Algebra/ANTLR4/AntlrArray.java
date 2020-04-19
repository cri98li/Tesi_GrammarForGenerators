package Testsuite.Compare.Algebra.ANTLR4;

import java.util.LinkedList;
import java.util.List;

public class AntlrArray implements AntlrValue{
	private final List<Object> list;
	
	public AntlrArray() {
		list = new LinkedList<>();
	}
	
	public void add(AntlrValue value) {
		list.add(value.getValue());
	}

	@Override
	public List<Object> getValue() {
		return list;
	}
}
