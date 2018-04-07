package dnhthanh.hueic.edu.vn;

public class TinhTong {

	public static float thuchien(float[] a) {
		float S = 0;
		int size = a.length;//kích thước của mảng
		//Viết hàm thực hiện việc cộng các phần tử của mảng a
		for(int i = 0; i < size; i++)
			S+=a[i];
		return S;
	}
}
