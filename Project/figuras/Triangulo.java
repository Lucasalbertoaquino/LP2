package figuras;

import java.awt.*;

public class Triangulo extends Figure{
    int x2,x3;
    int y2,y3;

    public Triangulo(int x1,int x2,int x3,int y1,int y2,int y3,int rf,int gf,int bf,int rl,int gl,int bl){
        super();
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.rf = rf;
        this.gf = gf;
        this.bf = bf;
        this.rl = rl;
        this.gl = gl;
        this.bl = bl;
    }

    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        int [] x ={this.x1,this.x2,this.x3};
        int [] y ={this.y1,this.y2,this.y3};
        g2d.setColor(new Color(this.rf,this.gf,this.bf));
        g2d.fillPolygon(x,y,3);
        g2d.setColor(new Color(this.rl,this.gl,this.bl));
        g2d.drawPolygon(x,y,3);
    }
}