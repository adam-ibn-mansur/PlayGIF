import java.io.*;
import javax.swing.*;
import java.lang.String;

/*
This script is courtesy of Adam Habil, #900832364
Created 2019.20.02, at 15:40
*/

public class PlayGif {
	private final int NUM = 5;
	private JLabel[] myImages;
	private String[] imageNames;
	private String[] mySolutions;
	private JPanel panel;

	public MyImages() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		panel = new JPanel();
		this.add(panel);

		imageNames = new String[NUM];
		myImages = new JLabel[NUM];

		imageNames[0] = "C:\\Users\\ahabil\\Work\\H5P\\American-Sign-Language.gif";
		imageNames[1] = "C:\\Users\\ahabil\\Work\\H5P\\Angry.gif";
		imageNames[2] = "C:\\Users\\ahabil\\Work\\H5P\\Again (Repeat).gif";
		imageNames[3] = "C:\\Users\\ahabil\\Work\\H5P\\Afternoon.gif";
		imageNames[4] = "C:\\Users\\ahabil\\Work\\H5P\\Absent.gif";

		for (int i = 0; i < NUM; i++) {
			// adds a new JLabel to you JLabel array with the
			// image loaded in
			myImages[i] = new JLabel(new ImageIcon(imageNames[0]));

			// adds the JLabel in position i in the JLabel
			// array to your panel
			panel.add(myImages[i]);
		}

		// adds a new JLabel with "Hello" to the panel.
		panel.add(new JLabel("Hello"));
	}

	public StoreData(String name, int nineHun) {
		HashMap<Integer, String> stuID = new HashMap<>();
		stuID.put(nineHun, name);
	}

	public int rightOrWrong() {
		mySolutions=  new String[NUM];

		image names


	}

	public double outputGrade(int results) {
		double grade = 0.0;
		grade = results / imageNames.length
		return grade;
	}

]
	public static void main (String[] args) {
		PlayGif play = new PlayGif();

		String name = JOptionPane.showInputDialog(frame, "Please enter your name: ", "Enter name");
		int nineHun = Integer.parseInteger(JOptionPane.showInputDialog(frame, "Please enter your 900 #: ", "Enter 900 #,"));

		play.StoreData()

		JOptionPane.showMessageDialog( frame, "Your grade for this quiz is " + play.outputGrade(), "Quiz Grade" );
	}

}
