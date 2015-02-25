import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class classa {
	public static classa classa = new classa();
	public static void main(String[] args) {
		int[] newArray = {3,4,5,11,4,12,32,3,23,2,-2,14,4,5,65,7,68,79,4,35,6,7};
		System.out.println("hello");
		JLabel labelOne = new JLabel("MAX: "+classa.max(newArray));
			labelOne.setSize(400,400/3);
		JLabel labelTwo = new JLabel("MIN: "+classa.min(newArray));
			labelTwo.setSize(400,400/3);
		JButton buttonOne = new JButton("Hutto");
			buttonOne.setSize(100,100);
		JFrame frame = new JFrame("FrameDemo");
		JPanel contentPaneOne = new JPanel(new BorderLayout());
			contentPaneOne.setBackground(new Color(130,130,250));
			contentPaneOne.add(labelOne, BorderLayout.CENTER);
        	contentPaneOne.add(labelTwo, BorderLayout.CENTER);
        	//contentPaneOne.add(buttonOne, BorderLayout.CENTER);
        	contentPaneOne.setSize(200,200);
        JPanel contentPaneTwo = new JPanel(new BorderLayout());
        	contentPaneTwo.setSize(200,200);
        	contentPaneTwo.add(buttonOne, BorderLayout.CENTER);
        frame.add(contentPaneOne, BorderLayout.CENTER);
        frame.add(contentPaneTwo, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
	}
	public int max(int[] hehe){
		try{
		int maxNum = 0;
		for(int i = 0; i < hehe.length; i++){
			if(hehe[i] > maxNum){
				maxNum = hehe[i];
			}
		}
		return maxNum;
		}
		catch (Exception e) {
			return 0;
		}
	}
	public int min(int[] hehe){
		int maxNum = classa.max(hehe);
		for(int i = 0; i < hehe.length; i++){
			if(hehe[i] < maxNum){
				maxNum = hehe[i];
			}
		}
		return maxNum;
	}
}