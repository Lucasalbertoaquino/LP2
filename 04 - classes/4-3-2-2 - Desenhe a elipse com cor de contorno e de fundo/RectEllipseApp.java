import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

class RectEllipseApp {
    public static void main (String[] args) {
        RectEllipseFrame frame = new RectEllipseFrame();
        frame.setVisible(true);
    }
}

class RectEllipseFrame extends JFrame {
    Rect r1,r2,r3;
    Ellipse e1,e2,e3;

    RectEllipseFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Rect + Ellipse");
        this.setSize(350, 350);
        this.r1 = new Rect(50,50, 100,30,255,0,0,0,0,255);

        this.e1 = new Ellipse(50,100, 100,30,0,0,0,0,255,0);
        this.e2 = new Ellipse(100,150, 120,60,0,255,127,255,255,0);
        this.e3 = new Ellipse(150,200, 200,90,255,0,255,139,69,19);
        
    }

    public void paint (Graphics g) {
        super.paint(g);
        this.r1.paint(g);
        this.e1.paint(g);
        this.e2.paint(g);
        this.e3.paint(g);
    }
}

class Rect {
    int x, y;
    int w, h;
    int rf,gf,bf; // cor de fundo
    int rl,gl,bl;//cor de contorno

    Rect (int x, int y, int w, int h, int rf,int gf,int bf, int rl, int gl,int bl) {
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

    void paint (Graphics g) {
        g.setColor(new Color(this.rf,this.gf,this.bf));
        g.fillRect(this.x,this.y,this.w,this.h);
        g.setColor(new Color(this.rl,this.gl,this.bl));
        g.drawRect(this.x,this.y, this.w,this.h);
    }
}

class Ellipse {
    int x, y;
    int w, h;
    int rf,gf,bf; // cor de fundo
    int rl,gl,bl;//cor de contorno

    Ellipse (int x, int y, int w, int h,int rf,int gf,int bf, int rl, int gl,int bl) {
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
        System.out.format("Elipse de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(new Color(this.rf,this.gf,this.bf));
        g2d.fillRect(this.x,this.y,this.w,this.h);
        g2d.setColor(new Color(this.rl,this.gl,this.bl));
        g2d.draw(new Ellipse2D.Double(this.x,this.y, this.w,this.h));
    }
}