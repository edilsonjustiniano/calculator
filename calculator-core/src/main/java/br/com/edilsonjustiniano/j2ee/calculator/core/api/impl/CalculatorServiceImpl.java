package br.com.edilsonjustiniano.j2ee.calculator.core.api.impl;

import br.com.edilsonjustiniano.j2ee.calculator.api.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public Integer sum(Integer first, Integer second) {
		System.out.println(first);
		System.out.println(second);
		return first + second;
	}

	@Override
	public Integer subtract(Integer first, Integer second) {
		return first - second;
	}

	@Override
	public Integer multiple(Integer first, Integer second) {
		return first * second;
	}

	@Override
	public Integer divide(Integer first, Integer second) {
		return second != 0 ? first / second : 0;
	}

}
