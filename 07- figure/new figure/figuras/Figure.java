package figuras;

import java.awt.Graphics;

public abstract class Figure{
    int x1, y1;
    int rf,gf,bf;
    int rl,gl,bl;
    public abstract void paint(Graphics g);
}