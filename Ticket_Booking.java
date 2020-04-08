import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ticket_Booking {
	
	static JTextArea textarea;
	static int price_count = 0;
    	static JTextField textfield;
	
	public static void main(String[] args) {
		
		final String [] array = {"", "", "", ""};
		
		JFrame frame = new JFrame("Vox Cinema");
		frame.setSize(600,600);
		frame.getContentPane().setLayout(null);
		
		JLabel selectmovie = new JLabel("Select Movie: ");
		selectmovie.setFont(new Font("Calibri", Font.PLAIN, 15));
		selectmovie.setBounds(10, 10, 150, 30);
		frame.getContentPane().add(selectmovie);
		
		String [] temp1 = {"", "Interstellar", "Avengers: End Game", "Dunkirk", "The Circle", "Stephen Hawkings"};
		final JComboBox<String> comboBox = new JComboBox<>(temp1);
		comboBox.setMaximumRowCount(5);
		comboBox.setFont(new Font("Calibri", Font.PLAIN, 15));
		comboBox.setBounds(150, 15, 192, 20);
		frame.getContentPane().add(comboBox);
		
		comboBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{			
				 array[0] = (String) comboBox.getSelectedItem();
				 
			}
		});
		
		JLabel selecttiming = new JLabel("Select Timing: ");
		selecttiming.setFont(new Font("Calibri", Font.PLAIN, 15));
		selecttiming.setBounds(10, 45, 150, 30);
		frame.getContentPane().add(selecttiming);
		
		String [] temp2 = {"", "11:30 am", "1:00 pm", "4:00 pm", "8:30 pm", "10:00 pm"};
		final JComboBox<String> comboBox_1 = new JComboBox<>(temp2);
		comboBox_1.setMaximumRowCount(5);
		comboBox_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		comboBox_1.setBounds(150, 50, 192, 20);
		frame.getContentPane().add(comboBox_1);
		
		comboBox_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{			
				array[1] = (String) comboBox_1.getSelectedItem();
			}
		});
		
		JRadioButton radio_7 = new JRadioButton("");
		radio_7.setBounds(250, 241, 21, 21);
		frame.getContentPane().add(radio_7);
		
		JRadioButton radio_6 = new JRadioButton("");
		radio_6.setBounds(200, 241, 21, 21);
		frame.getContentPane().add(radio_6);
		
		JRadioButton radio_10 = new JRadioButton("");
		radio_10.setBounds(400, 241, 21, 21);
		frame.getContentPane().add(radio_10);
		
		JRadioButton radio_8 = new JRadioButton("");
		radio_8.setBounds(300, 241, 21, 21);
		frame.getContentPane().add(radio_8);
		
		JRadioButton radio_9 = new JRadioButton("");
		radio_9.setBounds(350, 241, 21, 21);
		frame.getContentPane().add(radio_9);
		
		JRadioButton radio_5 = new JRadioButton("");
		radio_5.setBounds(400, 221, 21, 21);
		frame.getContentPane().add(radio_5);
		
		JRadioButton radio_1 = new JRadioButton("");
		radio_1.setBounds(200, 221, 21, 21);
		frame.getContentPane().add(radio_1);
		
		JRadioButton radio_2 = new JRadioButton("");
		radio_2.setBounds(250, 221, 21, 21);
		frame.getContentPane().add(radio_2);
		
		JRadioButton radio_3 = new JRadioButton("");
		radio_3.setBounds(300, 221, 21, 21);
		frame.getContentPane().add(radio_3);
		
		JRadioButton radio_4 = new JRadioButton("");
		radio_4.setBounds(350, 221, 21, 21);
		frame.getContentPane().add(radio_4);
		
		JRadioButton radio_11 = new JRadioButton("");
		radio_11.setBounds(200, 261, 21, 21);
		frame.getContentPane().add(radio_11);
		
		JRadioButton radio_12 = new JRadioButton("");
		radio_12.setBounds(250, 261, 21, 21);
		frame.getContentPane().add(radio_12);
		
		JRadioButton radio_13 = new JRadioButton("");
		radio_13.setBounds(300, 261, 21, 21);
		frame.getContentPane().add(radio_13);
		
		JRadioButton radio_14 = new JRadioButton("");
		radio_14.setBounds(350, 261, 21, 21);
		frame.getContentPane().add(radio_14);
		
		JRadioButton radio_15 = new JRadioButton("");
		radio_15.setBounds(400, 261, 21, 21);
		frame.getContentPane().add(radio_15);
		
		JRadioButton radio_16 = new JRadioButton("");
		radio_16.setBounds(200, 301, 21, 21);
		frame.getContentPane().add(radio_16);
		
		JRadioButton radio_17 = new JRadioButton("");
		radio_17.setBounds(250, 301, 21, 21);
		frame.getContentPane().add(radio_17);
		
		JRadioButton radio_18 = new JRadioButton("");
		radio_18.setBounds(300, 301, 21, 21);
		frame.getContentPane().add(radio_18);
		
		JRadioButton radio_19 = new JRadioButton("");
		radio_19.setBounds(350, 301, 21, 21);
		frame.getContentPane().add(radio_19);
		
		JRadioButton radio_20 = new JRadioButton("");
		radio_20.setBounds(400, 301, 21, 21);
		frame.getContentPane().add(radio_20);
		
		final JRadioButton [] arraybuttonnormal = {radio_1, radio_2, radio_3, radio_4, radio_5, radio_6, radio_7, radio_8, radio_9, radio_10,
				radio_11, radio_12, radio_13, radio_14, radio_15};
		final JRadioButton [] arraybuttonvip = {radio_16, radio_17, radio_18, radio_19, radio_20};
				
		JLabel seatselection = new JLabel("Seat Selection:");
		seatselection.setFont(new Font("Calibri", Font.PLAIN, 15));
		seatselection.setBounds(10, 181, 200, 30);
		frame.getContentPane().add(seatselection);
		
		JLabel lineshort = new JLabel("________________________________");
		lineshort.setFont(new Font("Calibri", Font.PLAIN, 15));
		lineshort.setBounds(200, 281, 261, 10);
		frame.getContentPane().add(lineshort);
		
		JLabel screen = new JLabel("SCREEN");
		screen.setFont(new Font("Calibri", Font.PLAIN, 15));
		screen.setBounds(285, 181, 100, 30);
		frame.getContentPane().add(screen);
		
		JRadioButton radioselected = new JRadioButton("");
		radioselected.setSelected(true);
		radioselected.setBounds(485, 221, 21, 21);
		frame.getContentPane().add(radioselected);
		
		JRadioButton radioavailable = new JRadioButton("");
		radioavailable.setBounds(485, 241, 21, 21);
		frame.getContentPane().add(radioavailable);
		
		JRadioButton radiosold = new JRadioButton("");
		radiosold.setEnabled(false);
		radiosold.setBounds(485, 261, 21, 21);
		frame.getContentPane().add(radiosold);
		
		JLabel selected = new JLabel("Selected");
		selected.setFont(new Font("Calibri", Font.PLAIN, 15));
		selected.setBounds(510, 223, 68, 20);
		frame.getContentPane().add(selected);
		
		JLabel available = new JLabel("Available");
		available.setFont(new Font("Calibri", Font.PLAIN, 15));
		available.setBounds(510, 243, 68, 20);
		frame.getContentPane().add(available);
		
		JLabel sold = new JLabel("Sold");
		sold.setFont(new Font("Calibri", Font.PLAIN, 15));
		sold.setBounds(510, 263, 68, 20);
		frame.getContentPane().add(sold);
		
		JLabel selectdate = new JLabel("Select Date:");
		selectdate.setFont(new Font("Calibri", Font.PLAIN, 15));
		selectdate.setBounds(10, 80, 150, 30);
		frame.getContentPane().add(selectdate);
		
		JLabel selectseat = new JLabel("Select Seat Type: ");
		selectseat.setFont(new Font("Calibri", Font.PLAIN, 15));
		selectseat.setBounds(10, 115, 160, 30);
		frame.getContentPane().add(selectseat);
		
		String [] temp3 = {"", "Tue 26 Nov", "Wed 27 Nov", "Thurs 28 Nov", "Fri 29 Nov", "Sat 30 Nov"};
		final JComboBox<String> comboBox_2 = new JComboBox<>(temp3);
		comboBox_2.setMaximumRowCount(5);
		comboBox_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		comboBox_2.setBounds(150, 85, 192, 20);
		frame.getContentPane().add(comboBox_2);
		
		comboBox_2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{			
				array[2] = (String) comboBox_2.getSelectedItem();
			}
		});
		
		String [] temp4= {"", "Edge (Rs. 600)", "Normal (Rs. 200)"};
	    final JComboBox<String> comboBox_3 = new JComboBox<>(temp4);
		comboBox_3.setMaximumRowCount(5);
		comboBox_3.setFont(new Font("Calibri", Font.PLAIN, 15));
		comboBox_3.setBounds(150, 120, 192, 20);
		frame.getContentPane().add(comboBox_3);
		
		comboBox_3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{			
				array[3] = (String) comboBox_3.getSelectedItem();
				if(array[3] == "Edge (Rs. 600)")
				{
					for(int i=0 ; i<15; i++)
					{
						arraybuttonnormal[i].setEnabled(false);;
					}
					for(int i=0 ; i<5; i++)
					{
						arraybuttonvip[i].setEnabled(true);;
					}
				}
				else if(array[3] == "Normal (Rs. 200)")
				{
					for(int i=0 ; i<5; i++)
					{
						arraybuttonvip[i].setEnabled(false);;
					}
					for(int i=0 ; i<15; i++)
					{
						arraybuttonnormal[i].setEnabled(true);;
					}
				}
				
			}
		});
		
		JButton booknow = new JButton("Book Now");
		booknow.setFont(new Font("Calibri", Font.PLAIN, 15));
		booknow.setBounds(210, 350, 200, 30);
		frame.getContentPane().add(booknow);
		
		JLabel linelong = new JLabel("_______________________________________________________________________________");
		linelong.setFont(new Font("Calibri", Font.PLAIN, 15));
		linelong.setBounds(15, 400, 1000, 10);
		frame.getContentPane().add(linelong);
		
		textarea = new JTextArea();
		textarea.setFont(new Font("Calibri", Font.PLAIN, 18));
		textarea.setEditable(false);
		textarea.setBounds(10, 460, 568, 93);
		frame.getContentPane().add(textarea);
		textarea.setColumns(10);
		
		textfield = new JTextField();
		textfield.setEditable(false);
		textfield.setBounds(10, 425, 566, 19);
		frame.getContentPane().add(textfield);
		textfield.setColumns(10);
		
		booknow.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{			
				for(int i=0 ; i<15; i++)
				{
					boolean c = check(arraybuttonnormal[i]);
					if(c == true)
						price_count = price_count + 200;
				}
				for(int j=0 ; j<5; j++)
				{
					boolean c = check(arraybuttonvip[j]);
					if(c == true)
						price_count = price_count + 600;
				}
				
				textfield.setText("Your booking has been confirmed.");
				textarea.setText("Movie: "+ array[0] + "\nTime: " + array[1] + "\nDay: "+ array[2]+ "\nPrice: Rs."+ price_count );
				price_count = 0;
			}
		});
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	public static boolean check (JRadioButton button)
	{
		if(button.isSelected() == true)
		{
			button.setSelected(false);
			button.setEnabled(false);
			return true;
		}
		return false;
	}
	
}


