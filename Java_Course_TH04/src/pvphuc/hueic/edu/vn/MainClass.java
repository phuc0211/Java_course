package pvphuc.hueic.edu.vn;

public class MainClass {
    public static void main(String[] args) {
        HinhKhoi1 A = new HinhKhoi1(11, 4);
        HinhKhoi2 B = new HinhKhoi2(12, 2,3);
        HinhKhoi3 C = new HinhKhoi3(12, 2);
        System.out.println("Thể tích hình khối 1: "+ A.thetich());
        System.out.println("Thể tích hình khối 2: "+ B.thetich());
        System.out.println("Thể tích hình khối 3: "+ C.thetich());
    }
}
