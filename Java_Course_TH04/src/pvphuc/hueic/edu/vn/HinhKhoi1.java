package pvphuc.hueic.edu.vn;

public class HinhKhoi1 extends HinhKhoi {
    protected float chieudai;
    private float getChieudai(){
        return chieudai;
    }
    private void setChieudai(float chieudai){
        this.chieudai=chieudai;
    }
    public HinhKhoi1(){

    }
    public HinhKhoi1( float chieudai, float chieucao){
        this.chieudai = chieudai;
        this.chieucao = chieucao;
    }
    protected float thetich(){
        return chieucao*(chieudai*chieudai);
    }
}
