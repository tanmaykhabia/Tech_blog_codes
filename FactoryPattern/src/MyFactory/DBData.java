package MyFactory;


import java.util.*;

public abstract class  DBData {
    ArrayList<String> data ; 

    public void   printData (){
        for (String string : this.data) {
            System.out.println(string);
        }
    }

    public void trimWhiteSpace(){
        for (int i = 0; i < this.data.size(); i++) {
            this.data.set(i, this.data.get(i).strip())  ; 
        }
    }

    public void makeLowerCase(){
        for (int i = 0; i < this.data.size(); i++) {
            this.data.set(i, this.data.get(i).toLowerCase())  ; 
        }
    }
    public void makeUpperCase(){
        for (int i = 0; i < this.data.size(); i++) {
            this.data.set(i, this.data.get(i).toLowerCase())  ; 
        }
    }
}
