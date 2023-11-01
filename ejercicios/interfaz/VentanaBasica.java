
import java.awt.*; 
import javax.swing.*;

public class VentanaBasica {
	
	public static void main(String[] args){
		//1. Create the frame.
		JFrame frame = new JFrame("Mi primer Interfaz Gráfica");

		//2. Optional: What happens when the frame closes?
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//3. Create components and put them in the frame.
		//...create emptyLabel...
		
		JLabel titulo = new JLabel("Curso Java!!", SwingConstants.CENTER);
		titulo.setPreferredSize(new Dimension(300, 100));
		frame.getContentPane().add(titulo, BorderLayout.CENTER);

		//4. Size the frame.
		frame.pack();

		//5. Show it.
		frame.setVisible(true);
		
	}
	
}