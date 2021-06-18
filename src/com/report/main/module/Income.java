package com.report.main.module;

import java.util.Scanner;

public class Income {
	
	String incomeType;
	double amount;
	double tax;
	double totalTax;
	
	public Income(String incomeType, double amount, double tax, double totalTax) {
		
		this.incomeType = getIncomeType();
		this.amount = getAmount();
		this.tax = getTax();
		this.totalTax = getTotalTax();
		
	}
	
	public String getIncomeType() {
		Scanner input3 = new Scanner(System.in);
		System.out.println("Silahkan input jenis penghasilan karyawan : ");
		String incomeType = input3.next();
		return incomeType;
	}
	
	public double getAmount() {
		Scanner input4 = new Scanner(System.in);
		System.out.println("Silahkan input jumlah penghasilan karyawan : ");
		double amount = input4.nextDouble();
		return amount;
	}
	
	public double getTax() {
		if(amount <= 4170000) {
			tax = 5.0;
		} else {
			tax = 15.0;
		}
		return tax;
	}
	
	public double getTotalTax() {
		totalTax = (tax/100) * amount;
		return totalTax;
	}

}
