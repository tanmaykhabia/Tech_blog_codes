package MyFactory;

public class ProcessData {
    DataFactory factory; 

    public ProcessData(DataFactory factory ){
        this.factory  = factory ; 
    }
    
    public void processData(String source){
        // does't care which object is returned 
        DBData data = this.factory.getData(source); 
        
        // Some pre processing 
        data.trimWhiteSpace();
        data.makeUpperCase();
        data.printData();
    }
}
