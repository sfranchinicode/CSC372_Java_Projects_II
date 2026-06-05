/* BankBalanceGUI creates a simple banking interface
that allows the user to deposit money, withdrawal money if 
funds are there, display the account balance and exit
the program
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BankBalanceGUI extends JFrame implements ActionListener{
    
    // Create bank account object
    private BankAccount account;

    // GUI components 
    private JPanel panel;
    private JLabel amountLabel;
    private JTextField amountField;
    
    // Build buttons for required fields
    private JButton depositButton;
    private JButton withdrawalButton;
    private JButton showBalanceButton;
    private JButton exitButton;

    // Constructor
    public BankBalanceGUI() {
        account = new BankAccount();

        // Window settings
        setTitle("Bank Balance Application");
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the panel and layout
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));

        // Create the labels
        amountLabel = new JLabel("Enter Amount to Deposit/Withdrawal: ");

        // Create text field
        amountField = new JTextField();

        // Create buttons
        depositButton = new JButton("Deposit");
        withdrawalButton = new JButton("Withdrawal");
        showBalanceButton = new JButton("Show Balance");
        exitButton = new JButton("Exit");

        // Add ActionListeners
        depositButton.addActionListener(this);
        withdrawalButton.addActionListener(this);  
        showBalanceButton.addActionListener(this);
        exitButton.addActionListener(this);

        // Create and add panel components
        panel.add(amountLabel);
        panel.add(amountField);
        panel.add(depositButton);
        panel.add(withdrawalButton);
        panel.add(showBalanceButton);
        panel.add(exitButton);

        // Add the panel to the frame
        add(panel);

        // Make visible
        setVisible(true);
    }

    // Handle the button clicks
    @Override 
    public void actionPerformed(ActionEvent e) { 

        // Get amount entered by user
        double amount = 0;
        
        // Catch errors
        try {
            amount = Double.parseDouble(amountField.getText());
        } catch ( NumberFormatException ex) {
            // Show error if not clicking Show Balance or Exit
            if(e.getSource() != showBalanceButton && e.getSource() != exitButton) {
                JOptionPane.showMessageDialog(this, "Please enter a valid number.");
                return;
            }
        }
        
        if (amount <= 0) {
            JOptionPane.showMessageDialog(this, "Please enter a positive amount.");
            return;
        }
         
        // Deposit Button with a confirmation message
        if(e.getSource() == depositButton) {
            account.deposit(amount);
            JOptionPane.showMessageDialog(this, String.format ("Deposit of $%.2f successful.", amount));
        }

        // Withdrawal Button with a confirmation message
        if(e.getSource() == withdrawalButton) {
            // Handle overdraft from BankAccount class
            if(amount > account.getBalance()) {
                JOptionPane.showMessageDialog(this, "Insufficient Funds.");
            } else { 
                account. withdrawal(amount);
                JOptionPane.showMessageDialog(this, String.format("Withdrawal of $%.2f was successful.", amount));
            }
        }

        // Show Balance Button
        if(e.getSource() == showBalanceButton) {
            JOptionPane.showMessageDialog(this, String.format("Your current balance is $%.2f", account.getBalance()));
        }

        // Exit Button
        if(e.getSource() == exitButton) {
            JOptionPane.showMessageDialog(this, String.format("Final Balance: $%.2f", account.getBalance()));
            System.exit(0);
        }

        // Reset text field 
        amountField.setText("");
    }

    // Main method to run GUI
    public static void main(String[] args) {
        new BankBalanceGUI();
    }
}
