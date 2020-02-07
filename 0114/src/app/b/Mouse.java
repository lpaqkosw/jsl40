package app.b;

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

    public void buttonClick(int clickedButton){
        switch(this.numButton>=clickedButton ? clickedButton:0){
            case 1:{
                System.out.println("left clicked!");
                return;
            }

            case 2:{
                System.out.println("right clicked!");
                return;
            }

            case 3:{
                System.out.println("wheeled!");
                return;
            }

            default:{
                System.out.println("error");
                return;
            }
        }
    }
        
    
    

    public Mouse(int numButton, boolean wireless, String color) {
        this.numButton = numButton;
        this.wireless = wireless;
        this.color = color;
    }

    public int getNumButton() {
        return numButton;
    }

    public void setNumButton(int numButton) {
        this.numButton = numButton;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mouse [color=" + color + ", numButton=" + numButton + ", wireless=" + wireless + "]";
    }
}