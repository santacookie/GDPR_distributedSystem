package ClientGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;

import ds.service1.Access;
import ds.service1.UserService;
import ds.service1.userGrpc;
import ds.service1.userGrpc.userBlockingStub;
import ds.service1.Access.APIResponse;
import ds.service1.Access.LoginRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;
import javax.swing.ImageIcon;

import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.SwingConstants;

public class client1 {

	
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					client1 window = new client1();
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
	public client1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Smart Office Client Service 1");
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 907, 742);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel username = new JLabel("User Name");
		username.setFont(new Font("HYGothic-Extra", Font.PLAIN, 20));
		username.setBounds(506, 254, 147, 36);
		frame.getContentPane().add(username);
		
		JLabel passWord = new JLabel("Password");
		passWord.setFont(new Font("HYGothic-Extra", Font.PLAIN, 20));
		passWord.setBounds(506, 365, 147, 36);
		frame.getContentPane().add(passWord);
		
		
		//textfield 생성자
		textField = new JTextField();
		textField.setBounds(678, 257, 179, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(678, 368, 179, 36);
		frame.getContentPane().add(textField_1);
		
		
		//connect with server
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("HYGraphic-Medium", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JButton button = (JButton)e.getSource();
				String label = button.getActionCommand();
				
				
				if(textField == textField_1) {
					System.out.println("Hello Our Employee");
				}else {
					System.out.println("Please try again");
				}
					System.out.println("service 1 to be invoked ...");
					
					ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 20).usePlaintext().build();
					userBlockingStub blockingStub = userGrpc.newBlockingStub(channel);	
					
					
					//preparing message to send
					LoginRequest request = LoginRequest.newBuilder().setUsername(textField.getText()).build();
					LoginRequest request2 = LoginRequest.newBuilder().setPassword(textField_1.getText()).build();

					//retreving reply from service
					APIResponse response = blockingStub.login(request);
					APIResponse response2 = blockingStub.login(request2);
					
					//textField_1.setText( String.valueOf( response.getResponsemessage()) );
					textField_2.setText( String.valueOf( response.getResponsemessage()) );
					
					
				
				System.out.println("You are not our Employee. ");
			}
		});
		
		
		btnNewButton.setBounds(681, 472, 176, 42);
		frame.getContentPane().add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(450, 649, 443, 51);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		//backgound part
		JLabel lblNewLabel_1 = new JLabel(""); //background 
		Image img = new ImageIcon(this.getClass().getResource("/service1.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setBounds(0, 0, 450, 700);
		frame.getContentPane().add(lblNewLabel_1);
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}
	}

