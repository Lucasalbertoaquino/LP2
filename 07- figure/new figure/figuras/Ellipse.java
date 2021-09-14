package figuras;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

public class Ellipse extends Figure {
    int w, h;

    public Ellipse (int x1, int y1, int w, int h,int rf,int gf,int bf, int rl, int gl,int bl) {
        this.x1 = x1;
        this.y1 = y1;
        this.w = w;
        this.h = h;
        this.rf = rf;
        this.gf = gf;
        this.bf = bf;
        this.rl = rl;
        this.gl = gl;
        this.bl = bl;
    }

    void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x1, this.y1);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(this.rf,this.gf,this.bf));
        g2d.fillOval(this.x1,this.y1,this.w,this.h); // resolve o fundo do  contorno
        g2d.setColor(new Color(this.rl,this.gl,this.bl));
        g2d.drawOval(this.x1,this.y1, this.w,this.h);//resolve o contorno
        
    }
}