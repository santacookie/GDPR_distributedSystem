package ClientGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JSplitPane;
import javax.swing.JTextPane;

import ds.service3.LogisticsGrpc;
import ds.service3.LogisticsGrpc.LogisticsBlockingStub;
import ds.service3.Request;
import ds.service3.RequestOrBuilder;
import ds.service3.Response;
import ds.service3.ResponseOrBuilder;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.internal.ServerStream;
import io.grpc.stub.ClientResponseObserver;
import io.grpc.stub.StreamObserver;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;

public class client3 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					client3 window = new client3();
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
	public client3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 597, 832);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel lblNewLabel_1 = new JLabel("Product Name");
		lblNewLabel_1.setFont(new Font("HYGothic-Extra", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(122, 196, 125, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(157, 231, 234, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Product Name");
		lblNewLabel_1_1.setFont(new Font("HYGothic-Extra", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(122, 399, 125, 33);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(157, 305, 234, 23);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Customer");
		lblNewLabel_1_1_1.setFont(new Font("HYGothic-Extra", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(132, 605, 125, 33);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(157, 426, 234, 23);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Office Message");
		lblNewLabel_1_1_1_1.setFont(new Font("HYGothic-Extra", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1.setBounds(132, 694, 145, 33);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(157, 508, 234, 23);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Confirm Message");
		lblNewLabel_1_1_1_1_1.setFont(new Font("HYGothic-Extra", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_1.setBounds(122, 278, 166, 33);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(157, 632, 234, 23);
		frame.getContentPane().add(textField_4);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Shipping status");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("HYGothic-Extra", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_1_1.setBounds(122, 481, 155, 33);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(157, 726, 234, 21);
		frame.getContentPane().add(textField_5);
		
		
		//버튼 1번 
		JButton btnNewButton = new JButton("payment");
		btnNewButton.setBounds(390, 231, 91, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JButton button = (JButton)e.getSource();
				String label = button.getActionCommand();	
				
				
				System.out.println("service 3 to be invoked ...");
				System.out.println("Thank you so much order some office product! ");
				
					
				
					ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 414).usePlaintext().build();
					LogisticsBlockingStub LogisticsStub = LogisticsGrpc.newBlockingStub(channel);
					
					textField_1.setText( String.valueOf("Thank you so much payment"));
			}
		});
		
		
		JButton btnNewButton_2 = new JButton("send");
		btnNewButton_2.setBounds(390, 426, 91, 23);
		frame.getContentPane().add(btnNewButton_2);

		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JButton button1 = (JButton)e.getSource();
				String label1 = button1.getActionCommand();	
				
				System.out.println("service 3 to be invoked ...");
				System.out.println("Your product status");
				
					
				
					ManagedChannel channel1 = ManagedChannelBuilder.forAddress("localhost", 414).usePlaintext().build();
					LogisticsBlockingStub LogisticsStub = LogisticsGrpc.newBlockingStub(channel1);
					
					textField_3.setText( String.valueOf("Soon delivery"));
			}
		});
		
		JButton btnNewButton_1 = new JButton("Chat >");
		btnNewButton_1.setBounds(390, 632, 91, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JButton button2 = (JButton)e.getSource();
				String label2 = button2.getActionCommand();	
				
				
				System.out.println("Customer sent to Inquiry message");
				System.out.println("...");
					
				
					ManagedChannel channel2 = ManagedChannelBuilder.forAddress("localhost", 414).usePlaintext().build();
					LogisticsBlockingStub LogisticsStub = LogisticsGrpc.newBlockingStub(channel2);
					
					textField_5.setText( String.valueOf("Inquary message. Thank you."));
			}
		});
		
		JButton btnNewButton_3 = new JButton("Chat >>");
		btnNewButton_3.setBounds(390, 725, 91, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, -12, 583, 814);
		frame.getContentPane().add(lblNewLabel);
		Image img = new ImageIcon(this.getClass().getResource("/service3.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JButton button3 = (JButton)e.getSource();
				String label3 = button3.getActionCommand();	
				
				
				System.out.println("Smart Office Service agent sent to answer message");
				System.out.println("...");
					
				
					ManagedChannel channel3 = ManagedChannelBuilder.forAddress("localhost", 414).usePlaintext().build();
					LogisticsBlockingStub LogisticsStub = LogisticsGrpc.newBlockingStub(channel3);
					
					textField_4.setText( String.valueOf("Inquary message Answer."));
			}
		});
	}	
}
		
		

	
		
	
	
