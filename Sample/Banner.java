import javax.swing.*;
import java.awt.*;

public class Banner implements Runnable
{ 
    JLabel banner , l1 ;
    Thread t ;
    public Banner()
    {
       JFrame f = new JFrame();
       f.setSize(500,200);
       f.setLayout(new FlowLayout());

       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       banner = new JLabel("!!  Welcome To Sastra  !!");
       banner.setFont(new Font("Arial",Font.ITALIC,50));
       banner.setSize(400,5);
       l1 = new JLabel("Hello Sastra"); 
       f.add(banner);
       f.add(l1);
       t = new Thread(this);
       t.start();

       f.setVisible(true);
    }

    public void run()
    {
        while(true)
        {
            String Text = banner.getText();
            int len = Text.length();
            banner.setText(Text.charAt(len-1)+Text.substring(0,len-1));

            try{
                Thread.sleep(200);
            }
            catch(Exception e)
            { 
                System.out.println(e);
            }
        }
    }
    public static void main(String args[])
    {
        new Banner();
    }
}