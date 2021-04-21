import java.awt.Checkbox;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class filmeListener implements ActionListener, MouseListener {
	
	private JTextField txt_titulo;
	private JTextField txt_sinopse;
	private JComboBox cbo_genero;
	private RadioGroup rdo_onde;
	private Checkbox cke_assist;
	private StarRater star;

	public filmeListener(JTextField txt_titulo, JTextField txt_sinopse,JComboBox genero,RadioGroup rdo_onde, Checkbox cke_assist, StarRater star) {
		this.txt_titulo = txt_titulo;
		this.txt_sinopse = txt_sinopse;
		this.cbo_genero = genero;
		this.rdo_onde = rdo_onde;
		this.cke_assist = cke_assist;
		this.star = star;
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		var titulo = String.valueOf(txt_titulo.getText());
		var sinopse = String.valueOf(txt_sinopse.getText());
		String genero = (String)cbo_genero.getSelectedItem();
		var ondeAssis = rdo_onde;
		var assistido = String.valueOf(cke_assist);
		int stars = Integer.valueOf( star.getSelection());
				
		System.out.println("Titulo: " + titulo.toString() + "\n" + "Sinopse: " + sinopse + " \n"+ "Genero: "+ genero + " \n" + "Onde Asistir" + ondeAssis + " \n"+ "Assistido" + assistido + " \n" + "Estrelas: " + stars );
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//txtNumero1.setBackground(Color.RED);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//txtNumero1.setBackground(Color.WHITE);
		
	}

}
