package MyFactory;
public class RelationDBFactory implements DataFactory{

    @Override
    public DBData getData(String source) {
        if(source == "postgres"){
            return new PostgresData(); 
        }else {
            return new MySqlData() ; 
        }
    }
    
}
