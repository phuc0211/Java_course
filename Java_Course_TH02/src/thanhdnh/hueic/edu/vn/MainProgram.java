package thanhdnh.hueic.edu.vn;

import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		HangHoa hh = new HangHoa();
		KhachHang kh = new KhachHang();
		//Tiếp tục với các yêu cầu của đề bài
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		String a;
		String b;
		int n;
		String c,d;
		double e,f;
		System.out.println("Mời nhập tài khoản");
		a = sc.nextLine();
		System.out.println("Mời nhập mật khẩu");
		b = sc.nextLine();
		if(a.equals(kh.getUsername()) && b.equals(kh.getPassword())){
			do {
				System.out.println("bạn mua gì không ?");
				System.out.println("1.có");
				System.out.println("2.không");
				n = sc.nextInt();
				if (n==1) {
					System.out.println("nhập tên hàng: ");
					c = sc1.nextLine();
					System.out.println("Ngày sản xuất: ");
					d = sc1.nextLine();
					System.out.println("Đơn giá: ");
					e= sc1.nextDouble();
					System.out.println("Số lượng: ");
					f = sc1.nextDouble();
					System.out.println("tên hàng : " + c + "\n" + "ngày sản xuất : " + d +"\n"+ "đơn giá : " + e + "\n"+"số lượng : " + f +"\n"+ "Tổng tiền = " + ( e * f ) );
				}
				else
					if(n==2 )
					System.out.println("hẹn gặp lại ^^");
				else
					if(n!=1 || n!=2)
						System.out.println("chọn 1 hoặc 2");

			}while (n!=2);

		}else
			System.out.println("tài khoản hoặc mật khẩu không đúng!");


		
	}

}
