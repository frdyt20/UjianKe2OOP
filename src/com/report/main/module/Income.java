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
	
	/**
	 * Fungsi untuk mendapatkan jenis penghasilan
	 * 
	 * @return String
	 */
	public String getIncomeType() {
		Scanner input3 = new Scanner(System.in);
		System.out.println("Silahkan input jenis penghasilan karyawan : ");
		String incomeType = input3.next();
		return incomeType;
	}
	
	/**
	 * Fungsi untuk mendapatkan jumlah penghasilan kotor
	 * 
	 * @return double
	 */
	public double getAmount() {
		Scanner input4 = new Scanner(System.in);
		System.out.println("Silahkan input jumlah penghasilan karyawan : ");
		double amount = input4.nextDouble();
		return amount;
	}
	
	/**
	 * Fungsi untuk mendapatkan persentase pajak penghasilan
	 * 
	 * @return double
	 */
	public double getTax() {
		if(amount <= 4170000) {
			tax = 5.0;
		} else {
			tax = 15.0;
		}
		return tax;
	}
	
	/**
	 * Fungsi untuk mendapatkan jumlah penghasilan kena pajak
	 * 
	 * @return double
	 */
	public double getTotalTax() {
		totalTax = (tax/100) * amount;
		return totalTax;
	}

}
