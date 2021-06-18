package com.report.main.module;

import java.util.Scanner;

public class Staff {
	
	String name;
	String id;
	Income income = new Income();
	
	public Staff(String name, String id, Income income) {
		
		this.name = getNama();
		this.id = getID();
	}
	
	/**
	 * Fungsi untuk input nama Karyawan
	 * 
	 * @return String
	 */
	public String getNama() {
		Scanner input = new Scanner(System.in);
		System.out.println("Silahkan input nama karyawan : ");
		String name = input.next();
		return name;
	}
	
	/**
	 * Fungsi untuk mendapatkan nomor ID Karyawan
	 * 
	 * @return String
	 */
	public String getID() {
		Scanner input2 = new Scanner(System.in);
		System.out.println("Silahkan nomor ID karyawan : ");
		String id = input2.next();
		return id;
	}
	
	/**
	 * Fungsi untuk menghitung total penghasilan
	 * Formula Total Penghasilan = Penghasilan - Penghasilan kena pajak
	 * 
	 * @return double
	 */
	public double calculateNetIncome() {
		double totalNetIncome = income.getAmount() * income.getTotalTax();
		return totalNetIncome;
	}
	
	/**
	 * Fungsi untuk menampilkan info Karyawan
	 * berupa Nama dan ID Karyawan
	 */
	public void displayStaffInfo() {
		System.out.println("Berikut hasil input data income Karyawan");
		System.out.println();
		System.out.println("Nama : " + name);
		System.out.println("ID : " + id);
		System.out.println("----------------------------------------");
	}
	
	/**
	 * Fungsi untuk menampilkan info penghasilan Karyawan
	 * Berupa Jenis Penghasilan, Jumlah Penghasilan, Jumlah penghasilan kena pajak
	 * serta Penghasilan bersih setelah kena pajak
	 */
	public void displayIncomeInfo() {
		System.out.println("Jenis Penghasilan : " + income.getIncomeType());
		System.out.println("Penghasilan yang didapatkan : " + income.getAmount());
		System.out.println("Penghasilan kena pajak : " + income.getTotalTax());
		System.out.println("Penghasilan bersih setelah pajak : " + calculateNetIncome());
	}
}
