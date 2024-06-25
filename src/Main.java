import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculadora");
        frame.setContentPane(new Form1().menuCalculadora);
        frame.pack();
        frame.setVisible(true);
    }
}