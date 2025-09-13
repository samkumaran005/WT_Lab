import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
public class ImageViewer extends JFrame implements ActionListener {
    JButton browseBtn;
    JLabel imageLabel;
    public ImageViewer() {
        setTitle("Image Viewer");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        browseBtn = new JButton("Browse");
        browseBtn.addActionListener(this);
        add(browseBtn, BorderLayout.NORTH);
        imageLabel = new JLabel("", SwingConstants.CENTER);
        add(new JScrollPane(imageLabel), BorderLayout.CENTER);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(file.getAbsolutePath());
            Image img = icon.getImage().getScaledInstance(500, 400, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(img));
        }
    }
    public static void main(String[] args) {
        ImageViewer viewer = new ImageViewer();
    }
}
