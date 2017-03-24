package multipleWindowGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JTextField;

import multipleWindowGUI.AudioRecorder;
import multipleWindowGUI.OpenFile;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AuthoringApp {

	private JFrame frame;
	private JPanel panelMenu;
	private JTextField textField;
	private JTextField textFieldRecordingSelected;
	private JTextField textFieldSenarioSelected;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AuthoringApp window = new AuthoringApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AuthoringApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panelMenu, "name_35816227078265");
		panelMenu.setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setText("Authoring App");
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setColumns(10);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(145, 11, 130, 33);
		panelMenu.add(textField);
		
		JButton btnChooseFileButton = new JButton("Choose File");
		btnChooseFileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				OpenFile of = new OpenFile();

				try {
					of.PickMe();
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				textFieldSenarioSelected.setText(of.sb2.toString());
			}
		});
		btnChooseFileButton.setBounds(35, 86, 89, 23);
		panelMenu.add(btnChooseFileButton);
		
		JButton btnVoiceRecorderButton = new JButton("Voice Recorder");
		btnVoiceRecorderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				new AudioRecorder();
			}
		});
		btnVoiceRecorderButton.setBounds(163, 86, 105, 23);
		panelMenu.add(btnVoiceRecorderButton);
		
		JButton button_2 = new JButton("New button");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		button_2.setBounds(318, 86, 89, 23);
		panelMenu.add(button_2);
		
		textFieldRecordingSelected = new JTextField();
		textFieldRecordingSelected.setColumns(10);
		textFieldRecordingSelected.setBounds(163, 224, 112, 20);
		panelMenu.add(textFieldRecordingSelected);
		
		textFieldSenarioSelected = new JTextField();
		textFieldSenarioSelected.setColumns(10);
		textFieldSenarioSelected.setBounds(163, 161, 112, 20);
		panelMenu.add(textFieldSenarioSelected);
		
		JLabel labelSenarioSelected = new JLabel("Senario Selected:");
		labelSenarioSelected.setBounds(62, 164, 105, 14);
		panelMenu.add(labelSenarioSelected);
		
		JLabel labelRecordingSelected = new JLabel("Recording Selected:");
		labelRecordingSelected.setBounds(48, 225, 105, 14);
		panelMenu.add(labelRecordingSelected);
		frame.setBounds(100, 100, 450, 403);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
