import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel redPanel = new JPanel();
        JPanel greenPanel = new JPanel();
        JPanel bluePanel = new JPanel();
        JButton greenButton = new JButton();
        JLabel label = new JLabel();

        label.setText("Java genius");
        label.setBounds(400,70,100,100);
        label.setFont(new Font("Courier New",Font.BOLD,10));
        label.setOpaque(true);
        label.setBackground(Color.BLUE);

        greenButton.setBounds(330,50,100,50);
        greenButton.setText("Submit");
        greenButton.setFocusable(false);
        greenButton.addActionListener(e -> System.out.println("Hey, man"));

        redPanel.setBounds(0,0,100,100);
        redPanel.setBackground(Color.red);
        redPanel.setLayout(null);


        greenPanel.setBounds(110,0,100,100);
        greenPanel.setBackground(Color.green);


        bluePanel.setBounds(220,0,100,100);
        bluePanel.setBackground(Color.blue);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.add(redPanel);
        frame.add(greenPanel);
        frame.add(bluePanel);
        frame.add(greenButton);
        frame.add(label);
        frame.setLayout(null);


    }
}