import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 {
    public JPanel menuCalculadora;
    private JButton btn7;
    private JButton btnDecimal;
    private JButton btn4;
    private JButton btn1;
    private JButton btn8;
    private JButton btn5;
    private JButton btn2;
    private JButton btn0;
    private JButton btn9;
    private JButton btn6;
    private JButton btn3;
    private JButton btnIgual;
    private JButton btnDiv;
    private JButton btnMulti;
    private JButton btnResta;
    private JButton btnSuma;
    private JButton raizCuaButton;
    private JButton btnPotencia;
    private JButton senButton;
    private JButton cosButton;
    private JButton tanButton;
    private JButton borrarButton1;
    private JLabel panelCalculadora;
    private JButton btnBorDigito;

    double numero1;
    double numero2;
    String operacion;
    double resultado;

    public Form1() {
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelCalculadora.setText(panelCalculadora.getText()+"1");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelCalculadora.setText(panelCalculadora.getText()+"2");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelCalculadora.setText(panelCalculadora.getText()+"3");
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelCalculadora.setText(panelCalculadora.getText()+"4");
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelCalculadora.setText(panelCalculadora.getText()+"5");
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelCalculadora.setText(panelCalculadora.getText()+"6");
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelCalculadora.setText(panelCalculadora.getText()+"7");
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelCalculadora.setText(panelCalculadora.getText()+"8");
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelCalculadora.setText(panelCalculadora.getText()+"9");
            }
        });
        btnDecimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!(panelCalculadora.getText().contains("."))){
                    panelCalculadora.setText(panelCalculadora.getText()+".");
                }
            }
        });
        borrarButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelCalculadora.setText("");
            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelCalculadora.setText(panelCalculadora.getText()+"0");
            }
        });

        btnSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(panelCalculadora.getText());
                panelCalculadora.setText("");
                operacion = "+";
            }
        });
        btnMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(panelCalculadora.getText());
                panelCalculadora.setText("");
                operacion = "*";
            }
        });
        btnResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(panelCalculadora.getText());
                panelCalculadora.setText("");
                operacion = "-";
            }
        });
        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(panelCalculadora.getText());
                panelCalculadora.setText("");
                operacion = "/";
            }
        });
        btnBorDigito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoActual = panelCalculadora.getText();
                if (textoActual != null && textoActual.length() > 0) {
                    // Eliminar el último carácter
                    textoActual = textoActual.substring(0, textoActual.length() - 1);
                    panelCalculadora.setText(textoActual);
                }
            }
        });
        btnIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero2 = Double.parseDouble(panelCalculadora.getText());
                switch (operacion){
                    case "+":
                        resultado = numero1 + numero2;
                        panelCalculadora.setText(Double.toString(Math.round(resultado * 100.0)/100.0));
                        break;
                    case "-":
                        resultado = numero1 - numero2;
                        panelCalculadora.setText(Double.toString(Math.round(resultado * 100.0)/100.0));
                        break;
                    case "*":
                        resultado = numero1 * numero2;
                        panelCalculadora.setText(Double.toString(Math.round(resultado * 100.0)/100.0));
                        break;
                    case "/":
                        if (numero2 != 0) {
                            resultado = numero1 / numero2;
                            panelCalculadora.setText(Double.toString(Math.round(resultado * 100.0)/100.0));
                            break;
                        }
                        else {
                            panelCalculadora.setText("Ingrese un divisor distinto de 0");
                            break;
                        }
                    case "^":
                        resultado = Math.pow(numero1,numero2);
                        panelCalculadora.setText(Double.toString(Math.round(resultado * 100.0)/100.0));
                        break;
                }
            }
        });
        raizCuaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(panelCalculadora.getText());
                double raiz = Math.round(Math.sqrt(numero1) * 100.0)/100.0;
                panelCalculadora.setText(Double.toString(raiz));
            }
        });
        btnPotencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(panelCalculadora.getText());
                panelCalculadora.setText("");
                operacion = "^";
            }
        });
        senButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(panelCalculadora.getText());
                numero1 = numero1 * (Math.PI/180);
                double seno = Math.round(Math.sin(numero1) * 100.0)/100.0;
                panelCalculadora.setText(Double.toString(seno));
            }
        });
        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(panelCalculadora.getText());
                numero1 = numero1 * (Math.PI/180);
                double cos = Math.round(Math.cos(numero1) * 100.0)/100.0;
                panelCalculadora.setText(Double.toString(cos));
            }
        });
        tanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(panelCalculadora.getText());
                numero1 = numero1 * (Math.PI/180);
                double tan = Math.round(Math.tan(numero1) * 100.0)/100.0;
                panelCalculadora.setText(Double.toString(tan));
            }
        });
    }
}
