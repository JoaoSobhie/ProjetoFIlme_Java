import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class filme {
	
public static void main(String[] args) {
	JFrame jframe =  new JFrame("Filmes");

	jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jframe.setSize(700, 400);
	jframe.setVisible(true);
	
	JPanel cadastro =  new JPanel(new BorderLayout(20, 0));
	JPanel imagem =  new JPanel(new GridLayout(1,1));
	JPanel janela = new JPanel(new GridLayout(10,1));
	JPanel referencias = new JPanel(new GridLayout(0,1));
	referencias.setPreferredSize(new Dimension(180, 400));
	JPanel button = new JPanel();
	
	cadastro.add(imagem, BorderLayout.LINE_START);
	cadastro.add(janela, BorderLayout.CENTER);
	cadastro.add(referencias, BorderLayout.EAST);
	cadastro.add(button, BorderLayout.SOUTH);
	
	JTabbedPane abas = new JTabbedPane();
	abas.add("Filmes", cadastro);
	abas.add("Lista", new JPanel());
	jframe.add(abas);
		
	imagem.add(new imgConfig(new ImageIcon("src/imagens/CentralPark.jpg")));
	
	//Declarando campos
	JTextField text_titulo = new JTextField();
	JTextField text_sinopse = new JTextField();
	String[] genero = {"Comédia", "Ação", "Drama"};
	JComboBox cb= new JComboBox(genero);
	RadioGroup radio = new RadioGroup(List.of("Netflix", "Prime Video", "Disney+"));
	Checkbox check = new Checkbox("Assistido");
	StarRater star = new StarRater(5,3.5f);
	
	filmeListener listener = new filmeListener(text_titulo,  text_sinopse, cb, radio,  check, star);
	
	//label titulo
	janela.add(new labelConfig("Titulo"));

	//textfield titulo
	text_titulo.setPreferredSize(new Dimension(200, 30));
	janela.add(text_titulo);
	text_titulo.addMouseListener(listener);
	
	//label sinopse
	janela.add(new labelConfig("Sinopse"));
	
	//textfield sinopse
	
	text_sinopse.setPreferredSize(new Dimension(200, 30));
	janela.add(text_sinopse);
	text_sinopse.addMouseListener(listener);

	//label genero
	janela.add(new labelConfig("Genero"));

	//Combo Box Genero
	janela.add(cb);
	cb.addMouseListener(listener);

	
	//label onde assistir
	referencias.add(new labelConfig("Onde assistir"));

	//Radio Group onde assistir
	
	referencias.add(radio);
	radio.addMouseListener(listener);

	
	//checkbox assistido
	
	referencias.add(check);
	check.addMouseListener(listener);

	
	//label genero
	referencias.add(new labelConfig("Avaliações"));
	
	//starrater assistido
	
	referencias.add(star);
	
	JButton btn_salvar =  new JButton("Salvar");
	button.add(btn_salvar);
	btn_salvar.addActionListener(listener);
	
	JButton btn_cancelar =  new JButton("Cancelar");
	button.add(btn_cancelar);
	
	jframe.setVisible(true);
	
	
	}
}
