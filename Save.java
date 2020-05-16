import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Save {
    public static void save(Player player,String filename) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(filename));
        String s=player.getName()+"_"+player.getVolume()+"_"+player.getLevel()+"_"+player.getAttack()+"_"+player.getExp()+"_"+player.getMaxVolume()+"_"+player.getMaxExp();
        out.write(s);
        out.close();
        JOptionPane.showMessageDialog(new JFrame(),"Saved");

    }
}
