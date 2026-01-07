import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {

    public Dashboard(String username) {
        setTitle("Dashboard");
        setSize(300,150);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        JLabel welcomeLabel = new JLabel("Welcome, " + username + "!");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(welcomeLabel);

        JButton logoutBtn = new JButton("Logout");
        add(logoutBtn);

        logoutBtn.addActionListener(e -> {
            new LoginFrame();
            dispose();
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
