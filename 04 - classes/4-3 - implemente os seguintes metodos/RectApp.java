public class RectApp {
    public static void main (String[] args) {
        Rect r1 = new Rect(1,1, 10,10); 
        r1.print();
        r1.drag(5,6);
        r1.areaRect();
     }
} 

class Rect {
     int x, y;
     int w, h;

     Rect (int x, int y, int w, int h) {
         this.x = x;
         this.y = y;
         this.w = w;
         this.h = h;
        }

        int areaRect(){
        int area = this.w * this.h;
        System.out.printf("A Area do retangulo e: %d\n",area);
        return area;
        }

    void drag(int dx, int dy){
        //pos atual
        int ax = this.x;
        int ay = this.y;
        //pos depois
        int npx = ax + dx;
        int npy = ay + dy;
        System.out.printf("A nova posicao do retangulo e: (%d,%d)\n",npx,npy);
        }
    
    void print () {
       System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",this.w, this.h, this.x, this.y);
    }
}
