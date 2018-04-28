package pvphuc.hueic.edu.vn;

public class HinhKhoi3 extends HinhKhoi {

    private float bankinh;

    public float getBankinh(){
        return bankinh;
    }
    public void setBankinh(){
        this.bankinh=bankinh;
    }
    public HinhKhoi3(){

    }
    public HinhKhoi3( float bankinh, float chieucao){
        this.bankinh=bankinh;
        this.chieucao=chieucao;
    }
    protected float thetich(){
        return chieucao * 3.14f *( bankinh*bankinh);
    }
}
