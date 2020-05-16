public class Character {
    String name;
    private int volume;
    private int mana;
    private int level;
    private int attack;

    public Character() {
    }

    public void setName(String newName){
        name=newName.toString();
    }
    public void setVolume(int newVolume){
        volume=newVolume;
    }
    public void setMana(int newMana){
        mana=newMana;
    }
    public void setLevel(int newLevel){
        level=newLevel;
    }
    public void setAttack(int newAttack){
        attack=newAttack;
    }
    public String getName(){
        return name;
    }
    public int getMana(){
        return mana;
    }
    public int getVolume(){
        return volume;
    }
    public int getLevel(){
        return level;
    }
    public int getAttack(){
        return attack;
    }
}
