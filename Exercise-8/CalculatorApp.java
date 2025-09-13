import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CalculatorApp extends JFrame implements ActionListener {
    JTextField num1Field, num2Field, resultField;
    JButton addBtn, subBtn, mulBtn, divBtn;
    public CalculatorApp() {
        setTitle("Basic Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));
        add(new JLabel("Number 1:"));
        num1Field = new JTextField();
        add(num1Field);
        add(new JLabel("Number 2:"));
        num2Field = new JTextField();
        add(num2Field);
        addBtn = new JButton("Add");
        subBtn = new JButton("Subtract");
        mulBtn = new JButton("Multiply");
        divBtn = new JButton("Divide");
        addBtn.addActionListener(this);
        subBtn.addActionListener(this);
        mulBtn.addActionListener(this);
        divBtn.addActionListener(this);
        add(addBtn); add(subBtn);
        add(mulBtn); add(divBtn);
        add(new JLabel("Result:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(num1Field.getText());
            double b = Double.parseDouble(num2Field.getText());
            double result = 0;
            if (e.getSource() == addBtn) result = a + b;
            else if (e.getSource() == subBtn) result = a - b;
            else if (e.getSource() == mulBtn) result = a * b;
            else if (e.getSource() == divBtn) result = b != 0 ? a / b : Double.NaN;
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid Input");
        }
    }
    public static void main(String[] args) {
        CalculatorApp app = new CalculatorApp();
    }
}