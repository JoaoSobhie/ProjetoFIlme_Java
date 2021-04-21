import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class imgConfig extends JLabel {
	public imgConfig(ImageIcon imageIcon) {
		super(imageIcon);
		init();
	}
	
	private void init() {
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setPreferredSize(new Dimension(200, 350));
	}
}