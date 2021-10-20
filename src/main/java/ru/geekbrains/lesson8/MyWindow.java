package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("My Simple Window");
        setBounds(600, 300, 600, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JTextField textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        Font font = new Font("Arial", Font.PLAIN, 18);
        textField.setFont(font);

        JPanel buttonsPanel = new JPanel(new GridLayout(1, 3));
        add(buttonsPanel, BorderLayout.CENTER);

        setVisible(true);


    }
}
