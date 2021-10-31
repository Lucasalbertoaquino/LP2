import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.lang.String;

import figuras.*;

class IfaceApp{
    public static void main(String[] args){
        IfaceFrame frame = new IfaceFrame();
        frame.setVisible(true);

    }
}
class IfaceFrame extends JFrame{
    ArrayList<Figure> figs = new ArrayList<Figure>();
    Figure focus = null;
    Random rand = new Random();// gera numeros aleatorios
    Scanner teclado = new Scanner(System.in);
    String s;//pergunta s/n

    int xm,ym; //coordenadas mause atual

    
    

    IfaceFrame(){
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
                    if((evt.getKeyChar() == 'r'||evt.getKeyChar() == 'R')){
                        // insere as cores aleatoriamente
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
                    if((evt.getKeyChar() == 'f')||(evt.getKeyChar() =='F')){
                        //insere as cores manualmente
                        System.out.printf("*****Inserir cores do Retangulo manualmente*****\n");
                        System.out.printf("R: ");
                        int rf = teclado.nextInt();
                        System.out.printf("G: ");
                        int gf = teclado.nextInt();
                        System.out.printf("B: ");
                        int bf = teclado.nextInt();
                        if((rf < 0 || rf > 255)||(gf < 0|| gf > 255)||(bf < 0 ||bf > 255)){
                            System.out.println("***Voce inseriu um canal de cores invalido***");
                            System.out.println("Por definicao sera inserida uma figura padrao!!!\n");
                            rf = 0;
                            gf = 0;
                            bf = 0;
                        }
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
                    if((evt.getKeyChar() == 'e')||(evt.getKeyChar() == 'E')){
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
                    if((evt.getKeyChar() == 'd')||(evt.getKeyChar() == 'D')){
                        System.out.printf("*****Inserir cores da Elipse manualmente*****\n");
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
                        if((rf < 0 || rf > 255)||(gf < 0|| gf > 255)||(bf < 0 ||bf > 255)){
                            System.out.println("***Voce inseriu um canal de cores invalido***");
                            System.out.println("Por definicao sera inserida uma figura padrao!!!\n");
                            rf = 0;
                            gf = 0;
                            bf = 0;
                        }
                        figs.add(new Ellipse(x,y,w,h,rf,gf,bf,rl,gl,bl));
                        teclado.nextLine();//limpa o buffer   
                    }
                    if((evt.getKeyChar() == 's')|| (evt.getKeyChar() =='S')){
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
                    if((evt.getKeyChar() == 'w')|| (evt.getKeyChar() =='W')){
                        System.out.printf("*****Inserir cores da Estrela manualmente*****\n");
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
                        if((rf < 0 || rf > 255)||(gf < 0|| gf > 255)||(bf < 0 ||bf > 255)){
                            System.out.println("***Voce inseriu um canal de cores invalido***");
                            System.out.println("Por definicao sera inserida uma figura padrao!!!\n");
                            rf = 0;
                            gf = 0;
                            bf = 0;
                        }
                        //figs.add(new Estrela(x,x-50,x/2,x-70,x-100,x,x+100,x+70,x+150,x+50,y,y*2,y*2,y+180,y*4,y+240,y*4,y+180,y*2,y*2,rf,gf,bf,rl,gl,bl));
                        figs.add(new Estrela(x,x-50,x/2,x-70,x-100,x,x+100,x+70,x+150,x+50,y/3,y-100,y-100,y-20,y+100,y+40,y,y-20,y-100,y-100,rf,gf,bf,rl,gl,bl));
                        teclado.nextLine();//limpa o buffer
                    }
                    if((evt.getKeyChar() == 't')|| (evt.getKeyChar() == 'T')){
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
                    if((evt.getKeyChar() == 'g')|| (evt.getKeyChar() == 'G')){
                        System.out.printf("*****Inserir cores do Triangulo manualmente*****\n");
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
                        if((rf < 0 || rf > 255)||(gf < 0|| gf > 255)||(bf < 0 ||bf > 255)){
                            System.out.println("***Voce inseriu um canal de cores invalido***");
                            System.out.println("Por definicao sera inserida uma figura padrao!!!\n");
                            rf = 0;
                            gf = 0;
                            bf = 0;
                        }
                        figs.add(new Triangulo(x,y,w,h,x,y,rf,gf,bf,rl,gl,bl));
                        teclado.nextLine(); //limpa o buffer
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
                    int mx = evt.getX();
                    int my = evt.getY();
                    for(Figure fig: figs){
                        if(fig.clicked(mx,my)){
                            focus = fig;
                            fig.foco(255,0,0); //coloca o foco em vermelho
                        }
                        else{
                            fig.foco(0,0,0);
                        }
                    }
                }
                public void mouseClicked(MouseEvent evt){
                    int mx = evt.getX();
                    int my = evt.getY();
                    for(Figure fig: figs){
                        if(fig.clicked(mx,my)){
                            fig.foco(255,0,0); //coloca o foco em vermelho
                            
                        }
                        else{
                            fig.foco(0,0,0);
                        }
                    }
                    repaint();
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
                            fig.drag(dx-(fig.w/2),dy-(fig.h/2));//pega no meio da figura
                        }
                    }
                    repaint();
                }
                public void mouseMoved(MouseEvent evt){
                    focus = null;
                    xm = evt.getX();
                    ym = evt.getY();
                }
            }

        );

        this.setTitle("the Project part 2");
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