import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class labelConfig extends JLabel {
	
	public labelConfig(String texto) {
		 super(texto);
		 init();
	}
	private void init() {
		this.setHorizontalAlignment(JLabel.LEFT);
	}

}