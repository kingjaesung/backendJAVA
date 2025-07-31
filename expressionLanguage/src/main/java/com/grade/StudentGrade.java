package com.grade;

public class StudentGrade {

	
	private double average;
	
	public void setAverage(double ...num) {
		// ...num은 double 타입의 값을 여러개 받을 수 있다는 뜻
		if (num == null) return;
		double sum = 0;
		for (int i = 0; i<num.length; i++) {
			sum += num[i];
		}
		average = sum / (int)num.length;
	}
	
	public double getAverage() {
		return average;
	}
}
