import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Fuqia_e_passwordit {

	private JFrame frmPassword;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fuqia_e_passwordit window = new Fuqia_e_passwordit();
					window.frmPassword.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Fuqia_e_passwordit() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPassword = new JFrame();
		frmPassword.setForeground(Color.BLACK);
		frmPassword.setBackground(Color.BLACK);
		frmPassword.setTitle("Siguria e te dhenave");
		frmPassword.setBounds(100, 100, 554, 267);
		frmPassword.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPassword.getContentPane().setLayout(null);
		
		JLabel lblFuqiaEFjalekalimit = new JLabel("Fuqia e fjalekalimit");
		lblFuqiaEFjalekalimit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblFuqiaEFjalekalimit.setForeground(Color.WHITE);
		lblFuqiaEFjalekalimit.setBounds(177, 11, 176, 30);
		frmPassword.getContentPane().add(lblFuqiaEFjalekalimit);
		
		JLabel lblUsername = new JLabel("Perdoruesi:");
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBounds(25, 78, 104, 24);
		frmPassword.getContentPane().add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(139, 82, 189, 20);
		frmPassword.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Fjalekalimi:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(25, 125, 96, 14);
		frmPassword.getContentPane().add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(139, 124, 189, 20);
		frmPassword.getContentPane().add(passwordField);
		
		JButton btnCakto = new JButton("Cakto");
		btnCakto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String perdoruesi=textField.getText();
                String fjalekalimi=String.valueOf(passwordField.getPassword());
                boolean hasLetter = false;
			    boolean hasDigit = false;
			        if(fjalekalimi.length()>=6)
			         {
			            for (int i = 0; i < fjalekalimi.length(); i++) {
			                char x = fjalekalimi.charAt(i);
			                if (Character.isLetter(x)) {

			                    hasLetter = true;
			                }

			                else if (Character.isDigit(x)) {

			                    hasDigit = true;
			                }

			                // no need to check further, break the loop
			                if(hasLetter && hasDigit){

			                    break;
			                }

			            }
			            if (hasLetter && hasDigit) {
			                System.out.println("Passwordi juaj eshte i fuqishem!");
			            } else {
			                System.out.println("Passwordi juaj eshte i dobet!Kujdes!");
			            }
			         }
			        else 
                    {
			            System.out.println("Passwordi duhet te kete te pakten 6 karaktere!");
			        }
			    }}
		);
		btnCakto.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnCakto.setBounds(221, 176, 89, 23);
		frmPassword.getContentPane().add(btnCakto);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Fuqia_e_passwordit.class.getResource("/Images/1.jpg")));
		label.setBounds(0, 0, 538, 228);
		frmPassword.getContentPane().add(label);
	}
}
