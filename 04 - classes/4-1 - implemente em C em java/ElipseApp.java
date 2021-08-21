public class ElipseApp{
    public static void main(String [] args){
        Elipse e1 = new Elipse(10,10,40,40,0,360);
        e1.printe();
    }
}

class Elipse{
    int x,y; //posicao da elpse
    int w,h; //largura e altura respectivamente
    int ai; //angulo de inicio(sentido antihorario)
    int angulo; // angulo que tem elipse em arc
    Elipse(int x,int y,int w, int h, int ai, int angulo){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.ai = ai;
        this.angulo = angulo;
    }
    void printe(){
        System.out.printf("A Elipse de tamanho (%d,%d),na posicao(%d,%d), tendo inicio no angulo(%d) possui (%d) graus",this.w,this.h,this.x,this.y,this.ai,this.angulo);
    }
}
