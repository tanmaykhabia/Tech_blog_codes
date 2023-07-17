package MyFactory;

public class ProcessDataWithoutFactory {
    public void processData(String source) {

        if (source == "postgres") {
            PostgresData data = new PostgresData();
            data.trimWhiteSpace();
            data.makeUpperCase();
            data.printData();

        } else {
            MySqlData data = new MySqlData();
            data.trimWhiteSpace();
            data.makeUpperCase();
            data.printData();

        }
    }
}
