import java.io.*;
import javax.swing.*;
import java.lang.String;

/*
A Java program that displays 5 GIFs of a woman signing in ASL (American Sign Language).
The user running it is prompted to give their name and student ID number, then answer
the questions of what she is signing, and is graded for their answers.
*/

/*
This script is courtesy of Adam Habil, #900832364
Created 2019.20.02, at 15:40
*/

public class PlayGif {
	private final int MAX = 5;
	private int correctAnswers = 0;

	private String name;
	private int IDNumber;

	private JLabel[] myImages;
	private String[] imageNames;
	private String[] studentAnswers;

	private JPanel panel;

	//calls the CreateGIFs function to make the .gif files into an array
	public void CreateGIFs() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		panel = new JPanel();
		this.add(panel);

		imageNames = new String[MAX];
		myImages = new JLabel[MAX];

		//Loads the 5 .gif files to the imageName.
		imageNames[0] = "Absent.gif";
		imageNames[1] = "Afternoon.gif";
		imageNames[2] = "Again (Repeat).gif";
		imageNames[3] = "American-Sign-Language.gif";
		imageNames[4] = "Angry.gif";

		for (int i = 0; i < MAX; i++) {
			// adds a new JLabel to your JLabel array with the
			// image loaded in
			myImages[i] = new JLabel(new ImageIcon(imageNames[0]));

			// adds the JLabel in position i in the JLabel
			// array to your panel
			panel.add(myImages[i]);
		} //end for
	} //end fxn

	public void AskForInfo() {
		name = (String)JOptionPane.showInputDialog(frame,
		"Please enter your name: ",
		"Enter name");

		IDNumber = Integer.parseInteger(JOptionPane.showInputDialog(frame,
		"Please enter your 900 #: ",
		"Enter 900 #"));

		this.GIFsAndQuestions();
	} //end fxn

	//show GIFs and ask questions
	public void GIFsAndQuestions() {
		//Absent.gif
		Object[] options_one = {"Present", "Absent", "Current"};
		studentAnswers[0] = (String)JOptionPane.showOptionDialog(frame,
		panel.myImages[0],
		"This ASL expression means:\n",
    "Customized Dialog",
    JOptionPane.PLAIN_MESSAGE,
    null,
    options_one,
    "Absent");

		if (studentAnswers[0].equals("Absent")) {
			correctAnswers++;
		} //end if

		//Afternoon.gif
		Object[] options_two = {"Morning", "Evening", "Afternoon"};
		studentAnswers[1] = (String)JOptionPane.showOptionDialog(frame,
		panel.myImages[1],
		"This ASL expression means:\n",
    "Customized Dialog",
    JOptionPane.PLAIN_MESSAGE,
    null,
    options_two,
    "Afternoon");

		if (studentAnswers[1].equals("Afternoon")) {
			correctAnswers++;
		} //end if

		//Again.gif
		Object[] options_three = {"Quit", "Again", "Start"};
		studentAnswers[2] = (String)JOptionPane.showOptionDialog(frame,
		panel.myImages[2],
		"This ASL expression means:\n",
    "Customized Dialog",
    JOptionPane.PLAIN_MESSAGE,
    null,
    options_three,
    "Again");

		if (studentAnswers[2].equals("Again")) {
			correctAnswers++;
		} //end if

		//ASL.gif
		Object[] options_four = {"American Sign Language (ASL)", "British Sign Language (BSL)", "Chinese Sing Language (CSL)"};
		studentAnswers[3] = (String)JOptionPane.showOptionDialog(frame,
		panel.myImages[3],
		"This ASL expression means:\n",
    "Customized Dialog",
    JOptionPane.PLAIN_MESSAGE,
    null,
    options_four,
    "American Sign Language (ASL)");

		if (studentAnswers[3].equals("American Sign Language (ASL)")) {
			correctAnswers++;
		} //end if

		Object[] options_five = {"Sad", "Excited", "Angry"};
		studentAnswers[4] = (String)JOptionPane.showOptionDialog(frame,
		panel.myImages[4],
		"This ASL expression means:\n",
    "Customized Dialog",
    JOptionPane.PLAIN_MESSAGE,
    null,
    options_five,
    "Angry");

		if (studentAnswers[4].equals("Angry")) {
			correctAnswers++;
		} //end if
	} //end fxn

	public double outputGrade() {
		double grade = 0.0;
		grade = Math.floor( (correctAnswers / MAX) * 100 );
		return grade;
	} //end fxn

	public static void main (String[] args) {
		PlayGif play = new PlayGif();
		play.CreateGIFs();
		play.AskForInfo();
		double yourGrade = play.outputGrade();

		JOptionPane.showMessageDialog(frame,
		name + " (" + IDNumber + "), Your grade for this quiz is " + yourGrade + "%",
		"Quiz Grade",
		JOptionPane.PLAIN_MESSAGE);

		int n = JOptionPane.showOptionDialog(frame,
		 "Is there another student willing to try this?",
		 "Important Prompt!!!",
		 JOptionPane.QUESTION_MESSAGE,
		 JOptionPane.YES_NO_OPTION);
		 //yes = 0, no = 1;
		 if (n == 0) {
			 play.AskForInfo();
		 }//end if
	} //end fxn
}//end prgm
