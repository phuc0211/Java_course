package pvphuc.hueic.edu.vn;

public class HinhKhoi2 extends HinhKhoi1 {
    protected float chieurong;

    public float getChieurong(){
        return chieurong;
    }
    public void setChieurong(){
        this.chieurong=chieurong;
    }
    public HinhKhoi2(){

    }
    public HinhKhoi2(float chieurong, float chieudai, float chieucao){
        this.chieurong = chieurong;
        this.chieucao = chieucao;
        this.chieudai = chieudai;
    }

    @Override protected float thetich(){
        return chieucao*chieudai*chieurong;
    }
}
