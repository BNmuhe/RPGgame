public class Item {
    String name;
    String description;

    public Item(String iName,String iDescription){
        name = iName.toString();
        description=iDescription.toString();

    }
    public String getName(){
        return name;
}
    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }
}
