package ntu.tab;
import java.util.Scanner;
public class DTB {

	public static void main(String[] args) {
		// Scan tu ban phim
		Scanner banPhim = new Scanner(System.in);
		
		// Nhap ho và ten sinh vien
        System.out.print("Nhập họ và tên sinh viên: ");
        String fullName = banPhim.nextLine();
        
        // Nhap diem trung binh
        System.out.print("Nhập điểm trung bình: ");
        double diemTP = banPhim.nextDouble();
        
        // Xuat
        System.out.println("\nThông tin sinh viên:");
        System.out.println("Họ và tên: " + fullName);
        System.out.println("Điểm trung bình: " + diemTP);
        
        // Dong scanner
        banPhim.close();

	}

}
