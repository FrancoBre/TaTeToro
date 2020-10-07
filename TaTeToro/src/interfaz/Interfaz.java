package interfaz;

import java.awt.EventQueue;
import java.awt.Image;

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
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Interfaz {

	private JFrame frame;
	private JTextField text_nombr1;
	private JTextField text_nombr2;
	int resp; 


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
		
		
		JPanel juego = new JPanel();
		juego.setBounds(0, 0, 350, 301);
		frame.getContentPane().add(juego);
		
		juego.setLayout(null);
		juego.setVisible(false);
		
		
		JLabel turno = new JLabel("");
		turno.setBounds(144, 11, 120, 14);
		juego.add(turno);
		Tablero tablero=new Tablero();
		Jugador jugador=new Jugador(1);
	
		
		//Declaracion de botones 
		JButton btn_1 = new JButton("");
		JButton btn_2 = new JButton("");
		JButton btn_3 = new JButton("");
		JButton btn_4 = new JButton("");
		JButton btn_5 = new JButton("");
		JButton btn_6 = new JButton("");
		JButton btn_7 = new JButton("");
		JButton btn_8 = new JButton("");
		JButton btn_9 = new JButton("");
		
		//Action boton 1
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
						
				tablero.setJugada(jugador, 0, 0);
				
				
				//CAMBIA LOS TURNOS Y LOS LABELS CON EL NOMBRE 	
				resp=jugador.cambiarTurno(jugador);
				if (resp==1) {	
					turno.setText(text_nombr1.getText());
				}
				else {
					turno.setText(text_nombr2.getText());
				}
					
			// a implementar, if(Jugada.esGanadora(tablero, jugador))... mostrar un mensaje de que gano
			}
		});
		btn_1.setBounds(79, 60, 55, 55);
		juego.add(btn_1);
		
		//Action boton 2
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tablero.setJugada(jugador, 0, 1);
		
			//CAMBIA LOS TURNOS Y LOS LABELS CON EL NOMBRE 	
				resp=jugador.cambiarTurno(jugador);
				if (resp==1) {	
					turno.setText(text_nombr1.getText());
				}
				else {
					turno.setText(text_nombr2.getText());
				}
			// a implementar, if(Jugada.esGanadora(tablero, jugador))... mostrar un mensaje de que gano
			}
		});
		btn_2.setBounds(144, 60, 55, 55);
		juego.add(btn_2);
		
		//Action boton 3
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				tablero.setJugada(jugador, 0, 2);
				
				
				//CAMBIA LOS TURNOS Y LOS LABELS CON EL NOMBRE 	
				resp=jugador.cambiarTurno(jugador);
				if (resp==1) {	
					turno.setText(text_nombr1.getText());
				}
				else {
					turno.setText(text_nombr2.getText());
				}
			// a implementar, if(Jugada.esGanadora(tablero, jugador))... mostrar un mensaje de que gano
			}
		});
		btn_3.setBounds(209, 60, 55, 55);
		juego.add(btn_3);
		
		//Action boton 4
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				tablero.setJugada(jugador, 1, 0);
				
				
				//CAMBIA LOS TURNOS Y LOS LABELS CON EL NOMBRE 	
				resp=jugador.cambiarTurno(jugador);
				if (resp==1) {	
					turno.setText(text_nombr1.getText());
				}
				else {
					turno.setText(text_nombr2.getText());
				}
				
				
				//jugador.cambiarTurno(jugador);
			// a implementar, if(Jugada.esGanadora(tablero, jugador))... mostrar un mensaje de que gano
			}
		});
		btn_4.setBounds(79, 126, 55, 55);
		juego.add(btn_4);
		
		//Action boton 5
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				tablero.setJugada(jugador, 1, 1);
				
				
				//CAMBIA LOS TURNOS Y LOS LABELS CON EL NOMBRE 	
				resp=jugador.cambiarTurno(jugador);
				if (resp==1) {	
					turno.setText(text_nombr1.getText());
				}
				else {
					turno.setText(text_nombr2.getText());
				}
			// a implementar, if(Jugada.esGanadora(tablero, jugador))... mostrar un mensaje de que gano
			}
		});
		btn_5.setBounds(144, 126, 55, 55);
		juego.add(btn_5);
		
		//Action boton 6
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				tablero.setJugada(jugador, 1, 2);
			
				
				//CAMBIA LOS TURNOS Y LOS LABELS CON EL NOMBRE 	
				jugador.setNumero(resp);
				if (resp==1) {	
					turno.setText(text_nombr1.getText());
				}
				else {
					turno.setText(text_nombr2.getText());
				}
				
			// a implementar, if(Jugada.esGanadora(tablero, jugador))... mostrar un mensaje de que gano.
			}
		});
		btn_6.setBounds(209, 126, 55, 55);
		juego.add(btn_6);
		
		//Action boton 7
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				tablero.setJugada(jugador, 2, 0);

				
				//CAMBIA LOS TURNOS Y LOS LABELS CON EL NOMBRE 	
				resp=jugador.cambiarTurno(jugador);
				jugador.setNumero(resp);
				if (resp==1) {	
					turno.setText(text_nombr1.getText());
				}
				else {
					turno.setText(text_nombr2.getText());
				}
				
				// a implementar, if(Jugada.esGanadora(tablero, jugador))... mostrar un mensaje de que gano
			}
		});
		btn_7.setBounds(79, 192, 55, 55);
		juego.add(btn_7);
		
		//Action boton 8
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				tablero.setJugada(jugador, 2, 1);
				
				
				//CAMBIA LOS TURNOS Y LOS LABELS CON EL NOMBRE 	
				resp=jugador.cambiarTurno(jugador);
				if (resp==1) {	
					turno.setText(text_nombr1.getText());
				}
				else {
					turno.setText(text_nombr2.getText());
				}
				
			// a implementar, if(Jugada.esGanadora(tablero, jugador))... mostrar un mensaje de que gano
			}
		});
		btn_8.setBounds(144, 192, 55, 55);
		juego.add(btn_8);
		
		//Action boton 9
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				tablero.setJugada(jugador, 2, 2);
		
				
				//CAMBIA LOS TURNOS Y LOS LABELS CON EL NOMBRE 	
				resp=jugador.cambiarTurno(jugador);
				if (resp==1) {	
					turno.setText(text_nombr1.getText());
				}
				else {
					turno.setText(text_nombr2.getText());
				}
				
			// a implementar, if(Jugada.esGanadora(tablero, jugador))... mostrar un mensaje de que gano
			}
		});
		btn_9.setBounds(209, 192, 55, 55);
		juego.add(btn_9);
		
		JLabel lblNewLabel_1 = new JLabel("Turno de :");
		lblNewLabel_1.setBounds(79, 11, 97, 14);
		
		juego.add(lblNewLabel_1);
		
		
		
		JPanel ingreso = new JPanel();
		ingreso.setBounds(0, 0, 338, 269);
		frame.getContentPane().add(ingreso);
		ingreso.setLayout(null);
		
		JButton btnNewButton = new JButton("Jugar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Jugador jugador1=new Jugador(1);
				Jugador jugador2=new Jugador(2);
				
//				jugador1.setNombre(text_nombr1.getText());
//				jugador2.setNombre(text_nombr2.getText());
				
				ingreso.setVisible(false);
				juego.setVisible(true);
				
				turno.setText(text_nombr1.getText());
				
			}
		});
		btnNewButton.setBounds(111, 174, 109, 42);
		ingreso.add(btnNewButton);
		
		text_nombr1 = new JTextField();
		text_nombr1.setBounds(139, 77, 135, 20);
		ingreso.add(text_nombr1);
		text_nombr1.setColumns(10);
		
		text_nombr2 = new JTextField();
		text_nombr2.setBounds(139, 108, 135, 20);
		ingreso.add(text_nombr2);
		text_nombr2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Jugador 1");
		lblNewLabel.setBounds(67, 80, 72, 14);
		ingreso.add(lblNewLabel);
		
		JLabel lblJugador = new JLabel("Jugador 2");
		lblJugador.setBounds(67, 111, 72, 14);
		ingreso.add(lblJugador);
		frame.setBackground(UIManager.getColor("Button.disabledShadow"));
		frame.setBounds(100, 100, 356, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
