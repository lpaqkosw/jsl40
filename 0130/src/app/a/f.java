package app.a;
//System.arraycopy(원본배열,시작위치,대상배열,시작위치,항목수);
//copy array
public class f{
    public static void main(String[] args) {
        char[] arr2 = {'a','b','f','c','d','f'};
        char[] arr3 = {'b','c','x','s','e','z','x','y','l'};
        for(char ch : arr2){
            System.out.print(ch + "\t");
        }
        System.out.println();
        for(char ch : arr3){
            System.out.print(ch+"\t");
        }
        System.out.println();
        
        System.arraycopy(arr2, 0, arr3, 0, 2);

        for(char ch : arr2){
            System.out.print(ch + "\t");
        }
        System.out.println();
        for(char ch : arr3){
            System.out.print(ch+"\t");
        }

    }
}