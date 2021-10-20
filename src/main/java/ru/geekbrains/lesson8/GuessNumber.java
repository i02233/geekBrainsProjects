package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessNumber extends JFrame {
    private int randomNumber;
    private int tryCount = 1;
    private JTextField textField;

    public GuessNumber() {
        randomNumber = (int) (Math.random() * 10) + 1;

        setTitle("Guess the number");
        setBounds(600, 300, 600, 148);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        textField.setText("Программа загадала число от 1 до 10");
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.CENTER);

        Font font = new Font("Arial", Font.PLAIN, 18);
        textField.setFont(font);

        JPanel menuPanel = new JPanel(new GridLayout(1,1));
        add(menuPanel, BorderLayout.SOUTH);

        JButton restartButton = new JButton("RESTART GAME");
        menuPanel.add(restartButton);
        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                restartGame();
            }
        });

        JPanel buttonsPanel = new JPanel(new GridLayout(1, 10));
        add(buttonsPanel, BorderLayout.CENTER);

        for (int i = 1; i <= 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.setFont(font);
            buttonsPanel.add(button);
            int buttonIndex = i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tryToAnswer(buttonIndex, button);
                }
            });
        }

        setVisible(true);


    }

    public void restartGame(){
        randomNumber = (int) (Math.random() * 10) + 1;
        tryCount = 1;
        textField.setText("Программа загадала число от 1 до 10");
        textField.setBackground(Color.WHITE);
    }

    public void tryToAnswer(int answer, JButton button) {
        if (tryCount <= 3) {
            if (answer == randomNumber) {
                textField.setText("Попытка " + tryCount + ": Вы угадали! Ответ: " + randomNumber);
                textField.setBackground(Color.GREEN);
                tryCount++;
            } else if (answer > randomNumber && tryCount < 3) {
                textField.setText("Попытка " + tryCount + ": Не угадали! Загаданное число меньше");
                textField.setBackground(Color.YELLOW);
                tryCount++;
            } else if (answer < randomNumber && tryCount < 3){
                textField.setText("Попытка " + tryCount + ": Не угадали! Загаданное число больше");
                textField.setBackground(Color.YELLOW);
                tryCount++;
            } else {
                textField.setText("Вы исчерпали все попытки. Игра закончена!");
                textField.setBackground(Color.RED);
                tryCount++;
            }
        }
    }
}
