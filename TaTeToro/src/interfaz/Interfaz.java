package interfaz;

import java.awt.Color;

import java.awt.EventQueue;

import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.UIManager;

import juego.Jugador;
import juego.Jugada;
import juego.Tablero;

import javax.swing.JButton;
import java.awt.event.ActionListener;
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
		acerca.setBounds(0, 0, 360, 300);
		frame.getContentPane().add(acerca);
		//agrego color a el segundo panel
		acerca.setBackground(Color.GRAY);
		acerca.setLayout(null);
	
		JPanel ingreso = new JPanel();
		ingreso.setBounds(0, 0, 360, 300);
		frame.getContentPane().add(ingreso);
		ingreso.setLayout(null);
		//agrego color al primer panel 
		Color colorBorbonia=new Color(205, 97, 85 );
		ingreso.setBackground(colorBorbonia);
		
		
		JPanel juego = new JPanel();
		juego.setBounds(0, 0, 360, 300);
		frame.getContentPane().add(juego);
		//agrego color a el segundo panel
		Color colorBorbonia2=new Color(217, 136, 128);
		juego.setBackground(colorBorbonia2);
		
		juego.setLayout(null);
		juego.setVisible(false);
		
		JPanel resultado = new JPanel();
		resultado.setLayout(null);
		resultado.setBounds(0, 0, 360, 300);
		frame.getContentPane().add(resultado);
		//agrego color al tercer panel
		Color colorBorbonia3=new Color(169, 50, 38);
		resultado.setBackground(colorBorbonia3);
		
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
		frame.setBounds(100, 100, 360, 332);
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
		
		JLabel turno_de = new JLabel("Turno de :");
		turno_de.setFont(new Font("Arial", Font.PLAIN, 13));
		turno_de.setBounds(79, 11, 97, 14);
		juego.add(turno_de);
		
		JButton volver_resul = new JButton("Volver al resultado");
		volver_resul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				juego.setVisible(false);
				resultado.setVisible(true);
			}
		});
		volver_resul.setBounds(206, 267, 124, 23);
		juego.add(volver_resul);
	
		
		
		
		//-----------------------BOTONES----------------------------------// 
		
		
		//Action boton de verJugada
			
		//Action boton Jugar
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ingreso.setVisible(false);
				juego.setVisible(true);
				volver_resul.setVisible(false);
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
		
				JButton verJugada = new JButton("Jugada ganadora");
				verJugada.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						juego.setVisible(true);
						resultado.setVisible(false);
						volver_resul.setVisible(true);
						turno_de.setVisible(false);
						turno.setVisible(false);
						btn_1.setEnabled(false);
						btn_2.setEnabled(false);
						btn_3.setEnabled(false);
						btn_4.setEnabled(false);
						btn_5.setEnabled(false);
						btn_6.setEnabled(false);
						btn_7.setEnabled(false);
						btn_8.setEnabled(false);
						btn_9.setEnabled(false);
					}
				});
				verJugada.setBounds(40, 175, 117, 42);
				resultado.add(verJugada);		
				
			//Action boton 1
			btn_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int num_jug = 0;
					num_jug = jugador.getNumero();
					tablero.setJugada(jugador, 0, 0);
					
					//verifica si es jugadora ganadora
					verificaJugadaGanadora(juego, resultado, tablero, jugador, num_jug);
					
					//Cambiar los turnos, cambia nombre de los labels y agrega X o O dependiendo quien sea el jugador 
					cambiarTurnos(turno, btn_1, jugador);	
					
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
					
					//verifica si es jugadora ganadora
					verificaJugadaGanadora(juego, resultado, tablero, jugador, num_jug);
					
					//Cambiar los turnos, cambia nombre de los labels y agrega X o O dependiendo quien sea el jugador 
					cambiarTurnos(turno, btn_2, jugador);
					
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
					
					//verifica si es jugada ganadora
					verificaJugadaGanadora(juego, resultado, tablero, jugador, num_jug);
					
					//Cambiar los turnos, cambia nombre de los labels y agrega X o O dependiendo quien sea el jugador 
					cambiarTurnos(turno, btn_3, jugador);
					
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
					//verifica si es jugada ganadora
					verificaJugadaGanadora(juego, resultado, tablero, jugador, num_jug);
					
					//Cambiar los turnos, cambia nombre de los labels y agrega X o O dependiendo quien sea el jugador 
					cambiarTurnos(turno, btn_4, jugador);
					
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
					
					//verifica si es jugada ganadora
					verificaJugadaGanadora(juego, resultado, tablero, jugador, num_jug);
					
					//Cambiar los turnos, cambia nombre de los labels y agrega X o O dependiendo quien sea el jugador 
					cambiarTurnos(turno, btn_5, jugador);
					
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
					
					//verifica si es jugada ganadora
					verificaJugadaGanadora(juego, resultado, tablero, jugador, num_jug);
					
					//Cambiar los turnos, cambia nombre de los labels y agrega X o O dependiendo quien sea el jugador 
					cambiarTurnos(turno, btn_6, jugador);
					
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
					
					//verifica si es jugada ganadora
					verificaJugadaGanadora(juego, resultado, tablero, jugador, num_jug);
					
					//Cambiar los turnos, cambia nombre de los labels y agrega X o O dependiendo quien sea el jugador 
					cambiarTurnos(turno, btn_7, jugador);
					
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
					
					//verifica si es jugada ganadora
					verificaJugadaGanadora(juego, resultado, tablero, jugador, num_jug);
					
					//Cambiar los turnos, cambia nombre de los labels y agrega X o O dependiendo quien sea el jugador 
					cambiarTurnos(turno, btn_8, jugador);
					
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
					
					//verifica si es jugada ganadora
					verificaJugadaGanadora(juego, resultado, tablero, jugador, num_jug);
				
					//Cambiar los turnos, cambia nombre de los labels y agrega X o O dependiendo quien sea el jugador 
					cambiarTurnos(turno, btn_9, jugador);
					//bloquea los botones cuando ya fueron usados!
					btn_9.setEnabled(false);
				}
			});
			btn_9.setBounds(209, 192, 55, 55);
			juego.add(btn_9);
			
			
			//volver al menu desde el juego
			JButton btn_volverMenu = new JButton("Volver al men\u00FA");
			btn_volverMenu.setFont(new Font("Arial", Font.PLAIN, 13));
			btn_volverMenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//Action volver a jugar
					turno_de.setVisible(true);
					turno.setVisible(true);
					juego.setVisible(false);
					ingreso.setVisible(true);
					//limpio el tablero y los jugadores
					tablero.LimpiarTablero();
					jugador.limpiarJugadores();
					//Limpio los nombres 
					text_nombr1.setText("");
					text_nombr2.setText("");
					//Limpia las propiedades de los botones (color y contenido)
					limpiarBoton(btn_1);
					limpiarBoton(btn_2);
					limpiarBoton(btn_3);
					limpiarBoton(btn_4);
					limpiarBoton(btn_5);
					limpiarBoton(btn_6);
					limpiarBoton(btn_7);
					limpiarBoton(btn_8);
					limpiarBoton(btn_9);
				}
			});
			btn_volverMenu.setBounds(10, 267, 124, 23);
			juego.add(btn_volverMenu);
			
			
		
		//Action boton cerrar
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(112, 234, 117, 42);
		resultado.add(btnCerrar);
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnCerrar.setVisible(false);
				ingreso.setVisible(true);
				text_nombr1.setText(" ");
				text_nombr2.setText(" ");
				Window w = SwingUtilities.getWindowAncestor(ingreso);
				 w.setVisible(false);

			}});
		textGanador = new JTextField();
		textGanador.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textGanador.setColumns(10);
		textGanador.setBounds(140, 102, 135, 20);
		resultado.add(textGanador);
		
		//volver al menu desde resultado
		JButton volver_menu = new JButton("Volver al men\u00FA");
		volver_menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Action volver a jugar
				turno_de.setVisible(true);
				turno.setVisible(true);
				juego.setVisible(false);
				resultado.setVisible(false);
				ingreso.setVisible(true);
				//limpio el tablero y los jugadores
				tablero.LimpiarTablero();
				jugador.limpiarJugadores();
				//Limpio los nombres 
				text_nombr1.setText("");
				text_nombr2.setText("");
				//Limpia las propiedades de los botones (color y contenido)
				limpiarBoton(btn_1);
				limpiarBoton(btn_2);
				limpiarBoton(btn_3);
				limpiarBoton(btn_4);
				limpiarBoton(btn_5);
				limpiarBoton(btn_6);
				limpiarBoton(btn_7);
				limpiarBoton(btn_8);
				limpiarBoton(btn_9);
				
			}
		});
		volver_menu.setFont(new Font("Arial", Font.PLAIN, 13));
		volver_menu.setBounds(192, 175, 124, 42);
		resultado.add(volver_menu);
		
	}

	/**
	 * @param juego
	 * @param resultado
	 * @param tablero
	 * @param jugador
	 * @param num_jug
	 */
	public void verificaJugadaGanadora(JPanel juego, JPanel resultado, Tablero tablero, Jugador jugador, int num_jug) {
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
	}

	/**
	 * @param turno
	 * @param btn_1
	 * @param jugador
	 */
	public void cambiarTurnos(JLabel turno, JButton btn, Jugador jugador) {
		resp=jugador.cambiarTurno(jugador);
		if (resp==1) {	
			btn.setBackground(Color.red);
			btn.setText("O");
			turno.setText(text_nombr1.getText());
		}
		else {
			btn.setBackground(Color.blue);
			btn.setText("X");
			turno.setText(text_nombr2.getText());
		}
	}
	
	public void limpiarBoton(JButton btn) {
		btn.setText("");
		btn.setEnabled(true);
		btn.setBackground(Color.WHITE);
	}
}
