package ntu.tab;

public class SanPham {
	// Dinh nghia cac thuoc tinh
	int maSP;
	String tenSP;
	String loaiSP;
	String anhSP; // ten file anh
	// Ham tao
	public SanPham() {
		// khoi tao gias tri ban dau cua thuoc tinh neu co
	}
	
//	public SanPham(int maSP, String tenSP, String loaiSP, String anhSP) {
//		// khoi tao gias tri ban dau cua thuoc tinh neu co
//		maSP = maSP;
//		tenSP = tenSP;
//		loaiSP = loaiSP;
//		anhSP = anhSP;
//	}
	
	public SanPham(int maSP, String tenSP, String loaiSP, String anhSP) {
		// khoi tao gias tri ban dau cua thuoc tinh neu co
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.loaiSP = loaiSP;
		this.anhSP = anhSP;
	}
	
	// cac getter/setter
	public int getMaSP() {
		return maSP;
	}
	public void setMaSP(int maSP) {
		this.maSP = maSP;
	}

}
