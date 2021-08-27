import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PaintApp {
    public static void main (String[] args) {
        PaintFrame frame = new PaintFrame();
        frame.setVisible(true);
    }
}

class PaintFrame extends JFrame {
    Rect r1,r2,r3;

    PaintFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Painting Figures");
        this.setSize(450, 450);
        this.r1 = new Rect(50,50, 100,30,0,0,0,128,0,128);
        this.r2 = new Rect(100,100, 150,60,0,255,0,210,105,30);
        this.r3 = new Rect(200,250, 200,90,255,255,0,255,0,0);
        
    }

    public void paint (Graphics g) {
        super.paint(g);
        this.r1.paint(g);
        this.r2.paint(g);
        this.r3.paint(g);
    }
}

class Rect {
    int x, y;
    int w, h;
    int rf,gf,bf; // cor de fundo
    int rl,gl,bl;//cor de contorno

    Rect (int x, int y, int w, int h,int rf,int gf,int bf, int rl, int gl,int bl) {
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
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(new Color(this.rf,this.gf,this.bf));
        g2d.fillRect(this.x,this.y, this.w,this.h);// preenche o fundo do rect
        g2d.setColor(new Color(this.rl,this.gl,this.bl));
        g2d.drawRect(this.x,this.y, this.w,this.h);// contorno do rect(desenha as linhas)

    }
}