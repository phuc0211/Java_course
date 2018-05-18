package dnhthanh.hueic.edu.vn;

public class Round {
	private float R;//Bán kính
	private Point O;//Tâm

	public Round() {
		this.R = Math.round(Math.random()*100);
		this.O = new Point();
	}

	@Override
	public String toString() {
		return "Round{" +
				"R=" + R +
				", O=" + O +
				'}';
	}

	public Round(float r, Point o) {
		R = r;
		O = o;
	}

	public float getR() {
		return R;
	}

	public void setR(float r) {
		R = r;
	}

	public Point getO() {
		return O;
	}

	public void setO(Point o) {
		O = o;
	}
	//Tạo getters và setters cho R và O

	//Xét vị trí tương đối điểm với đường tròn: nếu nằm trong - trả về -1; nếu nằm ngoài - trả về 1; nếu nằm trên - trả về 0
	public int ViTriTuongDoiDiemVoiDuongTron(Point A) {
		if (O.KhoangCach(A) == R)
			return 0;
		else if (O.KhoangCach(A) > R)
			return -1;
		else
			return 1;
	}
}
