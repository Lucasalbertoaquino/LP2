import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello2DApp {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
    }
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java2D - Hello World!");
        this.setSize(850, 850);
        this.getContentPane().setBackground(Color.blue);
        this.setVisible(true);
        
    }

    public void paint(Graphics gh){
        super.paint(gh);
        Graphics2D gh2d = (Graphics2D) gh;
        
        Graphics2D ghl = gh2d;

        Graphics2D fonte = ghl;

        //fonte
        fonte.setFont(new Font("Arial",Font.BOLD,18));
        fonte.setPaint(Color.red);
        fonte.drawString("UERJ",400,700);
        fonte.setPaint(Color.white);
        fonte.drawString("LP2",420,200);
        fonte.setPaint(Color.yellow);
        fonte.drawString("LUCAS ALBERTO",100,425);
        fonte.setPaint(Color.green);
        fonte.drawString("JAVA",640,425);
        

        //line
        ghl.setPaint(Color.white);
        int w = getWidth();
        int h = getHeight();
        ghl.drawLine(0,0, w,h);
        ghl.drawLine(0,h, w,0);

        //circle
        gh2d.setPaint(Color.red);
        int la = getWidth();
        int al = getHeight();
        gh2d.drawOval(0,0,al,la);
        gh2d.drawOval(0,al,la,0);
    }
}