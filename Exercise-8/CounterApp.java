import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CounterApp extends JFrame implements ActionListener {
    int count = 0;
    JLabel countLabel;
    JButton clickBtn, resetBtn;
    public CounterApp() {
        setTitle("Counter App");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        countLabel = new JLabel("Count: 0");
        add(countLabel);
        clickBtn = new JButton("Click Me");
        resetBtn = new JButton("Reset");
        clickBtn.addActionListener(this);
        resetBtn.addActionListener(this);
        add(clickBtn);
        add(resetBtn);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clickBtn) {
            count++;
        } else if (e.getSource() == resetBtn) {
            count = 0;
        }
        countLabel.setText("Count: " + count);
    }
    public static void main(String[] args) {
        CounterApp app = new CounterApp();
    }
}
