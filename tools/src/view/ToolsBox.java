package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ToolsBox extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ToolsBox frame = new ToolsBox();
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
	public ToolsBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setText("\u8BF7\u8F93\u5165\u4F7F\u7528\u5BC6\u7801\uFF1A");
		textField.setBounds(10, 109, 119, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(139, 109, 134, 21);
		contentPane.add(passwordField);
		
		JButton dr = new JButton("\u786E\u5B9A");
		dr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				LoginAvt(ae);
				String password = JPasswordField.getText().toString();
				if(!JPasswordField.getText().isEmpty())
				{
					if(JPasswordField.getText()="test")
					{
						System.out.print("登入成功！");
						new MainMenu().setVisible(true); //打开新界面MainMenu
						this.setVisible(false);//关闭本界面
					}else{
						//登录失败
						JOptionPane.showMessageDialog(null, "密码错误，请重新输入!", "提示", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		dr.setBounds(161, 156, 93, 23);
		contentPane.add(dr);
	}
}
