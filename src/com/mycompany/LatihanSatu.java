import javax.swing.JFrame;

public class LatihanSatu {
    public static void main(String[] args) {

        //Membuat object JFrame
        JFrame frame = new JFrame("Aplikasi Saya");

        //Mengatur ukuran jendela
        frame.setSize(600, 400);

        //Menutup aplikasi ketika jendela ditutup
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Menampilkan jendela
        frame.setVisible(true);
    }
}