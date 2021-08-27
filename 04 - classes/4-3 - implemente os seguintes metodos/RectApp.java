public class RectApp {
    public static void main (String[] args) {
        Rect r1 = new Rect(1,1, 10,10);
        //r1.print();
        int x;
        r1.drag(5,6);
        //r1.areaRect();
        x = r1.areaRect();
        r1.print();
        System.out.printf("Area do retangulo: %d",x);
     }
} 

class Rect {
     int x, y;
     int w, h;
     //int areaT;
     int nposx, nposy;

     Rect (int x, int y, int w, int h) {
         //cosntrutor e set
         this.x = x;
         this.y = y;
         this.w = w;
         this.h = h;
        }
        /*void setAreaRect(int a){
            this.areaT = a;
        }*/
        void setNpos(int x, int y){
            this.nposx = x;
            this.nposy = y;
        }


        public int areaRect(){
            int area = this.w * this.h;
            //setAreaRect(area);
            return area;
        }

        void drag(int dx, int dy){
            //pos atual
            int ax = this.x;
            int ay = this.y;
            //pos depois
            int npx = ax + dx;
            int npy = ay + dy;
            setNpos(npx,npy);
        }
    
        void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",this.w, this.h, this.x, this.y);
        //System.out.printf("A Area do retangulo e: %d\n",this.areaT);
        System.out.printf("A nova posicao do retangulo e: (%d,%d)\n",nposx,nposy);
    }
}
