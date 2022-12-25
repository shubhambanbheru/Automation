package Interface;

public class AdvanceCalculator implements Calculator,Casio {

	
	@Override
	public void log() {
		System.out.println("Casio Interface:log");
		
	}

	@Override
	public void Tan() {
		System.out.println("Casio Interface:Tan");
		
	}

	@Override
	public void Add() {
		System.out.println("Addition method");
	}

	@Override
	public void Sub() {
		System.out.println("Subtraction method");
	}

	@Override
	public void Mul() {
		System.out.println("Multiplication method");
		
	}

}
