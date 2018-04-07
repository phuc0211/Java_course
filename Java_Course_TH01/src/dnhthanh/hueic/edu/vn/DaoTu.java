package dnhthanh.hueic.edu.vn;

public class DaoTu {
	public static String thuchien(String s) {
		String ns = new String() ;
		//Viết nội dung xử lý xâu s cho ra xâu ns, trong đó ns là xâu đảo từ.
		int dem = 0;
		char a[] = s.toCharArray();
		for (int i =0; i < a.length; i++){
			if(a[i] == ' ' || i == 0 )
				dem++;
		}
		System.out.println(dem);
		return ns;
	}
}
