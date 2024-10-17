import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingDemo extends JFrame {
    
    // Components
    private JLabel nameLabel;
    private JTextField nameField;
    private JLabel colorLabel;
    private JComboBox<String> colorComboBox;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JCheckBox subscribeCheckBox;
    private JButton submitButton;
    private JTextArea outputArea;
    private DefaultListModel<String> hobbiesModel;
    private JList<String> hobbiesList;
    
    public SwingDemo() {
        // Set up the frame
        setTitle("Swing Demo Application");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Name Input
        nameLabel = new JLabel("Enter your name:");
        nameField = new JTextField(15);

        // Color Selection
        colorLabel = new JLabel("Select your favorite color:");
        String[] colors = {"Red", "Green", "Blue", "Yellow", "Black"};
        colorComboBox = new JComboBox<>(colors);

        // Gender Selection
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        // Subscribe Checkbox
        subscribeCheckBox = new JCheckBox("Subscribe to newsletter");

        // Hobbies List
        hobbiesModel = new DefaultListModel<>();
        hobbiesModel.addElement("Reading");
        hobbiesModel.addElement("Traveling");
        hobbiesModel.addElement("Gaming");
        hobbiesList = new JList<>(hobbiesModel);
        hobbiesList.setVisibleRowCount(3);
        hobbiesList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Submit Button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(new SubmitButtonListener());

        // Output Area
        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);
        
        // Add components to the frame
        add(nameLabel);
        add(nameField);
        add(colorLabel);
        add(colorComboBox);
        add(maleRadioButton);
        add(femaleRadioButton);
        add(subscribeCheckBox);
        add(new JLabel("Select your hobbies:"));
        add(new JScrollPane(hobbiesList));  // Add scroll pane for the list
        add(submitButton);
        add(new JLabel("Output:"));
        add(new JScrollPane(outputArea));  // Add scroll pane for the text area

        // Make the frame visible
        setVisible(true);
    }

    // Action Listener for the submit button
    private class SubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = nameField.getText();
            String color = (String) colorComboBox.getSelectedItem();
            String gender = maleRadioButton.isSelected() ? "Male" : "Female";
            boolean subscribed = subscribeCheckBox.isSelected();
            StringBuilder hobbies = new StringBuilder();
            for (String hobby : hobbiesList.getSelectedValuesList()) {
                hobbies.append(hobby).append(", ");
            }
            String hobbiesText = hobbies.length() > 0 ? hobbies.substring(0, hobbies.length() - 2) : "None";

            // Displaying the output in the output area
            outputArea.setText("Name          : " + name + "\n" +
                               "Favorite Color: " + color + "\n" +
                               "Gender        : " + gender + "\n" +
                               "Subscribed    : " + subscribed + "\n" +
                               "Hobbies       : " + hobbiesText);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SwingDemo());
    }
}
