package pvphuc.hueic.edu.vn;

import java.time.ZoneId;
import java.util.Date;

public class Employer {
    public String ma;
    public String hoten;
    public int namsinh;
    public boolean gioitinh;
    public double hsl;

    @Override
    public String toString() {
        return "Employer{" +
                "ma='" + ma + '\'' +
                ", hoten='" + hoten + '\'' +
                ", tuoi =" + this.TinhTuoi() +
                ", gioitinh=" + (gioitinh?"nam":"nu") +
                ", luong = " + this.TinhLuong() +
                '}' + "\n";
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public double getHsl() {
        return hsl;
    }

    public void setHsl(double hsl) {
        this.hsl = hsl;
    }

    public Employer() {

    }

    public Employer(String ma, String hoten, int namsinh, boolean gioitinh, double hsl) {

        this.ma = ma;
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.gioitinh = gioitinh;
        this.hsl = hsl;
    }
    public double TinhLuong(){
        return hsl * 1250000;
    }
    public int TinhTuoi(){
        return (new Date()).toInstant().atZone(ZoneId.systemDefault()).getYear() - this.getNamsinh();

    }
}
