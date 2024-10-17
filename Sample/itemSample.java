import java.awt.*;
import java.awt.event.*;

class itemSample implements ItemListener
{
    Label l = new Label();
    Checkbox cb1, cb2;
    public itemSample()
    {
        Frame f = new Frame("Example");
       
        l.setAlignment(Label.CENTER);
        //l.setSize(400,300);
        l.setBounds(50, 50, 300, 50);

        cb1 = new Checkbox("C++");
        cb1.setBounds(100,100,50,50);
        
        cb2 = new Checkbox("Java");
        cb2.setBounds(100,150,50,50);

        
        f.add(cb1);
        f.add(cb2);
        f.add(l);

        cb1.addItemListener(this);
        cb2.addItemListener(this);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void itemStateChanged(ItemEvent e)
    {
        if( e.getSource() == cb1 )
        l.setText("C++ CheckBox :" + (e.getStateChange() == 1 ? "Checked" : "UnChecked" ) );

        if( e.getSource() == cb2 )
        l.setText("Java CheckBox :" + (e.getStateChange() == 1 ? "Checked" : "UnChecked" ) );       
    }

    public static void main(String args[])
    {
        new itemSample();
    }
}