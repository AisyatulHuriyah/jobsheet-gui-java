import java.awt.event.*;
import javax.swing.*;

public class LatihanLima {
    public static void main(String[] args) {
        
        //Setup Jendela
        JFrame frame = new JFrame("Complete Calculator");
        frame.setSize(400, 350);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Judul
        JLabel title = new JLabel("CALCULATOR");
        title.setBounds(150, 10, 200, 25);
        frame.add(title);

        //Input 1
        JLabel label1 = new JLabel("Number 1:");
        label1.setBounds(20, 50, 100, 25);
        frame.add(label1);

        JTextField input1 = new JTextField();
        input1.setBounds(120, 50, 150, 25);
        frame.add(input1);

        //Input 2
        JLabel label2 = new JLabel("Number 2:");
        label2.setBounds(20, 90, 100, 25);
        frame.add(label2);

        JTextField input2 = new JTextField();
        input2.setBounds(120, 90, 150, 25);
        frame.add(input2);

        //Label & Output Hasil
        JLabel labelResult = new JLabel("Result:");
        labelResult.setBounds(20, 130, 100, 25);
        frame.add(labelResult);

        JTextField output = new JTextField();
        output.setBounds(120, 130, 150, 25);
        output.setEditable(false); // Dikunci
        frame.add(output);

        //Tombol-Tombol Kalkulator
        JButton btnAdd = new JButton("Add"); // Tambah
        btnAdd.setBounds(20, 180, 100, 30);
        frame.add(btnAdd);

        JButton btnLess = new JButton("Less"); // Kurang
        btnLess.setBounds(130, 180, 100, 30);
        frame.add(btnLess);

        JButton btnKali = new JButton("Multiple"); // Kali
        btnKali.setBounds(240, 180, 100, 30);
        frame.add(btnKali);

        JButton btnShare = new JButton("Divide"); //Pembagian
        btnShare.setBounds(20, 220, 100, 30);
        frame.add(btnShare);

        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(130, 220, 100, 30);
        frame.add(btnReset);

        JButton btnExit = new JButton("Exit");
        btnExit.setBounds(240, 220, 100, 30);
        frame.add(btnExit);

        //Logika Tombol-Tombol Kalkulator
        ActionListener operation = e -> {
            try {
                // Ambil angka dari input, ubah teks ke tipe data double
                double a = Double.parseDouble(input1.getText());
                double b = Double.parseDouble(input2.getText());
                double result = 0;

                // Cek tombol mana yang diklik menggunakan e.getSource()
                if (e.getSource() == btnAdd) {
                    result = a + b;
                } else if (e.getSource() == btnLess) {
                    result = a - b;
                } else if (e.getSource() == btnKali) {
                    result = a * b;
                } else if (e.getSource() == btnShare) {
                    result = a / b;
                }

                // Tampilkan hasil di kotak output
                output.setText(String.valueOf(result));

            } catch (NumberFormatException ex) {
                // Kalau user ngetik huruf / kosong, munculin pesan error
                JOptionPane.showMessageDialog(frame, "Input harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        };

        // Daftarkan ActionListener ke tombol-tombol matematika
        btnAdd.addActionListener(operation);
        btnLess.addActionListener(operation);
        btnKali.addActionListener(operation);
        btnShare.addActionListener(operation);

        // 8. Logika Tombol Reset
        btnReset.addActionListener(e -> {
            input1.setText("");
            input2.setText("");
            output.setText("");
        });

        // 9. Logika Tombol Exit
        btnExit.addActionListener(e -> System.exit(0));

        // 10. Tampilkan Jendela
        frame.setVisible(true);
    }
}