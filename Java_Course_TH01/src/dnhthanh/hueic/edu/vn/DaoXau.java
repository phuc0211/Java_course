package dnhthanh.hueic.edu.vn;

import java.util.Arrays;

public class DaoXau {
	public static String thuchien(String s) {
		String ns;
		//Viết nội dung xử lý xâu s cho ra xâu ns, trong đó ns là xâu đảo xâu.
		char[] a = s.toCharArray();
		char[] b = new char[a.length];
		for (int i = a.length -1 ; i >= 0; i--)
		{
			b[i]= a[a.length - 1 - i];
		}
		ns = new String(b);
		return ns;
	}
}
