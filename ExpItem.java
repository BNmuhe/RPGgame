public class ExpItem extends Item {
    int expUp;
    public ExpItem(String iName, String iDescription,int iExpUp) {
        super(iName, iDescription);
        expUp=iExpUp;
    }

    public int getExpUp() {
        return expUp;
    }
}
