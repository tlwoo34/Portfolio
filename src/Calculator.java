import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator {
    private JPanel Calculator;
    private JTextField TxtDisplay;
    private JButton button1;
    private JButton button2;
    private JButton ACButton;
    private JButton xButton;
    private JButton button5;
    private JButton button6;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a0Button;
    private JButton button11;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a00Button;
    private JButton button16;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton button20;


    double a, b, result;
    String op;

    public Calculator() {
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TxtDisplay.setText("");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TxtDisplay.setText(TxtDisplay.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TxtDisplay.setText(TxtDisplay.getText() + a8Button.getText());

            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TxtDisplay.setText(TxtDisplay.getText() + a9Button.getText());

            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TxtDisplay.setText(TxtDisplay.getText() + a4Button.getText());

            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TxtDisplay.setText(TxtDisplay.getText() + a5Button.getText());

            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TxtDisplay.setText(TxtDisplay.getText() + a6Button.getText());

            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TxtDisplay.setText(TxtDisplay.getText() + a1Button.getText());

            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TxtDisplay.setText(TxtDisplay.getText() + a2Button.getText());

            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TxtDisplay.setText(TxtDisplay.getText() + a3Button.getText());

            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TxtDisplay.setText(TxtDisplay.getText() + a0Button.getText());

            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TxtDisplay.setText(TxtDisplay.getText() + a00Button.getText());

            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(TxtDisplay.getText().contains(".")){
                    double pm = Double.parseDouble(TxtDisplay.getText());
                    pm = pm*-1;
                    TxtDisplay.setText(String.valueOf(pm));
                } else {
                    long PM = Long.parseLong(TxtDisplay.getText());
                    PM = PM*-1;
                    TxtDisplay.setText(String.valueOf(PM));
                }
            }
        });

        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            a = Double.parseDouble(TxtDisplay.getText());
            op = "+";
            TxtDisplay.setText("");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(TxtDisplay.getText());
                op = "-";
                TxtDisplay.setText("");
            }
        });
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!TxtDisplay.getText().contains(".")){
                    TxtDisplay.setText(TxtDisplay.getText() + button20.getText());
                }
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(TxtDisplay.getText());
                op = "*";
                TxtDisplay.setText("");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(TxtDisplay.getText());
                op = "/";
                TxtDisplay.setText("");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;

                if(TxtDisplay.getText().length() > 0){
                    StringBuilder str8 = new StringBuilder(TxtDisplay.getText());
                    str8.deleteCharAt(TxtDisplay.getText().length() - 1);
                    backspace = String.valueOf(str8);
                    TxtDisplay.setText(backspace);
                }
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(TxtDisplay.getText());

                if(op == "+"){
                    result = a + b;
                    TxtDisplay.setText(String.valueOf(result));
                }else if(op == "-"){
                    result = a-b;
                    TxtDisplay.setText(String.valueOf(result));
                }else if(op == "*"){
                    result = a*b;
                    TxtDisplay.setText(String.valueOf(result));
                }else if(op == "/"){
                    result = a/b;
                    TxtDisplay.setText(String.valueOf(result));
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
