package figuras;

import java.awt.Graphics;

public abstract class Figure{
    public int x1, y1;
    public int w, h;

    int rf,gf,bf;
    int rl,gl,bl;
    public abstract void paint(Graphics g);
    //public abstract void print();
    public void drag(int dx, int dy){
        this.x1 = dx;
        this.y1 = dy;
    }
}