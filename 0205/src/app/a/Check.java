package app.a;

public class Check{
    public static boolean isOk(String[] in){
            if(Integer.parseInt(in[0]) < 1 || Integer.parseInt(in[0]) >3){
                return false;
            }
            else if(Integer.parseInt(in[1]) < 1 || Integer.parseInt(in[1]) >6){
                return false;

            }
            else if(Integer.parseInt(in[2]) < 1 || Integer.parseInt(in[2]) >45){
                return false;

            }
            else if(Integer.parseInt(in[4]) > 100 || Integer.parseInt(in[4])< 0){
                return false;
            }
            else if(in[3].length()>10){
                return false;
            }
            else{
                return true;
            }
    }
}