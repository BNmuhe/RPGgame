import javax.swing.*;
import java.util.Vector;

public class Bag {
    Vector<Food> vecF =new Vector<Food>();
    Vector<ExpItem> vecEI =new Vector<ExpItem>();
    Vector<Equipment> vecE = new Vector<Equipment>();


    //单例模式
    private static Bag bag=null;
    private Bag(){

    }
    public static Bag getBagInstance(){
        if(bag == null){
            bag=new Bag();
        }
        return bag;
    }

    public void showFood(){
        JFrame frame = new JFrame("bag");
        String s ="";
        for(int i=0;i<vecF.size();i++){

            s+="Food_"+i+"_"+vecF.get(i).getName()+"\n";
        }
        JOptionPane.showMessageDialog(frame,s);
    }
    public void showExpItem(){

        JFrame frame = new JFrame("bag");
        String s ="";
        for(int i=0;i<vecEI.size();i++){

            s+="expItem_"+i+"_"+vecEI.get(i).getName()+"\n";
        }
        JOptionPane.showMessageDialog(frame,s);




    }
    public void showEquipment(){

        JFrame frame = new JFrame("bag");
        String s ="";
        for(int i=0;i<vecE.size();i++){

            s+="Equipment_"+i+"_"+vecE.get(i).getName()+"\n";
        }
        JOptionPane.showMessageDialog(frame,s);


    }
    public void showBag(){
        showFood();
        showExpItem();
        showEquipment();
    }


    public void addFood(Food food){
        vecF.add(food);
    }
    public void addExpItem(ExpItem expItem){
        vecEI.add(expItem);
    }
    public void addEquipment(Equipment equipment){
        vecE.add(equipment);
    }





}

