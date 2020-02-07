package app.g;

public class EmployeeData{

    public void dataPrint(Employee[] a, int cnt){
        System.out.println("\noriginal: ");
        System.out.println("id\tname\twage");
        for(int i = 0; i<cnt;i++){
            a[i].print();
        }
    }

    public void sortPrint(Employee[] a, int cnt, int order){
        
            for(int i =0; i < cnt-1; i++){
                for(int j = i+1; j <cnt;j++){
                    if(order == 1){
                        if(a[i].id >a[j].id){
                            Employee tmp = a[i];
                            a[i] = a[j];
                            a[j] = tmp;
                        }
                    }
                    else{
                        if(a[i].id<a[j].id){
                            Employee tmp = a[i];
                            a[i] = a[j];
                            a[j] = tmp;
                        }
                    }
                }
            }

        System.out.println("\nsorted: ");
        System.out.println("id\tname\twage");
        for(int i = 0; i<cnt;i++){
            a[i].print();
        }
    }
}