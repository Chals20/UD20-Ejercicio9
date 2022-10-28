package exercise9;

import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class ex9Frame extends JFrame {

	boolean esPrimeraTirada = true;
	int contVictoria, contIntentos;
	int esPrimero;
	JToggleButton primerBoton;
	JToggleButton segundoBoton;
	int contador0, contador1, contador2, contador3, contador4, contador5, contador6, contador7;
	String UrlPrimeraCarta = "";

	ArrayList<String> listaRutas = new ArrayList<>();
	ArrayList<String> btnImages = new ArrayList<>();

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

		listaRutas.add("/Oso.png");
		listaRutas.add("/Leon.png");
		listaRutas.add("/Conejo.png");
		listaRutas.add("/Cocodrilo.png");
		listaRutas.add("/Elefante.png");
		listaRutas.add("/Mono.png");
		listaRutas.add("/Obeja.png");
		listaRutas.add("/Leopardo.png");

		for (int i = 0; i < 16; i++) {
			ponerRutas(listaRutas, btnImages);
		}

		try {

			// Ponemos todas las cartas boca abajo.
			b1.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
			b2.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
			b3.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
			b4.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
			b5.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
			b6.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
			b7.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
			b8.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
			b9.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
			b10.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
			b11.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
			b12.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
			b13.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
			b14.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
			b15.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
			b16.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));

		} catch (Exception e) {
			System.out.println("PETA");
			System.out.println(e);
		}


		// Dar vuelta a las cartas
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println(contIntentos);
				try {
					b1.setIcon(new ImageIcon(ImageIO.read(getClass().getResource(btnImages.get(0)))));
					try {
						if (!b1.equals(primerBoton)) {
							esPrimero++;
						} else {
							return;
						}
					} catch (Exception e) {
						System.out.println("Has tocado dos veces el mismo botón");
					}

					if (esPrimero == 1) {
						try {
							primerBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
							segundoBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
						} catch (Exception e) {
							System.out.println("Es la primera tirada");
						}
						contIntentos++;
						primerBoton = b1;
						UrlPrimeraCarta = btnImages.get(0);
					} else if (esPrimero == 2) {
						segundoBoton = b1;
						if (btnImages.get(0).equals(UrlPrimeraCarta) && !b1.equals(primerBoton)) {
							System.out.println("Has acertado");
							b1.setEnabled(false);
							primerBoton.setEnabled(false);
							contVictoria++;
							if (contVictoria == 8) {
								JOptionPane.showMessageDialog(null, "Has ganado con " + contIntentos + " intentos. Enhorabuena!!!");
							}
						}
						esPrimero = 0;
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

		b2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					b2.setIcon(new ImageIcon(ImageIO.read(getClass().getResource(btnImages.get(1)))));
					try {
						if (!b2.equals(primerBoton)) {
							esPrimero++;
						} else {
							return;
						}
					} catch (Exception e) {
						System.out.println("Has tocado dos veces el mismo botón");
					}
					if (esPrimero == 1) {
						try {
							primerBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
							segundoBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
						} catch (Exception e) {
							System.out.println("Es la primera tirada");
						}
						contIntentos++;
						primerBoton = b2;
						UrlPrimeraCarta = btnImages.get(1);
					} else if (esPrimero == 2) {
						segundoBoton = b2;
						if (btnImages.get(1).equals(UrlPrimeraCarta) && !b2.equals(primerBoton)) {
							System.out.println("Has acertado");
							b2.setEnabled(false);
							primerBoton.setEnabled(false);
							contVictoria++;
							if (contVictoria == 8) {
								JOptionPane.showMessageDialog(null, "Has ganado con " + contIntentos + " intentos. Enhorabuena!!!");
							}
						}
						esPrimero = 0;
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

		b3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					b3.setIcon(new ImageIcon(ImageIO.read(getClass().getResource(btnImages.get(2)))));
					try {
						if (!b3.equals(primerBoton)) {
							esPrimero++;
						} else {
							return;
						}
					} catch (Exception e) {
						System.out.println("Has tocado dos veces el mismo botón");
					}
					if (esPrimero == 1) {
						try {
							primerBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
							segundoBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
						} catch (Exception e) {
							System.out.println("Es la primera tirada");
						}
						contIntentos++;
						primerBoton = b3;
						UrlPrimeraCarta = btnImages.get(2);
					} else if (esPrimero == 2) {
						segundoBoton = b3;
						if (btnImages.get(2).equals(UrlPrimeraCarta) && !b3.equals(primerBoton)) {
							System.out.println("Has acertado");
							b3.setEnabled(false);
							primerBoton.setEnabled(false);
							contVictoria++;
							if (contVictoria == 8) {
								JOptionPane.showMessageDialog(null, "Has ganado con " + contIntentos + " intentos. Enhorabuena!!!");
							}
						}
						esPrimero = 0;
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

		b4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					b4.setIcon(new ImageIcon(ImageIO.read(getClass().getResource(btnImages.get(3)))));
					try {
						if (!b4.equals(primerBoton)) {
							esPrimero++;
						} else {
							return;
						}
					} catch (Exception e) {
						System.out.println("Has tocado dos veces el mismo botón");
					}
					if (esPrimero == 1) {
						try {
							primerBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
							segundoBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
						} catch (Exception e) {
							System.out.println("Es la primera tirada");
						}
						contIntentos++;
						primerBoton = b4;
						UrlPrimeraCarta = btnImages.get(3);
					} else if (esPrimero == 2) {
						segundoBoton = b4;
						if (btnImages.get(3).equals(UrlPrimeraCarta) && !b4.equals(primerBoton)) {
							System.out.println("Has acertado");
							b4.setEnabled(false);
							primerBoton.setEnabled(false);
							contVictoria++;
							if (contVictoria == 8) {
								JOptionPane.showMessageDialog(null, "Has ganado con " + contIntentos + " intentos. Enhorabuena!!!");
							}
						}
						esPrimero = 0;
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

		b5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					b5.setIcon(new ImageIcon(ImageIO.read(getClass().getResource(btnImages.get(4)))));
					try {
						if (!b5.equals(primerBoton)) {
							esPrimero++;
						} else {
							return;
						}
					} catch (Exception e) {
						System.out.println("Has tocado dos veces el mismo botón");
					}
					if (esPrimero == 1) {
						try {
							primerBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
							segundoBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
						} catch (Exception e) {
							System.out.println("Es la primera tirada");
						}
						contIntentos++;
						primerBoton = b5;
						UrlPrimeraCarta = btnImages.get(4);
					} else if (esPrimero == 2) {
						segundoBoton = b5;
						if (btnImages.get(4).equals(UrlPrimeraCarta) && !b5.equals(primerBoton)) {
							System.out.println("Has acertado");
							b5.setEnabled(false);
							primerBoton.setEnabled(false);
							contVictoria++;
							if (contVictoria == 8) {
								JOptionPane.showMessageDialog(null, "Has ganado con " + contIntentos + " intentos. Enhorabuena!!!");
							}
						}
						esPrimero = 0;
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

		b6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					b6.setIcon(new ImageIcon(ImageIO.read(getClass().getResource(btnImages.get(5)))));
					try {
						if (!b6.equals(primerBoton)) {
							esPrimero++;
						} else {
							return;
						}
					} catch (Exception e) {
						System.out.println("Has tocado dos veces el mismo botón");
					}
					if (esPrimero == 1) {
						try {
							primerBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
							segundoBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
						} catch (Exception e) {
							System.out.println("Es la primera tirada");
						}
						contIntentos++;
						primerBoton = b6;
						UrlPrimeraCarta = btnImages.get(5);
					} else if (esPrimero == 2) {
						segundoBoton = b6;
						if (btnImages.get(5).equals(UrlPrimeraCarta) && !b6.equals(primerBoton)) {
							System.out.println("Has acertado");
							b6.setEnabled(false);
							primerBoton.setEnabled(false);
							contVictoria++;
							if (contVictoria == 8) {
								JOptionPane.showMessageDialog(null, "Has ganado con " + contIntentos + " intentos. Enhorabuena!!!");
							}
						}
						esPrimero = 0;
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

		b7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					b7.setIcon(new ImageIcon(ImageIO.read(getClass().getResource(btnImages.get(6)))));
					try {
						if (!b7.equals(primerBoton)) {
							esPrimero++;
						} else {
							return;
						}
					} catch (Exception e) {
						System.out.println("Has tocado dos veces el mismo botón");
					}
					if (esPrimero == 1) {
						try {
							primerBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
							segundoBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
						} catch (Exception e) {
							System.out.println("Es la primera tirada");
						}
						contIntentos++;
						primerBoton = b7;
						UrlPrimeraCarta = btnImages.get(6);
					} else if (esPrimero == 2) {
						segundoBoton = b7;
						if (btnImages.get(6).equals(UrlPrimeraCarta) && !b7.equals(primerBoton)) {
							System.out.println("Has acertado");
							b7.setEnabled(false);
							primerBoton.setEnabled(false);
							contVictoria++;
							if (contVictoria == 8) {
								JOptionPane.showMessageDialog(null, "Has ganado con " + contIntentos + " intentos. Enhorabuena!!!");
							}
						}
						esPrimero = 0;
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

		b8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					b8.setIcon(new ImageIcon(ImageIO.read(getClass().getResource(btnImages.get(7)))));
					try {
						if (!b8.equals(primerBoton)) {
							esPrimero++;
						} else {
							return;
						}
					} catch (Exception e) {
						System.out.println("Has tocado dos veces el mismo botón");
					}
					if (esPrimero == 1) {
						try {
							primerBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
							segundoBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
						} catch (Exception e) {
							System.out.println("Es la primera tirada");
						}
						contIntentos++;
						primerBoton = b8;
						UrlPrimeraCarta = btnImages.get(7);
					} else if (esPrimero == 2) {
						segundoBoton = b8;
						if (btnImages.get(7).equals(UrlPrimeraCarta) && !b8.equals(primerBoton)) {
							System.out.println("Has acertado");
							b8.setEnabled(false);
							primerBoton.setEnabled(false);
							contVictoria++;
							if (contVictoria == 8) {
								JOptionPane.showMessageDialog(null, "Has ganado con " + contIntentos + " intentos. Enhorabuena!!!");
							}
						}
						esPrimero = 0;
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

		b9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					b9.setIcon(new ImageIcon(ImageIO.read(getClass().getResource(btnImages.get(8)))));
					try {
						if (!b9.equals(primerBoton)) {
							esPrimero++;
						} else {
							return;
						}
					} catch (Exception e) {
						System.out.println("Has tocado dos veces el mismo botón");
					}
					if (esPrimero == 1) {
						try {
							primerBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
							segundoBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
						} catch (Exception e) {
							System.out.println("Es la primera tirada");
						}
						contIntentos++;
						primerBoton = b9;
						UrlPrimeraCarta = btnImages.get(8);
					} else if (esPrimero == 2) {
						segundoBoton = b9;
						if (btnImages.get(8).equals(UrlPrimeraCarta) && !b9.equals(primerBoton)) {
							System.out.println("Has acertado");
							b9.setEnabled(false);
							primerBoton.setEnabled(false);
							contVictoria++;
							if (contVictoria == 8) {
								JOptionPane.showMessageDialog(null, "Has ganado con " + contIntentos + " intentos. Enhorabuena!!!");
							}
						}
						esPrimero = 0;
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

		b10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					b10.setIcon(new ImageIcon(ImageIO.read(getClass().getResource(btnImages.get(9)))));
					try {
						if (!b10.equals(primerBoton)) {
							esPrimero++;
						} else {
							return;
						}
					} catch (Exception e) {
						System.out.println("Has tocado dos veces el mismo botón");
					}
					if (esPrimero == 1) {
						try {
							primerBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
							segundoBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
						} catch (Exception e) {
							System.out.println("Es la primera tirada");
						}
						contIntentos++;
						primerBoton = b10;
						UrlPrimeraCarta = btnImages.get(9);
					} else if (esPrimero == 2) {
						segundoBoton = b10;
						if (btnImages.get(9).equals(UrlPrimeraCarta) && !b10.equals(primerBoton)) {
							System.out.println("Has acertado");
							b10.setEnabled(false);
							primerBoton.setEnabled(false);
							contVictoria++;
							if (contVictoria == 8) {
								JOptionPane.showMessageDialog(null, "Has ganado con " + contIntentos + " intentos. Enhorabuena!!!");
							}
						}
						esPrimero = 0;
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

		b11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					b11.setIcon(new ImageIcon(ImageIO.read(getClass().getResource(btnImages.get(10)))));
					try {
						if (!b11.equals(primerBoton)) {
							esPrimero++;
						} else {
							return;
						}
					} catch (Exception e) {
						System.out.println("Has tocado dos veces el mismo botón");
					}
					if (esPrimero == 1) {
						try {
							primerBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
							segundoBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
						} catch (Exception e) {
							System.out.println("Es la primera tirada");
						}
						contIntentos++;
						primerBoton = b11;
						UrlPrimeraCarta = btnImages.get(10);
					} else if (esPrimero == 2) {
						segundoBoton = b11;
						if (btnImages.get(10).equals(UrlPrimeraCarta) && !b11.equals(primerBoton)) {
							System.out.println("Has acertado");
							b11.setEnabled(false);
							primerBoton.setEnabled(false);
							contVictoria++;
							if (contVictoria == 8) {
								JOptionPane.showMessageDialog(null, "Has ganado con " + contIntentos + " intentos. Enhorabuena!!!");
							}
						}
						esPrimero = 0;
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

		b12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					b12.setIcon(new ImageIcon(ImageIO.read(getClass().getResource(btnImages.get(11)))));
					try {
						if (!b12.equals(primerBoton)) {
							esPrimero++;
						} else {
							return;
						}
					} catch (Exception e) {
						System.out.println("Has tocado dos veces el mismo botón");
					}
					if (esPrimero == 1) {
						try {
							primerBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
							segundoBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
						} catch (Exception e) {
							System.out.println("Es la primera tirada");
						}
						contIntentos++;
						primerBoton = b12;
						UrlPrimeraCarta = btnImages.get(11);
					} else if (esPrimero == 2) {
						segundoBoton = b12;
						if (btnImages.get(11).equals(UrlPrimeraCarta) && !b12.equals(primerBoton)) {
							System.out.println("Has acertado");
							b12.setEnabled(false);
							primerBoton.setEnabled(false);
							contVictoria++;
							if (contVictoria == 8) {
								JOptionPane.showMessageDialog(null, "Has ganado con " + contIntentos + " intentos. Enhorabuena!!!");
							}
						}
						esPrimero = 0;
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

		b13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					b13.setIcon(new ImageIcon(ImageIO.read(getClass().getResource(btnImages.get(12)))));
					try {
						if (!b13.equals(primerBoton)) {
							esPrimero++;
						} else {
							return;
						}
					} catch (Exception e) {
						System.out.println("Has tocado dos veces el mismo botón");
					}
					if (esPrimero == 1) {
						try {
							primerBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
							segundoBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
						} catch (Exception e) {
							System.out.println("Es la primera tirada");
						}
						contIntentos++;
						primerBoton = b13;
						UrlPrimeraCarta = btnImages.get(12);
					} else if (esPrimero == 2) {
						segundoBoton = b13;
						if (btnImages.get(12).equals(UrlPrimeraCarta) && !b13.equals(primerBoton)) {
							System.out.println("Has acertado");
							b13.setEnabled(false);
							primerBoton.setEnabled(false);
							contVictoria++;
							if (contVictoria == 8) {
								JOptionPane.showMessageDialog(null, "Has ganado con " + contIntentos + " intentos. Enhorabuena!!!");
							}
						}
						esPrimero = 0;
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

		b14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					b14.setIcon(new ImageIcon(ImageIO.read(getClass().getResource(btnImages.get(13)))));
					try {
						if (!b14.equals(primerBoton)) {
							esPrimero++;
						} else {
							return;
						}
					} catch (Exception e) {
						System.out.println("Has tocado dos veces el mismo botón");
					}
					if (esPrimero == 1) {
						try {
							primerBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
							segundoBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
						} catch (Exception e) {
							System.out.println("Es la primera tirada");
						}
						contIntentos++;
						primerBoton = b14;
						UrlPrimeraCarta = btnImages.get(13);
					} else if (esPrimero == 2) {
						segundoBoton = b14;
						if (btnImages.get(13).equals(UrlPrimeraCarta) && !b14.equals(primerBoton)) {
							System.out.println("Has acertado");
							b14.setEnabled(false);
							primerBoton.setEnabled(false);
							contVictoria++;
							if (contVictoria == 8) {
								JOptionPane.showMessageDialog(null, "Has ganado con " + contIntentos + " intentos. Enhorabuena!!!");
							}
						}
						esPrimero = 0;
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

		b15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					b15.setIcon(new ImageIcon(ImageIO.read(getClass().getResource(btnImages.get(14)))));
					try {
						if (!b15.equals(primerBoton)) {
							esPrimero++;
						} else {
							return;
						}
					} catch (Exception e) {
						System.out.println("Has tocado dos veces el mismo botón");
					}
					if (esPrimero == 1) {
						try {
							primerBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
							segundoBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
						} catch (Exception e) {
							System.out.println("Es la primera tirada");
						}
						contIntentos++;
						primerBoton = b15;
						UrlPrimeraCarta = btnImages.get(14);
					} else if (esPrimero == 2) {
						segundoBoton = b15;
						if (btnImages.get(14).equals(UrlPrimeraCarta) && !b15.equals(primerBoton)) {
							System.out.println("Has acertado");
							b15.setEnabled(false);
							primerBoton.setEnabled(false);
							contVictoria++;
							if (contVictoria == 8) {
								JOptionPane.showMessageDialog(null, "Has ganado con " + contIntentos + " intentos. Enhorabuena!!!");
							}
						}
						esPrimero = 0;
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

		b16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					b16.setIcon(new ImageIcon(ImageIO.read(getClass().getResource(btnImages.get(15)))));
					try {
						if (!b16.equals(primerBoton)) {
							esPrimero++;
						} else {
							return;
						}
					} catch (Exception e) {
						System.out.println("Has tocado dos veces el mismo botón");
					}
					if (esPrimero == 1) {
						try {
							primerBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
							segundoBoton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Rojo.png"))));
						} catch (Exception e) {
							System.out.println("Es la primera tirada");
						}
						contIntentos++;
						primerBoton = b16;
						UrlPrimeraCarta = btnImages.get(15);
					} else if (esPrimero == 2) {
						segundoBoton = b16;
						if (btnImages.get(15).equals(UrlPrimeraCarta) && !b16.equals(primerBoton)) {
							System.out.println("Has acertado");
							b16.setEnabled(false);
							primerBoton.setEnabled(false);
							contVictoria++;
							if (contVictoria == 8) {
								JOptionPane.showMessageDialog(null, "Has ganado con " + contIntentos + " intentos. Enhorabuena!!!");
							}
						}
						esPrimero = 0;
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

	}

	private int ponerRutas(ArrayList<String> listaRutas, ArrayList<String> btnImages) {
		boolean seguir = true;
		while (seguir) {
			int numero = dameRandom();
			switch (numero) {
			case 0:
				if (contador0 < 2) {
					btnImages.add(listaRutas.get(0));
					contador0++;
					return numero;
				}
				break;
			case 1:
				if (contador1 < 2) {
					contador1++;
					btnImages.add(listaRutas.get(1));
					return numero;
				}
				break;
			case 2:
				if (contador2 < 2) {
					contador2++;
					btnImages.add(listaRutas.get(2));
					return numero;
				}
				break;
			case 3:
				if (contador3 < 2) {
					btnImages.add(listaRutas.get(3));
					contador3++;
					return numero;
				}
				break;

			case 4:
				if (contador4 < 2) {
					btnImages.add(listaRutas.get(4));
					contador4++;
					return numero;
				}
				break;
			case 5:
				if (contador5 < 2) {
					btnImages.add(listaRutas.get(5));
					contador5++;
					return numero;
				}
				break;
			case 6:
				if (contador6 < 2) {
					btnImages.add(listaRutas.get(6));
					contador6++;
					return numero;
				}
				break;
			case 7:
				if (contador7 < 2) {
					btnImages.add(listaRutas.get(7));
					contador7++;
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
