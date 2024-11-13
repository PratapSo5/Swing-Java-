// Working  with JList control
import javax.swing.*;

public class SEx17 extends JFrame {
    JLabel lb1;
    JList<String> list;

    public SEx17() {
        lb1 = new JLabel("Select your choice");
        String options[] = {"Cricket", "Football", "Hockey", "Tennis"};

        // Initialize the JList with options
        list = new JList<>(options);

        // Use JScrollPane to hold the list for better display and optional scrolling
        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setBounds(10, 60, 110, 100);

        // Set bounds for the label
        lb1.setBounds(40, 20, 150, 20);

        // Set layout to null for custom positioning
        setLayout(null);

        // Add components to the frame
        add(lb1);
        add(scrollPane);

        // Frame settings
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SEx17();
    }
}
