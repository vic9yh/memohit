package capaPresentacion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;

import javax.swing.BoxLayout;

import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import net.miginfocom.swing.MigLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaJugar extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VentanaJugar dialog = new VentanaJugar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VentanaJugar() {
		setBounds(100, 100, 600, 483);
		
		final Button rojo = new Button();
		rojo.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				rojo.setBackground(new Color(255, 0, 0));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				rojo.setBackground(new Color(139, 0, 0));
			}
		});
		rojo.setBackground(new Color(139, 0, 0));
		rojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		final Button verde = new Button();
		verde.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				verde.setBackground(new Color(0, 255, 0));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				verde.setBackground(new Color(0, 100, 0));
			}
		});
		verde.setBackground(new Color(0, 100, 0));
		
		final Button amarillo = new Button();
		amarillo.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				amarillo.setBackground(new Color(255, 255, 0));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				amarillo.setBackground(new Color(255, 215, 0));
			}
		});
		amarillo.setBackground(new Color(255, 215, 0));
		
		final Button azul = new Button();
		azul.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				azul.setBackground(new Color(0, 0, 255));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				azul.setBackground(new Color(0, 0, 139));
			}
		});
		azul.setBackground(new Color(0, 0, 139));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(138, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(amarillo, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(azul, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(rojo, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(verde, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)))
					.addGap(132))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(91, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(verde, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
						.addComponent(rojo, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(amarillo, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
						.addComponent(azul, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
					.addGap(85))
		);
		getContentPane().setLayout(groupLayout);
	}

}
