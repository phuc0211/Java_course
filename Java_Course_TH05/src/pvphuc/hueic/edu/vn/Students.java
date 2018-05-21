package pvphuc.hueic.edu.vn;

import java.util.ArrayList;

public class Students implements IHuman {
    ArrayList<Student> students = new ArrayList<>();
    public ArrayList<Student> getStudents(){
        return students;
    }
    public void setStudents(ArrayList<Student>  students){
        this.students = students;
    }
    @Override
    public  Object TimKiem(int from, int to) {
        ArrayList <Student> arrst = new ArrayList<>();
        for ( Student st : students )
        {
            if (st.tinhTuoi() >= from && st.tinhTuoi() <= to)
            {
                arrst.add(st);
            }
        }
        return arrst;
    }

    @Override
    public Object TimKiem(boolean gt) {
        ArrayList <Student> arrst = new ArrayList<>();
        for (Student st : students)
        {
            if (st.gioiTinh == gt)
            {
                arrst.add(st);
            }
        }
        return arrst;
    }

    @Override
    public Object TimKiem(String ten) {
        ArrayList <Student> arrst = new ArrayList<>();
        for (Student st : students)
        {
            if (st.getHoTen().indexOf(ten) >= 0)
            {
                arrst.add(st);
            }
        }
        return arrst;
    }

    @Override
    public String toString() {
        return "Students{" +
                "students=" + students + "\n" +
                '}';
    }
}
