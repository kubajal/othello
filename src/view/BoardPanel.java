package view;

import controller.Controller;
import model.Figure;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import model.Field;

/*
Glowna plansza do gry
Logika gry wywolywana jest w ActionListenerach
*/

public class BoardPanel extends JPanel{

    private final static Integer SQUARE_SIZE = 50;

    private Color brightFieldColor = new Color(133, 200, 0);
    private Color darkFieldColor = new Color(0, 160, 39);

    private Figure draggedFigure = null;

    private Field[][] board;
    Boolean playersMove = false;

    public BoardPanel() {
        board = new Field[8][8];
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                board[i][j] = new Field(j, i);
                board[i][j].setMinimumSize(new Dimension(SQUARE_SIZE, SQUARE_SIZE));
                board[i][j].setVisible(true);
                if((i+j)%2 == 0)
                    board[i][j].setBackground(brightFieldColor);
                else
                    board[i][j].setBackground(darkFieldColor);
                board[i][j].setEnabled(false);
                Icon warnIcon = new ImageIcon("yourFile.gif");
                this.add(board[i][j]);

                // kliknieto na pole do gry
                board[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        // upewnienie sie ze teraz kolej gracza, a nie komputera
                        if(playersMove){
                            // TODO: implementacja dokladania pionkow
                        }
                    }
                });
            }
        }
    }

    public Field[][] getBoard(){
        return board;
    }
}
