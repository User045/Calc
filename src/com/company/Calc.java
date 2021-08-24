package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc extends JFrame {
    private JTextField txtInput;
    private JPanel pnl1;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn8;
    private JButton btn5;
    private JButton btn6;
    private JButton btn9;
    private JButton btn7;
    private JButton btnSifir;
    private JButton btnBeraber;
    private JButton btnSil;
    private JButton button3;
    private JButton btnTopla;
    private JButton btnCixma;
    private JButton btnVurma;
    private JButton btnFaiz;
    private double answer,number;
    int operation;

    public void hesablama(){
switch (operation){
    case 1:
        answer=number+Double.parseDouble(txtInput.getText());
        txtInput.setText(Double.toString(answer));
        break;
    case  2:
        answer=number-Double.parseDouble(txtInput.getText());
        txtInput.setText(Double.toString(answer));
        break;
    case 3:
        answer=number*Double.parseDouble(txtInput.getText());
        txtInput.setText(Double.toString(answer));
        break;
    case 4:
        answer=number/Double.parseDouble(txtInput.getText());
        txtInput.setText(Double.toString(answer));
        break;
}
    }

    public Calc() {





        add(pnl1);
        setSize(325,450);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Hesablayıcı");
       setLocationRelativeTo(null);


        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtInput.setText(txtInput.getText()+e.getActionCommand());
            }
        };
        btn2.addActionListener(listener);
        btn3.addActionListener(listener);
        btn4.addActionListener(listener);
        btn8.addActionListener(listener);
        btn5.addActionListener(listener);
        btn6.addActionListener(listener);
        btn9.addActionListener(listener);
        btn7.addActionListener(listener);
        btn1.addActionListener(listener);
        btnSifir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtInput.setText(txtInput.getText()+e.getActionCommand());
            }
        });
        btnTopla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnSil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtInput.setText("");
            }
        });
        btnTopla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number=Double.parseDouble(txtInput.getText());
                operation=1;
                txtInput.setText("");

            }
        });
        btnBeraber.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hesablama();
            }
        });
        btnCixma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number=Double.parseDouble(txtInput.getText());
                operation=2;
                txtInput.setText("");
            }
        });
        btnVurma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number=Double.parseDouble(txtInput.getText());
                operation=3;
                txtInput.setText("");
            }
        });
        btnFaiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number=Double.parseDouble(txtInput.getText());
                operation=4;
                txtInput.setText("");
            }
        });
    }
}
