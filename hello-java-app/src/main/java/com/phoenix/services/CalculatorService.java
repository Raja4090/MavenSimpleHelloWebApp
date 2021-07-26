package com.phoenix.services;

import com.phoenix.math.Calculator;
import com.phoenix.math.Divide;

public class CalculatorService {
	private Calculator  cal;
	private Divide div;
	
	public CalculatorService()
	{
		
	}
	

	public CalculatorService(Calculator cal) {
		super();
		this.cal = cal;
	}

	
	public Divide getDiv() {
		return div;
	}


	public void setDiv(Divide div) {
		this.div = div;
	}


	public CalculatorService(Divide div) {
		super();
		this.div = div;
	}


	public Calculator getCal() {
		return cal;
	}

	public void setCal(Calculator cal) {
		this.cal = cal;
	}

	@Override
	public String toString() {
		return "CalculatorService [cal=" + cal + ", div=" + div + "]";
	}
	
	
	public int addition(int a,int b)
	{
		return cal.add(a, b);
	}
	
	public int div(int a,int d)
	{
		return div.divNumbers(a, d);
	}

}
