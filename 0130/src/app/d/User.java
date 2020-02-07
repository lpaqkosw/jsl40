package app.d;

public class User implements Comparable<User>{
    int n;
    String name;
    String userId;
    String email;

    public User(int n, String name, String userId, String email) {
        this.n = n;
        this.name = name;
        this.userId = userId;
        this.email = email;
    }
    
    public User(String userId) {
        this.userId = userId;
    }

    public void print(){
        System.out.println(n+"\t"+name+"\t"+userId+"\t"+email);
    }

    @Override
    public int compareTo(User o) {
        return this.userId.compareTo(o.userId);
    }

    @Override
    public boolean equals(Object obj) {
        User tmp = (User) obj;
        if(this.userId.equals(tmp.userId)){
            return true;
        }
        if((User)obj == this){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return userId;
    }

}