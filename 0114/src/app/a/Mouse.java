package app.a;

public class Mouse{
    private int numButton;
    private boolean wireless;
    private String color;

    public void leftClick(){
        System.out.println("left clicked!");
    }

    public void rightClick(){
        System.out.println("right clicked!");

    }

    public int leftDoubleClick(){
        System.out.println("left double clicked!");
        return 0;
    }

    @Override
    public String toString() {
        return "Mouse [color=" + color + ", numButton=" + numButton + ", wireless=" + wireless + "]";
    }

    public Mouse(int numButton, boolean wireless, String color) {
        this.numButton = numButton;
        this.wireless = wireless;
        this.color = color;
    }
}