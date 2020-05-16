import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Load {




    public static Player loadPlayer(Player player,String filename) throws IOException {
        BufferedReader bw = new BufferedReader(new FileReader(filename));
        String s = bw.readLine();
        bw.close();
        StringTokenizer tokenizer = new StringTokenizer(s,"_");
        player.setName(tokenizer.nextToken());
        player.setVolume(Integer.parseInt(tokenizer.nextToken()));
        player.setLevel(Integer.parseInt(tokenizer.nextToken()));
        player.setAttack(Integer.parseInt(tokenizer.nextToken()));
        player.setExp(Integer.parseInt(tokenizer.nextToken()));
        player.setMaxVolume(Integer.parseInt(tokenizer.nextToken()));
        player.setMaxExp(Integer.parseInt(tokenizer.nextToken()));

        return player;
    }
    public static Monster loadMonster(Monster monster,String filename) throws IOException{
        BufferedReader bw = new BufferedReader(new FileReader(filename));
        String s = bw.readLine();
        bw.close();
        StringTokenizer tokenizer = new StringTokenizer(s,"_");
        monster.setName(tokenizer.nextToken());
        monster.setVolume(Integer.parseInt(tokenizer.nextToken()));
        monster.setMana(Integer.parseInt(tokenizer.nextToken()));
        monster.setLevel(Integer.parseInt(tokenizer.nextToken()));
        monster.setAttack(Integer.parseInt(tokenizer.nextToken()));
        monster.setAwardExp(Integer.parseInt(tokenizer.nextToken()));
        return monster;
    }
    public static Food loadFood(Food food, String filename) throws IOException {
        BufferedReader bw = new BufferedReader(new FileReader(filename));
        String s = bw.readLine();
        bw.close();
        StringTokenizer tokenizer = new StringTokenizer(s,"_");
        food.setName(tokenizer.nextToken());
        food.setDescription(tokenizer.nextToken());
        food.setVolumeUp(Integer.parseInt(tokenizer.nextToken()));
        return food;
    }
}
