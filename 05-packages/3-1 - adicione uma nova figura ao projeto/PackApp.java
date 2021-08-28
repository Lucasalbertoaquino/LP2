import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import figures.*;

class PackApp {
    public static void main (String[] args) {
        PackFrame frame = new PackFrame();
        frame.setVisible(true);
    }
}

class PackFrame extends JFrame {
    Rect r1;
    Ellipse e1;
    Triangulo t1;
    Estrela es1;

    PackFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java Packages");
        this.setSize(550, 550);
        this.r1 = new Rect(50,400, 100,30);
        this.e1 = new Ellipse(50,300, 100,30);
        this.t1 = new Triangulo(70,120,20,20,120,120);
        this.es1 = new Estrela(300,250,150,230,200,300,400,370,450,350,100,200,200,280,400,340,400,280,200,200);
    }

    public void paint (Graphics g) {
        super.paint(g);
        this.r1.paint(g);
        this.e1.paint(g);
        this.t1.paint(g);
        this.es1.paint(g);
    }
}