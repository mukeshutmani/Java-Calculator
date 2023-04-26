import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    // Declare all components
    private JFrame frame;
    private JTextField display;
    private JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    private JButton btnPlus, btnMinus, btnMultiply, btnDivide, btnEquals, btnClear;

    // Constructor to initialize components
    public Calculator() {
        frame = new JFrame("Calculator");
        frame.setLayout(new GridLayout(5, 3));

        display = new JTextField();
        display.setEditable(false);
        frame.add(display);

        btn7 = new JButton("7");
        frame.add(btn7);
        btn7.addActionListener(this);

        btn8 = new JButton("8");
        frame.add(btn8);
        btn8.addActionListener(this);

        btn9 = new JButton("9");
        frame.add(btn9);
        btn9.addActionListener(this);

        btnPlus = new JButton("+");
        frame.add(btnPlus);
        btnPlus.addActionListener(this);

        btn4 = new JButton("4");
        frame.add(btn4);
        btn4.addActionListener(this);

        btn5 = new JButton("5");
        frame.add(btn5);
        btn5.addActionListener(this);

        btn6 = new JButton("6");
        frame.add(btn6);
        btn6.addActionListener(this);

        btnMinus = new JButton("-");
        frame.add(btnMinus);
        btnMinus.addActionListener(this);

        btn1 = new JButton("1");
        frame.add(btn1);
        btn1.addActionListener(this);

        btn2 = new JButton("2");
        frame.add(btn2);
        btn2.addActionListener(this);

        btn3 = new JButton("3");
        frame.add(btn3);
        btn3.addActionListener(this);

        btnMultiply = new JButton("*");
        frame.add(btnMultiply);
        btnMultiply.addActionListener(this);

        btnClear = new JButton("C");
        frame.add(btnClear);
        btnClear.addActionListener(this);

        btn0 = new JButton("0");
        frame.add(btn0);
        btn0.addActionListener(this);

        btnEquals = new JButton("=");
        frame.add(btnEquals);
        btnEquals.addActionListener(this);

        btnDivide = new JButton("/");
        frame.add(btnDivide);
        btnDivide.addActionListener(this);

        // Set frame properties
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Method to perform calculation
    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();

        if (input.equals("C")) {
            display.setText("");
        } else if (input.equals("=")) {
            String expression = display.getText();
            String[] terms = expression.split("[+\\-*/]");
            double num1 = Double.parseDouble(terms[0]);
            double num2 = Double.parseDouble(terms[1]);
            double result = 0.0;

            if (expression.contains("+")) {
                result = num1 + num2;
            } else if (expression.contains("-")) {
                result = num1 - num2;
            } else if (expression.contains("*")) {
                result = num1 * num2;
            } else if (expression.contains("/")) {
                result = num1 / num2;
            }

            display.setText(String.valueOf(result));
        } else {
            display.setText(display.getText() + input);
        }
    }

    // Main method to start the application
    public static void main(String[] args) {
        new Calculator();
    }
}