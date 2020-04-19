import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class Demo extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo frame = new Demo();
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
	public Demo() {
		setTitle("����ഫ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 757, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u532F\u7387:", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel.setBounds(41, 22, 170, 230);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(31, 30, 96, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBoxn = new JComboBox();
		comboBoxn.setBounds(31, 71, 96, 21);
		panel.add(comboBoxn);
		comboBoxn.addItem("�п��");
		comboBoxn.addItem("�s�x�� TWD");
		comboBoxn.addItem("���� USD");
		comboBoxn.addItem("��� JPY");
		comboBoxn.addItem("�ڤ� EUR");
		comboBoxn.addItem("�^�� GBP");
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(31, 151, 96, 21);
		panel.add(comboBox_1);
		comboBox_1.addItem("�п��");
		comboBox_1.addItem("�s�x�� TWD");
		comboBox_1.addItem("���� USD");
		comboBox_1.addItem("��� JPY");
		comboBox_1.addItem("�ڤ� EUR");
		comboBox_1.addItem("�^�� GBP");
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(255, 204, 204));
		textField_2.setEditable(false);
		textField_2.setBounds(31, 188, 96, 21);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "\u6EAB\u5EA6:", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel_1.setBounds(282, 22, 170, 230);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(35, 30, 96, 21);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(35, 73, 96, 21);
		panel_1.add(comboBox_2);
		comboBox_2.addItem("�п��");
		comboBox_2.addItem("��� C");
		comboBox_2.addItem("�ؤ� F");
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(35, 154, 96, 21);
		panel_1.add(comboBox_3);
		comboBox_3.addItem("�п��");
		comboBox_3.addItem("��� C");
		comboBox_3.addItem("�ؤ� F");
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBackground(new Color(255, 204, 204));
		textField_3.setBounds(35, 185, 96, 21);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "\u901F\u5EA6:", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel_2.setBounds(522, 22, 170, 230);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		textField_4 = new JTextField();
		textField_4.setBounds(46, 28, 96, 21);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(46, 67, 96, 21);
		panel_2.add(comboBox_4);
		comboBox_4.addItem("�п��");
		comboBox_4.addItem("���� km");
		comboBox_4.addItem("�^�� mi");
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(46, 154, 96, 21);
		panel_2.add(comboBox_5);
		comboBox_5.addItem("�п��");
		comboBox_5.addItem("���� km");
		comboBox_5.addItem("�^�� mi");
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBackground(new Color(255, 204, 204));
		textField_5.setBounds(46, 188, 96, 21);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "\u6642\u9593:", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel_3.setBounds(41, 262, 170, 230);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		textField_6 = new JTextField();
		textField_6.setBounds(30, 30, 96, 21);
		panel_3.add(textField_6);
		textField_6.setColumns(10);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(30, 69, 96, 21);
		panel_3.add(comboBox_6);
		comboBox_6.addItem("�п��");
		comboBox_6.addItem("�~Year");
		comboBox_6.addItem("��Month");
		comboBox_6.addItem("�gWeek");
		comboBox_6.addItem("��Day");
		comboBox_6.addItem("��Hour");
		comboBox_6.addItem("��Minute");
		comboBox_6.addItem("��Second");
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBounds(30, 157, 96, 21);
		panel_3.add(comboBox_7);
		comboBox_7.addItem("�п��");
		comboBox_7.addItem("�~Year");
		comboBox_7.addItem("��Month");
		comboBox_7.addItem("�gWeek");
		comboBox_7.addItem("��Day");
		comboBox_7.addItem("��Hour");
		comboBox_7.addItem("��Minute");
		comboBox_7.addItem("��Second");
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setBackground(new Color(255, 204, 204));
		textField_7.setBounds(30, 188, 96, 21);
		panel_3.add(textField_7);
		textField_7.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "BMI:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(285, 289, 407, 187);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblCm = new JLabel("\u8EAB\u9AD8cm:");
		lblCm.setBounds(10, 38, 76, 15);
		panel_4.add(lblCm);
		lblCm.setFont(new Font("�з���", Font.PLAIN, 16));
		
		textField_8 = new JTextField();
		textField_8.setBounds(80, 36, 96, 21);
		panel_4.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblkg = new JLabel("\u9AD4\u91CDkg:");
		lblkg.setBounds(203, 38, 76, 15);
		panel_4.add(lblkg);
		lblkg.setFont(new Font("�з���", Font.PLAIN, 16));
		
		textField_9 = new JTextField();
		textField_9.setBounds(289, 36, 96, 21);
		panel_4.add(textField_9);
		textField_9.setColumns(10);
						
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setBackground(new Color(255, 204, 204));
		textField_10.setBounds(152, 156, 96, 21);
		panel_4.add(textField_10);
		textField_10.setColumns(10);
		
		
		//�ײv�ഫ		
		ImageIcon icon=new ImageIcon(getClass().getResource("/change.png"));
		JButton btnNewButton = new JButton(icon);
		
		btnNewButton.setBounds(66, 102, 30, 40);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent arg0) {											
				String m =comboBoxn.getSelectedItem().toString();
				String m2 =comboBox_1.getSelectedItem().toString();																
				String s=textField.getText();
				
				if(m.equalsIgnoreCase("�п��") || m2.equalsIgnoreCase("�п��"))				
				{
					JOptionPane.showMessageDialog(null, "�п�ܿﶵ", "�ײv", JOptionPane.WARNING_MESSAGE); //�p�G�S��ܿﶵ�|���Xĵ�i�T��
				}
				
				if(!s.matches("[0.0-9.0]+"))
				{					
					JOptionPane.showMessageDialog(null, "�п�J���T�Ʀr", "�ײv", JOptionPane.ERROR_MESSAGE); //�p�G�O�D�Ʀr�|���X���~�T���A�òM��2��textField
					textField.setText("");
					textField_2.setText("");
				}				
				
				  double a=Double.parseDouble(textField.getText());
				
				
					//�s�x�����L��f��				
					if(m.equalsIgnoreCase("�s�x�� TWD") && m2.equalsIgnoreCase("���� USD"))
					{																																																	
						double b=a*0.032;					
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  //�|�ˤ��J��p�ƲĤ@��
						textField_2.setText(""+money);
						
					}
					if(m.equalsIgnoreCase("�s�x�� TWD") && m2.equalsIgnoreCase("��� JPY"))
					{										
						double b=a*3.6;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					if(m.equalsIgnoreCase("�s�x�� TWD") && m2.equalsIgnoreCase("�ڤ� EUR"))
					{										
						double b=a*0.0286;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					if(m.equalsIgnoreCase("�s�x�� TWD") && m2.equalsIgnoreCase("�^�� GBP"))
					{										
						double b=a*0.025;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					
					
					//�������L��f��
					if(m.equalsIgnoreCase("���� USD") && m2.equalsIgnoreCase("�s�x�� TWD"))
					{
						double b=a*30;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					if(m.equalsIgnoreCase("���� USD") && m2.equalsIgnoreCase("��� JPY"))
					{
						double b=a*113;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					if(m.equalsIgnoreCase("���� USD") && m2.equalsIgnoreCase("�ڤ� EUR"))
					{
						double b=a*0.88;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					if(m.equalsIgnoreCase("���� USD") && m2.equalsIgnoreCase("�^�� GBP"))
					{
						double b=a*0.79;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					
					
					//��괫�L��f��
					if(m.equalsIgnoreCase("��� JPY") && m2.equalsIgnoreCase("�s�x�� TWD"))
					{
						double b=a*0.27;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  //�|�ˤ��J��p�ƲĤ@��
						textField_2.setText(""+money);
					}
					if(m.equalsIgnoreCase("��� JPY") && m2.equalsIgnoreCase("���� USD"))
					{
						double b=a*0.0088;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					if(m.equalsIgnoreCase("��� JPY") && m2.equalsIgnoreCase("�ڤ� EUR"))
					{
						double b=a*0.0078;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					if(m.equalsIgnoreCase("��� JPY") && m2.equalsIgnoreCase("�^�� GBP"))
					{
						double b=a*0.007;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					
					
					//�ڤ����L��f��
					if(m.equalsIgnoreCase("�ڤ� EUR") && m2.equalsIgnoreCase("�s�x�� TWD"))
					{
						double b=a*35;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  //�|�ˤ��J��p�ƲĤ@��
						textField_2.setText(""+money);
					}
					if(m.equalsIgnoreCase("�ڤ� EUR") && m2.equalsIgnoreCase("���� USD"))
					{
						double b=a*1.13;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					if(m.equalsIgnoreCase("�ڤ� EUR") && m2.equalsIgnoreCase("��� JPY"))
					{
						double b=a*128;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					if(m.equalsIgnoreCase("�ڤ� EUR") && m2.equalsIgnoreCase("�^�� GBP"))
					{
						double b=a*0.9;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					
					
					//�^�鴫�L��f��
					if(m.equalsIgnoreCase("�^�� GBP") && m2.equalsIgnoreCase("�s�x�� TWD"))
					{
						double b=a*38;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  //�|�ˤ��J��p�ƲĤ@��
						textField_2.setText(""+money);
					}
					if(m.equalsIgnoreCase("�^�� GBP") && m2.equalsIgnoreCase("���� USD"))
					{
						double b=a*1.2;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					if(m.equalsIgnoreCase("�^�� GBP") && m2.equalsIgnoreCase("��� JPY"))
					{
						double b=a*143;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					if(m.equalsIgnoreCase("�^�� GBP") && m2.equalsIgnoreCase("�ڤ� EUR"))
					{
						double b=a*1.11;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}																																							
			}
		}
				
			);	
	
		
		
		//�ū��ഫ		

		JButton  button = new JButton(icon);
		button.setBounds(68, 104, 30, 40);
		panel_1.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String c =comboBox_2.getSelectedItem().toString();
				String f =comboBox_3.getSelectedItem().toString();
				String s=textField_1.getText();
				
				if(c.equalsIgnoreCase("�п��") || f.equalsIgnoreCase("�п��"))				
				{
					JOptionPane.showMessageDialog(null, "�п�ܿﶵ", "�ū�", JOptionPane.WARNING_MESSAGE);  //�p�G�S��ܿﶵ�|���Xĵ�i�T��
				}
				
				if(!s.matches("[0.0-9.0]+"))
				{
					JOptionPane.showMessageDialog(null, "�п�J���T�Ʀr", "�ū�", JOptionPane.ERROR_MESSAGE); //�p�G�O�D�Ʀr�|���X���~�T���A�òM��2��textField
					textField_1.setText("");
					textField_3.setText("");
				}
				
				double a=Double.parseDouble(textField_1.getText());
				
			
				//�����ؤ�								
				if(c.equalsIgnoreCase("��� C") && f.equalsIgnoreCase("�ؤ� F"))
				{										
					double b=a*9/5.0+32;
					BigDecimal   d   =   new   BigDecimal(b);
					double temp =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  //�|�ˤ��J��p�ƲĤ@��
					textField_3.setText(""+temp);
				}
				
				//�ؤ������
				if(c.equalsIgnoreCase("�ؤ� F") && f.equalsIgnoreCase("��� C"))
				{										
					double b=(a-32)*5/9.0;
					BigDecimal   d   =   new   BigDecimal(b);
					double temp =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
					textField_3.setText(""+temp);
				}
			
			}});
		
		
										
		//�t���ഫ
		JButton button_1 = new JButton(icon);
		button_1.setBounds(82, 104, 30, 40);
		panel_2.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String k =comboBox_4.getSelectedItem().toString();
				String m =comboBox_5.getSelectedItem().toString();
				String s=textField_4.getText();
				
				if(k.equalsIgnoreCase("�п��") || m.equalsIgnoreCase("�п��"))				
				{
					JOptionPane.showMessageDialog(null, "�п�ܿﶵ", "�t��", JOptionPane.WARNING_MESSAGE); //�p�G�S��ܿﶵ�|���Xĵ�i�T��
				}
				
				if(!s.matches("[0.0-9.0]+"))
				{
					JOptionPane.showMessageDialog(null, "�п�J���T�Ʀr", "�t��", JOptionPane.ERROR_MESSAGE); //�p�G�O�D�Ʀr�|���X���~�T���A�òM��2��textField
					textField_4.setText("");
					textField_5.setText("");
				}
				double a=Double.parseDouble(textField_4.getText());
				
				//������^��
				if(k.equalsIgnoreCase("���� km") && m.equalsIgnoreCase("�^�� mi"))
								{										
									double b=a/1.6;
									BigDecimal   d   =   new   BigDecimal(b);
									double speed =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  //�|�ˤ��J��p�ƲĤ@��
									textField_5.setText(""+speed);
								}
				
				//�^���ऽ��
				if(k.equalsIgnoreCase("�^�� mi") && m.equalsIgnoreCase("���� km"))
								{										
									double b=a*1.6;
									BigDecimal   d   =   new   BigDecimal(b);
									double speed =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_5.setText(""+speed);
								}

			}
		});

				
		    
		
		//�ɶ��ഫ
		JButton button_2 = new JButton(icon);
		button_2.setBounds(60, 107, 30, 40);
		panel_3.add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t =comboBox_6.getSelectedItem().toString();
				String t2 =comboBox_7.getSelectedItem().toString();
				String s=textField_6.getText();
				
				if(t.equalsIgnoreCase("�п��") || t2.equalsIgnoreCase("�п��"))				
				{
					JOptionPane.showMessageDialog(null, "�п�ܿﶵ", "�ɶ�", JOptionPane.WARNING_MESSAGE); //�p�G�S��ܿﶵ�|���Xĵ�i�T��
				}
				
				if(!s.matches("[0.0-9.0]+"))
				{
					JOptionPane.showMessageDialog(null, "�п�J���T�Ʀr", "�ɶ�", JOptionPane.ERROR_MESSAGE); //�p�G�O�D�Ʀr�|���X���~�T���A�òM��2��textField
					textField_6.setText("");
					textField_7.setText("");
				}
				double a=Double.parseDouble(textField_6.getText());
				
				//�~���B�g�B��B�ɡB���B��			
				if(t.equalsIgnoreCase("�~Year") && t2.equalsIgnoreCase("��Month"))
								{										
									double b=a*12;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  //�|�ˤ��J��p�ƲĤ@��
									textField_7.setText(""+time);
								}
				if(t.equalsIgnoreCase("�~Year") && t2.equalsIgnoreCase("�gWeek"))
								{										
									double b=a*52;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue(); 
									textField_7.setText(""+time);
								}
				if(t.equalsIgnoreCase("�~Year") && t2.equalsIgnoreCase("��Day"))
								{										
									double b=a*365;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
								}
				if(t.equalsIgnoreCase("�~Year") && t2.equalsIgnoreCase("��Hour"))
								{										
									double b=a*8766;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
								}
				if(t.equalsIgnoreCase("�~Year") && t2.equalsIgnoreCase("��Minute"))
								{										
									double b=a*525960;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
								}
				if(t.equalsIgnoreCase("�~Year") && t2.equalsIgnoreCase("��Second"))
								{										
									double b=a*31557600;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
								}
				
				//����~�B�g�B��B�ɡB���B��	
				if(t.equalsIgnoreCase("��Month") && t2.equalsIgnoreCase("�~Year"))
				{										
									double b=a*0.08;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("��Month") && t2.equalsIgnoreCase("�gWeek"))
				{										
									double b=a*4;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue(); 
									textField_7.setText(""+time);
				}	
				if(t.equalsIgnoreCase("��Month") && t2.equalsIgnoreCase("��Day"))
				{										
									double b=a*30;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("��Month") && t2.equalsIgnoreCase("��Hour"))
				{										
									double b=a*720;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("��Month") && t2.equalsIgnoreCase("�� Minute"))
				{										
									double b=a*43830;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("��Month") && t2.equalsIgnoreCase("��Second"))
				{										
									double b=a*2629800;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				
				
				//�g��~�B�g�B��B�ɡB���B��	
				if(t.equalsIgnoreCase("�gWeek") && t2.equalsIgnoreCase("�~Year"))
				{										
									double b=a*0.02;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("�gWeek") && t2.equalsIgnoreCase("��Month"))
				{										
									double b=a*0.25;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}	
				if(t.equalsIgnoreCase("�gWeek") && t2.equalsIgnoreCase("��Day"))
				{										
									double b=a*7;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("�gWeek") && t2.equalsIgnoreCase("��Hour"))
				{										
									double b=a*168;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("�gWeek") && t2.equalsIgnoreCase("��Minute"))
				{										
									double b=a*10080;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("�gWeek") && t2.equalsIgnoreCase("��Second"))
				{										
									double b=a*604800;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				
				//����~�B��B�g�B�ɡB���B��	
				if(t.equalsIgnoreCase("��Day") && t2.equalsIgnoreCase("�~Year"))
				{										
									double b=a*0.003;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("��Day") && t2.equalsIgnoreCase("��Month"))
				{										
									double b=a*0.033;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}	
				if(t.equalsIgnoreCase("��Day") && t2.equalsIgnoreCase("�gWeek"))
				{										
									double b=a*0.143;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("��Day") && t2.equalsIgnoreCase("��Hour"))
				{										
									double b=a*24;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("��Day") && t2.equalsIgnoreCase("��Minute"))
				{										
									double b=a*1440;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("��Day") && t2.equalsIgnoreCase("��Second"))
				{										
									double b=a*86400;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				
				//����~�B��B�g�B��B���B��	
				if(t.equalsIgnoreCase("��Hour") && t2.equalsIgnoreCase("�~Year"))
				{										
									double b=a*0.0001;					
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("��Hour") && t2.equalsIgnoreCase("��Month"))
				{										
									double b=a*0.033;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}	
				if(t.equalsIgnoreCase("��Hour") && t2.equalsIgnoreCase("�gWeek"))
				{										
									double b=a*0.0014;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("��Hour") && t2.equalsIgnoreCase("��Day"))
				{										
									double b=a*0.0417;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("��Hour") && t2.equalsIgnoreCase("��Minute"))
				{										
									double b=a*60;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("��Hour") && t2.equalsIgnoreCase("��Second"))
				{										
									double b=a*3600;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				
				//����~�B��B�g�B��B�ɡB��
				if(t.equalsIgnoreCase("��Minute") && t2.equalsIgnoreCase("�~Year"))
				{										
									double b=a*0.000002;					
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("��Minute") && t2.equalsIgnoreCase("��Month"))
				{										
									double b=a*0.000023;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}	
				if(t.equalsIgnoreCase("��Minute") && t2.equalsIgnoreCase("�gWeek"))
				{										
									double b=a*0.000099;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("��Minute") && t2.equalsIgnoreCase("��Day"))
				{										
									double b=a*0.000694;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("��Minute") && t2.equalsIgnoreCase("��Hour"))
				{										
									double b=a*0.016667;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("��Minute") && t2.equalsIgnoreCase("��Second"))
				{										
									double b=a*60;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				
				//����~�B��B�g�B��B�ɡB���B	
				if(t.equalsIgnoreCase("��Second") && t2.equalsIgnoreCase("�~Year"))
				{										
									double b=a/31557600;					
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("��Second") && t2.equalsIgnoreCase("��Month"))
				{										
									double b=a/2629800;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}	
				if(t.equalsIgnoreCase("��Second") && t2.equalsIgnoreCase("�gWeek"))
				{										
									double b=a/604800;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("��Second") && t2.equalsIgnoreCase("��Day"))
				{										
									double b=a/86400;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("��Second") && t2.equalsIgnoreCase("��Hour"))
				{										
									double b=a/3600;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("��Second") && t2.equalsIgnoreCase("��Minute"))
				{										
									double b=a/60;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
			}
		});

		
		
		//BMI
		JButton button_3 = new JButton(icon);
		button_3.setBounds(183, 81, 30, 40);
		panel_4.add(button_3);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				
				String s=textField_8.getText();
				String d=textField_9.getText();
								
				if(!s.matches("[0.0-9.0]+") || !d.matches("[0.0-9.0]+"))
				{
					JOptionPane.showMessageDialog(null, "�п�J���T�Ʀr", "BMI", JOptionPane.ERROR_MESSAGE); //�p�G�O�D�Ʀr�|���X���~�T���A�òM��2��textField
					
					textField_8.setText("");
					textField_9.setText("");
					textField_10.setText("");
				}
				
			    
				double cm=Double.parseDouble(textField_8.getText());
				double kg=Double.parseDouble(textField_9.getText());				
				double bmi=kg/(cm/100*cm/100);
				BigDecimal   b   =   new   BigDecimal(bmi);
				double bmi2 =   b.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  //�|�ˤ��J��p�ƲĤ@��
				textField_10.setText(""+bmi2);
				double c=Double.parseDouble(textField_10.getText());
				
												
				if(c<18.5)
				{
					JOptionPane.showMessageDialog(null, "�魫�L�� (BMI<18.5)", "BMI", JOptionPane.INFORMATION_MESSAGE);
				}
				if(c>=18.5 && c<24)
				{
					JOptionPane.showMessageDialog(null, "�魫�з� (18.5��BMI��24)", "BMI", JOptionPane.INFORMATION_MESSAGE);
				}
				if(c>=24)
				{
					JOptionPane.showMessageDialog(null, "�魫�L�� (BMI��24)", "BMI", JOptionPane.INFORMATION_MESSAGE);
				}
				
				
			}
		});
		
		
		
	}
}
