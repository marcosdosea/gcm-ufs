import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class main {
	
	private JFrame janela = new JFrame();

	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.janela.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public main() throws IOException {
		initialize();
	}
	
	private void initialize() throws IOException {
		Menu menu = new Menu();
		janela = menu.Criarjanela();
		menu.GetMenu();
	}
	

}
