package figures;

import java.awt.*;

public class Estrela{
    int x1,x2,x3,x4,x5,x6,x7,x8,x9,x10;
    int y1,y2,y3,y4,y5,y6,y7,y8,y9,y10;

    public Estrela(int x1,int x2,int x3,int x4,int x5,int x6,int x7,int x8,int x9,int x10,int y1,int y2,int y3,int y4,int y5,int y6,int y7,int y8,int y9,int y10){ 
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.x5 = x5;
        this.x6 = x6;
        this.x7 = x7;
        this.x8 = x8;
        this.x9 = x9;
        this.x10 = x10;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.y4 = y4;
        this.y5 = y5;
        this.y6 = y6;
        this.y7 = y7;
        this.y8 = y8;
        this.y9 = y9;
        this.y10 = y10;
    }

    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
       int [] x ={this.x1,this.x2,this.x3,this.x4,this.x5,this.x6,this.x7,this.x8,this.x9,this.x10};
       int [] y ={this.y1,this.y2,this.y3,this.y4,this.y5,this.y6,this.y7,this.y8,this.y9,this.y10};
       
       g2d.drawPolygon(x,y,10);
    }
}