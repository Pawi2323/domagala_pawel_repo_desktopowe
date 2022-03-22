import javax.swing.*;

public class SwingWindow extends JFrame {
    private JLabel label;
    private JCheckBox checkBox;
    private JCheckBox checkBox2;

    public SwingWindow() {
        createInstances();
        addToFrame();
        configure();
    }
    
    private void createInstances() {
        checkBox = new JCheckBox("Wybór 1");
        checkBox2 = new JCheckBox("Wybór 2");
        checkBox.setBounds(100,100, 50,50);
        checkBox2.setBounds(100,150, 50,50);
    }

    private void addToFrame() {
        getContentPane().add(label);
        getContentPane().add(checkBox);
        getContentPane().add(checkBox2);
    }
    
    private void configure() {
        setTitle("Tytuł");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(512, 256);
        setLocationRelativeTo(null);
    }
}