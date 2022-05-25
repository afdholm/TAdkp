package com.bookingtiket;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class page2c implements ActionListener {
    JComboBox pilihanTiket;

    JTextField user, email;

    JButton button, button2;

    JLabel review, review1, review2, review3, review4, review5;

    String out, out1, out2, out3, out4, out5;
    String responses[] = {"Konfirmasi", "Batal"};

    ImageIcon logo = new ImageIcon("PSISlogo.png");
    ImageIcon qrcode = new ImageIcon("qrcode.png");

    JFrame myFrame;

    page2c(){
        ImageIcon banner = new ImageIcon("match3.jpg");

        JLabel label = new JLabel();
        label.setIcon(banner);
        label.setVisible(true);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 720, 240);

        JLabel label1 = new JLabel();
        label1.setText("Pastikan data yang Anda isi benar!");
        label1.setFont(new Font("Courier New", Font.PLAIN, 16));
        label1.setForeground(Color.white);

        JLabel label2 = new JLabel();
        label2.setText("Silakan pilih jenis tiket");
        label2.setFont(new Font("Courier New", Font.PLAIN, 16));
        label2.setForeground(Color.white);

        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(0, 37, 129));
        panel1.setBounds(0, 240, 720, 30);
        panel1.add(label1);

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(0, 37, 129));
        panel2.setBounds(0, 280, 720, 30);
        panel2.add(label2);

        String[] jenisTiket = {
                "----------------------- Pilih tiket ---------------------",
                "-- Ekonomi (Supporter) ------------------- Rp60.000,00 --",
                "-- Umum --------------------------------- Rp120.000,00 --",
                "-- VIP (Tribun Barat) ------------------- Rp200.000,00 --"
        };

        pilihanTiket = new JComboBox<>(jenisTiket);
        pilihanTiket.setFont(new Font("Courier New", Font.BOLD, 18));
        pilihanTiket.setForeground(new Color(0, 37, 129));
        pilihanTiket.setBounds(20, 310, 670, 25);
        pilihanTiket.addActionListener(this);

        JLabel userL = new JLabel();
        userL.setText("Silakan masukkan nama lengkap");
        userL.setFont(new Font("Courier New", Font.PLAIN, 16));
        userL.setForeground(Color.white);

        JPanel userP = new JPanel();
        userP.setBackground(new Color(0, 37, 129));
        userP.setBounds(0, 335, 720, 30);
        userP.add(userL);

        user = new JTextField();
        user.setFont(new Font("Courier New", Font.BOLD, 18));
        user.setForeground(new Color(0, 37, 129));
        user.setBounds(20, 365, 670, 25);
        user.addActionListener(this);

        JLabel emaiL = new JLabel();
        emaiL.setText("Silakan masukkan alamat email aktif");
        emaiL.setFont(new Font("Courier New", Font.PLAIN, 16));
        emaiL.setForeground(Color.white);

        JPanel emailP = new JPanel();
        emailP.setBackground(new Color(0, 37, 129));
        emailP.setBounds(0, 390, 720, 30);
        emailP.add(emaiL);

        email = new JTextField();
        email.setFont(new Font("Courier New", Font.BOLD, 18));
        email.setForeground(new Color(0, 37, 129));
        email.setBounds(20, 420, 670, 25);
        email.addActionListener(this);

        button = new JButton();
        button.setFont(new Font("Courier New", Font.BOLD, 18));
        button.setText("LANJUT");
        button.setFocusable(false);
        button.setBounds(295, 460, 120, 35);
        button.addActionListener(this);

        review = new JLabel();
        review.setFont(new Font("Courier New", Font.PLAIN, 16));
        review.setForeground(Color.yellow);

        review1 = new JLabel();
        review1.setFont(new Font("Courier New", Font.PLAIN, 16));
        review1.setForeground(Color.yellow);

        review2 = new JLabel();
        review2.setFont(new Font("Courier New", Font.PLAIN, 16));
        review2.setForeground(Color.yellow);

        review3 = new JLabel();
        review3.setFont(new Font("Courier New", Font.PLAIN, 16));
        review3.setForeground(Color.yellow);

        review4 = new JLabel();
        review4.setFont(new Font("Courier New", Font.PLAIN, 16));
        review4.setForeground(Color.yellow);

        review5 = new JLabel();
        review5.setFont(new Font("Courier New", Font.PLAIN, 16));
        review5.setForeground(Color.yellow);

        JPanel panel3 = new JPanel();
        panel3.setBackground(new Color(0, 37, 129));
        panel3.setBounds(105, 510, 500, 25);
        panel3.add(review);

        JPanel panel4 = new JPanel();
        panel4.setBackground(new Color(0, 37, 129));
        panel4.setBounds(105, 535, 500, 25);
        panel4.add(review1);

        JPanel panel5 = new JPanel();
        panel5.setBackground(new Color(0, 37, 129));
        panel5.setBounds(105, 560, 500, 25);
        panel5.add(review2);

        JPanel panel6 = new JPanel();
        panel6.setBackground(new Color(0, 37, 129));
        panel6.setBounds(105, 585, 500, 25);
        panel6.add(review3);

        JPanel panel7 = new JPanel();
        panel7.setBackground(new Color(0, 37, 129));
        panel7.setBounds(105, 610, 500, 25);
        panel7.add(review4);

        JPanel panel8 = new JPanel();
        panel8.setBackground(new Color(0, 37, 129));
        panel8.setBounds(105, 635, 500, 25);
        panel8.add(review5);

        button2 = new JButton();
        button2.setFont(new Font("Courier New", Font.BOLD, 18));
        button2.setText("LANJUT KE PEMBAYARAN");
        button2.setFocusable(false);
        button2.setBounds(220, 670, 280, 35);
        button2.addActionListener(this);
        button2.setEnabled(false);
        button2.setVisible(false);

        myFrame = new JFrame();
        myFrame.setTitle("Booking Tiket PSIS");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setResizable(false);
        myFrame.setLayout(null);
        myFrame.setSize(730,760);
        myFrame.getContentPane().setBackground(new Color(0, 37, 129));
        myFrame.setIconImage(logo.getImage());
        myFrame.add(label);
        myFrame.add(panel1);
        myFrame.add(panel2);
        myFrame.add(pilihanTiket);
        myFrame.add(userP);
        myFrame.add(user);
        myFrame.add(emailP);
        myFrame.add(email);
        myFrame.add(button);
        myFrame.add(panel3);
        myFrame.add(panel4);
        myFrame.add(panel5);
        myFrame.add(panel6);
        myFrame.add(panel7);
        myFrame.add(panel8);
        myFrame.add(button2);
        myFrame.setVisible(true);
        myFrame.revalidate();
        myFrame.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pilihanTiket){
            pilihanTiket.getSelectedIndex();
            if (pilihanTiket.getSelectedIndex()==1){
                out = "Mohon cek kembali pesanan Anda.";
                out1 = "1x tiket EKONOMI PSIS Semarang vs Arema FC";
                out2 = "Std.Jatidiri Semarang 30/07/2022 KO:15.30 WIB";
                out4 = "Total Pembayaran Rp60.000,00 *Sudah termasuk pajak";
                out5 = "Jika sudah sesuai silakan lanjut ke pembayaran";
            } else if (pilihanTiket.getSelectedIndex()==2) {
                out = "Mohon cek kembali pesanan Anda.";
                out1 = "1x tiket UMUM PSIS Semarang vs Arema FC";
                out2 = "Std.Jatidiri Semarang 30/07/2022 KO:15.30 WIB";
                out4 = "Total Pembayaran Rp120.000,00 *Sudah termasuk pajak";
                out5 = "Jika sudah sesuai silakan lanjut ke pembayaran";
            } else if (pilihanTiket.getSelectedIndex()==3) {
                out = "Mohon cek kembali pesanan Anda.";
                out1 = "1x tiket VIP PSIS Semarang vs Arema FC";
                out2 = "Std.Jatidiri Semarang 30/07/2022 KO:15.30 WIB";
                out4 = "Total Pembayaran Rp200.000,00 *Sudah termasuk pajak";
                out5 = "Jika sudah sesuai silakan lanjut ke pembayaran";
            }
        } else if (e.getSource()==button) {
            if (user.getText().trim().equals("") || email.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Pastikan semua data Anda sudah terisi!",
                        "WARNING!", JOptionPane.WARNING_MESSAGE, null);
            } else if (pilihanTiket.getSelectedIndex()==0) {
                JOptionPane.showMessageDialog(null, "Pilih jenis tiket yang Anda inginkan!",
                        "WARNING!", JOptionPane.WARNING_MESSAGE, null);
            } else {
                review.setText(out);
                review1.setText(out1);
                review2.setText(out2);
                out3 = ("A.N. " + user.getText() + ", email: " + email.getText());
                review3.setText(out3);
                review4.setText(out4);
                review5.setText(out5);
                button2.setEnabled(true);
                button2.setVisible(true);
                pilihanTiket.setEnabled(false);
                user.setEnabled(false);
                email.setEnabled(false);
                button.setEnabled(false);
            }
        } else if (e.getSource()==button2) {
            int answer = JOptionPane.showOptionDialog
                    (null,"Silakan lakukan pembayaran melalui QR code berikut", "Konfirmasi Pembayaran",
                            JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, qrcode, responses, 0);
            if (answer==0){
                myFrame.dispose();
                new page3();
            }
        }
    }
}
