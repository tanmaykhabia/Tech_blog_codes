package MyFactory;
import java.util.*;

public class PostgresData extends DBData{
    public PostgresData(){
        // Suppose you are calling only one columns of data. 
        this.data = new ArrayList<> (List.of("Postgres" , "data " , " Coming ") );
    }
}
