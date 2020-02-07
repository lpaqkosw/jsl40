package app.l;
//interface ex

interface Control{
    public int maxVolume=10;
    public int minVolume=0;
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);

    default void setMute(boolean mute){
        if(mute){
            System.out.println("mute");
        }
        else{
            System.out.println("unmute");
        }
    }

    static void changeBattery(){
        System.out.println("change battery");
    }
}

class Tv implements Control{
    private int volume;

    void print(){
        System.out.println("Tv.volume = "+this.volume);
    }

    @Override
    public void setVolume(int volume) {
        if(volume > Control.maxVolume){
            this.volume = Control.maxVolume;
        }
        else if(volume < Control.minVolume){
            this.volume = Control.minVolume;
        }
        else{
            this.volume = volume;
        }
        System.out.println("Volume set to "+this.volume);
    }

    @Override
    public void turnOff() {
        System.out.println("TV off");
        
    }

    @Override
    public void turnOn() {
        System.out.println("TV on");
        
    }

}

public class l{
    public static void main(String[] args) {
        Tv t = new Tv();
        t.turnOn();
        t.setVolume(15);
        t.print();
        t.turnOff();
    }
}