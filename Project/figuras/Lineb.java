package figuras;

import java.awt.*;

public class Lineb extends Figure{

    public Lineb(int x1, int y1, int w, int h,int rf,int gf,int bf, int rl, int gl,int bl){
        super(x1,y1,w,h,rf,gf,bf,rl,gl,bl);
    }

    public void print () {
        System.out.println();
    }

    public void paint (Graphics g,boolean focused) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        g2d.drawLine(this.x1, this.y1, this.x1+this.w,this.y1+ this.h);
        g2d.setColor(Color.RED);
        g2d.drawLine(this.x1+this.w,this.y1, this.x1, this.y1+ this.h);
        
    }
}