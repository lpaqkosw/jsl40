package app.b;

public class Member{
    String name;
    String phonNum;
    String id;
    String sex;
    int age;

    public Member(String name, String phonNum, String id) {
        this.name = name;
        this.phonNum = phonNum;
        this.id = id;
        calcAge();
    }

    public void calcAge(){
        int century;
        String tmpId = this.id;
        int tmpSex = Integer.parseInt(tmpId.substring(tmpId.length()-1));
        if(tmpSex%2 == 0){
            this.sex = "female";
            century = tmpSex==2||tmpSex==6 ? 1900:2000;
        }
        else{
            this.sex = "male";
            century = tmpSex ==1||tmpSex==5 ? 1900:2000;
        }
        int birth = Integer.parseInt(tmpId.substring(0,2))+ century;
        this.age = 2020 - birth+1;
    }

    @Override
    public String toString() {
        return name+"\t"+phonNum+"\t"+sex+"\t"+age;
    }

   

}