package Database;

import commonAPI.CommonAPI;

import java.io.IOException;
import java.sql.SQLException;

public class DbReader extends CommonAPI{

    public void dbConnection() throws SQLException, IOException, ClassNotFoundException {
        ConnectDB.connectToMySql();
    }

}
