package exercise9;

import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class ex9Frame extends JFrame {

	boolean esPrimera = true;
	int  contador0, contador1, contador2, contador3, contador4, contador5, contador6, contador7;

	ArrayList<String> listaRutas = new ArrayList<>();

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
	 * 
	 * @throws IOException
	 */
	public ex9Frame() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 814, 813);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 4, 0, 0));

		JToggleButton b1 = new JToggleButton();
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("Hello");
			}
		});
		contentPane.add(b1);

		JToggleButton b4 = new JToggleButton();
		contentPane.add(b4);

		JToggleButton b8 = new JToggleButton();
		contentPane.add(b8);

		JToggleButton b12 = new JToggleButton();
		contentPane.add(b12);

		JToggleButton b15 = new JToggleButton();
		contentPane.add(b15);

		JToggleButton b14 = new JToggleButton();
		contentPane.add(b14);

		JToggleButton b13 = new JToggleButton();
		contentPane.add(b13);

		JToggleButton b11 = new JToggleButton();
		contentPane.add(b11);

		JToggleButton b10 = new JToggleButton();
		contentPane.add(b10);

		JToggleButton b9 = new JToggleButton();
		contentPane.add(b9);

		JToggleButton b7 = new JToggleButton();
		contentPane.add(b7);

		JToggleButton b6 = new JToggleButton();
		contentPane.add(b6);

		JToggleButton b5 = new JToggleButton();
		contentPane.add(b5);

		JToggleButton b16 = new JToggleButton();
		contentPane.add(b16);

		JToggleButton b2 = new JToggleButton();
		contentPane.add(b2);

		JToggleButton b3 = new JToggleButton();
		contentPane.add(b3);
		System.out.println(getClass().getResource("/Oso.png"));

		listaRutas.add("/Oso.png");
		listaRutas.add("/Leon.png");
		listaRutas.add("/Conejo.png");
		listaRutas.add("/Cocodrilo.png");
		listaRutas.add("/Elefante.png");
		listaRutas.add("/Mono.png");
		listaRutas.add("/Obeja.png");
		listaRutas.add("/Leopardo.png");
		

	
		try {
			b1.setIcon(
					new ImageIcon(ImageIO.read(getClass().getResource(listaRutas.get(ponerRutas(listaRutas))))));
			b2.setIcon(
					new ImageIcon(ImageIO.read(getClass().getResource(listaRutas.get(ponerRutas(listaRutas))))));
			b3.setIcon(
					new ImageIcon(ImageIO.read(getClass().getResource(listaRutas.get(ponerRutas(listaRutas))))));
			b4.setIcon(
					new ImageIcon(ImageIO.read(getClass().getResource(listaRutas.get(ponerRutas(listaRutas))))));
			b5.setIcon(
					new ImageIcon(ImageIO.read(getClass().getResource(listaRutas.get(ponerRutas(listaRutas))))));
			b6.setIcon(
					new ImageIcon(ImageIO.read(getClass().getResource(listaRutas.get(ponerRutas(listaRutas))))));
			b7.setIcon(
					new ImageIcon(ImageIO.read(getClass().getResource(listaRutas.get(ponerRutas(listaRutas))))));
			b8.setIcon(
					new ImageIcon(ImageIO.read(getClass().getResource(listaRutas.get(ponerRutas(listaRutas))))));
			b9.setIcon(
					new ImageIcon(ImageIO.read(getClass().getResource(listaRutas.get(ponerRutas(listaRutas))))));
			b10.setIcon(
					new ImageIcon(ImageIO.read(getClass().getResource(listaRutas.get(ponerRutas(listaRutas))))));
			b11.setIcon(
					new ImageIcon(ImageIO.read(getClass().getResource(listaRutas.get(ponerRutas(listaRutas))))));
			b12.setIcon(
					new ImageIcon(ImageIO.read(getClass().getResource(listaRutas.get(ponerRutas(listaRutas))))));
			b13.setIcon(
					new ImageIcon(ImageIO.read(getClass().getResource(listaRutas.get(ponerRutas(listaRutas))))));
			b14.setIcon(
					new ImageIcon(ImageIO.read(getClass().getResource(listaRutas.get(ponerRutas(listaRutas))))));
			b15.setIcon(
					new ImageIcon(ImageIO.read(getClass().getResource(listaRutas.get(ponerRutas(listaRutas))))));
			b16.setIcon(
					new ImageIcon(ImageIO.read(getClass().getResource(listaRutas.get(ponerRutas(listaRutas))))));

		} catch (Exception e) {
			System.out.println(e);
		}

		// btn.setIcon(new
		// ImageIcon(ImageIO.read(getClass().getResource("/Blank.png"))));
		// btn.setSelectedIcon(new
		// ImageIcon(ImageIO.read(getClass().getResource("/Bomb.png"))));
	}

	private int ponerRutas(ArrayList<String> listaRutas) {
		boolean seguir = true;
		while (seguir) {
			int numero = dameRandom();
			switch (numero) {
			case 1:
				if (contador1 < 2) {
					contador1++;
					return numero;
				}
				break;
			case 2:
				if (contador2 < 2) {
					contador2++;
					return numero;
				}
				break;
			case 3:
				if (contador3 < 2) {
					contador3++;
					return numero;
				}
				break;

			case 4:
				if (contador4 < 2) {
					contador4++;
					return numero;
				}
				break;
			case 5:
				if (contador5 < 2) {
					contador5++;
					return numero;
				}
				break;
			case 6:
				if (contador6 < 2) {
					contador6++;
					return numero;
				}
				break;
			case 7:
				if (contador7 < 2) {
					contador7++;
					return numero;
				}
				break;
			case 0:
				if (contador0 < 2) {
					contador0++;
					return numero;
				}
				break;
			default:
				break;
			}
		}
		return 0;

	}

	private int dameRandom() {
		int min = 0, max = 7;
		Random random = new Random();
		int numero = 0;
		numero = random.nextInt(max - min + 1) + min;
		return numero;
	}

}
