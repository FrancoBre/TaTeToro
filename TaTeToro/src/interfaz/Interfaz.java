package interfaz;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import juego.Jugador;
import juego.Jugada;
import juego.Tablero;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.IndexColorModel;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.Font;

public class Interfaz {

	private JFrame frame;
	private JTextField text_nombr1;
	private JTextField text_nombr2;
	int resp; 
	private JTextField textGanador;
	private final JButton btnAcerca = new JButton("Acerca de: ");


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("Button.background"));
		frame.getContentPane().setLayout(null);
		// PANELES 
		JPanel acerca = new JPanel();
		acerca.setBounds(0, 0, 335, 301);
		frame.getContentPane().add(acerca);
		//agrego color a el segundo panel
		acerca.setBackground(Color.GRAY);
		acerca.setLayout(null);
	
		JPanel ingreso = new JPanel();
		ingreso.setBounds(0, 0, 338, 301);
		frame.getContentPane().add(ingreso);
		ingreso.setLayout(null);
		//agrego color al primer panel 
		Color colorBorboña=new Color(205, 97, 85 );
		ingreso.setBackground(colorBorboña);
		
		
		JPanel juego = new JPanel();
		juego.setBounds(0, 0, 340, 301);
		frame.getContentPane().add(juego);
		//agrego color a el segundo panel
		Color colorBorboña2=new Color(217, 136, 128);
		juego.setBackground(colorBorboña2);
		juego.setLayout(null);
		juego.setVisible(false);
		
		JPanel resultado = new JPanel();
		resultado.setLayout(null);
		resultado.setBounds(0, 0, 338, 301);
		frame.getContentPane().add(resultado);
		//agrego color al tercer panel
		Color colorBorboña3=new Color(169, 50, 38);
		resultado.setBackground(colorBorboña3);
		
		JLabel turno = new JLabel("");
		turno.setBounds(144, 11, 120, 14);
		juego.add(turno);
		
			
			//Declaracion de botones 
			JButton btn_1 = new JButton("");
			btn_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
			JButton btn_2 = new JButton("");
			btn_2.setFont(new Font("Arial Black", Font.PLAIN, 15));
			JButton btn_3 = new JButton("");
			btn_3.setFont(new Font("Arial Black", Font.PLAIN, 15));
			JButton btn_4 = new JButton("");
			btn_4.setFont(new Font("Arial Black", Font.PLAIN, 15));
			JButton btn_5 = new JButton("");
			btn_5.setFont(new Font("Arial Black", Font.PLAIN, 15));
			JButton btn_6 = new JButton("");
			btn_6.setFont(new Font("Arial Black", Font.PLAIN, 15));
			JButton btn_7 = new JButton("");
			btn_7.setFont(new Font("Arial Black", Font.PLAIN, 15));
			JButton btn_8 = new JButton("");
			btn_8.setFont(new Font("Arial Black", Font.PLAIN, 15));
			JButton btn_9 = new JButton("");
			btn_9.setFont(new Font("Arial Black", Font.PLAIN, 15));
	
			JButton btnNewButton = new JButton("Jugar");
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
			
		
		
		text_nombr1 = new JTextField();
		text_nombr1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		text_nombr1.setBounds(139, 77, 135, 20);
		ingreso.add(text_nombr1);
		text_nombr1.setColumns(10);
		
		text_nombr2 = new JTextField();
		text_nombr2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		text_nombr2.setBounds(139, 108, 135, 20);
		ingreso.add(text_nombr2);
		text_nombr2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Jugador 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(67, 80, 72, 14);
		ingreso.add(lblNewLabel);
		
		JLabel lblJugador = new JLabel("Jugador 2");
		lblJugador.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblJugador.setBounds(67, 111, 72, 14);
		ingreso.add(lblJugador);
		btnAcerca.setBounds(19, 259, 135, 31);
		ingreso.add(btnAcerca);
		
		JLabel lblGanador = new JLabel("Ganador");
		lblGanador.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGanador.setBounds(68, 105, 72, 14);
		resultado.add(lblGanador);
		resultado.setVisible(false);
		Tablero tablero=new Tablero();
		Jugador jugador=new Jugador(1);
		frame.setBackground(UIManager.getColor("Button.disabledShadow"));
		frame.setBounds(100, 100, 348, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel_2 = new JLabel("Sobre nosotros:");
		lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(81, 30, 189, 42);
		acerca.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("C- -: ");
		lblNewLabel_3.setFont(new Font("Broadway", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(22, 69, 94, 75);
		acerca.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nicol\u00E1s Wendler");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(81, 127, 146, 28);
		acerca.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Franco Br\u00E9goli");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_5.setBounds(81, 166, 140, 28);
		acerca.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Sabrina Ar\u00E9valo");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_6.setBounds(81, 205, 122, 28);
		acerca.add(lblNewLabel_6);
		
		JButton btn_volver = new JButton("Volver");
		btn_volver.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_volver.setForeground(Color.BLACK);
		btn_volver.setBounds(27, 256, 89, 23);
		acerca.add(btn_volver);
		acerca.setVisible(false);
		
		//Action boton de verJugada
		JButton verJugada = new JButton("Jugada ganadora");
		verJugada.setBounds(40, 175, 109, 42);
		resultado.add(verJugada);
	
		//Action boton Jugar
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Jugador jugador1=new Jugador(1);
				Jugador jugador2=new Jugador(2);
				ingreso.setVisible(false);
				juego.setVisible(true);
				turno.setText(text_nombr1.getText());	
			}
		});
		btnNewButton.setBounds(111, 174, 109, 42);
		ingreso.add(btnNewButton);
		
		//Action boton acerca
		btnAcerca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnAcerca.setVisible(false);
				acerca.setVisible(true);
				btnNewButton.setVisible(false);
				text_nombr1.setVisible(false);
			}}); 
		
		//Action boton volver
				btn_volver.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						ingreso.setVisible(true);
						acerca.setVisible(false);
						btnNewButton.setVisible(true);
						text_nombr1.setVisible(true);
						btnAcerca.setVisible(true);
					}});
		
			//Action boton 1
			btn_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int num_jug = 0;
					num_jug = jugador.getNumero();
					tablero.setJugada(jugador, 0, 0);
					
					if(Jugada.esGanadora(tablero, jugador)){
						//Se muestra el panel de resultado y se esconde el del juego 
						resultado.setVisible(true);
						juego.setVisible(false);
						//Agrego ganador al input de panel resultado y muestra el nombre del ganador
						if(num_jug==1) 
							textGanador.setText(text_nombr1.getText() );
						else
							textGanador.setText(text_nombr2.getText() );
						//Bloque de input
						textGanador.setEditable(false);
					}
					
					//Cambiar los turnos, cambia nombre de los labels y agrega X o O dependiendo quien sea el jugador 
					resp=jugador.cambiarTurno(jugador);
					if (resp==1) {	
						//btn_1.setSelectedIcon(new ImageIcon("C:\\Users\\sabri\\git\\TaTeToro\\TaTeToro\\TaTeToro\\TaTeToro\\img\\circulo_rojo"));
						btn_1.setBackground(Color.red);
						btn_1.setText("O");
						turno.setText(text_nombr1.getText());
					}
					else {
						btn_1.setBackground(Color.blue);
						//btn_1.setSelectedIcon(new ImageIcon("C:\\Users\\sabri\\git\\TaTeToro\\TaTeToro\\TaTeToro\\TaTeToro\\img\\equis_negra"));
						btn_1.setText("X");
						turno.setText(text_nombr2.getText());
					}	
					//bloquea los botones cuando ya fueron usados!
					btn_1.setEnabled(false);
				}
			});
			btn_1.setBounds(79, 60, 55, 55);
			juego.add(btn_1);
			
			//Action boton 2
			btn_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int num_jug = 0;
					num_jug = jugador.getNumero();
					tablero.setJugada(jugador, 0, 1);
					if(Jugada.esGanadora(tablero, jugador)){
						//Se muestra el panel de resultado y se esconde el del juego 
						resultado.setVisible(true);
						juego.setVisible(false);
						//Agrego ganador al input de panel resultado y muestra el nombre del ganador
						if(num_jug==1) 
							textGanador.setText(text_nombr1.getText() );
						else
							textGanador.setText(text_nombr2.getText() );
						//Bloque de input
						textGanador.setEditable(false);
					}
					
					//Cambiar los turnos, cambia nombre de los labels y agrega X o O dependiendo quien sea el jugador 
					resp=jugador.cambiarTurno(jugador);
					if (resp==1) {	
						btn_2.setBackground(Color.red);
						btn_2.setText("O");
						turno.setText(text_nombr1.getText());
					}
					else {
						btn_2.setBackground(Color.BLUE);
						btn_2.setText("X");
						turno.setText(text_nombr2.getText());
					}
					//bloquea los botones cuando ya fueron usados!
					btn_2.setEnabled(false);
				}
			});
			btn_2.setBounds(144, 60, 55, 55);
			juego.add(btn_2);
			
			//Action boton 3
			btn_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int num_jug = 0;
					num_jug = jugador.getNumero();
					tablero.setJugada(jugador, 0, 2);
					
					if(Jugada.esGanadora(tablero, jugador)){
						//Se muestra el panel de resultado y se esconde el del juego 
						resultado.setVisible(true);
						juego.setVisible(false);
						//Agrego ganador al input de panel resultado y muestra el nombre del ganador
						if(num_jug==1) 
							textGanador.setText(text_nombr1.getText() );
						else
							textGanador.setText(text_nombr2.getText() );
						//Bloque de input
						textGanador.setEditable(false);
					}
					 
					//Cambiar los turnos, cambia nombre de los labels y agrega X o O dependiendo quien sea el jugador 
					resp=jugador.cambiarTurno(jugador);
					if (resp==1) {	
						btn_3.setBackground(Color.red);
						btn_3.setText("O");
						turno.setText(text_nombr1.getText());
					}
					else {
						btn_3.setBackground(Color.blue);
						btn_3.setText("X");
						turno.setText(text_nombr2.getText());
					}
					//bloquea los botones cuando ya fueron usados!
					btn_3.setEnabled(false);
				}
			});
			btn_3.setBounds(209, 60, 55, 55);
			juego.add(btn_3);
			
			//Action boton 4
			btn_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int num_jug = 0;
					num_jug = jugador.getNumero();
					tablero.setJugada(jugador, 1, 0);
					
					if(Jugada.esGanadora(tablero, jugador)){
						//Se muestra el panel de resultado y se esconde el del juego 
						resultado.setVisible(true);
						juego.setVisible(false);
						//Agrego ganador al input de panel resultado y muestra el nombre del ganador
						if(num_jug==1) 
							textGanador.setText(text_nombr1.getText() );
						else
							textGanador.setText(text_nombr2.getText() );
						//Bloque de input
						textGanador.setEditable(false);
					}
					
					//Cambiar los turnos, cambia nombre de los labels y agrega X o O dependiendo quien sea el jugador 	
					resp=jugador.cambiarTurno(jugador);
					if (resp==1) {	
						btn_4.setBackground(Color.red);
						btn_4.setText("O");
						turno.setText(text_nombr1.getText());
					
					}
					else {
						btn_4.setBackground(Color.blue);
						btn_4.setText("X");
						turno.setText(text_nombr2.getText());
					}
					//bloquea los botones cuando ya fueron usados!
					btn_4.setEnabled(false);
				}
			});
			btn_4.setBounds(79, 126, 55, 55);
			juego.add(btn_4);
			
			//Action boton 5
			btn_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int num_jug = 0;
					num_jug = jugador.getNumero();
					tablero.setJugada(jugador, 1, 1);
					
					if(Jugada.esGanadora(tablero, jugador)){
						//Se muestra el panel de resultado y se esconde el del juego 
						resultado.setVisible(true);
						juego.setVisible(false);
						//Agrego ganador al input de panel resultado y muestra el nombre del ganador
						if(num_jug==1) 
							textGanador.setText(text_nombr1.getText() );
						else
							textGanador.setText(text_nombr2.getText() );
						//Bloque de input
						textGanador.setEditable(false);
					}
					
					//Cambiar los turnos, cambia nombre de los labels y agrega X o O dependiendo quien sea el jugador 
					resp=jugador.cambiarTurno(jugador);
					if (resp==1) {	
						btn_5.setBackground(Color.red);
						btn_5.setText("O");
						turno.setText(text_nombr1.getText());
					}
					else {
						btn_5.setBackground(Color.blue);
						btn_5.setText("X");
						turno.setText(text_nombr2.getText());
					}
					//bloquea los botones cuando ya fueron usados!
					btn_5.setEnabled(false);
				}
			});
			btn_5.setBounds(144, 126, 55, 55);
			juego.add(btn_5);
			
			//Action boton 6
			btn_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int num_jug = 0;
					num_jug = jugador.getNumero();
					tablero.setJugada(jugador, 1, 2);
					
					if(Jugada.esGanadora(tablero, jugador)){
						//Se muestra el panel de resultado y se esconde el del juego 
						resultado.setVisible(true);
						juego.setVisible(false);
						//Agrego ganador al input de panel resultado y muestra el nombre del ganador
						if(num_jug==1) 
							textGanador.setText(text_nombr1.getText() );
						else
							textGanador.setText(text_nombr2.getText() );
						//Bloque de input
						textGanador.setEditable(false);
					}
					
					//Cambiar los turnos, cambia nombre de los labels y agrega X o O dependiendo quien sea el jugador 
					resp=jugador.cambiarTurno(jugador);
					if (resp==1) {	
						btn_6.setBackground(Color.red);
						btn_6.setText("O");
						turno.setText(text_nombr1.getText());
					
					}
					else {
						btn_6.setBackground(Color.blue);
						btn_6.setText("X");
						turno.setText(text_nombr2.getText());
					}
					//bloquea los botones cuando ya fueron usados!
					btn_6.setEnabled(false);
				}
			});
			btn_6.setBounds(209, 126, 55, 55);
			juego.add(btn_6);
			
			//Action boton 7
			btn_7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int num_jug = 0;
					num_jug = jugador.getNumero();
					tablero.setJugada(jugador, 2, 0);
					
					if(Jugada.esGanadora(tablero, jugador)){
						//Se muestra el panel de resultado y se esconde el del juego 
						resultado.setVisible(true);
						juego.setVisible(false);
						//Agrego ganador al input de panel resultado y muestra el nombre del ganador
						if(num_jug==1) 
							textGanador.setText(text_nombr1.getText() );
						else
							textGanador.setText(text_nombr2.getText() );
						//Bloque de input
						textGanador.setEditable(false);
					}
					
					//Cambiar los turnos, cambia nombre de los labels y agrega X o O dependiendo quien sea el jugador 
					resp=jugador.cambiarTurno(jugador);
					if (resp==1) {	
						btn_7.setBackground(Color.red);
						btn_7.setText("O");
						turno.setText(text_nombr1.getText());
					}
					else {
						btn_7.setBackground(Color.blue);
						btn_7.setText("X");
						turno.setText(text_nombr2.getText());
					}
					btn_7.setEnabled(false);
				}
			});
			btn_7.setBounds(79, 192, 55, 55);
			juego.add(btn_7);
			
			//Action boton 8
			btn_8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int num_jug = 0;
					num_jug = jugador.getNumero();
					tablero.setJugada(jugador, 2, 1);
					
					if(Jugada.esGanadora(tablero, jugador)){
						//Se muestra el panel de resultado y se esconde el del juego 
						resultado.setVisible(true);
						juego.setVisible(false);
						//Agrego ganador al input de panel resultado 
						// muestra el nombre del ganador
						if(num_jug==1) 
							textGanador.setText(text_nombr1.getText() );
						else
							textGanador.setText(text_nombr2.getText() );
						//Bloque de input
						textGanador.setEditable(false);
					}
					
					//Cambiar los turnos, cambia nombre de los labels y agrega X o O dependiendo quien sea el jugador 
					resp=jugador.cambiarTurno(jugador);
					if (resp==1) {	
						btn_8.setBackground(Color.red);
						btn_8.setText("O");
						turno.setText(text_nombr1.getText());
					}
					else {
						btn_8.setBackground(Color.blue);
						btn_8.setText("X");
						turno.setText(text_nombr2.getText());
					}
					//bloquea los botones cuando ya fueron usados!
					btn_8.setEnabled(false);
				}
			});
			btn_8.setBounds(144, 192, 55, 55);
			juego.add(btn_8);
			
			//Action boton 9
			btn_9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int num_jug = 0;
					num_jug = jugador.getNumero();
					tablero.setJugada(jugador, 2, 2);
					
					if(Jugada.esGanadora(tablero, jugador)){
						//Se muestra el panel de resultado y se esconde el del juego 
						resultado.setVisible(true);
						juego.setVisible(false);
						//Agrego ganador al input de panel resultado 
						// muestra el nombre del ganador
						if(num_jug==1) 
							textGanador.setText(text_nombr1.getText() );
						else
							textGanador.setText(text_nombr2.getText() );
						
						//Bloque de input
						textGanador.setEditable(false);
					}
				
					//Cambiar los turnos, cambia nombre de los labels y agrega X o O dependiendo quien sea el jugador 
					resp=jugador.cambiarTurno(jugador);
					if (resp==1) {	
						btn_9.setBackground(Color.red);
						btn_9.setText("O");
						turno.setText(text_nombr1.getText());
					}
					else {
						btn_9.setBackground(Color.blue);
						btn_9.setText("X");
						turno.setText(text_nombr2.getText());
					}
					//bloquea los botones cuando ya fueron usados!
					btn_9.setEnabled(false);
				}
			});
			btn_9.setBounds(209, 192, 55, 55);
			juego.add(btn_9);
			
			JLabel lblNewLabel_1 = new JLabel("Turno de :");
			lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 13));
			lblNewLabel_1.setBounds(79, 11, 97, 14);
			juego.add(lblNewLabel_1);
			
			JButton btn_volverMenu = new JButton("Volver al men\u00FA");
			btn_volverMenu.setFont(new Font("Arial", Font.PLAIN, 13));
			btn_volverMenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//Action volver a jugar
					juego.setVisible(false);
					ingreso.setVisible(true);
					//Limpiar tablero y jugadores
				}
			});
			btn_volverMenu.setBounds(10, 267, 110, 23);
			juego.add(btn_volverMenu);
		
		
		//Action boton cerrar
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(185, 175, 109, 42);
		resultado.add(btnCerrar);
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnCerrar.setVisible(false);
				ingreso.setVisible(true);
				text_nombr1.setText(" ");
				text_nombr2.setText(" ");
				Window w = SwingUtilities.getWindowAncestor(ingreso);
				 w.setVisible(false);

				 //si alguno quiere verficarlo mire aca 
//				btn_1.setEnabled(true);
//				btn_2.setEnabled(true);
//				btn_3.setEnabled(true);
//				btn_4.setEnabled(true);
//				btn_5.setEnabled(true);
//				btn_6.setEnabled(true);
//				btn_7.setEnabled(true);
//				btn_8.setEnabled(true);
//				btn_9.setEnabled(true);
//				btn_1.setText("");
//				btn_2.setText("");
//				btn_3.setText("");
//				btn_4.setText("");
//				btn_5.setText("");
//				btn_6.setText("");
//				btn_7.setText("");
//				btn_8.setText("");
//				btn_9.setText("");
//				tablero.LimpiarTablero();
			}});
		textGanador = new JTextField();
		textGanador.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textGanador.setColumns(10);
		textGanador.setBounds(140, 102, 135, 20);
		resultado.add(textGanador);
		
	}

	protected void removeAll() {
		// TODO Auto-generated method stub
		
	}
}
