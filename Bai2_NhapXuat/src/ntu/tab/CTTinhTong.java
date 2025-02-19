package ntu.tab;

import java.util.Scanner;

public class CTTinhTong {

	public static void main(String[] args) {
		// In một dòng tiêu đề App
		System.out.print("CT TINH TONG \n");
		
		// chuẩn bị việc nhập
		Scanner banPhim = new Scanner(System.in); //scan từ bàn phím
		
		// In dòng hướng dẫn mời nhập A
		System.out.println("Mời nhập a: ");
		double a = banPhim.nextDouble(); // khai báo biến double (số nguyên)
		System.out.println("Mời nhập b: ");
		double b = banPhim.nextDouble();
		// Tính toán
		double tong = a+ b;
		// xuất kết quả
		System.out.print("Tổng là: ");
		System.out.print(tong);

	}

}
