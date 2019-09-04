package paczka;

import java.awt.*;  
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

class MojeOkno extends Frame
{
    private Color kolor = Color.BLACK;

    private WindowListener frameList = new WindowAdapter()
    {
        @Override
        public void windowClosing (WindowEvent ev)
        {
            MojeOkno.this.dispose();
        }
    };
    private MouseListener mouseList = new MouseAdapter()
    {
        @Override
        public void mouseClicked(MouseEvent ev)
        {
            Graphics gr = plotno.getGraphics();
            gr.setColor(kolor);
            gr.fillRect(ev.getX() - 10, ev.getY() - 10, 20, 20);
        }
    };
    private KeyListener keyList = new KeyAdapter()
    {
        @Override
        public void keyPressed (KeyEvent ev)
        {
            switch (ev.getKeyCode())
            {
            case KeyEvent.VK_LEFT: // klawisz 'lewo'
                kolor = Color.RED;
                break;
            case KeyEvent.VK_RIGHT: // klawisz 'prawo'
                kolor = Color.GREEN;
                break;
            case KeyEvent.VK_UP: // klawisz 'góra'
                kolor = Color.BLUE;
                break;
            case KeyEvent.VK_DOWN:
                kolor = Color.MAGENTA;
                break;
            default: // inne klawisze
                kolor = Color.BLACK;
                break;
            }
        }
    };

    private Canvas plotno = new Canvas();

    public MojeOkno()
    {
        super("dobra gra");
        setSize(400, 400);
        setLocation(100, 100);
        add(plotno, BorderLayout.CENTER);
        plotno.addKeyListener(keyList);
        plotno.addMouseListener(mouseList);
        plotno.setFocusable(true);
        plotno.requestFocus();
        addWindowListener(frameList);
        setVisible(true);
    }
}

class Gracz {
    private int w;
    private int h;
    private int x = 100;
    private int y = 100;
    private Image badacz;

    public Gracz(){
        loadImage();
    }

    private void loadImage() {

        String filename = "eksplorator.png"; 

        try{
            badacz = ImageIO.read(new File(filename));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
               
        w = badacz.getWidth(null);
        h = badacz.getHeight(null);
    }

    public int getX() {
        
        return x;
    }

    public int getY() {
        
        return y;
    }
    
    public int getWidth() {
        
        return w;
    }
    
    public int getHeight() {
        
        return h;
    }    
}

public class HelloAWT {
    public static void main(String[] args) {
        new MojeOkno();
    }
}
