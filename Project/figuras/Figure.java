package figuras;

import java.util.Scanner;
import java.lang.String;

import java.awt.Graphics;
import java.io.Serializable;

import ivisible.IVisible;

public abstract class Figure implements IVisible,Serializable{
    public int x1, y1;
    public int w, h;
    private int mx,my;

    public  int rf,gf,bf;//fundo
    public int  rl,gl,bl;//linha

    public Figure (int x1, int y1, int w, int h,int rf,int gf,int bf, int rl, int gl,int bl) {
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

    public abstract void paint(Graphics g,boolean focused);
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
