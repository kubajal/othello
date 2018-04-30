package controller;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import model.Figure;
import view.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;


public class Controller {

    final static String WHITECOLOR = "WHITE";
    final static String BLACKCOLOR = "BLACK";

    private final ImageIcon whiteIcon =  new ImageIcon(this.getClass().getResource("/model/bialy.png"));
    private final ImageIcon blackIcon =  new ImageIcon(this.getClass().getResource("/model/czarny.png"));
    private String playerColor = BLACKCOLOR;

    MainWindow mainWindow;

    public Controller (MainWindow _mainWindow){

        mainWindow = _mainWindow;
        mainWindow.getIntroPanel().getAcceptButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(mainWindow.getIntroPanel().playerHasWhite()){
                    playerColor = WHITECOLOR;
                    mainWindow.showBoardPanel();
                    mainWindow.getBoardPanel().setVisible(true);
                    initGame(mainWindow.getIntroPanel().playerHasWhite());
                }
            }
        });
    }

    private Vector<Figure> white;
    private Vector<Figure> black;

    void initGame(Boolean b){

        white = new Vector<Figure>();
        black = new Vector<Figure>();

        white.add(new Figure(WHITECOLOR, 3, 3));
        white.add(new Figure(WHITECOLOR, 4, 4));

        black.add(new Figure(BLACKCOLOR, 3, 4));
        black.add(new Figure(BLACKCOLOR, 4, 3));
        if(b){
            mainWindow.getBoard()[3][3].setEnabled(true);
            mainWindow.getBoard()[4][4].setEnabled(true);
        }
        else{
            mainWindow.getBoard()[3][4].setEnabled(true);
            mainWindow.getBoard()[4][3].setEnabled(true);
        }
        mainWindow.getBoard()[3][3].add(new JLabel(whiteIcon));
        mainWindow.getBoard()[4][4].add(new JLabel(whiteIcon));
        mainWindow.getBoard()[3][4].add(new JLabel(blackIcon));
        mainWindow.getBoard()[4][3].add(new JLabel(blackIcon));
    }

}
