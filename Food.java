public class Food extends Item {
    private int volumeUp;

    public Food(String iName, String iDescription,int iVolumeUp) {
        super(iName, iDescription);
        volumeUp=iVolumeUp;
    }

    public void setVolumeUp(int volumeUp) {
        this.volumeUp = volumeUp;
    }


    public int getVolumeUp() {
        return volumeUp;
    }
}
