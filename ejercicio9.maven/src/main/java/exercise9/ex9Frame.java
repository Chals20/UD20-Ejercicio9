package exercise9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ex9Frame extends JFrame {
	
	boolean esPrimera = true;


	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex9Frame frame = new ex9Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ex9Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 4, 0, 0));
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("Hello");
			}
		});
		contentPane.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_4 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_4);
		
		JToggleButton tglbtnNewToggleButton_8 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_8);
		
		JToggleButton tglbtnNewToggleButton_12 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_12);
		
		JToggleButton tglbtnNewToggleButton_15 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_15);
		
		JToggleButton tglbtnNewToggleButton_14 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_14);
		
		JToggleButton tglbtnNewToggleButton_13 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_13);
		
		JToggleButton tglbtnNewToggleButton_11 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_11);
		
		JToggleButton tglbtnNewToggleButton_10 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_10);
		
		JToggleButton tglbtnNewToggleButton_9 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_9);
		
		JToggleButton tglbtnNewToggleButton_7 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_7);
		
		JToggleButton tglbtnNewToggleButton_6 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_6);
		
		JToggleButton tglbtnNewToggleButton_5 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_5);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_1);
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_2);
		
		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_3);
		
		
		
		
		
	}

}
