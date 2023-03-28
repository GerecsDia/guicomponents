import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class TextFieldExample extends JFrame {
    
    TextFieldExample() {


        super("TextField pelda");
        initComponents();

    }

    private void initComponents() {
        this.setSize(300,200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        JLabel label01 = new JLabel("Szoveg: ");
        label01.setBounds(50, 20, 100, 30);
        this.add(label01);

        JTextField jtf = new JTextField(20);
        jtf.setBounds(110, 20, 100, 30);
        this.add(jtf);

        JButton button = new JButton("Mehet");
        button.setBounds(80, 55, 80, 30);
        this.add(button);

        JLabel label02 = new JLabel();
        label02.setBounds(80, 100, 100, 30);
        this.add(label02);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {

                String text = jtf.getText();
                label02.setText(text);
                jtf.setText("");

            }
            
        });


    }
}
