import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class classb{
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton("MIDO");
			button.setSize(100,100);
			button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
              System.out.println("MiDo Ȝ");
            }
        });   
		JButton button2 = new JButton("button");
			button2.setSize(100,100);
		JPanel panel = new JPanel();
			panel.setSize(400,400);
		panel.add(button);
		panel.add(button2);
		frame.add(panel);
		frame.pack();
	}
}