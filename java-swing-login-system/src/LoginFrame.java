
import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class LoginFrame extends JFrame {

    JTextField username;
    JPasswordField password;

    public LoginFrame() {
        setTitle("Login");
        setSize(300, 180);
        setLayout(new GridLayout(3,2,5,5));
        setLocationRelativeTo(null);

        add(new JLabel("Username:"));
        username = new JTextField();
        add(username);

        add(new JLabel("Password:"));
        password = new JPasswordField();
        add(password);

        JButton loginBtn = new JButton("Login");
        add(new JLabel()); // empty label for spacing
        add(loginBtn);

        loginBtn.addActionListener(e -> loginUser());

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    void loginUser() {
        String user = username.getText();
        String pass = new String(password.getPassword());

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM users WHERE username=? AND password=?"
            );
            ps.setString(1, user);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                // credentials valid → open dashboard
                new Dashboard(user);
                dispose(); // close login frame
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Credentials!");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new LoginFrame();
    }
}


