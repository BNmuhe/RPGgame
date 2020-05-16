import javax.swing.*;
import java.util.Vector;

public class Player extends Character {
    private Vector<Skill> vecS=new Vector<Skill>();
    private Vector<Equipment> vecE = new Vector<Equipment>();
    private Bag myBag= Bag.getBagInstance();
    private int exp;
    private int defense;
    private int maxExp=10;
    private int maxVolume=100;

    //单例
    private static Player instance;
    private Player(){}
    public static Player getInstance(){
        if(instance==null){
            instance = new Player();
        }
        return instance;
    }



    public void setDefense(int defense) {
        this.defense = defense;
    }
    public void setExp(int exp) {
        this.exp = exp;
    }
    public int getDefense() {
        return defense;
    }
    public int getExp() {
        return exp;
    }
    public int getMaxExp() {
        return maxExp;
    }
    public Bag getMyBag(){
        return myBag;
    }
    public int getMaxVolume() {
        return maxVolume;
    }
    public void setMaxExp(int maxExp) {
        this.maxExp = maxExp;
    }
    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }
    public void eatFood(Food food){
        setVolume(getVolume()+food.getVolumeUp());
    }
    public void useExpItem(ExpItem expItem){
        setExp(getExp()+expItem.getExpUp());
    }
    public void uesEquipment(Equipment equipment){
        setAttack(getAttack()+equipment.getAttack());
        setDefense(getDefense()+equipment.getDefense());
    }

    //检测是否升级
    public void checkIfLevelUp(){
        if(getExp()>=getMaxExp()){
            setLevel(getLevel()+1);
            setExp(getExp()-getMaxExp());
            setMaxVolume(getMaxVolume()+10);
            setMana(getMana()+5);
            setDefense(getDefense()+2);
            setAttack(getAttack()+4);
            setMaxExp(getMaxExp()+5*getLevel());
        }
    }
    public void attackMonster(Monster monster){
        monster.setVolume(monster.getVolume()-this.getAttack());
    }
}
