package capaPresentacion;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInicial frame = new VentanaInicial();
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
	public VentanaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		Button jugar = new Button("Jugar");
		jugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Al pulsar en el boton de abre la ventana de jugar y se cierra esta
				VentanaJugar vj = new VentanaJugar();
				vj.setVisible(true);
				dispose();
			}
		});
		
		Button ranking = new Button("Ranking");
		
		Button salir = new Button("Salir");
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(238, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(jugar, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
						.addComponent(salir, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
						.addComponent(ranking, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
					.addGap(227))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(70)
					.addComponent(jugar, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
					.addComponent(ranking, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(69)
					.addComponent(salir, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(71))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
