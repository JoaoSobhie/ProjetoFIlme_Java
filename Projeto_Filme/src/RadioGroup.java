import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioGroup extends JPanel{
	private ButtonGroup grupo = new ButtonGroup();
	private List<String> opcao;
	
	public RadioGroup(List<String> opcoes) {
		this.opcao = opcoes;
		init();
	}
	
	private void init() {
		opcao.forEach(opcao -> {
			JRadioButton botao = new JRadioButton(opcao);
			grupo.add(botao);
			this.add(botao);
		});
	}
}