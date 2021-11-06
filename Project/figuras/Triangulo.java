package figuras;

import java.awt.*;
import java.util.Arrays;

public class Triangulo extends Figure{
    private int x2,x3;
    private int y2,y3;
    private int nx1;//usado no desenho apenas
    private int ny1;//usado no desenho apenas

    public Triangulo(int x1,int x2,int x3,int y1,int y2,int y3,int rf,int gf,int bf,int rl,int gl,int bl){
        super();
        
        //this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        //this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.rf = rf;
        this.gf = gf;
        this.bf = bf;
        this.rl = rl;
        this.gl = gl;
        this.bl = bl;

        int [] x ={this.x1,this.x2,this.x3};
        int [] y ={this.y1,this.y1,this.y3};
        for(int i = 0;i <3;i++){
            System.out.println(y[i]);
        }
        
        Arrays.sort(x);
        Arrays.sort(y);

        int maiorx = x[2]; //w
        int menorx = x[0]; //x1
        int maiory = y[2]; //y1
        int menory = y[0]; //h

        for(int i = 0;i <3;i++){
            System.out.println(y[i]);
        }
        

        this.w = maiorx - menorx;
        this.h = maiory - menory; 

        
        this.nx1 = x1;
        this.ny1 = y1;

        this.x1 = menorx;
        this.y1 = maiory;
    }
    public void print(){
        System.out.println("Teste");
    }

    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        int [] x ={this.nx1,this.x2,this.x3};
        int [] y ={this.ny1,this.y1,this.x3};

        //int [] x ={this.x1,this.x2,this.x3};
        //int [] y ={this.y1,this.y2,this.y3};
        g2d.setColor(new Color(this.rf,this.gf,this.bf));
        g2d.fillPolygon(x,y,3);
        g2d.setColor(new Color(this.rl,this.gl,this.bl));
        g2d.drawPolygon(x,y,3);
    }
}