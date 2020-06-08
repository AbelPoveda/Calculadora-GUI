import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JTextField resultado;
    private JButton boton4;
    private JPanel Panel;
    private JButton boton0;
    private JButton mas;
    private JButton boton8;
    private JButton boton7;
    private JButton boton2;
    private JButton boton1;
    private JButton boton5;
    private JButton multiplicar;
    private JButton result;
    private JButton boton3;
    private JButton boton6;
    private JButton boton9;
    private JButton menos;
    private JButton dividir;
    private JButton clear;
    int numero1=0;
    int numero2=0;
    int operacion;

    public Calculadora() {

        boton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(resultado.getText()+"0");
            }
        });
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(resultado.getText()+"1");
            }
        });
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(resultado.getText()+"2");
            }
        });
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(resultado.getText()+"3");
            }
        });
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(resultado.getText()+"4");
            }
        });
        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(resultado.getText()+"5");
            }
        });
        boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(resultado.getText()+"6");
            }
        });
        boton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(resultado.getText()+"7");
            }
        });
        boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(resultado.getText()+"8");
            }
        });
        boton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(resultado.getText()+"9");
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText("");
            }
        });
        mas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Integer.parseInt(resultado.getText());
                resultado.setText("");
                operacion=1;
            }
        });
        menos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Integer.parseInt(resultado.getText());
                resultado.setText("");
                operacion=2;
            }
        });
        multiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Integer.parseInt(resultado.getText());
                resultado.setText("");
                operacion=3;
            }
        });
        dividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Integer.parseInt(resultado.getText());
                resultado.setText("");
                operacion=4;
            }
        });

        result.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero2=Integer.parseInt(resultado.getText());
                if (operacion==1) resultado.setText(String.valueOf(numero1+numero2));
                else if (operacion==2) resultado.setText(String.valueOf(numero1-numero2));
                else if (operacion==3) resultado.setText(String.valueOf(numero1*numero2));
                else if (operacion==4) resultado.setText(String.valueOf(numero1/numero2));
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
