package figuras;

import java.awt.*;

public class Rect extends Figure {
    
    public Rect (int x1, int y1, int w, int h,int rf,int gf,int bf, int rl, int gl,int bl) {
        super(x1,y1,w,h,rf,gf,bf,rl,gl,bl);
    }

    public void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x1, this.y1);
    }

    public void paint (Graphics g,boolean focused) {
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setColor(new Color(this.rf,this.gf,this.bf));
        g2d.fillRect(this.x1,this.y1,this.w,this.h);
        g2d.setColor(new Color(this.rl,this.gl,this.bl));
        g2d.drawRect(this.x1,this.y1, this.w,this.h);

    }
}