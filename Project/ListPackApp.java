import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.lang.String;

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
    Scanner teclado = new Scanner(System.in);
    String s;//pergunta s/n

    int xm,ym; //coordenadas mause atual
    

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
                        System.out.printf("Inserir cores do Retangulo manualmente [S/N]: ");
                        s = teclado.nextLine();
                        if(s.equals("s")||s.equals("S")){
                            System.out.println();
                            System.out.println("***Cores***");
                            System.out.printf("R: ");
                            int rf = teclado.nextInt();
                            System.out.printf("G: ");
                            int gf = teclado.nextInt();
                            System.out.printf("B: ");
                            int bf = teclado.nextInt();
                            int x = xm; //recebe a coordenada x do mouse
                            int y = ym; // recebe a coordenada y do mouse
                            int w = rand.nextInt(50);
                            int h = rand.nextInt(50);
                            int rl = 0;
                            int gl = 0;
                            int bl = 0;
                            Rect r = new Rect(x,y,w,h,rf,gf,bf,rl,gl,bl);
                            figs.add(r);
                            teclado.nextLine();//limpa o buffer                            
                        }
                        else{
                            int rf = rand.nextInt(255);//define a cor de 256 bits caso nao seja definida pelo user
                            int gf = rand.nextInt(255);
                            int bf = rand.nextInt(255);
                            int x = xm; //recebe a coordenada x do mouse
                            int y = ym; // recebe a coordenada y do mouse
                            int w = rand.nextInt(50);
                            int h = rand.nextInt(50);
                            int rl = 0;
                            int gl = 0;
                            int bl = 0;
                            Rect r = new Rect(x,y,w,h,rf,gf,bf,rl,gl,bl);
                            figs.add(r);
                            
                        }
                    }
                    if((evt.getKeyChar() == 'e')||(evt.getKeyChar() == 'E')){
                        System.out.printf("Inserir cores da Elipse manualmente [S/N]: ");
                        s = teclado.nextLine();
                        if(s.equals("s")||s.equals("S")){
                            System.out.println();
                            System.out.println("***Cores***");
                            int x = xm; //recebe a coordenada x do mouse
                            int y = ym; // recebe a coordenada y do mouse
                            int w = rand.nextInt(50);
                            int h = rand.nextInt(50);
                            int rl = 0;
                            int gl = 0;
                            int bl = 0;
                            System.out.printf("R: ");
                            int rf = teclado.nextInt();
                            System.out.printf("G: ");
                            int gf = teclado.nextInt();
                            System.out.printf("B: ");
                            int bf = teclado.nextInt();
                            figs.add(new Ellipse(x,y,w,h,rf,gf,bf,rl,gl,bl));
                            teclado.nextLine();//limpa o buffer
                               
                        }
                        else{
                            int x = xm; //recebe a coordenada x do mouse
                            int y = ym; // recebe a coordenada y do mouse
                            int w = rand.nextInt(50);
                            int h = rand.nextInt(50);
                            int rf = rand.nextInt(255);//define a cor de 256 bits
                            int gf = rand.nextInt(255);
                            int bf = rand.nextInt(255);
                            int rl = 0;
                            int gl = 0;
                            int bl = 0;
                            figs.add(new Ellipse(x,y,w,h,rf,gf,bf,rl,gl,bl));   
                        }
                    }
                    if((evt.getKeyChar() == 's')|| (evt.getKeyChar() =='S')){
                        System.out.printf("Inserir cores da Estrela manualmente [S/N]: ");
                        s = teclado.nextLine();
                        if(s.equals("s")||s.equals("S")){
                            int x = xm; //recebe a coordenada x do mouse
                            int y = ym; // recebe a coordenada y do mouse
                            System.out.printf("R: ");
                            int rf = teclado.nextInt();
                            System.out.printf("G: "); 
                            int gf = teclado.nextInt();
                            System.out.printf("B: ");
                            int bf = teclado.nextInt();
                            int rl = 0;
                            int gl = 0;
                            int bl = 0;
                            //figs.add(new Estrela(x,x-50,x/2,x-70,x-100,x,x+100,x+70,x+150,x+50,y,y*2,y*2,y+180,y*4,y+240,y*4,y+180,y*2,y*2,rf,gf,bf,rl,gl,bl));
                            figs.add(new Estrela(x,x-50,x/2,x-70,x-100,x,x+100,x+70,x+150,x+50,y/3,y-100,y-100,y-20,y+100,y+40,y,y-20,y-100,y-100,rf,gf,bf,rl,gl,bl));
                            teclado.nextLine();//limpa o buffer

                        }
                        else{
                            int x = xm; //recebe a coordenada x do mouse
                            int y = ym; // recebe a coordenada y do mouse
                            int rf = rand.nextInt(255);//define a cor de 256 bits
                            int gf = rand.nextInt(255);
                            int bf = rand.nextInt(255);
                            int rl = 0;
                            int gl = 0;
                            int bl = 0;
                            //figs.add(new Estrela(x,x-50,x/2,x-70,x-100,x,x+100,x+70,x+150,x+50,y,y*2,y*2,y+180,y*4,y+240,y*4,y+180,y*2,y*2,rf,gf,bf,rl,gl,bl));
                            figs.add(new Estrela(x,x-50,x/2,x-70,x-100,x,x+100,x+70,x+150,x+50,y/3,y-100,y-100,y-20,y+100,y+40,y,y-20,y-100,y-100,rf,gf,bf,rl,gl,bl));
                        }
                    }
                    if((evt.getKeyChar() == 't')|| (evt.getKeyChar() == 'T')){
                        System.out.printf("Inserir cores do Triangulo manualmente [S/N]: ");
                        s = teclado.nextLine();
                        if(s.equals("s")||s.equals("S")){
                            int x = xm; //recebe a coordenada x do mouse
                            int y = ym; // recebe a coordenada y do mouse
                            int w = rand.nextInt(50);
                            int h = rand.nextInt(50);
                            int rl = 0;
                            int gl = 0;
                            int bl = 0;
                            System.out.printf("R: ");
                            int rf = teclado.nextInt();
                            System.out.printf("G: "); 
                            int gf = teclado.nextInt();
                            System.out.printf("B: ");
                            int bf = teclado.nextInt();
                            //figs.add(new Triangulo(x,y,w,h,x,y,rf,gf,bf,rl,gl,bl));
                            teclado.nextLine(); //limpa o buffer
                        }
                        else{
                            int x = xm; //recebe a coordenada x do mouse
                            int y = ym; // recebe a coordenada y do mouse
                            int w = rand.nextInt(50);
                            int h = rand.nextInt(50);
                            int rf = rand.nextInt(255);
                            int gf = rand.nextInt(255);
                            int bf = rand.nextInt(255);
                            int rl = 0;
                            int gl = 0;
                            int bl = 0;
                            figs.add(new Triangulo(x,y,w,h,x,y,rf,gf,bf,rl,gl,bl));
                            //figs.add(new Triangulo(100,10,200,100,150,180,rf,gf,bf,rl,gl,bl));
                        }
                    }
                    if((evt.getKeyChar() == 127)&&(focus != null)){
                        figs.remove(figs.get(figs.indexOf(focus))); // remove o elemento
                        if((evt.getKeyChar() == 127)&&(focus!=null)){
                            System.out.println("Elemento ja removido");
                            focus = null;
                        }
                    }
                    else if((evt.getKeyChar() == 127)&&(focus == null)){
                        System.out.println("Nada a remover");
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
                            focus = fig;
                            fig.foco(255,0,0); //coloca o foco em vermelho
                        }
                        else{
                            fig.foco(0,0,0);
                        }
                    }
                }
                public void mouseClicked(MouseEvent evt){
                    for(Figure fig: figs){
                        int mx = evt.getX();
                        int my = evt.getY();
                        int p1 = fig.x1 + fig.w;
                        int p2 = fig.y1 + fig.h;
                        if(((mx >= fig.x1) &&(mx <= p1))&&((my >= fig.y1)&&(my <= p2))){
                            fig.foco(255,0,0); //coloca o foco em vermelho
                            repaint();
                        }
                        else{
                            fig.foco(0,0,0);
                            repaint();
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
                        if((focus != null)&&(focus == fig)){
                            fig.drag(dx,dy);
                            repaint();
                        }
                    }
                }
                public void mouseMoved(MouseEvent evt){
                    focus = null;
                    //n = evt.getPoint();
                    xm = evt.getX();
                    ym = evt.getY();


                }
            }

        );

        this.setTitle("Project");
        this.setSize(350,350);
    }

    public void paint (Graphics g){
        super.paint(g);
        for(Figure fig: this.figs){
            fig.paint(g);
            //fig.print();
        }
    }

}