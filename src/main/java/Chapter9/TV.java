package Chapter9;

public class TV {

    public static void main(String[] args) {
        TV tv1=new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolumeLevel(3);

        TV tv2=new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("tv1 on "+tv1.channel + " ch with vol "+ tv1.volumeLevel);
        System.out.println("tv2 on "+tv2.channel + " ch with vol "+ tv2.volumeLevel);
    }

    int channel=1;
    int volumeLevel=1;
    boolean on=false;

    public TV(){
    }

    public void turnOn(){
        on=true;
    }

    public void turnOff(){
        on=false;
    }

    public void setChannel(int newChannel){
        if(on&&newChannel>=1 && newChannel<=120)channel=newChannel;
    }

    public void setVolumeLevel(int newVolumeLevel){
        if(on&&newVolumeLevel>=1&&newVolumeLevel<=7)volumeLevel=newVolumeLevel;
    }

    public void channelUp(){
        if(on&&channel<120)channel++;
    }

    public void channelDown(){
        if(on&&channel>1)channel--;
    }

    public void volumeUp(){
        if(on&&volumeLevel<7)volumeLevel++;
    }

    public void VolumeDown(){
        if(on&&volumeLevel>1)volumeLevel--;
    }
}
