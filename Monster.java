import javax.swing.*;

public class Monster extends  Character {
    private int awardExp;

    private Monster(){


    }
    private static Monster instance;
    public static Monster getInstance(){
        if(instance==null){
            instance=new Monster();

        }
        return instance;
    }

    private ImageIcon monster = new ImageIcon("/images/monster.gif");

    public void attackPlayer(Player player){
        player.setVolume(player.getVolume()-this.getAttack());
    }
    public int getAwardExp() {
        return awardExp;
    }

    public void setAwardExp(int awardExp) {
        this.awardExp = awardExp;
    }

    public ImageIcon getMonster() {
        return monster;
    }
}
