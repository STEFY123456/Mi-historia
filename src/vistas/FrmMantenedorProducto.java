package vistas;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;

public class FrmMantenedorProducto extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmMantenedorProducto frame = new FrmMantenedorProducto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmMantenedorProducto() {
		getContentPane().setBackground(Color.ORANGE);
		setBounds(100, 100, 450, 300);

	}

}
