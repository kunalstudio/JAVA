import java.awt.*;
import java.awt.event.*;

class MouseEventListener extends Frame implements MouseListener {
    Label l;

    public MouseEventListener() {
        // Initialize the label and set its bounds
        l = new Label();
        l.setBounds(20, 50, 100, 200);  // Adjusted y-position to 50 for visibility
        
        // Add label to frame
        add(l);
        
        // Add MouseListener to the frame
        addMouseListener(this);
        
        // Set frame properties
        setSize(300, 300);
        setLayout(null);  // Use null layout for absolute positioning
        setVisible(true);
    }

    // Override the mouseClicked method
    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

    // Override the mouseEntered method
    @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    // Override the other required methods (even if you don't need them)
    @Override
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }

    public static void main(String args[]) {
        new MouseEventListener();
    }
}
