import javax.swing.*;

class swingSample
{
    public static void main(String args[])
    {
       /*JFrame frame = new JFrame();
         JButton button = new JButton("CSBT Click");

        button.setBounds(100,150,200,300);
        frame.add(button) ;
        frame.setSize(600,300);
        frame.setVisible(true);*/

        JFrame frame = new JFrame("CSBT");
        frame.setSize(1000,500);
        frame.setVisible(true);

        JButton b1 = new JButton("Submit");
        JButton b2 = new JButton("Cancel");
        JButton b3 = new JButton("Clear");

        b1.setBounds(30,50,100,50);
        b2.setBounds(30,150,100,50);
        b3.setBounds(30,250,100,50);

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
    }
    
}
    
