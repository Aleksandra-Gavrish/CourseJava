package Lesson7;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JMenuBar;



public class GameWindow extends JFrame {

    private Settings settings;
    private GameMap gameMap;

    private final int WIN_WIDTH = 500;
    private final int WIN_HEIGHT = 555;
    private int winPosX;
    private int winPosY;

    private JButton btnStartGame;
    private JButton btnExitGame;
    private JPanel panelForButtons;


    GameWindow() {
        setupWindow();
        prepareButton();
        settings = new Settings(this);
        gameMap = new GameMap();

        add(panelForButtons, BorderLayout.SOUTH);
        add(gameMap);
        setVisible(true);
    }

    private void setupWindow() {
        winPosX = 500;
        winPosY = 250;
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setLocation(winPosX, winPosY);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Our Game!!!");
        setResizable(false);
    }



    private void prepareButton () {
            btnStartGame = new JButton("Start game");
            btnStartGame.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    settings.setVisible(true);
                }
            });

            btnExitGame = new JButton("Exit game");
            btnExitGame.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
            panelForButtons = new JPanel();
            panelForButtons.setLayout(new GridLayout(1, 2));
            panelForButtons.add(btnStartGame);
            panelForButtons.add(btnExitGame);
        }

        void startGameWithUserSetting ( int gameMod, int fieldSizeX, int fieldSizeY, int winLength){
            gameMap.start(gameMod, fieldSizeX, fieldSizeY, winLength);
        }

    }
