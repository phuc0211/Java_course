package pvphuc.hueic.edu.vn;

import java.time.ZoneId;
import java.util.Date;

public class Student {
    public String ma;
    public String hoTen;
    public int namSinh;
    public boolean gioiTinh;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Student() {
    }

    public Student(String ma, String hoTen, int namSinh, boolean gioiTinh) {

        this.ma = ma;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    }

    public int tinhTuoi(){
        return (new Date()).toInstant().atZone(ZoneId.systemDefault()).getYear() - this.getNamSinh();
    }
    @Override
    public String toString() {
        return "Student{" +
                "ma='" + ma + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi =" + this.tinhTuoi() +
                ", gioiTinh=" + (gioiTinh?"nam":"nu") +
                '}' + "\n";
    }
}
