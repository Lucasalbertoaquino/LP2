package figures;

import java.awt.*;

public class Rect {
    int x, y;
    int w, h;
    int rf,gf,bf; 
    int rl,gl,bl;

    public Rect (int x, int y, int w, int h,int rf,int gf,int bf, int rl, int gl,int bl) {
        this.x = x;
        this.y = y;
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
            this.w, this.h, this.x, this.y);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(new Color(this.rf,this.gf,this.bf));
        g2d.fillRect(this.x,this.y,this.w,this.h);
        g2d.setColor(new Color(this.rl,this.gl,this.bl));
        g2d.drawRect(this.x,this.y, this.w,this.h);

    }
}