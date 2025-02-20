package ntu.tab;
import java.util.Scanner;
public class HCN {

	public static void main(String[] args) {
		Scanner banPhim = new Scanner(System.in);
		
		// Nhap chieu dai va rong
		System.out.print("Nhập chiều dài hình chữ nhật: ");
        double chieuD = banPhim.nextDouble();
        
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double chieuR = banPhim.nextDouble();
        
        // Tinh chu vi, dien tich va canh nho
        double chuVi = 2 * (chieuD + chieuR);
        double DT = chieuD * chieuR;
        double canhNho = Math.min(chieuD, chieuR);
        
        // Xuat kq
        System.out.println("\n🔹 Kết quả tính toán:");
        System.out.println("Chu vi hình chữ nhật: " + chuVi);
        System.out.println("Diện tích hình chữ nhật: " + DT);
        System.out.println("Cạnh nhỏ hơn: " + canhNho);
        
        // Dong scanner
        banPhim.close();

	}

}
