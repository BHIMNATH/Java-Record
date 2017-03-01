import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class DrawShapes extends JFrame implements ActionListener
{
    JMenuBar mb;
    JMenu draw;
    JMenuItem rect,line,oval;
    DrawShapes()
    {
        setLayout(null);
        mb=new JMenuBar();

        draw=new JMenu("Draw");
        draw.setMnemonic('d');
        mb.add(draw);

        rect=new JMenuItem("Rectangle");
        rect.addActionListener(this);
        rect.setMnemonic('r');
        draw.add(rect);

        line=new JMenuItem("Line");
        line.addActionListener(this);
        line.setMnemonic('l');
        draw.add(line);

        oval=new JMenuItem("Oval");
        oval.addActionListener(this);
        oval.setMnemonic('o');
        draw.add(oval);

        setJMenuBar(mb);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String str=ae.getActionCommand();
        Graphics g=getGraphics();

        if(str=="Rectangle")
        g.drawRect(100,100,50,50);

        if(str=="Line")
        g.drawLine(300,50,400,350);

        if(str=="Oval")
        g.drawOval(400,50,50,50);
    }

    public static void main(String args[])
    {
        DrawShapes f=new DrawShapes();
        f.setTitle("My frame");
        f.setSize(500,500);
        f.setVisible(true);
    }
}