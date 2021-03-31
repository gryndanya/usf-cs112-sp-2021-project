package Project1;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	private static void initAndShowGUI() {

		DummyPredictor tester = new DummyPredictor();
		tester.readData("test.txt");
		
		String accuracy = "";
		accuracy = accuracy + String.format("%.2f", tester.getAccuracy(tester.data)) + "% correct.";		
		String precision = "";
		precision = precision + String.format("%.2f", tester.getPrecision(tester.data))  + "% off target.";

		JFrame myFrame = new JFrame();
		myFrame.setTitle("DummyPredictor Stats");
		myFrame.setLocation(500, 500);

		Container contentPane = myFrame.getContentPane();
		contentPane.setLayout(new GridLayout(2, 2));
		contentPane.add(new Label("Accuracy: "));
		contentPane.add(new Label(accuracy));
		contentPane.add(new Label("Precision: "));
		contentPane.add(new Label(precision));

		myFrame.pack();
		myFrame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				initAndShowGUI();
			}
		});

	}
}



