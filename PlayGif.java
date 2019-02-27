import java.io.*;
import javax.swing.*;
import java.lang.String;

/*
This script is courtesy of Adam Habil, #900832364
Created 2019.20.02, at 15:40
*/

public class PlayGif {
	private final int MAX = 5;
	private String name;
	private int IDNumber;

	private JLabel[] myImages;
	private String[] imageNames;
	private String[] studentAnswers;

	private JPanel panel;

	public void askForInfo() {
		name = JOptionPane.showInputDialog(frame,
		"Please enter your name: ",
		"Enter name");

		IDNumber = Integer.parseInteger(JOptionPane.showInputDialog(frame,
		"Please enter your 900 #: ",
		"Enter 900 #,"));
	} //end fxn

	public void myImages() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		panel = new JPanel();
		this.add(panel);

		imageNames = new String[MAX];
		myImages = new JLabel[MAX];

		//If you download the .java to your personal computer, you should change the location.
		imageNames[0] = "C:\\Users\\ahabil\\Work\\H5P\\Absent.gif";
		imageNames[1] = "C:\\Users\\ahabil\\Work\\H5P\\Afternoon.gif";
		imageNames[2] = "C:\\Users\\ahabil\\Work\\H5P\\Again (Repeat).gif";
		imageNames[3] = "C:\\Users\\ahabil\\Work\\H5P\\American-Sign-Language.gif";
		imageNames[4] = "C:\\Users\\ahabil\\Work\\H5P\\Angry.gif";

		for (int i = 0; i < MAX; i++) {
			// adds a new JLabel to you JLabel array with the
			// image loaded in
			myImages[i] = new JLabel(new ImageIcon(imageNames[0]));

			// adds the JLabel in position i in the JLabel
			// array to your panel
			panel.add(myImages[i]);
		} //end for
	} //end fxn

	//show GIFs and ask questions

	public int GIFsAndQuestions() {
		int correctAnswers = 0;

		//Absent.gif
		Object[] possibilities_one = {"Present", "Absent", "Current"};
		studentAnswers[0] = (String)JOptionPane.showInputDialog(frame,
		panel.myImage[0],
		"This ASL expression means:\n"
    "Customized Dialog",
    JOptionPane.PLAIN_MESSAGE,
    icon,
    possibilities,
    "Absent");

		if (studentAnswers[0].equals("Absent")) {
			correctAnswers++;
		} //end fxn

		//Afternoon.gif
		Object[] possibilities_two = {"Morning", "Evening", "Afternoon"};
		studentAnswers[1] = (String)JOptionPane.showInputDialog(frame,
		panel.myImage[1],
		"This ASL expression means:\n"
    "Customized Dialog",
    JOptionPane.PLAIN_MESSAGE,
    icon,
    possibilities,
    "Afternoon");

		if (studentAnswers[1].equals("Afternoon")) {
			correctAnswers++;
		} //end fxn

		//Again.gif
		Object[] possibilities_three = {"Quit", "Again", "Start"};
		studentAnswers[2] = (String)JOptionPane.showInputDialog(frame,
		panel.myImage[2],
		"This ASL expression means:\n"
    "Customized Dialog",
    JOptionPane.PLAIN_MESSAGE,
    icon,
    possibilities,
    "Again");

		if (studentAnswers[2].equals("Again")) {
			correctAnswers++;
		} //end fxn

		//ASL.gif
		Object[] possibilities_four = {"American Sign Language (ASL)", "British Sign Language (BSL)", "Chinese Sing Language (CSL)"};
		studentAnswers[3] = (String)JOptionPane.showInputDialog(frame,
		panel.myImage[3],
		"This ASL expression means:\n"
    "Customized Dialog",
    JOptionPane.PLAIN_MESSAGE,
    icon,
    possibilities,
    "American Sign Language (ASL)");

		if (studentAnswers[3].equals("American Sign Language (ASL)")) {
			correctAnswers++;
		} //end fxn

		Object[] possibilities_five = {"Sad", "Excited", "Angry"};
		studentAnswers[4] = (String)JOptionPane.showInputDialog(frame,
		panel.myImage[4],
		"This ASL expression means:\n"
    "Customized Dialog",
    JOptionPane.PLAIN_MESSAGE,
    icon,
    possibilities,
    "Angry");

		if (studentAnswers[4].equals("Angry")) {
			correctAnswers++;
		} //end fxn

		return correctAnswers;

	}
	//Compar Answers

	public double outputGrade() {
		double grade = 0.0;
		grade = (this.GIFsAndQuestions() / imageNames.length) * 100;
		return grade;
	} //end fxn

	public static void main (String[] args) {
		PlayGif play = new PlayGif();

		play.askForInfo();



		JOptionPane.showMessageDialog(frame,
		name + " (" + IDNumber + "), Your grade for this quiz is " + play.outputGrade() + "%.",
		"Quiz Grade",
		JOptionPane.PLAIN_MESSAGE);

		int n = JOptionPane.showOptionDialog(frame,
		 "Is there another student willing to try this?",
		 "Important Prompt!!!",
		 JOptionPane.QUESTION_MESSAGE,
		 JOptionPane.YES_NO_OPTION);

		 if (n == 0) {
			 play.askForInfo();
		 }//end if

	} //end fxn

}//end prgm
