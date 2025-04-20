import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cola_Ej3 {
    private JTextField txtN1;
    private JTextField txtN2;
    private JTextField txtN3;
    private JTextField txtN4;
    private JTextField txtN5;
    private JTextField p1;
    private JTextField p2;
    private JTextField p3;
    private JTextField p4;
    private JTextField p5;
    private JTextArea Resultado;
    private JButton atenderPacientesButton;
    private JPanel rootPanel;

    public Cola cola = new Cola();


    public Cola_Ej3() {

        atenderPacientesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                procesarPacientes();
            }
        });
    }

    private void procesarPacientes() {
        cola = new Cola();

        try {
            cola.insertarConPrioridad(txtN1.getText(), Integer.parseInt(p1.getText()));
            cola.insertarConPrioridad(txtN2.getText(), Integer.parseInt(p2.getText()));
            cola.insertarConPrioridad(txtN3.getText(), Integer.parseInt(p3.getText()));
            cola.insertarConPrioridad(txtN4.getText(), Integer.parseInt(p4.getText()));
            cola.insertarConPrioridad(txtN5.getText(), Integer.parseInt(p5.getText()));

            Resultado.setText(cola.atenderPacientes());
        } catch (NumberFormatException ex) {
            Resultado.setText("Error: Las prioridades deben ser números enteros.");
        }
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Atención Hospital San Mungo");
            Cola_Ej3 ventana = new Cola_Ej3();
            frame.setContentPane(ventana.getRootPanel());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
