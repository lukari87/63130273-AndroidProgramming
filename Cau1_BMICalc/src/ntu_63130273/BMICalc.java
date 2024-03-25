package ntu_63130273;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICalc {
    JFrame frame;
    private JTextField heightField;
    private JTextField weightField;
    private JLabel bmiLabel;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	BMICalc window = new BMICalc();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public BMICalc() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel heightLabel = new JLabel("Chiều cao (m):");
        heightLabel.setBounds(10, 10, 100, 30);
        frame.getContentPane().add(heightLabel);

        heightField = new JTextField();
        heightField.setBounds(120, 10, 150, 30);
        frame.getContentPane().add(heightField);
        heightField.setColumns(10);

        JLabel weightLabel = new JLabel("Cân nặng (kg):");
        weightLabel.setBounds(10, 50, 100, 30);
        frame.getContentPane().add(weightLabel);

        weightField = new JTextField();
        weightField.setBounds(120, 50, 150, 30);
        frame.getContentPane().add(weightField);
        weightField.setColumns(10);

        JButton calcButton = new JButton("Tính BMI");
        calcButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double height = Double.parseDouble(heightField.getText());
                double weight = Double.parseDouble(weightField.getText());
                double bmi = weight / (height * height);
                bmiLabel.setText(String.format("Chỉ số BMI của bạn: %.2f", bmi));
            }
        });
        calcButton.setBounds(10, 90, 100, 30);
        frame.getContentPane().add(calcButton);

        bmiLabel = new JLabel("");
        bmiLabel.setBounds(120, 90, 200, 30);
        frame.getContentPane().add(bmiLabel);
    }
}

