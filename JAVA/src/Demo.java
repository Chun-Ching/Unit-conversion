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
		setTitle("單位轉換");
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
		comboBoxn.addItem("請選擇");
		comboBoxn.addItem("新台幣 TWD");
		comboBoxn.addItem("美元 USD");
		comboBoxn.addItem("日圓 JPY");
		comboBoxn.addItem("歐元 EUR");
		comboBoxn.addItem("英鎊 GBP");
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(31, 151, 96, 21);
		panel.add(comboBox_1);
		comboBox_1.addItem("請選擇");
		comboBox_1.addItem("新台幣 TWD");
		comboBox_1.addItem("美元 USD");
		comboBox_1.addItem("日圓 JPY");
		comboBox_1.addItem("歐元 EUR");
		comboBox_1.addItem("英鎊 GBP");
		
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
		comboBox_2.addItem("請選擇");
		comboBox_2.addItem("攝氏 C");
		comboBox_2.addItem("華氏 F");
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(35, 154, 96, 21);
		panel_1.add(comboBox_3);
		comboBox_3.addItem("請選擇");
		comboBox_3.addItem("攝氏 C");
		comboBox_3.addItem("華氏 F");
		
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
		comboBox_4.addItem("請選擇");
		comboBox_4.addItem("公里 km");
		comboBox_4.addItem("英里 mi");
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(46, 154, 96, 21);
		panel_2.add(comboBox_5);
		comboBox_5.addItem("請選擇");
		comboBox_5.addItem("公里 km");
		comboBox_5.addItem("英里 mi");
		
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
		comboBox_6.addItem("請選擇");
		comboBox_6.addItem("年Year");
		comboBox_6.addItem("月Month");
		comboBox_6.addItem("週Week");
		comboBox_6.addItem("日Day");
		comboBox_6.addItem("時Hour");
		comboBox_6.addItem("分Minute");
		comboBox_6.addItem("秒Second");
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBounds(30, 157, 96, 21);
		panel_3.add(comboBox_7);
		comboBox_7.addItem("請選擇");
		comboBox_7.addItem("年Year");
		comboBox_7.addItem("月Month");
		comboBox_7.addItem("週Week");
		comboBox_7.addItem("日Day");
		comboBox_7.addItem("時Hour");
		comboBox_7.addItem("分Minute");
		comboBox_7.addItem("秒Second");
		
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
		lblCm.setFont(new Font("標楷體", Font.PLAIN, 16));
		
		textField_8 = new JTextField();
		textField_8.setBounds(80, 36, 96, 21);
		panel_4.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblkg = new JLabel("\u9AD4\u91CDkg:");
		lblkg.setBounds(203, 38, 76, 15);
		panel_4.add(lblkg);
		lblkg.setFont(new Font("標楷體", Font.PLAIN, 16));
		
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
		
		
		//匯率轉換		
		ImageIcon icon=new ImageIcon(getClass().getResource("/change.png"));
		JButton btnNewButton = new JButton(icon);
		
		btnNewButton.setBounds(66, 102, 30, 40);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent arg0) {											
				String m =comboBoxn.getSelectedItem().toString();
				String m2 =comboBox_1.getSelectedItem().toString();																
				String s=textField.getText();
				
				if(m.equalsIgnoreCase("請選擇") || m2.equalsIgnoreCase("請選擇"))				
				{
					JOptionPane.showMessageDialog(null, "請選擇選項", "匯率", JOptionPane.WARNING_MESSAGE); //如果沒選擇選項會跳出警告訊息
				}
				
				if(!s.matches("[0.0-9.0]+"))
				{					
					JOptionPane.showMessageDialog(null, "請輸入正確數字", "匯率", JOptionPane.ERROR_MESSAGE); //如果是非數字會跳出錯誤訊息，並清空2個textField
					textField.setText("");
					textField_2.setText("");
				}				
				
				  double a=Double.parseDouble(textField.getText());
				
				
					//新台幣換他國貨幣				
					if(m.equalsIgnoreCase("新台幣 TWD") && m2.equalsIgnoreCase("美元 USD"))
					{																																																	
						double b=a*0.032;					
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  //四捨五入到小數第一位
						textField_2.setText(""+money);
						
					}
					if(m.equalsIgnoreCase("新台幣 TWD") && m2.equalsIgnoreCase("日圓 JPY"))
					{										
						double b=a*3.6;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					if(m.equalsIgnoreCase("新台幣 TWD") && m2.equalsIgnoreCase("歐元 EUR"))
					{										
						double b=a*0.0286;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					if(m.equalsIgnoreCase("新台幣 TWD") && m2.equalsIgnoreCase("英鎊 GBP"))
					{										
						double b=a*0.025;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					
					
					//美元換他國貨幣
					if(m.equalsIgnoreCase("美元 USD") && m2.equalsIgnoreCase("新台幣 TWD"))
					{
						double b=a*30;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					if(m.equalsIgnoreCase("美元 USD") && m2.equalsIgnoreCase("日圓 JPY"))
					{
						double b=a*113;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					if(m.equalsIgnoreCase("美元 USD") && m2.equalsIgnoreCase("歐元 EUR"))
					{
						double b=a*0.88;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					if(m.equalsIgnoreCase("美元 USD") && m2.equalsIgnoreCase("英鎊 GBP"))
					{
						double b=a*0.79;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					
					
					//日圓換他國貨幣
					if(m.equalsIgnoreCase("日圓 JPY") && m2.equalsIgnoreCase("新台幣 TWD"))
					{
						double b=a*0.27;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  //四捨五入到小數第一位
						textField_2.setText(""+money);
					}
					if(m.equalsIgnoreCase("日圓 JPY") && m2.equalsIgnoreCase("美元 USD"))
					{
						double b=a*0.0088;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					if(m.equalsIgnoreCase("日圓 JPY") && m2.equalsIgnoreCase("歐元 EUR"))
					{
						double b=a*0.0078;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					if(m.equalsIgnoreCase("日圓 JPY") && m2.equalsIgnoreCase("英鎊 GBP"))
					{
						double b=a*0.007;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					
					
					//歐元換他國貨幣
					if(m.equalsIgnoreCase("歐元 EUR") && m2.equalsIgnoreCase("新台幣 TWD"))
					{
						double b=a*35;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  //四捨五入到小數第一位
						textField_2.setText(""+money);
					}
					if(m.equalsIgnoreCase("歐元 EUR") && m2.equalsIgnoreCase("美元 USD"))
					{
						double b=a*1.13;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					if(m.equalsIgnoreCase("歐元 EUR") && m2.equalsIgnoreCase("日圓 JPY"))
					{
						double b=a*128;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					if(m.equalsIgnoreCase("歐元 EUR") && m2.equalsIgnoreCase("英鎊 GBP"))
					{
						double b=a*0.9;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					
					
					//英鎊換他國貨幣
					if(m.equalsIgnoreCase("英鎊 GBP") && m2.equalsIgnoreCase("新台幣 TWD"))
					{
						double b=a*38;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  //四捨五入到小數第一位
						textField_2.setText(""+money);
					}
					if(m.equalsIgnoreCase("英鎊 GBP") && m2.equalsIgnoreCase("美元 USD"))
					{
						double b=a*1.2;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					if(m.equalsIgnoreCase("英鎊 GBP") && m2.equalsIgnoreCase("日圓 JPY"))
					{
						double b=a*143;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}
					if(m.equalsIgnoreCase("英鎊 GBP") && m2.equalsIgnoreCase("歐元 EUR"))
					{
						double b=a*1.11;
						BigDecimal   c   =   new   BigDecimal(b);
						double money =   c.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
						textField_2.setText(""+money);
					}																																							
			}
		}
				
			);	
	
		
		
		//溫度轉換		

		JButton  button = new JButton(icon);
		button.setBounds(68, 104, 30, 40);
		panel_1.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String c =comboBox_2.getSelectedItem().toString();
				String f =comboBox_3.getSelectedItem().toString();
				String s=textField_1.getText();
				
				if(c.equalsIgnoreCase("請選擇") || f.equalsIgnoreCase("請選擇"))				
				{
					JOptionPane.showMessageDialog(null, "請選擇選項", "溫度", JOptionPane.WARNING_MESSAGE);  //如果沒選擇選項會跳出警告訊息
				}
				
				if(!s.matches("[0.0-9.0]+"))
				{
					JOptionPane.showMessageDialog(null, "請輸入正確數字", "溫度", JOptionPane.ERROR_MESSAGE); //如果是非數字會跳出錯誤訊息，並清空2個textField
					textField_1.setText("");
					textField_3.setText("");
				}
				
				double a=Double.parseDouble(textField_1.getText());
				
			
				//攝氏轉華氏								
				if(c.equalsIgnoreCase("攝氏 C") && f.equalsIgnoreCase("華氏 F"))
				{										
					double b=a*9/5.0+32;
					BigDecimal   d   =   new   BigDecimal(b);
					double temp =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  //四捨五入到小數第一位
					textField_3.setText(""+temp);
				}
				
				//華氏轉攝氏
				if(c.equalsIgnoreCase("華氏 F") && f.equalsIgnoreCase("攝氏 C"))
				{										
					double b=(a-32)*5/9.0;
					BigDecimal   d   =   new   BigDecimal(b);
					double temp =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
					textField_3.setText(""+temp);
				}
			
			}});
		
		
										
		//速度轉換
		JButton button_1 = new JButton(icon);
		button_1.setBounds(82, 104, 30, 40);
		panel_2.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String k =comboBox_4.getSelectedItem().toString();
				String m =comboBox_5.getSelectedItem().toString();
				String s=textField_4.getText();
				
				if(k.equalsIgnoreCase("請選擇") || m.equalsIgnoreCase("請選擇"))				
				{
					JOptionPane.showMessageDialog(null, "請選擇選項", "速度", JOptionPane.WARNING_MESSAGE); //如果沒選擇選項會跳出警告訊息
				}
				
				if(!s.matches("[0.0-9.0]+"))
				{
					JOptionPane.showMessageDialog(null, "請輸入正確數字", "速度", JOptionPane.ERROR_MESSAGE); //如果是非數字會跳出錯誤訊息，並清空2個textField
					textField_4.setText("");
					textField_5.setText("");
				}
				double a=Double.parseDouble(textField_4.getText());
				
				//公里轉英里
				if(k.equalsIgnoreCase("公里 km") && m.equalsIgnoreCase("英里 mi"))
								{										
									double b=a/1.6;
									BigDecimal   d   =   new   BigDecimal(b);
									double speed =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  //四捨五入到小數第一位
									textField_5.setText(""+speed);
								}
				
				//英里轉公里
				if(k.equalsIgnoreCase("英里 mi") && m.equalsIgnoreCase("公里 km"))
								{										
									double b=a*1.6;
									BigDecimal   d   =   new   BigDecimal(b);
									double speed =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_5.setText(""+speed);
								}

			}
		});

				
		    
		
		//時間轉換
		JButton button_2 = new JButton(icon);
		button_2.setBounds(60, 107, 30, 40);
		panel_3.add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t =comboBox_6.getSelectedItem().toString();
				String t2 =comboBox_7.getSelectedItem().toString();
				String s=textField_6.getText();
				
				if(t.equalsIgnoreCase("請選擇") || t2.equalsIgnoreCase("請選擇"))				
				{
					JOptionPane.showMessageDialog(null, "請選擇選項", "時間", JOptionPane.WARNING_MESSAGE); //如果沒選擇選項會跳出警告訊息
				}
				
				if(!s.matches("[0.0-9.0]+"))
				{
					JOptionPane.showMessageDialog(null, "請輸入正確數字", "時間", JOptionPane.ERROR_MESSAGE); //如果是非數字會跳出錯誤訊息，並清空2個textField
					textField_6.setText("");
					textField_7.setText("");
				}
				double a=Double.parseDouble(textField_6.getText());
				
				//年轉月、週、日、時、分、秒			
				if(t.equalsIgnoreCase("年Year") && t2.equalsIgnoreCase("月Month"))
								{										
									double b=a*12;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  //四捨五入到小數第一位
									textField_7.setText(""+time);
								}
				if(t.equalsIgnoreCase("年Year") && t2.equalsIgnoreCase("週Week"))
								{										
									double b=a*52;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue(); 
									textField_7.setText(""+time);
								}
				if(t.equalsIgnoreCase("年Year") && t2.equalsIgnoreCase("日Day"))
								{										
									double b=a*365;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
								}
				if(t.equalsIgnoreCase("年Year") && t2.equalsIgnoreCase("時Hour"))
								{										
									double b=a*8766;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
								}
				if(t.equalsIgnoreCase("年Year") && t2.equalsIgnoreCase("分Minute"))
								{										
									double b=a*525960;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
								}
				if(t.equalsIgnoreCase("年Year") && t2.equalsIgnoreCase("秒Second"))
								{										
									double b=a*31557600;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
								}
				
				//月轉年、週、日、時、分、秒	
				if(t.equalsIgnoreCase("月Month") && t2.equalsIgnoreCase("年Year"))
				{										
									double b=a*0.08;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("月Month") && t2.equalsIgnoreCase("週Week"))
				{										
									double b=a*4;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue(); 
									textField_7.setText(""+time);
				}	
				if(t.equalsIgnoreCase("月Month") && t2.equalsIgnoreCase("日Day"))
				{										
									double b=a*30;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("月Month") && t2.equalsIgnoreCase("時Hour"))
				{										
									double b=a*720;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("月Month") && t2.equalsIgnoreCase("分 Minute"))
				{										
									double b=a*43830;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("月Month") && t2.equalsIgnoreCase("秒Second"))
				{										
									double b=a*2629800;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				
				
				//週轉年、週、日、時、分、秒	
				if(t.equalsIgnoreCase("週Week") && t2.equalsIgnoreCase("年Year"))
				{										
									double b=a*0.02;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("週Week") && t2.equalsIgnoreCase("月Month"))
				{										
									double b=a*0.25;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}	
				if(t.equalsIgnoreCase("週Week") && t2.equalsIgnoreCase("日Day"))
				{										
									double b=a*7;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("週Week") && t2.equalsIgnoreCase("時Hour"))
				{										
									double b=a*168;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("週Week") && t2.equalsIgnoreCase("分Minute"))
				{										
									double b=a*10080;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("週Week") && t2.equalsIgnoreCase("秒Second"))
				{										
									double b=a*604800;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				
				//日轉年、月、週、時、分、秒	
				if(t.equalsIgnoreCase("日Day") && t2.equalsIgnoreCase("年Year"))
				{										
									double b=a*0.003;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("日Day") && t2.equalsIgnoreCase("月Month"))
				{										
									double b=a*0.033;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}	
				if(t.equalsIgnoreCase("日Day") && t2.equalsIgnoreCase("週Week"))
				{										
									double b=a*0.143;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("日Day") && t2.equalsIgnoreCase("時Hour"))
				{										
									double b=a*24;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("日Day") && t2.equalsIgnoreCase("分Minute"))
				{										
									double b=a*1440;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("日Day") && t2.equalsIgnoreCase("秒Second"))
				{										
									double b=a*86400;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				
				//時轉年、月、週、日、分、秒	
				if(t.equalsIgnoreCase("時Hour") && t2.equalsIgnoreCase("年Year"))
				{										
									double b=a*0.0001;					
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("時Hour") && t2.equalsIgnoreCase("月Month"))
				{										
									double b=a*0.033;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}	
				if(t.equalsIgnoreCase("時Hour") && t2.equalsIgnoreCase("週Week"))
				{										
									double b=a*0.0014;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("時Hour") && t2.equalsIgnoreCase("日Day"))
				{										
									double b=a*0.0417;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("時Hour") && t2.equalsIgnoreCase("分Minute"))
				{										
									double b=a*60;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("時Hour") && t2.equalsIgnoreCase("秒Second"))
				{										
									double b=a*3600;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				
				//分轉年、月、週、日、時、秒
				if(t.equalsIgnoreCase("分Minute") && t2.equalsIgnoreCase("年Year"))
				{										
									double b=a*0.000002;					
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("分Minute") && t2.equalsIgnoreCase("月Month"))
				{										
									double b=a*0.000023;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}	
				if(t.equalsIgnoreCase("分Minute") && t2.equalsIgnoreCase("週Week"))
				{										
									double b=a*0.000099;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("分Minute") && t2.equalsIgnoreCase("日Day"))
				{										
									double b=a*0.000694;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("分Minute") && t2.equalsIgnoreCase("時Hour"))
				{										
									double b=a*0.016667;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("分Minute") && t2.equalsIgnoreCase("秒Second"))
				{										
									double b=a*60;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				
				//秒轉年、月、週、日、時、分、	
				if(t.equalsIgnoreCase("秒Second") && t2.equalsIgnoreCase("年Year"))
				{										
									double b=a/31557600;					
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("秒Second") && t2.equalsIgnoreCase("月Month"))
				{										
									double b=a/2629800;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}	
				if(t.equalsIgnoreCase("秒Second") && t2.equalsIgnoreCase("週Week"))
				{										
									double b=a/604800;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("秒Second") && t2.equalsIgnoreCase("日Day"))
				{										
									double b=a/86400;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("秒Second") && t2.equalsIgnoreCase("時Hour"))
				{										
									double b=a/3600;
									BigDecimal   d   =   new   BigDecimal(b);
									double time =   d.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  
									textField_7.setText(""+time);
				}
				if(t.equalsIgnoreCase("秒Second") && t2.equalsIgnoreCase("分Minute"))
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
					JOptionPane.showMessageDialog(null, "請輸入正確數字", "BMI", JOptionPane.ERROR_MESSAGE); //如果是非數字會跳出錯誤訊息，並清空2個textField
					
					textField_8.setText("");
					textField_9.setText("");
					textField_10.setText("");
				}
				
			    
				double cm=Double.parseDouble(textField_8.getText());
				double kg=Double.parseDouble(textField_9.getText());				
				double bmi=kg/(cm/100*cm/100);
				BigDecimal   b   =   new   BigDecimal(bmi);
				double bmi2 =   b.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();  //四捨五入到小數第一位
				textField_10.setText(""+bmi2);
				double c=Double.parseDouble(textField_10.getText());
				
												
				if(c<18.5)
				{
					JOptionPane.showMessageDialog(null, "體重過輕 (BMI<18.5)", "BMI", JOptionPane.INFORMATION_MESSAGE);
				}
				if(c>=18.5 && c<24)
				{
					JOptionPane.showMessageDialog(null, "體重標準 (18.5≦BMI＜24)", "BMI", JOptionPane.INFORMATION_MESSAGE);
				}
				if(c>=24)
				{
					JOptionPane.showMessageDialog(null, "體重過重 (BMI≧24)", "BMI", JOptionPane.INFORMATION_MESSAGE);
				}
				
				
			}
		});
		
		
		
	}
}
