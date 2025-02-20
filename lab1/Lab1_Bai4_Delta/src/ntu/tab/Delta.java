package ntu.tab;

import java.util.Scanner;

public class Delta {

	public static void main(String[] args) {
		// Scan tu ban phim
		Scanner banPhim = new Scanner(System.in);
		
		// Nhap he so pt bac 2: ax^2 + bx + c = 0
		System.out.print("Nhập hệ số a: ");
        double a = banPhim.nextDouble();
        
        System.out.print("Nhập hệ số b: ");
        double b = banPhim.nextDouble();
        
        System.out.print("Nhập hệ số c: ");
        double c = banPhim.nextDouble();
        
        // Delta = b^2 - 4ac
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        // Tinh can delta (neu delta ko am)
        double sqrtDelta = delta >= 0 ? Math.sqrt(delta) : Double.NaN;
        
        // Xuat kq
        System.out.println("\nKết quả tính toán:");
        System.out.println("Giá trị của delta: " + delta);
        
        if (delta >= 0) {
            System.out.println("Căn delta: " + sqrtDelta);
        } else {
            System.out.println("Delta âm, không thể tính căn delta!");
        }
        
        // Dong scanner
        banPhim.close();

	}

}
