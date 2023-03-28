import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;


public class MenuExample extends JFrame {

    MenuExample() {


        super("Menu pelda");
        initComponents();

    }

    private void initComponents() {
        this.setSize(300,200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("Fajl");
        JMenuItem create = new JMenuItem("Uj");
        JMenuItem open = new JMenuItem("Megnyitas");
        JMenuItem save = new JMenuItem("Mentes");
        file.add(create);
        file.add(open);
        file.add(save);



        JMenu edit = new JMenu("Szerkesztes");
        JMenu window = new JMenu("Nezet");

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(window);

        this.setJMenuBar(menuBar);
    
}
}
