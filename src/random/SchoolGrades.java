package random;

import javax.swing.JOptionPane;

public class SchoolGrades {
	public static void main(String[] args) {
		String grade = JOptionPane.showInputDialog("What is your grade?");
		int grade1 = Integer.parseInt(grade);
		if (grade1 > 70) {
			JOptionPane.showMessageDialog(null, "You shall pass!");
		}
		else {
			JOptionPane.showMessageDialog(null, "You shall not pass!");
		}
	}

}
