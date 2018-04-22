package thanhdnh.hueic.edu.vn;

public class HangHoa {

	private String tenHang;
	private String ngaySanXuat;
	private double donGia;
	private double soLuong;
	//Tiếp tục cho các thuộc tính còn lại

	public String getTenHang() {
		return this.tenHang;
	}

	public void setTenHang(String tenHang) {

		this.tenHang = tenHang;
	}

	public String getNgaySanXuat(){
		return this.getNgaySanXuat();
	}

	public void setNgaySanXuat(String ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}

	public double getDonGia() {
		return this.donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public double getSoLuong() {
		return this.soLuong;
	}

	public void setSoLuong(double soLuong) {
		this.soLuong = soLuong;
	}

	public double tinhTien(){
		double S;
		S = donGia * soLuong ;
		return S;
	}
	public HangHoa() {
	}

	public HangHoa(String tenHang, String ngaySanXuat, double donGia, double soLuong) {
		this.tenHang = tenHang;
		this.ngaySanXuat = ngaySanXuat;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}

	@Override
	public String toString() {
		return(tenHang+ngaySanXuat+donGia+soLuong);
	}
	//Tiếp tục cho các phương thức còn lại
}
