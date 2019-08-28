import java.awt.*;  
import java.awt.event.*;
public class HelloAWT  
{  
  public HelloAWT()  
  {  
    Frame f= new Frame("Super Giera");  
    // zamykanie okna
    f.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e){
            f.dispose();
        }
    });
    f.add(new MyCanvas());  
    f.setLayout(null);  
    f.setSize(800, 800);  
    f.setVisible(true);  
  }  
  public static void main(String args[])  
  {  
    new HelloAWT();  
  }  
}  

class MyCanvas extends Canvas  
{  
        public MyCanvas() {  
        setBackground (Color.BLACK);  
        setSize(600, 600);  
     }  
  public void paint(Graphics g)  
  {  
    g.setColor(Color.red);  
    g.fillOval(75, 75, 150, 150);  
  }  
} 
