package com.vivek.logicprograms.primenumber;

public class PrimeNumber {
	int number;
	public PrimeNumber() {}
	
	public PrimeNumber(int number) {
		this.number=number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public boolean isPrime() {
		int div=2;
		while(div<number) {
			if(number%div==0) {
				return false;
			}else {
				div++;
			}
		}
		return true;
	}
}
