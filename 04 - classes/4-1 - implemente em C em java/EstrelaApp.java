public class EstrelaApp{
    public static void main(String[] args){
        Estrela es1 = new Estrela(10,10,40,40,90.0f,2.5f,3.14f,23,41,0.4f);
        es1.printe();
    }
}

class Estrela{
    int x,y; // posicao da estrela
    int w,h;// largura e altura da estrela
    float ainicial;//angulo inicial
    float ainc; //arco inicial
    float pi; // 3,14
    int r1,r2;//circulos auxiliares 
    float raio; //raio
    Estrela(int x, int y, int w, int h, float ainicial, float ainc, float pi, int r1, int r2, float raio){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.ainicial = ainicial;
        this.ainc = ainc;
        this.pi = pi;
        this.r1 = r1;
        this.r2 = r2;
        this.raio = raio;
    }
    void printe(){
        System.out.printf("A Estrela de tamanho (%d,%d),na posicao(%d,%d), tendo inicio no angulo(%f) e (%f), possui pi (%f),com raio de circulos auxiliares de (%d) e (%d) de raio (%f).",this.w,this.h,this.x,this.y,this.ainicial,this.ainc,this.pi,this.r1,this.r2,this.raio);
    }
}