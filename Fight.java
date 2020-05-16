public class Fight {
    public static void fight(Player player,Monster monster){
        monster.setVolume(50+player.getMaxVolume());
        FightGUI.fightGUI(player,monster);

    }
}
