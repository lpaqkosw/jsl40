package app.j;

public class Tv{
    String color;
    boolean power;
    int ch;

    void power(){
        power = !power;
    }

    void chUp(){
        ch++;
    }

    void chDown(){
        ch--;
    }

    @Override
    public String toString() {
        return "Tv [ch=" + ch + ", color=" + color + ", power=" + power + "]";
    }

    
}