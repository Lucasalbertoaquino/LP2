package figuras;

import java.awt.*;
import java.util.Arrays;

public class Triangulo extends Figure{

    public Triangulo(int x1,int y1,int w,int h,int rf,int gf,int bf,int rl,int gl,int bl){
        super(x1,y1,w,h,rf,gf,bf,rl,gl,bl);
        
    }
    public void print(){
        System.out.format("Triangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x1, this.y1);
    }

    public void paint(Graphics g,boolean focused){
        Graphics2D g2d = (Graphics2D) g;

        int [] x ={this.w/2+this.x1,this.x1,this.w+this.x1};
        int [] y ={this.y1,this.y1+this.h,this.y1+this.h};

        g2d.setColor(new Color(this.rf,this.gf,this.bf));
        g2d.fillPolygon(x,y,3);
        g2d.setColor(new Color(this.rl,this.gl,this.bl));
        g2d.drawPolygon(x,y,3);
    }
}