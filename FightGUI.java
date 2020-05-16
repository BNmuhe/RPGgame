import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.*;

import af.swing.layout.AfAnyWhere;
import af.swing.layout.AfMargin;

public class FightGUI {
    public static final int  x_f = 100;
    public static final int  y_f = 350;
    public static int x = x_f;
    public static int y = y_f;




    public static void fightGUI(Player player,Monster monster){
        JFrame frame = new JFrame("Fighting Demo");


        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());

        BgPanel p1 = new BgPanel();
        JPanel p2 = new JPanel();
        contentPane.add(p1,BorderLayout.CENTER);
        contentPane.add(p2,BorderLayout.LINE_END);
        p2.setPreferredSize(new Dimension(170, 0));

        //怪物
        p1.setLayout(new AfAnyWhere());
        JLabel monsL = new JLabel();
        JLabel playL = new JLabel();
        try {
            setImage("/images/monster.gif",monsL);
            setImage("/images/player.png",playL);
        } catch (Exception e) {}
        p1.add(monsL,new AfMargin(250,650,-1,-1));
        p1.add(playL,new AfMargin(x,y,-1,-1));
        playL.setLocation(x_f,y_f);



        //命令
        final JButton[] attack = {new JButton("attack")};
        JButton escape = new JButton("escape");
        JButton food = new JButton("food");
        p2.add(attack[0]);
        p2.add(escape);
        p2.add(food);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 670);
        frame.setVisible(true);

        attack[0].addActionListener((e)-> {

                x=x_f;
                y=y_f;
                for(int i =1;i<=100;i++) {
                    x = x + 5;
                    y = y - 1;
                    playL.setLocation(x,y);
                    try {
                        Thread.sleep(15);
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                }
                JOptionPane.showMessageDialog(frame,"you have dealt "+player.getAttack()+" damage to the monster\nand you took "+monster.getAttack()+" damage from the monster");
                player.attackMonster(monster);
                monster.attackPlayer(player);
                playL.setLocation(x_f,y_f);
                if(monster.getVolume()<=0){
                    JOptionPane.showMessageDialog(frame,"you have won the monster");
                    MainGUI.mainFrame.setVisible(true);
                    frame.dispose();
                    player.setVolume(player.getMaxVolume());
                    player.setExp(player.getExp() + monster.getAwardExp());
                    player.checkIfLevelUp();
                }

        });

        escape.addActionListener( (e) -> {
            MainGUI.mainFrame.setVisible(true);
            frame.dispose();
            player.setVolume(player.getMaxVolume());
        });

        food.addActionListener( (e) -> {
            player.getMyBag().showFood();

            player.eatFood(player.getMyBag().vecF.get(0));
            JOptionPane.showMessageDialog(frame,"You have eaten food!");
        });

    }
    private static void setImage(String path, JLabel label) throws Exception{
        URL url = FightGUI.class.getResource(path);
        Icon icon = new ImageIcon(url);
        label.setIcon(icon);
    }
}
