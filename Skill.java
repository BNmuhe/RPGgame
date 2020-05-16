public class Skill {
    String name;
    String description;
    int level;
    int attack;
    public Skill(String iName,String iDescription,int initialLevel,int initialAttack){
        name=iName.toString();
        description=iDescription.toString();
        level=initialLevel;
        attack=initialAttack;
    }
    public void setLevel(int newLevel){
        level=newLevel;
    }
    public void setAttack(int newAttack){
        attack=newAttack;
    }
    public int getLevel(){
        return level;
    }
    public int getAttack(){
        return attack;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
}
