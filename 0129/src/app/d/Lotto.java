package app.d;

public class Lotto{
    int rank;
    int[] lot;
    int[] playerLot;
    int playerNum;

    public Lotto(int[] lot, int[] playerLot, int playerNum) {
        this.lot = lot;
        this.playerLot = playerLot;
        this.playerNum = playerNum;
        getRank();
    }

    public void print(){
        System.out.print("\n"+playerNum+": ");
        for(int i =0; i < playerLot.length;i++){
            if(i == 5){
                System.out.print(playerLot[i]+"  --  ");
                break;
            }
            System.out.print(playerLot[i]+", ");
        }
        switch(this.rank){
            case 1:{
                System.out.println(rank+"st");
                break;
            }
            case 2:{
                System.out.println(rank+"nd");
                break;
            }
            case 3:{
                System.out.println(rank+"rd");
                break;
            }
            case 4:{
                System.out.println(rank+"th");
                break;
            }
            case 5:{
                System.out.println(rank+"th");
                break;
            }
            default:{
                System.out.println(" x");
            }
        }
    }

    public void getRank(){
        int match = 0;
        boolean bonus = false;
        for(int i = 0; i < playerLot.length;i++){
            if(playerLot[i] == lot[i]){
                match++;
            }
            if(playerLot[i] == lot[6]){
                bonus = true;
            }
        }
        switch(match){
            case 3:{
                this.rank = 5;
                break;
            }
            case 4:{
                this.rank = 4;
                break;
            }
            case 5:{
                if(bonus == true){
                    this.rank = 2;
                }
                else{
                    this.rank = 3;
                }
                break;
            }
            case 6:{
                this.rank = 1;
                break;
            }
        }
    }

}