import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

import figuras.*;

class ListPackApp{
    public static void main(String[] args){
        ListPackFrame frame = new ListPackFrame();
        frame.setVisible(true);

    }
}
class ListPackFrame extends JFrame{
    ArrayList<Rect> rs = new ArrayList<Rect>();
    ArrayList<Ellipse> es = new ArrayList<Ellipse>();
    Random rand = new Random();// gera numeros aleatorios

    ListPackFrame(){
        this.addWindowListener(
            new WindowAdapter(){
                public void windowClosing(WindowEvent e){
                    System.exit(0);
                }
            }
        );

        this.addKeyListener(
            new KeyAdapter(){
                public void keyPressed(KeyEvent evt){
                    if((evt.getKeyChar() == 'r')||(evt.getKeyChar() == 'R')){
                        int x = rand.nextInt(350);//varia de 0 a 350
                        int y = rand.nextInt(350);
                        int w = rand.nextInt(50);
                        int h = rand.nextInt(50);
                        int rf = rand.nextInt(255);//define a cor de 256 bits
                        int gf = rand.nextInt(255);
                        int bf = rand.nextInt(255);
                        int rl = rand.nextInt(255);
                        int gl = rand.nextInt(255);
                        int bl = rand.nextInt(255);
                        rs.add(new Rect(x,y,w,h,rf,gf,bf,rl,gl,bl));
                        repaint();
                    }
                    else if((evt.getKeyChar() == 'e')||(evt.getKeyChar() == 'E')){
                        int x = rand.nextInt(350);//varia de 0 a 350
                        int y = rand.nextInt(350);
                        int w = rand.nextInt(50);
                        int h = rand.nextInt(50);
                        int rf = rand.nextInt(255);//define a cor de 256 bits
                        int gf = rand.nextInt(255);
                        int bf = rand.nextInt(255);
                        int rl = rand.nextInt(255);
                        int gl = rand.nextInt(255);
                        int bl = rand.nextInt(255);
                        es.add(new Ellipse(x,y,w,h,rf,gf,bf,rl,gl,bl));
                        repaint();
                    }
                }
            }
        );
        this.setTitle("lista de retangulos + elipse");
        this.setSize(350,350);
    }

    public void paint (Graphics g){
        super.paint(g);
        for (Rect r: this.rs){
            r.paint(g);
        }
        for(Ellipse e: this.es){
            e.paint(g);
        }
    }
}