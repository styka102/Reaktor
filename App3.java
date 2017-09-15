package reaktor;

import javax.swing.*;
import java.awt.event.*;

public class App3 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Aplikacja 3");
		JButton btnWypisz = new JButton ("Wypisz");
		JButton btnWyjdz = new JButton ("Wyjdz");
		JTextField tfImie = new JTextField();
		JTextField tfNazwisko = new JTextField();
		JTextField tfStanowisko = new JTextField();
		JTextField tfPensja = new JTextField();
		
		JLabel lblName = new JLabel ("Imie");
		JLabel lblLast = new JLabel ("Nazwisko");
		JLabel lblPos = new JLabel ("Stanowisko");
		JLabel lblPens = new JLabel ("Pensja");
		JLabel lblRes = new JLabel ("Pensja");
		
		lblName.setBounds(20, 20, 100, 20);
		lblLast.setBounds(20, 100, 100, 20);
		lblPos.setBounds(20, 180, 100, 20);
		lblPens.setBounds(20, 260, 100, 20);
		
		lblRes.setBounds(20, 380, 250, 20);
		
		tfImie.setBounds(20, 60, 100, 20);
		tfNazwisko.setBounds(20, 140, 100, 20);
		tfStanowisko.setBounds(20, 220, 100, 20);
		tfPensja.setBounds(20, 300, 100, 20);
		
		btnWypisz.setBounds(20, 420, 100, 20);
		btnWyjdz.setBounds(120, 420, 100, 20);
		
		// obluga zdarzen
			
		btnWypisz.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e){
				//co ma sie wydarzyc
				String imie = tfImie.getText();
				String nazwisko = tfNazwisko.getText();
				String stanowisko = tfStanowisko.getText();
				String pensja = tfPensja.getText();
				
				lblRes.setText(imie+" "+nazwisko+" "+stanowisko+" ("+pensja+" PLN)");
			}
		});
		
		btnWyjdz.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e){
				//co ma sie wydarzyc
				System.exit(0);
			}
		});
		
		
		frame.add(lblName);
		frame.add(lblLast);
		frame.add(lblPos);
		frame.add(lblPens);
		
		frame.add(lblRes);
		
		frame.add(tfImie);
		frame.add(tfNazwisko);
		frame.add(tfStanowisko);
		frame.add(tfPensja);
		
		frame.add(btnWypisz);
		frame.add(btnWyjdz);
		
		frame.setSize(1000, 1400);
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
