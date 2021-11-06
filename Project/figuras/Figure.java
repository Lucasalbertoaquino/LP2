package figuras;

import java.util.Scanner;
import java.lang.String;

import java.awt.Graphics;

import ivisible.IVisible;

public abstract class Figure implements IVisible{
    int x1, y1;
    public int w, h;
    private int mx,my;

    protected int rf,gf,bf;//fundo
    protected int  rl,gl,bl;//linha
    public abstract void paint(Graphics g);
    public abstract void print();
    public void drag(int dx, int dy){
        this.x1 = dx;
        this.y1 = dy;
    }

    public boolean clicked(int mx, int my){
        return(((mx >= this.x1) &&(mx <= this.x1 + this.w))&&((my >= this.y1)&&(my <= this.y1 + this.h)));
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
