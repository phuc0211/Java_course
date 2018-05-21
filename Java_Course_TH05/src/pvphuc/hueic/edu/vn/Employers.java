package pvphuc.hueic.edu.vn;

import java.util.ArrayList;

public class Employers implements IHuman{
    ArrayList <Employer> arremployer = new ArrayList<>();

    public ArrayList<Employer> getArremployer() {
        return arremployer;
    }

    public void setArremployer(ArrayList<Employer> arremployer) {
        this.arremployer = arremployer;
    }

    @Override
    public Object TimKiem(int from, int to) {
        return null;
    }

    @Override
    public Object TimKiem(boolean gt) {
        return null;
    }

    @Override
    public Object TimKiem(String ten) {
        return null;
    }
    public Object TimKiem(double luong1, double luong2)
    {
        ArrayList<Employer> arremp = new ArrayList<>();
        for (Employer emp : arremployer)
        {
            if (emp.TinhLuong() >= luong1 && emp.TinhLuong() <= luong2)
                arremp.add(emp);
        }
        return arremp;
    }

}
