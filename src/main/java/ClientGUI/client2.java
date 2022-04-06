package ClientGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;

import com.google.protobuf.Descriptors.Descriptor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;





import ds.service2.ProductInfoGrpc;
import ds.service2.ProductInfoGrpc.ProductInfoBlockingStub;
import ds.service2.ProductInfoOuterClass.Product;
import ds.service2.ProductInfoOuterClass.ProductID;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


import java.awt.Color;
import javax.swing.JSplitPane;

public class client2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTextField textField_5;
	private JTextField textField_6;
	private JButton btnNewButton_2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					client2 window = new client2();
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
	public client2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1399, 783);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Id");
		lblNewLabel_1.setFont(new Font("HYGothic-Extra", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(544, 132, 159, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setFont(new Font("HYGothic-Extra", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(544, 200, 123, 30);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Description");
		lblNewLabel_1_2.setFont(new Font("HYGothic-Extra", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(544, 278, 159, 30);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Quantity");
		lblNewLabel_1_3.setFont(new Font("HYGothic-Extra", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(544, 350, 123, 30);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		
		//textfield constructor
		textField = new JTextField();
		textField.setBounds(781, 132, 175, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(781, 204, 175, 30);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(781, 278, 175, 30);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(781, 354, 175, 30);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(781, 429, 175, 30);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		
		
		btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.setFont(new Font("HYGothic-Extra", Font.PLAIN, 20));
		btnNewButton_1.setBounds(1002, 354, 175, 30);
		frame.getContentPane().add(btnNewButton_1);
		
		
		
		JLabel lblNewLabel_1_4 = new JLabel("Order Code ID");
		lblNewLabel_1_4.setFont(new Font("HYGothic-Extra", Font.PLAIN, 20));
		lblNewLabel_1_4.setBounds(544, 579, 197, 30);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(781, 582, 175, 30);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(506, 643, 671, 66);
		frame.getContentPane().add(textField_6);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Order Code ID");
		lblNewLabel_1_4_1.setFont(new Font("HYGothic-Extra", Font.PLAIN, 20));
		lblNewLabel_1_4_1.setBounds(544, 426, 197, 30);
		frame.getContentPane().add(lblNewLabel_1_4_1);
		
		
		JButton btnNewButton_3 = new JButton("Check");
		btnNewButton_3.setFont(new Font("HYGothic-Extra", Font.PLAIN, 20));
		btnNewButton_3.setBounds(1002, 579, 175, 29);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel(""); //background part
		lblNewLabel_2.setBounds(0, 0, 1385, 752);
		frame.getContentPane().add(lblNewLabel_2);
		Image img = new ImageIcon(this.getClass().getResource("/service2.jpg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img));
		
		
		
		
		
		//connect with server
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JButton button = (JButton)e.getSource();
				String label = button.getActionCommand();
				
				if(textField != textField_1 ) {
					System.out.println("Thank you so much order some office product!");
				}else {
					System.out.println("Please check invaild data");
				}
					System.out.println("service 2 to be invoked ...");
					
					ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 214).usePlaintext().build();
					ProductInfoBlockingStub ProductInfoBlockingStub = ProductInfoGrpc.newBlockingStub(channel);	
					
					
					//preparing message to send
					Product request = Product.newBuilder().setEmployedId(textField.getText()).build();
					Product request2 = Product.newBuilder().setName(textField_1.getText()).build();
					Product request3 = Product.newBuilder().setDescription(textField_2.getText()).build();
					Product request4 = Product.newBuilder().setQuantity(textField_3.getText()).build();
					
					//retreving reply from service
					ProductID response = ProductInfoBlockingStub.addProduct(request);
					ProductID response2 = ProductInfoBlockingStub.addProduct(request2);
					ProductID response3 = ProductInfoBlockingStub.addProduct(request3);
					ProductID response4 = ProductInfoBlockingStub.addProduct(request4);
					
					//textField_4.setText( String.valueOf( response.getResponsemessage()) );
					textField_4.setText( String.valueOf( response.getOrderCode()) );
					
					
				
				System.out.println("Please check your order code");
				
				
				
			}
		});
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JButton button = (JButton)e.getSource();
				String label = button.getActionCommand();
				
					System.out.println("Thank you so much order some office product!");
				
					System.out.println("Please check invaild data");
				
					System.out.println("service 2 to be invoked ...");
					
					ManagedChannel channel2 = ManagedChannelBuilder.forAddress("localhost", 214).usePlaintext().build();
					ProductInfoBlockingStub ProductInfoBlockingStub = ProductInfoGrpc.newBlockingStub(channel2);	
					
					
					
		
					//textField_4.setText( String.valueOf( response.getResponsemessage()) );
					textField_6.setText( String.valueOf( "Hi, employee, Your Order is success. Soon You can get it!"));
			
					
				
				System.out.println("Please check your order code");
				
			}
			});
			
		
	}
	}

