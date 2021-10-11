package figuras;

import java.util.Scanner;
import java.lang.String;

import java.awt.Graphics;

public abstract class Figure{
    public int x1, y1;
    public int w, h;
    public int mx,my;

    int rf,gf,bf;//fundo
    int rl,gl,bl;//linha
    public abstract void paint(Graphics g);
    //public abstract void print();
    public void drag(int dx, int dy){
        this.x1 = dx;
        this.y1 = dy;
    }
    public void foco(int r,int g,int b){
        this.rl = r;
        this.gl = g;
        this.bl = b;
    }
    public void cor(int r, int g,int b){
        this.rf = r;
        this.gf = g;
        this.bf = b;
    }


}
