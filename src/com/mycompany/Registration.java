import java.awt.event.*;
import javax.swing.*;

public class Registration {
    public static void main(String[] args) {
        
        //Setup Jendela
        JFrame frame = new JFrame("Student Registration Form");
        frame.setSize(400, 450); // Tinggi ditambah biar muat banyak kolom
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Label & TextField: Nama
        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(20, 20, 100, 25);
        frame.add(lblName);

        JTextField txtName = new JTextField();
        txtName.setBounds(130, 20, 200, 25);
        frame.add(txtName);

        //Label & TextField: NIM
        JLabel lblNim = new JLabel("NIM:");
        lblNim.setBounds(20, 60, 100, 25);
        frame.add(lblNim);

        JTextField txtNim = new JTextField();
        txtNim.setBounds(130, 60, 200, 25);
        frame.add(txtNim);

        //Label & TextField: Prodi
        JLabel lblProdi = new JLabel("Prodi:");
        lblProdi.setBounds(20, 100, 100, 25);
        frame.add(lblProdi);

        JTextField txtProdi = new JTextField();
        txtProdi.setBounds(130, 100, 200, 25);
        frame.add(txtProdi);

        //Modifikasi Jobsheet: Tambah Alamat
        JLabel lblAlamat = new JLabel("Alamat:");
        lblAlamat.setBounds(20, 140, 100, 25);
        frame.add(lblAlamat);

        JTextField txtAlamat = new JTextField();
        txtAlamat.setBounds(130, 140, 200, 25);
        frame.add(txtAlamat);

        //Modifikasi Jobsheet: Tambah Asal Sekolah
        JLabel lblSekolah = new JLabel("Asal Sekolah:");
        lblSekolah.setBounds(20, 180, 100, 25);
        frame.add(lblSekolah);

        JTextField txtSekolah = new JTextField();
        txtSekolah.setBounds(130, 180, 200, 25);
        frame.add(txtSekolah);

        //Tombol Save & Reset
        JButton btnSave = new JButton("Save");
        btnSave.setBounds(20, 220, 140, 30);
        frame.add(btnSave);

        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(190, 220, 140, 30);
        frame.add(btnReset);

        //JTextArea untuk menampilkan hasil
        JTextArea areaResult = new JTextArea();
        areaResult.setBounds(20, 270, 340, 120);
        areaResult.setEditable(false); // Dikunci
        frame.add(areaResult);

        //Aksi Tombol Save
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ambil semua teks, trim() buat buang spasi di ujung
                String name = txtName.getText().trim();
                String nim = txtNim.getText().trim();
                String prodi = txtProdi.getText().trim();
                String alamat = txtAlamat.getText().trim();
                String sekolah = txtSekolah.getText().trim();

                // VALIDASI: Kalau ada yang kosong, munculin error
                if (name.isEmpty() || nim.isEmpty() || prodi.isEmpty() || alamat.isEmpty() || sekolah.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Semua kolom harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
                    return; // Hentikan proses simpan
                }

                // Kalau lolos validasi, tampilkan di JTextArea
                areaResult.setText("Data Berhasil Disimpan:\n");
                areaResult.append("Name: " + name + "\n");
                areaResult.append("NIM: " + nim + "\n");
                areaResult.append("Prodi: " + prodi + "\n");
                areaResult.append("Alamat: " + alamat + "\n");
                areaResult.append("Asal Sekolah: " + sekolah + "\n");
                
                JOptionPane.showMessageDialog(frame, "Data berhasil disimpan!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        //Aksi Tombol Reset
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtName.setText("");
                txtNim.setText("");
                txtProdi.setText("");
                txtAlamat.setText("");
                txtSekolah.setText("");
                areaResult.setText("");
            }
        });

        //Tampilkan Jendela
        frame.setVisible(true);
    }
}