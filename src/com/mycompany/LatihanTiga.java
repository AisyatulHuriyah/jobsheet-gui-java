import java.awt.event.*;
import javax.swing.*;

public class LatihanTiga {
    public static void main(String[] args) {
        
        // Setup Jendela
        JFrame frame = new JFrame("Two Input TextField");
        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Label & TextField untuk Input 1
        JLabel label1 = new JLabel("Number 1:");
        label1.setBounds(20, 20, 120, 25);
        frame.add(label1);

        JTextField input1 = new JTextField();
        input1.setBounds(150, 20, 120, 25);
        frame.add(input1);

        //Label & TextField untuk Input 2
        JLabel label2 = new JLabel("Number 2:");
        label2.setBounds(20, 60, 120, 25);
        frame.add(label2);

        JTextField input2 = new JTextField();
        input2.setBounds(150, 60, 120, 25);
        frame.add(input2);

        //Tombol "Show"
        JButton button = new JButton("Show");
        button.setBounds(20, 100, 120, 30);
        frame.add(button);

        //TextField untuk Output (Hasil)
        JTextField output = new JTextField();
        output.setBounds(150, 100, 180, 30);
        output.setEditable(false);
        frame.add(output);

        //ActionListener untuk tombol
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mengambil teks dari kedua input
                String number1 = input1.getText();
                String number2 = input2.getText();
                
                // Menampilkannya di kotak output
                output.setText("Input 1: " + number1 + " | Input 2: " + number2);
            }
        });

        // Tampilkan Jendela
        frame.setVisible(true);
    }
}