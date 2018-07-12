package random;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	String height = JOptionPane.showInputDialog("how tall are you in foot?");
	int height1 = Integer.parseInt(height);
	if(height1 > 4) {
		JOptionPane.showMessageDialog(null, "Enjoy the ride!");
	}
	else {
		JOptionPane.showMessageDialog(null, "You can't be on this ride.");
	}
}
}
