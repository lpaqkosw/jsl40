package app.a;

public class Parking{
    String carNum;
    int time;
    int cost =0;

    public Parking(String carNum, int time) {
        this.carNum = carNum;
        if(time > 1440){
            this.time = 1440;
        }
        else{
            this.time = time;
        }
        calcCost();
    }

    public void calcCost(){
        int tmpTime = this.time;
                
        if(tmpTime > 10){
            this.cost += 500;
        }

        if(tmpTime > 30){
            this.cost += (((tmpTime-30)/10)*500);
            if(tmpTime%10 != 0){
                this.cost+=500;
            }
        }

        if(this.cost > 30000){
            this.cost = 30000;
        }
    }

    public void printCar(){
        System.out.println(carNum + "\t\t"+ time+" min"+ "\t\t"+ String.format("%,d", cost));


    }

}


/*
1234 12
4567 45
4234 30
4563 300
*/
   
    
