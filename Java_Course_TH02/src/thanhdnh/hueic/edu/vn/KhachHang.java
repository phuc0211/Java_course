package thanhdnh.hueic.edu.vn;

public class KhachHang {
	private String username;
	private String password;
	//Tiếp tục cho các thuộc tính khác

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {

		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public void muaHang(String tenHang, String ngaySanXuat, double soLuong, double donGia){
		HangHoa hh= new HangHoa();
		hh.setTenHang(tenHang);
		hh.setNgaySanXuat(ngaySanXuat);
		hh.setSoLuong(soLuong);
		hh.setDonGia(donGia);
		hh.tinhTien();
	}

	public KhachHang() {
		username = "123";
		password = "123";
	}

	public KhachHang(String username, String password) {
		this.username = username;
		this.password = password;
	}
	//Tiếp tục cho các phương thức khác
}
