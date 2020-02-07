package app.a;

public class ParkingData{
    Parking[] cars;
    int cnt;
    int totCost;
    public ParkingData(Parking[] cars, int cnt) {
        this.cars = cars;
        this.cnt = cnt;
        calcTotCost();
    }

    public void calcTotCost(){
        for(int i =0;i<cnt;i++){
            this.totCost += this.cars[i].cost;
        }
    }
    public void printData(){
        System.out.println("\nCar num:\tParked time: \tCost: ");
        for(int i = 0; i < cnt; i++){
            cars[i].printCar();
        }
        System.out.println("\nTotal cost:\t\t\t"+ String.format("%,d", totCost));
        
    }

}