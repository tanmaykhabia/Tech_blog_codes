import MyFactory.DataFactory;
import MyFactory.ProcessData;
import MyFactory.RelationDBFactory;

public class App {
    public static void main(String[] args) throws Exception {
        DataFactory factory =  new RelationDBFactory()  ; 
        ProcessData p = new ProcessData(factory)   ;
        p.processData("postgres") ; 
    }
}
