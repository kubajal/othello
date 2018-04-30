package view;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import controller.Controller;

/*
Panel Powitalny
Mozna uzupelnic o jakiekolwiek opcje gry, ktore sie ustawia na poczatku.
Na razie jest tylko wybor kolru.
*/

public class IntroPanel extends JPanel {

	private static final long serialVersionUID = -7729510720848698725L; // kod seryjny klasy JPanel

	private JButton acceptButton, whitePlayerColorButton, blackPlayerColorButton;

	private Label playerColorLabel1, playerColorLabel2;
	private TextField playerColorField, timeField;

	private Controller controller;

	private long timeForMove;
	private boolean playerHasWhiteFigures;

	public JButton getAcceptButton(){
		return acceptButton;
	}

	public Boolean playerHasWhite(){
		return playerHasWhiteFigures;
	}

	public IntroPanel() {

		setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 5));

		whitePlayerColorButton = new JButton("Biały");
		blackPlayerColorButton = new JButton("Czarny");
		acceptButton = new JButton("Ok");
		playerHasWhiteFigures = true;

		whitePlayerColorButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				playerColorField.setText("Biały");
				playerHasWhiteFigures = true;
			}
		});
		blackPlayerColorButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				playerColorField.setText("Czarny");
				playerHasWhiteFigures = false;
			}
		});

		playerColorLabel1 = new Label("Wybierz kolor figur, którymi będzie grał gracz.");
		playerColorLabel2 = new Label("Komputer otrzyma figury przeciwnego koloru");

		playerColorField = new TextField("Biały", 6);
		playerColorField.setEditable(false);

		add(playerColorLabel1);
		add(playerColorLabel2);
		add(whitePlayerColorButton);
		add(blackPlayerColorButton);
		add(playerColorField);
		add(acceptButton);
	}
}
