package ntu.tab;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		// Scan tu ban phim
		Scanner banPhim = new Scanner(System.in); 
		
		// Nhap canh khoi lap phuong
		System.out.print("Nhập độ dài cạnh của khối lập phương: ");
        double canh = banPhim.nextDouble();
        
        // Tinh the tich (V = a^3)
        double theTich = Math.pow(canh, 3);
        
        // Xuat kq
        System.out.println("\nKết quả tính toán:");
        System.out.println("Thể tích của khối lập phương: " + theTich);
        
        // Dong scanner
        banPhim.close();

	}

}
