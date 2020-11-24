package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Window extends JFrame {

    private static final ImageIcon ICON_X = new ImageIcon(
            "/Users/socialgun/IdeaProjects/JAVAgeekbrains/Java1/src/main/resources/ru.geekbrains/lesson8/" +
                    "X.png");
    private static final ImageIcon ICON_O = new ImageIcon(
            "/Users/socialgun/IdeaProjects/JAVAgeekbrains/Java1/src/main/resources/ru.geekbrains/lesson8/" +
                    "O.png");
    private static final ImageIcon ICON_DEFAULT = new ImageIcon(
            "/Users/socialgun/IdeaProjects/JAVAgeekbrains/Java1/src/main/resources/ru.geekbrains/lesson8/" +
                    "def.png");
    private final JButton[][] map = new JButton[3][3];
    private static int clickCount = 0;

    private void initMap(JPanel panel) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                map[i][j] = new JButton();
                JButton btn = map[i][j];
                btn.setIcon(ICON_DEFAULT);
                btn.setDisabledIcon(ICON_DEFAULT);

                btn.addActionListener(a -> {
                    btn.setIcon(ICON_X);
                    btn.setDisabledIcon(ICON_X);
                    btn.setEnabled(false);
                    clickCount++;

                    if (clickCount == 5) {
                        playOrNot("Ничья.");

                    } else if (isVictory(ICON_X)) {
                        playOrNot("Победа!");
                    } else {
                        int v;
                        int m;
                        do {
                            Random r = new Random();
                            m = r.nextInt(3);
                            v = r.nextInt(3);
                        }
                        while (!isFree(m, v));
                        map[m][v].setIcon(ICON_O);
                        map[m][v].setDisabledIcon(ICON_O);
                        map[m][v].setEnabled(false);

                        if (isVictory(ICON_O)) {
                            playOrNot("Поражение.");
                        }
                    }
                });
                panel.add(btn);
            }
        }
    }

    private void playOrNot(String string) {
        JFrame frame = new JFrame(string);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        JPanel p = new JPanel();
        JButton close = new JButton("CLOSE");
        close.addActionListener(e -> {
            dispose();
            frame.dispose();
        });
        JButton newGame = new JButton("NEW GAME");
        newGame.addActionListener(e ->
        {
            clickCount = 0;
            new Window();
            dispose();
            frame.dispose();
        });
        p.add(close);
        p.add(newGame);
        frame.add(p);
        frame.setVisible(true);
    }

    private boolean isFree(int i, int j) {
        return map[i][j].getIcon().equals(ICON_DEFAULT);
    }

    private boolean isVictory(javax.swing.ImageIcon symbol) {
        int sumH;
        int sumV;
        int sumD1 = 0;
        int sumD2 = 0;
        for (int i = 0; i < 3; i++) {
            sumH = 0;
            sumV = 0;
            for (int j = 0; j < 3; j++) {
                if (map[i][j].getIcon().equals(symbol)) {
                    sumH++;
                    if (sumH == 3) return true;
                }
                if (map[j][i].getIcon().equals(symbol)) {
                    sumV++;
                    if (sumV == 3) return true;
                }
            }
            if (map[i][i].getIcon().equals(symbol)) {
                sumD1++;
                if (sumD1 == 3) return true;
            }
            if (map[i][3 - i - 1].getIcon().equals(symbol)) {
                sumD2++;
                if (sumD2 == 3) return true;
            }
        }
        return false;
    }

    public Window() throws HeadlessException {
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 3));

        initMap(panel);
        add(panel);

        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Window();
    }
}

