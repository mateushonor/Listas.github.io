
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class LoginFrame extends JFrame implements ActionListener {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container container = getContentPane();
    JLabel usuarioLabel = new JLabel("USUARIO");
    JLabel senhaLabel = new JLabel("SENHA");
    JTextField usuarioTextField = new JTextField();
    JPasswordField senhaField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showSenha = new JCheckBox("Show Password");
 
 
    LoginFrame() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
 
    }
 
    public void setLayoutManager() {
        container.setLayout(null);
    }
 
    public void setLocationAndSize() {
        usuarioLabel.setBounds(50, 150, 100, 30);
        senhaLabel.setBounds(50, 220, 100, 30);
        usuarioTextField.setBounds(150, 150, 150, 30);
        senhaField.setBounds(150, 220, 150, 30);
        showSenha.setBounds(150, 250, 150, 30);
        loginButton.setBounds(50, 300, 100, 30);
        resetButton.setBounds(200, 300, 100, 30);
 
 
    }
 
    public void addComponentsToContainer() {
        container.add(usuarioLabel);
        container.add(senhaLabel);
        container.add(usuarioTextField);
        container.add(senhaField);
        container.add(showSenha);
        container.add(loginButton);
        container.add(resetButton);
    }
 
    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showSenha.addActionListener(this);
    }
 
 
    @SuppressWarnings("deprecation")
	@Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == loginButton) {
            String userText;
            String pwdText;
            userText = usuarioTextField.getText();
            pwdText = senhaField.getText();
            if (userText.equalsIgnoreCase("trainee") && pwdText.equalsIgnoreCase("12345")) {
                JOptionPane.showMessageDialog(this, "Login Successo");
            } else {
                JOptionPane.showMessageDialog(this, "Invalido Usuario ou senha");
            }
 
        }
        
        if (e.getSource() == resetButton) {
            usuarioTextField.setText("");
            senhaField.setText("");
        }
       
        if (e.getSource() == showSenha) {
            if (showSenha.isSelected()) {
                senhaField.setEchoChar((char) 0);
            } else {
                senhaField.setEchoChar('*');
            }
 
 
        }
    }
 
}
