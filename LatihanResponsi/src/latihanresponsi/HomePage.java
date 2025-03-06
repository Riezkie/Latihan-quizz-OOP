package latihanresponsi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame implements ActionListener {
    private JButton childBtn, teenBtn, adultBtn;

    public HomePage(String username) {
        setTitle("Home");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 1, 5, 5));

        add(new JLabel("Welcome, " + username, SwingConstants.CENTER));

        childBtn = new JButton("Child Magazine (Rp.10.800)");
        teenBtn = new JButton("Teen Magazine (Rp.15.200)");
        adultBtn = new JButton("Adult Magazine (Rp.24.400)");

        childBtn.addActionListener(this);
        teenBtn.addActionListener(this);
        adultBtn.addActionListener(this);

        add(childBtn);
        add(teenBtn);
        add(adultBtn);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == childBtn) {
            new BuyPage("Child", 10800);
        } else if (e.getSource() == teenBtn) {
            new BuyPage("Teen", 15200);
        } else if (e.getSource() == adultBtn) {
            new BuyPage("Adult", 24400);
        }
        dispose();
    }
}
