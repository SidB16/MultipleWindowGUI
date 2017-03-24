package multipleWindowGUI;

import java.util.Scanner;

import javax.swing.JFileChooser;

public class OpenFile {

	// Declare Variable
	JFileChooser fileChooser = new JFileChooser();
	StringBuilder sb = new StringBuilder();
	StringBuilder sb2 = new StringBuilder();
	
	public void PickMe() throws Exception {

		if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {

			// get file
			java.io.File file = fileChooser.getSelectedFile();
			
			// create a scanner for the file
			Scanner input = new Scanner(file);
			
			// read text from file
			while (input.hasNext()) {
				sb.append(input.nextLine());
				sb.append("\n");
			}
			sb2.append(file.getName());
			input.close();
		}

		else {
			sb.append("No file was selected");
			sb2.append("No file was selected");
		}
	}
}
	