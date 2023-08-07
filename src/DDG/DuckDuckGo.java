package DDG;



import javax.swing.JFrame;

public class DuckDuckGo extends JFrame{

    public DuckDuckGo() {
        add(new Model());
    }


    public static void main(String[] args) {
        DuckDuckGo ddg = new DuckDuckGo();
        ddg.setVisible(true);
        ddg.setTitle("DuckDuckGo-Game");
        ddg.setSize(380,420);
        ddg.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ddg.setLocationRelativeTo(null);

    }

}