import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Hello2DFrame extends JFrame{
    public Hello2DFrame(){
        //construtor
        this.setTitle("Hello World !");
        this.setSize(350,350);
    }

    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;//converte o contexto grafico para a dimensao 2d
        g2d.setPaint(Color.blue);
        int w = this.getWidth();
        int h = this.getHeight();
        g2d.drawLine(0,0,w,h);//(x,y)(x,y)
        g2d.drawLine(0,h,w,0);
    }
}