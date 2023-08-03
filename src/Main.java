import javax.swing.*;

public class Main{
    public static void main(String[]args){
        GameComponents window = new GameComponents();
        window.setSize(300,300);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}