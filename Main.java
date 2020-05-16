import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Player player = Player.getInstance();
        Monster monster = Monster.getInstance();


        Load.loadPlayer(player, "D:\\IdeaProjects\\untitled1\\rpg2\\src\\info\\playerInfo.txt");
        Load.loadMonster(monster, "D:\\IdeaProjects\\untitled1\\rpg2\\src\\info\\monsterInfo.txt");


        player.getMyBag().addEquipment(new Equipment("test", "test_description", 100, 50, 1));
        player.getMyBag().addExpItem(new ExpItem("test", "test_description", 10));
        player.getMyBag().addFood(new Food("test", "test_description", 10));


        run(player, monster);

    }

    public static void run(Player player, Monster monster) throws IOException {
        MainGUI.mainGUI(player, monster);
    }



}