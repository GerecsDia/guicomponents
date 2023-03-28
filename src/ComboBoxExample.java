import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class ComboBoxExample extends JFrame {

    ComboBoxExample() {


        super("ComboBox pelda");
        initComponents();

    }

    private void initComponents() {
        this.setSize(300,200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        String[] comboItems = {"Szinek", "Piros", "Kek", "Zold", "Sarga"};
        JComboBox jcb = new JComboBox(comboItems);
        jcb.setBounds(100, 70, 100, 30);          //be kell pozicionálni
        jcb.setEditable(true);                                //ha ezt belerakjuk, annyi, hogy szerkeszthető lesz az ablak
        this.add(jcb);
        
        JLabel label = new JLabel();
        label.setBounds(50, 100, 100, 30);
        this.add(label);                                             //hozzá kel adnunk a labelt
                                                 
        String actual = jcb.getSelectedItem().toString();           //lekérdezzük az aktuálisan kiválasztott elemet
        label.setText(actual);

        int comboSize = jcb.getItemCount();                     //megszámlálja hány db Item van benne
        System.out.println(comboSize);

}
}
