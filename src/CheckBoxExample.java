import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class CheckBoxExample extends JFrame {
    
    CheckBoxExample() {


        super("CheckBox pelda");
        initComponents();

    }

    private void initComponents() {
        this.setSize(300,200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        JCheckBox chb = new JCheckBox("Teszt", true);
        chb.setBounds(100,70, 100, 30);
        this.add(chb);

        chb.addItemListener(new ItemListener() {    //rákötjük a checkboxunkra az ItemListenert
            
            @Override
            public void itemStateChanged(ItemEvent event) {

                if( event.getStateChange() == 1) {                             //itt kell leírnom, hogy mi történjen a checkbox változása esetén

                    chb.setText("Bejelolve");

                }else {

                    chb.setText("Nincs jelolve");
                }


                } 
               

        
        });
        System.out.println(chb.isSelected());
    }

    
    }

