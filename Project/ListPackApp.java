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
    ArrayList<Figure> figs = new ArrayList<Figure>();
    Figure focus = null;
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
                        Rect r = new Rect(x,y,w,h,rf,gf,bf,rl,gl,bl);
                        figs.add(r);
                    }
                    if((evt.getKeyChar() == 'e')||(evt.getKeyChar() == 'E')){
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
                        figs.add(new Ellipse(x,y,w,h,rf,gf,bf,rl,gl,bl));
                    }
                    if((evt.getKeyChar() == 's')|| (evt.getKeyChar() =='S')){
                        int x = rand.nextInt(350);
                        int y = rand.nextInt(350);
                        //System.out.printf("%d:%d\n",x,y);
                        int rf = rand.nextInt(255);//define a cor de 256 bits
                        int gf = rand.nextInt(255);
                        int bf = rand.nextInt(255);
                        int rl = rand.nextInt(255);
                        int gl = rand.nextInt(255);
                        int bl = rand.nextInt(255);
                        //figs.add(new Estrela(x,x-50,x/2,x-70,x-100,x,x+100,x+70,x+150,x+50,y,y*2,y*2,y+180,y*4,y+240,y*4,y+180,y*2,y*2,rf,gf,bf,rl,gl,bl));
                        figs.add(new Estrela(x,x-50,x/2,x-70,x-100,x,x+100,x+70,x+150,x+50,y/3,y-100,y-100,y-20,y+100,y+40,y,y-20,y-100,y-100,rf,gf,bf,rl,gl,bl));
                    }
                    else if((evt.getKeyChar() == 't')|| (evt.getKeyChar() == 'T')){
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
                        figs.add(new Triangulo(x,y,w,h,x,y,rf,gf,bf,rl,gl,bl));
                    }
                    repaint();
                }
            }
        );

        this.addMouseListener(
            new MouseAdapter(){
                public void mousePressed(MouseEvent evt){
                    for(Figure fig: figs){
                        int mx = evt.getX();
                        int my = evt.getY();
                        int p1 = fig.x1 + fig.w;
                        int p2 = fig.y1 + fig.h;
                        
                        if(((mx >= fig.x1) &&(mx <= p1))&&((my >= fig.y1)&&(my <= p2))){
                            //System.out.println("Acertei");
                            focus = fig;
                        }
                    }
                }
            }

        );

        this.addMouseMotionListener(
            new MouseMotionAdapter(){
                public void mouseDragged(MouseEvent evt){
                    for(Figure fig: figs){
                        int dx = evt.getX();
                        int dy = evt.getY();
                        if(focus != null){
                            fig.x1 = dx;
                            fig.y1 = dy;
                            repaint();
                        }
                    }
                }
            }

        );


        this.setTitle("lista de retangulos + elipse + triangulo + star");
        this.setSize(350,350);
    }

    public void paint (Graphics g){
        super.paint(g);
        for(Figure fig: this.figs){
            fig.paint(g);
            fig.print();
        }
    }

}