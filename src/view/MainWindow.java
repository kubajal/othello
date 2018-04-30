package view;

import javax.swing.*;
import javax.swing.JFrame;
import model.Field;

import java.awt.*;

public class MainWindow extends JFrame{
	
	private static final long serialVersionUID = -7729510720848698724L; // kod seryjny klasy JFrame

	private final static Integer WINDOW_SIZE = 90 * 8;

	private IntroPanel introPanel;
	private BoardPanel boardPanel;

	public IntroPanel getIntroPanel(){
		return introPanel;
	}
	public BoardPanel getBoardPanel(){
		return boardPanel;
	}
	
    public MainWindow() {

    	try {
			SwingUtilities.invokeAndWait(new Runnable() {

				public void run() {
					introPanel = new IntroPanel();
					boardPanel = new BoardPanel();
					boardPanel.setVisible(false);
					introPanel.setVisible(true);
				}
			});

		}
    	catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Nie udalo sie utworzyc interfejsu dla uzytkownika. Sprobuj uruchomic aplikacje ponownie.");
    	}
		showIntroPanel();
    }

	public void showIntroPanel() {
		getContentPane().removeAll();
		getContentPane().add(introPanel);
		setTitle("Szachy");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 400);
		setLocationRelativeTo(null); // ustawiamy okno powitalne na srodku ekranu
		setVisible(true);
		setResizable(false);
	}

	public void showBoardPanel() {
		getContentPane().removeAll();
		getContentPane().add(boardPanel);
		boardPanel.setLayout(new GridLayout(8,8));
		setTitle("Szachy");
		setSize(WINDOW_SIZE, WINDOW_SIZE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // ustawiamy ekran gry na srodku ekranu
		setResizable(false);
	}

	public Field[][] getBoard(){

		return boardPanel.getBoard();
	}
}