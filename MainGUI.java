import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class MainGUI {
    public static JFrame mainFrame = null;

    public static void mainGUI(Player player,Monster monster){
        Risk.riskGUI(player);
        mainFrame = new JFrame("Main");
        Container contentPane = mainFrame.getContentPane();

        JPanel button = new JPanel();
        MainBg mainBg =new MainBg();
        contentPane.add(button,BorderLayout.PAGE_START);
        contentPane.add(mainBg,BorderLayout.CENTER);
        JButton fight = new JButton("fight");
        JButton risk = new JButton("risk");
        JButton save = new JButton("save");
        JButton exit = new JButton("exit");
        JButton info = new JButton("information");

        button.add(fight);
        button.add(risk);
        button.add(info);
        button.add(save);
        button.add(exit);



        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(800,600);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);



        fight.addActionListener(actionEvent -> {

            Fight.fight(player,monster);
            mainFrame.setVisible(false);
        });
        risk.addActionListener(actionEvent -> {


            Risk.riskFrame.setVisible(true);
            mainFrame.setVisible(false);
        });
        save.addActionListener(actionEvent -> {
            try {
                Save.save(player,"D:\\IdeaProjects\\untitled1\\rpg2\\src\\info\\playerInfo.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        info.addActionListener(actionEvent -> {
            InfoGUI.infoGUI(player);
            InfoGUI.infoFrame.setVisible(true);
            mainFrame.setVisible(false);

        });
        exit.addActionListener(actionEvent -> {
            mainFrame.dispose();
            System.exit(0);
        });
    }




}
