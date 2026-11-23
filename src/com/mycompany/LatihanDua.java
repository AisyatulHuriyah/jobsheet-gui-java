import java.awt.event.*;
import javax.swing.*;

public class LatihanDua {
    public static void main(String[] args) {

        // ini untuk membuat jendela JFrame
        JFrame frame = new JFrame("JLabel example");
        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat JLabel (Instruksi)
        JLabel label = new JLabel("Enter Number: ");
        label.setBounds(20, 20, 120, 25);
        frame.add(label);

        //Membuat TextField (Input)
        JTextField textField = new JTextField();
        textField.setBounds(150, 20, 120, 25);
        frame.add(textField);

        //Membuat JButton (Tombol)
        JButton btnDisplay = new JButton("Show");
        btnDisplay.setBounds(20, 60, 120, 30);
        frame.add(btnDisplay);

        //Membuat JLabel (Hasil)
        JLabel lblResult = new JLabel("Result: - ");
        lblResult.setBounds(150, 60, 150, 30);
        frame.add(lblResult);

        //ActionListener untuk tombol Show
        btnDisplay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                lblResult.setText("Result: " + input);
            }
        });

        //Menampilkan jendela
        frame.setVisible(true);
    }
}