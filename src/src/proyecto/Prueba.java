package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Prueba {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba window = new Prueba();
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
	public Prueba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 552, 519);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setFont(new Font("Dubai", Font.PLAIN, 14));
		btnContinuar.setBounds(221, 398, 89, 23);
		frame.getContentPane().add(btnContinuar);
		
		JLabel lblNewLabel_1 = new JLabel("                    Gym Rats");
		lblNewLabel_1.setFont(new Font("Dubai", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(142, 23, 242, 51);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblImagen = new JLabel("");
		lblImagen.setIcon(new ImageIcon(Prueba.class.getResource("/image/Diseño sin título.png")));
		lblImagen.setBounds(0, 0, 536, 480);
		frame.getContentPane().add(lblImagen);
	}
}
