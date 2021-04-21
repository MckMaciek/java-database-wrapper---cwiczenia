package p.database.Operations;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import p.database.DatabaseConnection;

import java.util.Scanner;

@Service
public class DeleteConcrete<T> {
    final JdbcTemplate jdbcTemplate;
    final DatabaseConnection databaseConnection;

    @Autowired
    public DeleteConcrete(){
        jdbcTemplate = new JdbcTemplate();
        databaseConnection = new DatabaseConnection();

        jdbcTemplate.setDataSource(databaseConnection.connection());
    }

    public <T> boolean delete(String tableName, String possibleWhereStatement){
        if(!possibleWhereStatement.equals("")){

            String sqlQuery = String.format("DELETE FROM %s WHERE %s=?", tableName, possibleWhereStatement);
            Scanner getPossibleGetterFromUser = new Scanner(System.in);
            String identify = getPossibleGetterFromUser.nextLine();

            Object[] args = new Object[] {identify};
            return jdbcTemplate.update(sqlQuery, args) == 1;

        }else{
            System.out.println("invalid WHERE syntax");
            return false;
        }

    }


}