package pvphuc.hueic.edu.vn;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        ArrayList<Student> arrStudent = new ArrayList<>();
        ArrayList<Employer> arrEmployer = new ArrayList<>();
        arrStudent.add(new Student("01", "Nguyen Van A", 1997, true));
        arrStudent.add(new Student("02", "Nguyen Van B", 1996, false));
        arrStudent.add(new Student("03", "Nguyen Van C", 1995, true));
        arrStudent.add(new Student("04", "Nguyen Van D", 1994, true));
        arrStudent.add(new Student("05", "Nguyen Van CC", 1990, false));
        Students stds = new Students();
        stds.setStudents(arrStudent);
//        System.out.println(stds);
        arrEmployer.add(new Employer("01", "Nguyen Van A", 1999, true, 5));
        arrEmployer.add(new Employer("02", "Nguyen Van B", 1998, false, 10));
        arrEmployer.add(new Employer("03", "Nguyen Van C", 1997, true, 7));
        arrEmployer.add(new Employer("04", "Nguyen Van D", 1994, false, 5));
        arrEmployer.add(new Employer("05", "Nguyen Van E", 1999, true, 5));
        Employers emp = new Employers();
        emp.setArremployer(arrEmployer);
        int chon;
        do {
            System.out.println("-------------------------------");
            System.out.println("1.Tìm sinh viên theo tên");
            System.out.println("2.Tìm sinh viên theo giới tính");
            System.out.println("3.Tìm sinh viên theo tuổi");
            System.out.println("4.Lọc nhân viên theo lương ");
            System.out.println("5.Thoát");
            System.out.println("-------------------------------");
            chon = sc.nextInt();
            switch (chon)
            {
                case 1 :
                    System.out.println("Nhập tên");
                    String ten;
                    ten = sc1.nextLine();
                    System.out.println("những sinh viên có tên được tìm kiếm là ");
                    System.out.println(stds.TimKiem(ten));
                    break;
                case 2 :
                    System.out.println("1.Nam");
                    System.out.println("2.Nu");
                    boolean gt = true;
                    int chon1;
                    chon1 = sc.nextInt();
                    switch (chon1)
                    {
                        case 1 :
                            gt = true;
                            break;
                        case 2 :
                            gt = false;
                            break;
                        default:
                            System.out.println("Sai");
                            break;
                    }
                    System.out.println("Những sinh viên có giới tính được chọn là");
                    System.out.println(stds.TimKiem(gt));
                    break;
                case 3 :
                    System.out.println("Nhập Khoảng tuổi");
                    int from, to;
                    System.out.println("Từ");
                    from = sc.nextInt();
                    System.out.println("Đến");
                    to = sc.nextInt();
                    System.out.println("Những sinh viên có khoảng tuổi từ " + from + " đến " + to +" là ");
                    System.out.println(stds.TimKiem(from,to));
                    break;
                case 4 :
                    System.out.println("Nhập lương");
                    double luong1, luong2;
                    System.out.println("từ");
                    luong1 = sc.nextDouble();
                    System.out.println("đến");
                    luong2 = sc.nextDouble();
                    System.out.println("những nhân viên có số lương từ " + luong1 + " đến " + luong2 + " là ");
                    System.out.println(emp.TimKiem(luong1, luong2));
                    break;
                default:
                    System.out.println("Nhập Sai");
                    break;

            }
        }while (chon != 5);
    }
}

