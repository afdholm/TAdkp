package com.bookingtiket;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class page3 implements ActionListener {
    JButton button;

    JFrame myFrame;

    page3(){
        ImageIcon banner = new ImageIcon("ty.jpg");

        JLabel label = new JLabel();
        label.setIcon(banner);
        label.setVisible(true);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 720, 480);

        JLabel label1 = new JLabel();
        label1.setText("Terima kasih atas dukungan Anda terhadap LASKAR MAHESA JENAR!");
        label1.setFont(new Font("Courier New", Font.PLAIN, 18));
        label1.setForeground(Color.yellow);

        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(0, 37, 129));
        panel1.setBounds(0, 480, 720, 30);
        panel1.add(label1);

        JLabel label2 = new JLabel();
        label2.setText("E-Tiket akan dikirimkan melalui email Anda max. 1x24 jam");
        label2.setFont(new Font("Courier New", Font.PLAIN, 16));
        label2.setForeground(Color.white);

        JLabel label3 = new JLabel();
        label3.setText("setelah pembayaran terverifikasi.");
        label3.setFont(new Font("Courier New", Font.PLAIN, 16));
        label3.setForeground(Color.white);

        JLabel label4 = new JLabel();
        label4.setText("Untuk informasi lebih lanjut hubungi:");
        label4.setFont(new Font("Courier New", Font.PLAIN, 16));
        label4.setForeground(Color.white);

        JLabel label5 = new JLabel();
        label5.setText("CP: 08XXXXXXXXXX");
        label5.setFont(new Font("Courier New", Font.PLAIN, 20));
        label5.setForeground(Color.yellow);

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(0, 37, 129));
        panel2.setBounds(0, 510, 720, 30);
        panel2.add(label2);

        JPanel panel3 = new JPanel();
        panel3.setBackground(new Color(0, 37, 129));
        panel3.setBounds(0, 530, 720, 30);
        panel3.add(label3);

        JPanel panel4 = new JPanel();
        panel4.setBackground(new Color(0, 37, 129));
        panel4.setBounds(0, 580, 720, 30);
        panel4.add(label4);

        JPanel panel5 = new JPanel();
        panel5.setBackground(new Color(0, 37, 129));
        panel5.setBounds(0, 605, 720, 30);
        panel5.add(label5);

        button = new JButton();
        button.setFont(new Font("Courier New", Font.BOLD, 18));
        button.setText("KEMBALI KE MENU UTAMA");
        button.setFocusable(false);
        button.setBounds(225, 650, 290, 35);
        button.addActionListener(this);

        myFrame = new JFrame();
        myFrame.setTitle("Booking Tiket PSIS");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setResizable(false);
        myFrame.setLayout(null);
        myFrame.setSize(730,740);
        myFrame.getContentPane().setBackground(new Color(0, 37, 129));
        ImageIcon logo = new ImageIcon("PSISlogo.png");
        myFrame.setIconImage(logo.getImage());
        myFrame.add(label);
        myFrame.add(panel1);
        myFrame.add(panel2);
        myFrame.add(panel3);
        myFrame.add(panel4);
        myFrame.add(panel5);
        myFrame.add(button);
        myFrame.setVisible(true);
        myFrame.revalidate();
        myFrame.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            myFrame.dispose();
            new page1();
        }
    }
}
