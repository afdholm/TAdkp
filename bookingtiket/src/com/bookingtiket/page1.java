package com.bookingtiket;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class page1 implements ActionListener {
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;

    JFrame myFrame;

    page1(){
        ImageIcon banner = new ImageIcon("banner.jpg");
        //Border border = BorderFactory.createLineBorder(Color.white, 2);

        JLabel label = new JLabel();
        label.setIcon(banner);
        //label.setBorder(border);
        label.setVisible(true);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 720, 240);

        JLabel label1 = new JLabel();
        label1.setText("Selamat Datang di Booking Tiket PSIS.com");
        label1.setFont(new Font("Courier New", Font.PLAIN, 20));
        label1.setForeground(Color.white);
        //label1.setVisible(true);
        //label1.setBackground(new Color(0, 37, 129));
        //label1.setBounds(0, 240, 720, 120);

        JLabel label2 = new JLabel();
        label2.setText("Dukungan Anda sangat berarti bagi Laskar Mahesa Jenar.");
        label2.setFont(new Font("Courier New", Font.PLAIN, 20));
        label2.setForeground(Color.white);

        JLabel label3 = new JLabel();
        label3.setText("YOH ISO YOH!");
        label3.setFont(new Font("Courier New", Font.PLAIN, 20));
        label3.setForeground(Color.white);

        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(0, 37, 129));
        //panel1.setLayout(null);
        panel1.setBounds(0, 240, 720, 30);
        //panel1.setVisible(true);
        panel1.add(label1);

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(0, 37, 129));
        panel2.setBounds(0, 260, 720, 30);
        panel2.add(label2);

        JPanel panel3 = new JPanel();
        panel3.setBackground(new Color(0, 37, 129));
        panel3.setBounds(0, 280, 720, 30);
        panel3.add(label3);

        button1 = new JButton();
        button1.setBounds(10, 330, 695, 40);
        button1.setText("PSIS Semarang vs Bali United");
        button1.setFont(new Font("Courier New", Font.BOLD, 18));
        button1.setFocusable(false);
        button1.addActionListener(this);

        JLabel label4 = new JLabel();
        label4.setText("Std Jatidiri Semarang 02/07/22 KO:18.30 WIB");
        label4.setFont(new Font("Courier New", Font.PLAIN, 16));
        label4.setForeground(Color.white);

        JPanel panel4 = new JPanel();
        panel4.setBackground(new Color(0, 37, 129));
        panel4.setBounds(0, 370, 720, 30);
        panel4.add(label4);

        button2 = new JButton();
        button2.setBounds(10, 410, 695, 40);
        button2.setText("PSIS Semarang vs PSS Sleman");
        button2.setFont(new Font("Courier New", Font.BOLD, 18));
        button2.setFocusable(false);
        button2.addActionListener(this);

        JLabel label5 = new JLabel();
        label5.setText("Std Jatidiri Semarang 24/07/22 KO:15.30 WIB");
        label5.setFont(new Font("Courier New", Font.PLAIN, 16));
        label5.setForeground(Color.white);

        JPanel panel5 = new JPanel();
        panel5.setBackground(new Color(0, 37, 129));
        panel5.setBounds(0, 450, 720, 30);
        panel5.add(label5);

        button3 = new JButton();
        button3.setBounds(10, 490, 695, 40);
        button3.setText("PSIS Semarang vs Arema FC");
        button3.setFont(new Font("Courier New", Font.BOLD, 18));
        button3.setFocusable(false);
        button3.addActionListener(this);

        JLabel label6 = new JLabel();
        label6.setText("Std Jatidiri Semarang 30/07/22 KO:15.30 WIB");
        label6.setFont(new Font("Courier New", Font.PLAIN, 16));
        label6.setForeground(Color.white);

        JPanel panel6 = new JPanel();
        panel6.setBackground(new Color(0, 37, 129));
        panel6.setBounds(0, 530, 720, 30);
        panel6.add(label6);

        button4 = new JButton();
        button4.setBounds(10, 570, 695, 40);
        button4.setText("PSIS Semarang vs Persebaya Surabaya (SOLD OUT)");
        button4.setFont(new Font("Courier New", Font.BOLD, 18));
        button4.setForeground(Color.red);
        button4.setFocusable(false);
        button4.addActionListener(this);
        button4.setEnabled(false);

        JLabel label7 = new JLabel();
        label7.setText("Std Jatidiri Semarang 13/08/22 KO:18.30 WIB");
        label7.setFont(new Font("Courier New", Font.PLAIN, 16));
        label7.setForeground(Color.white);

        JPanel panel7 = new JPanel();
        panel7.setBackground(new Color(0, 37, 129));
        panel7.setBounds(0, 610, 720, 30);
        panel7.add(label7);

        JLabel label8 = new JLabel();
        label8.setText("*Booking Tiket PSIS.com hanya menyediakan tiket pertandingan KANDANG. ");
        label8.setFont(new Font("Courier New", Font.PLAIN, 14));
        label8.setForeground(Color.white);

        JPanel panel8 = new JPanel();
        panel8.setBackground(new Color(0, 37, 129));
        panel8.setBounds(0, 650, 720, 25);
        panel8.add(label8);

        JLabel label9 = new JLabel();
        label9.setText("**Tiket pertandingan pada bulan September dan Oktober tersedia per 01/07/22.");
        label9.setFont(new Font("Courier New", Font.PLAIN, 14));
        label9.setForeground(Color.white);

        JPanel panel9 = new JPanel();
        panel9.setBackground(new Color(0, 37, 129));
        panel9.setBounds(0, 670, 720, 25);
        panel9.add(label9);

        JLabel label10 = new JLabel();
        label10.setText("CP: 08XXXXXXXXXX");
        label10.setFont(new Font("Courier New", Font.PLAIN, 20));
        label10.setForeground(Color.yellow);

        JPanel panel10 = new JPanel();
        panel10.setBackground(new Color(0, 37, 129));
        panel10.setBounds(0, 690, 720, 25);
        panel10.add(label10);

        myFrame = new JFrame();
        myFrame.setTitle("Booking Tiket PSIS");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setResizable(false);
        myFrame.setLayout(null);
        myFrame.setSize(730,760);
        myFrame.getContentPane().setBackground(new Color(0, 37, 129));
        ImageIcon logo = new ImageIcon("PSISlogo.png");
        myFrame.setIconImage(logo.getImage());
        myFrame.setVisible(true);
        myFrame.add(label);
        myFrame.add(panel1);
        myFrame.add(panel2);
        myFrame.add(panel3);
        myFrame.add(button1);
        myFrame.add(panel4);
        myFrame.add(button2);
        myFrame.add(panel5);
        myFrame.add(button3);
        myFrame.add(panel6);
        myFrame.add(button4);
        myFrame.add(panel7);
        myFrame.add(panel8);
        myFrame.add(panel9);
        myFrame.add(panel10);
        myFrame.revalidate();
        myFrame.repaint();
        //myFrame.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
            myFrame.dispose();
            new page2();
        } else if (e.getSource()==button2){
            myFrame.dispose();
            new page2b();
        } else if (e.getSource()==button3){
            myFrame.dispose();
            new page2c();
        }
    }
}
