package appliString;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppliString {

	private JFrame frmOprationSurUne;
	private JTextField chaine1;
	private JTextField textFieldI;
	private JTextField textFieldJ;
	private JTextField u;
	private JTextField chaine2;
	private JTextField chaine3;
	
	private String s;
	int i,j;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppliString window = new AppliString();
					window.frmOprationSurUne.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppliString() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOprationSurUne = new JFrame();
		frmOprationSurUne.setTitle("Op\u00E9rations sur une String");
		frmOprationSurUne.setBounds(100, 100, 450, 300);
		frmOprationSurUne.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setBackground(Color.MAGENTA);
		frmOprationSurUne.getContentPane().add(panelPrincipal, BorderLayout.CENTER);
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		
		JPanel panelCentre = new JPanel();
		panelCentre.setBackground(Color.ORANGE);
		panelPrincipal.add(panelCentre, BorderLayout.CENTER);
		panelCentre.setLayout(new BorderLayout(0, 0));
		
		JPanel panelCH = new JPanel();
		panelCentre.add(panelCH, BorderLayout.NORTH);
		panelCH.setLayout(new BorderLayout(0, 0));
		
		JLabel parametre = new JLabel("Param\u00E8tres :");
		parametre.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelCH.add(parametre);
		
		JPanel panelCB = new JPanel();
		panelCentre.add(panelCB, BorderLayout.CENTER);
		
		JPanel panel1 = new JPanel();
		panelCB.add(panel1);
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel i = new JLabel("int i = ");
		i.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel1.add(i);
		
		JPanel panelI = new JPanel();
		panel1.add(panelI);
		panelI.setLayout(new GridLayout(3, 1, 0, 0));
		
		JButton bouttonGH = new JButton("\u25B2");
		bouttonGH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//-------------------------------------------------
				if(Integer.valueOf(textFieldI.getText()) < chaine1.getText().length()) {
					textFieldI.setText(String.valueOf(Integer.valueOf(textFieldI.getText()) + 1));
				}
				else {
					bouttonGH.disable();
				}
				//-------------------------------------------------
			}
		});
		panelI.add(bouttonGH);
		
		textFieldI = new JTextField();
		textFieldI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//--------------------------------------
				textFieldI.setText(String.valueOf(Integer.valueOf(textFieldI.getText())));
				//--------------------------------------
			}
		});
		textFieldI.setFont(new Font("Tahoma", Font.BOLD, 12));
		textFieldI.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldI.setText("0");
		panelI.add(textFieldI);
		textFieldI.setColumns(10);
		
		JButton bouttonGB = new JButton("\u25BC");
		bouttonGB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//--------------------------------------------
				if(Integer.valueOf(textFieldI.getText()) > 0) {
					textFieldI.setText(String.valueOf(Integer.valueOf(textFieldI.getText()) - 1));
				}
				else {
					bouttonGB.disable();
				}
				//--------------------------------------------
			}
		});
		panelI.add(bouttonGB);
		
		JPanel panel2 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel2.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		panelCB.add(panel2);
		
		JLabel j = new JLabel("int j = ");
		j.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel2.add(j);
		
		JPanel panelJ = new JPanel();
		panel2.add(panelJ);
		panelJ.setLayout(new GridLayout(3, 1, 0, 0));
		
		JButton bouttonDH = new JButton("\u25B2");
		bouttonDH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//---------------------------------------------
				if(Integer.valueOf(textFieldJ.getText()) < chaine1.getText().length()) {
					textFieldJ.setText(String.valueOf(Integer.valueOf(textFieldJ.getText()) + 1));
				}
				else {
					bouttonDH.disable();
				}
				//---------------------------------------------
			}
		});
		panelJ.add(bouttonDH);
		
		textFieldJ = new JTextField();
		textFieldJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//----------------------------------------------
				textFieldJ.setText(String.valueOf(Integer.valueOf(textFieldJ.getText())));
				//----------------------------------------------
			}
		});
		textFieldJ.setFont(new Font("Tahoma", Font.BOLD, 12));
		textFieldJ.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldJ.setText("9");
		panelJ.add(textFieldJ);
		textFieldJ.setColumns(10);
		
		JButton bouttonDB = new JButton("\u25BC");
		bouttonDB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//--------------------------------------------
				if(Integer.valueOf(textFieldJ.getText()) > 0) {
					textFieldJ.setText(String.valueOf(Integer.valueOf(textFieldJ.getText()) -1 ));
				}
				else {
					bouttonDB.disable();
				}
				//--------------------------------------------
			}
		});
		panelJ.add(bouttonDB);
		
		JPanel panelBas = new JPanel();
		panelBas.setBackground(Color.BLUE);
		panelPrincipal.add(panelBas, BorderLayout.SOUTH);
		panelBas.setLayout(new GridLayout(4, 2, 0, 0));
		
		JPanel panelBH = new JPanel();
		panelBas.add(panelBH);
		panelBH.setLayout(new BorderLayout(0, 0));
		
		JLabel resultats = new JLabel("R\u00E9sultats : ");
		resultats.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelBH.add(resultats);
		
		JPanel panelBC1 = new JPanel();
		panelBas.add(panelBC1);
		panelBC1.setLayout(new BorderLayout(0, 0));
		
		JLabel charAt = new JLabel("s.charAt(i) vaut : ");
		panelBC1.add(charAt, BorderLayout.WEST);
		
		u = new JTextField();
		u.setEditable(false);
		u.setText("U");
		panelBC1.add(u, BorderLayout.CENTER);
		u.setColumns(10);
		
		JPanel panelBC2 = new JPanel();
		panelBas.add(panelBC2);
		panelBC2.setLayout(new BorderLayout(0, 0));
		
		JLabel substring1 = new JLabel("s.substring(i) vaut : ");
		panelBC2.add(substring1, BorderLayout.WEST);
		
		chaine2 = new JTextField();
		chaine2.setEditable(false);
		chaine2.setText("Un exemple de cha\u00EEne");
		panelBC2.add(chaine2, BorderLayout.CENTER);
		chaine2.setColumns(10);
		
		JPanel panelBB = new JPanel();
		panelBas.add(panelBB);
		panelBB.setLayout(new BorderLayout(0, 0));
		
		JLabel substring2 = new JLabel("s.substring(i,j) vaut : ");
		panelBB.add(substring2, BorderLayout.WEST);
		
		chaine3 = new JTextField();
		chaine3.setEditable(false);
		chaine3.setText("Un exempl");
		panelBB.add(chaine3, BorderLayout.CENTER);
		chaine3.setColumns(10);
		
		JPanel panelHaut = new JPanel();
		panelHaut.setBackground(SystemColor.control);
		panelPrincipal.add(panelHaut, BorderLayout.NORTH);
		panelHaut.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panelH = new JPanel();
		panelHaut.add(panelH);
		panelH.setLayout(new BorderLayout(0, 0));
		
		JLabel chaine = new JLabel("Cha\u00EEne :");
		chaine.setHorizontalAlignment(SwingConstants.LEFT);
		chaine.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelH.add(chaine);
		
		JPanel panelB = new JPanel();
		panelHaut.add(panelB);
		panelB.setLayout(new BorderLayout(0, 0));
		
		chaine1 = new JTextField();
		chaine1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//--------------------------------------------
				chaine1.setText(String.valueOf(Integer.valueOf(chaine1.getText())));
				//--------------------------------------------
			}
		});
		chaine1.setText("Un exemple de cha\u00EEne");
		panelB.add(chaine1);
		chaine1.setColumns(10);
		
		JLabel string = new JLabel("String s = ");
		string.setFont(new Font("Tahoma", Font.BOLD, 12));
		panelB.add(string, BorderLayout.WEST);
	}

}
