package MyFactory;
import java.util.ArrayList;
import java.util.List;

public class MySqlData extends DBData {
    public MySqlData(){
        // Suppose you are calling only one columns of data. 
        this.data = new ArrayList<> (List.of("MySqlData" , "data " , " Coming ") );
    }
}
