package lesson8;

import lesson8.components.NumberJButton;
import lesson8.components.OperatorJButton;
import lesson8.components.OperatorJButton2;
import lesson8.listeners.ButtonListener;
import lesson8.listeners.ClearButtonActionListener;
import lesson8.listeners.ExitButtonListener;
import lesson8.listeners.TestButtonListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplicationForm extends JFrame {

    private JTextField inputField;

    public ApplicationForm(String title) throws HeadlessException {
        super(title);
        setBounds(200, 300, 250, 370); //ПОМЕНЯТЬ!!!
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
//        testListener();

        setJMenuBar(createMenu());

        setLayout(new BorderLayout());
        add(createTopPanel(), BorderLayout.NORTH);
        add(createCenterPanel(), BorderLayout.CENTER);
       // add(createOperatorsLeftPanel(), BorderLayout.WEST);

        setVisible(true);
    }



    private JMenuBar createMenu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menuFile = new JMenu("File");

        menuBar.add(menuFile);
        menuBar.add(new JMenuItem("Help"));
        menuBar.add(new JMenuItem("About"));

        menuFile.add(new JMenuItem("Clear"));
        menuFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        JMenuItem exitItem = menuFile.add(new JMenuItem("Exit"));
        menuBar.add(exitItem);

/*        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });  */
        exitItem.addActionListener(new ExitButtonListener());


        return menuBar;
    }

    private JPanel createTopPanel() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());

        inputField = new JTextField();
        inputField.setEditable(false);
        top.add(inputField);
        inputField.setFont(new Font("Arial", Font.PLAIN, 15));
        inputField.setMargin(new Insets(8, 10, 8, 10));
        inputField.setBackground(new Color(255, 255, 255));

        inputField.setText("");


        return top;
    }

    private JPanel createCenterPanel() {
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());

        ActionListener buttonListener = new ButtonListener(inputField);

        centerPanel.add(createDigitsPanel(buttonListener), BorderLayout.CENTER);
        centerPanel.add(createOperatorsPanel(buttonListener), BorderLayout.NORTH);
        centerPanel.add(createOperatorsLeftPanel(buttonListener), BorderLayout.WEST);
        return centerPanel;
    }

    private JPanel createDigitsPanel(ActionListener buttonListener) {
        JPanel digitsPanel = new JPanel();

        digitsPanel.setLayout(new GridLayout(4, 3));


        for (int i = 0; i < 10; i++) {
            String buttonTitle = (i == 9) ? "0" : String.valueOf(i + 1);
            JButton btn = new NumberJButton(buttonTitle);
            btn.addActionListener(buttonListener);
            digitsPanel.add(btn);
        }
        JButton clear = new OperatorJButton2("C");
        digitsPanel.add(clear);
        clear.addActionListener(new ClearButtonActionListener(inputField));

        JButton calc = new OperatorJButton("=");
        digitsPanel.add(calc);
        calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ;
            }
        });


       // calc.setEnabled(false);



        return digitsPanel;
    }

    private JPanel createOperatorsPanel(ActionListener buttonListener) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout());

        JButton minus = new OperatorJButton("-");
        minus.addActionListener(buttonListener);
        panel.add(minus);

        JButton plus = new OperatorJButton("+");
        plus.addActionListener(buttonListener);
        panel.add(plus);

        JButton multiply = new OperatorJButton("x");
        multiply.addActionListener(buttonListener);
        panel.add(multiply);

        JButton divide = new OperatorJButton("/");
        divide.addActionListener(buttonListener);
        panel.add(divide);


        return panel;
    }
    private JPanel createOperatorsLeftPanel(ActionListener buttonListener) {
        JPanel leftpanel = new JPanel();
        leftpanel.setLayout(new GridLayout(4, 1));

        JButton brackets1 = new OperatorJButton("(");
        brackets1.addActionListener(buttonListener);
        leftpanel.add(brackets1);

        JButton brackets2 = new OperatorJButton(")");
        brackets2.addActionListener(buttonListener);
        leftpanel.add(brackets2);

        JButton remainder = new OperatorJButton("%");
        remainder.addActionListener(buttonListener);
        leftpanel.add(remainder);

        JButton dot = new OperatorJButton(".");
        dot.addActionListener(buttonListener);
        leftpanel.add(dot);

        return leftpanel;
    }


    private void testListener() {
        Button button = new Button("Кнопка");
        button.addActionListener(new TestButtonListener());
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
//
        super.add(button);
    }
}
