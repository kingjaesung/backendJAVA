package com.example;

public class Calc2 {
	// 계산 결과 보관을 위한 변수로 초기값을 0으로 설정

	private int result;

	public Calc2() {

		result = 0;
	}

	public Calc2(int num1, int num2, String op) {
		calculate(num1, num2, op);
	}

	public void calculate(int num1, int num2, String op) {

		switch (op) {
		case "+":
			this.result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		}

	}

	public int getResult() {
		return result;
	}

}
