package figuras;

import java.awt.*;


public class Estrela extends Figure{

    public Estrela(int x1, int y1, int w, int h,int rf,int gf,int bf, int rl, int gl,int bl){
        super(x1,y1,w,h,rf,gf,bf,rl,gl,bl); 

    }
    public void print(){
        System.out.println();
    }

    public void paint(Graphics g,boolean focused){
        Graphics2D g2d = (Graphics2D) g;

        double RAIO = 0.6;
        double ainicial = -Math.PI /2.0d;

        int r1 = (int)( RAIO * (this.h +10) );
        int r2 = r1/2;
        double ainc = ( 2.0d * Math.PI ) / 5.0d;
        
        int[] xvet = new int[ 10 ];
        int[] yvet = new int[ 10 ];
                
        for( int i = 0; i < 5; i++ ) {
            double a = ainicial + ( i * ainc );
            double a2 = a + ( ainc / 2.0d );

            xvet[i*2] = (int)( this.x1 + r1 * Math.cos( a ) );
            yvet[i*2] = (int)( this.y1 + r1 * Math.sin( a ) );

            xvet[i*2+1] = (int)( this.x1 + r2 * Math.cos( a2 ) );
            yvet[i*2+1] = (int)( this.y1 + r2 * Math.sin( a2 ) );            
        }
        
        g2d.setColor(new Color(this.rf,this.gf,this.bf));
        g2d.fillPolygon( xvet, yvet, 10 );
        g2d.setColor(new Color(this.rl,this.gl,this.bl));
        g2d.drawPolygon( xvet, yvet, 10 );
    }
}