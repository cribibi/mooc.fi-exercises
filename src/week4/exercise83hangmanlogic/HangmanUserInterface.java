package week4.exercise83hangmanlogicNeverificat;

// do not touch this!

import libs.HangmanLogic;

import javax.swing.*;
import java.awt.*;

public class HangmanUserInterface extends JFrame {

    private HangmanFigure figure;

    public HangmanUserInterface(HangmanLogicBianca logiikka) throws HeadlessException {
        super();
        setTitle("Hangman");

        this.figure = new HangmanFigure(logiikka, this);
        add(this.figure);
        addKeyListener(new HirsipuuKeyAdapter(logiikka));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
    }

    @Override
    public void repaint() {
        super.repaint();
        this.figure.repaint();
    }

    public void start() {
        setVisible(true);
    }
}