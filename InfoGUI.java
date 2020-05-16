import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class InfoGUI {
    public static JFrame infoFrame;

    public static void infoGUI(Player player1){
        infoFrame = new JFrame();
        infoFrame.setLayout(new BorderLayout());

        JLabel player = new JLabel();
        URL url = InfoGUI.class.getResource("/images/player.png");
        player.setIcon(new ImageIcon(url));


        JTextArea information = new JTextArea();
        String s = "name: "+player1.getName()+"\n"
                +"volume: "+player1.getVolume()+"/"+player1.getMaxVolume()+"\n"
                +"level: "+player1.getLevel()+"\n"
                +"attack: "+player1.getAttack()+"\n"
                +"exp: "+player1.getExp()+"/"+player1.getMaxExp()+"\n";
        information.append(s);

        JButton backToMain = new JButton("<<back");
        backToMain.addActionListener( (e) -> {
            infoFrame.setVisible(false);
            MainGUI.mainFrame.setVisible(true);

        });

        infoFrame.add(player,BorderLayout.LINE_START);
        infoFrame.add(information,BorderLayout.CENTER);
        infoFrame.add(backToMain,BorderLayout.PAGE_END);

        infoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        infoFrame.setSize(600, 300);
        infoFrame.setLocationRelativeTo(null);
        infoFrame.setVisible(false);
    }
}
