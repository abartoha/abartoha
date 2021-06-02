import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TempConvert {

    JButton convertTemp;
    JTextField textBox1, textBox2;
    JLabel l1, l2;

    public TempConvert() {

        JFrame frame = new JFrame("Temperature Convert");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(280, 150);
        frame.setLocation(300, 200);

        l1 = new JLabel("Enter Temperature in Celsius");
        textBox1 = new JTextField(10);
        textBox1.setText("");

        l2 = new JLabel("Temperature in Fahrenheit");
        textBox2 = new JTextField(10);
        textBox2.setText("");

        convertTemp = new JButton("Convert");
        // Mainly here starts my new code
        // I also changed some spelling errors    
        // And please don't be frustrated, I learned how to fix this from tutorialspoint right now
        convertTemp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // System.out.println("Pressed");
                String s1 = textBox1.getText();
                int a = Integer.parseInt(s1);
                float b = (9*a + 160)/5;
                String s2 = Float.toString(b);
                textBox2.setText(s2);
            }
        });

        JPanel panel = new JPanel();
        panel.add(l1);
        panel.add(textBox1);
        panel.add(convertTemp);
        panel.add(l2);
        panel.add(textBox2);
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);

    }

}

public class FinalLab {
    public static void main(String[] args) {
        new TempConvert();
    }
}
