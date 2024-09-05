package Temperature;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverterGUI extends JFrame implements ActionListener {
    private JTextField inputField;
    private JLabel resultLabel;

    public TemperatureConverterGUI() {
        setTitle("Temperature Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Create a JPanel as the content pane and set the background color
        JPanel contentPane = new JPanel();
        contentPane.setBackground(new Color(217, 205, 255)); // Light lavender color
        contentPane.setBorder(new EmptyBorder(20, 20, 20, 20));
        setContentPane(contentPane);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10));
        mainPanel.setBackground(new Color(217, 205, 255)); // Set background color
        contentPane.add(mainPanel); // Add mainPanel to the contentPanel
// Create input panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        inputPanel.setBackground(new Color(217, 205, 255)); // Light lavender color
        inputPanel.setBorder(BorderFactory.createLineBorder(new Color(137, 126, 173))); // Dark lavender color

        JLabel inputLabel = new JLabel("Enter temperature:");
        inputField = new JTextField(10);
        JButton convertButton = new JButton("Convert");
        convertButton.addActionListener(this);

        inputPanel.add(inputLabel);
        inputPanel.add(inputField);
        inputPanel.add(convertButton);

        // Create result panel
        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        resultPanel.setBackground(new Color(217, 205, 255)); // Light lavender color

        resultLabel = new JLabel("");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));
        resultLabel.setForeground(new Color(41, 47, 106)); // Dark purple color

        resultPanel.add(resultLabel);
// Add panels to the main panel
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(resultPanel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Convert")) {
            String input = inputField.getText();

            try {
                double temperature = Double.parseDouble(input);

                // Convert temperature from Celsius to Fahrenheit
                double convertedTemperature = (temperature * 9 / 5) + 32;

                resultLabel.setText("Converted temperature: " + convertedTemperature + " °F");
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input!");
            }
        }
    }
public static void main(String[] args) {
        SwingUtilities.invokeLater(TemperatureConverterGUI::new);
    }
}
