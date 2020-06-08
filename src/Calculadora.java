import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JTextField Texto;
    private JButton Boton;
    private JPanel Panel;

    public Calculadora() {
        Boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hola mundo");
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculadora().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
