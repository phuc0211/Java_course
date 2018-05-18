package dnhthanh.hueic.edu.vn;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		int numP = 5;//Số lượng điểm
		int numR = 3;//Số lượng đường tròn
		ArrayList<Point> points = new ArrayList<Point>();//Danh sách điểm
		ArrayList<Round> rounds = new ArrayList<Round>();//Danh sách đường tròn

		//Tạo một danh sách điểm
		for(int i=0; i<numP; i++)
			points.add(new Point());
		//Tạo một danh sách đường tròn
		for(int i=0; i<numR; i++)
			rounds.add(new Round());
		//Gọi phương thức xét vị trí tương đối
		for (int i = 0; i < numR; i++)
		{
			for (int j = 0; j < numP; j++)
			{
				int kq;
				kq = rounds.get(i).ViTriTuongDoiDiemVoiDuongTron(points.get(j));
				if (kq == 1)
				{
					System.out.println("Điểm " + j + " nằm trong đường tròn " + i);
				}else if (kq == 0)
				{
					System.out.println("Điểm " + j + " nằm trên đường tròn " + i);
				}else {
					System.out.println("Điểm " + j + " nằm ngoài đường tròn " + i);
				}
			}
		}
	}

}
