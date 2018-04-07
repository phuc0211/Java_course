package dnhthanh.hueic.edu.vn;

import java.util.Scanner;

public class GPT {

	public static void thuchien(float a, float b, float c) {
		//Viết nội dung giải phương trình bậc 2 vào đây
		float delta;
		float x,x1,x2;
		delta = b*2-4*a*c;
		if (a==0) {
			if (b==0){
				if (c==0)
					System.out.println("chuong trinh vo so nghiem");
				else
					System.out.println("phuong trinh vo nghiem");
			}else{
				x = (-c)/b;
				System.out.println("phuong trinh co 1 nghiem x= " + x);
			}
		}else {
			if(delta>0) {
				delta = b * 2 - 4 * a * c;
				if (delta < 0){
					System.out.println("phuong trinh vo nghiem ");
				}
				if(delta > 0){
					System.out.println("phuong trinh co 2 nghiem");
					System.out.println();
					System.out.println();
				}


			}
		}
	}
}
