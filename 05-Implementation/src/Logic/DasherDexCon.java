package Logic;
import Persistance.DBFacade;

import java.sql.SQLException;

public class DasherDexCon  {
    public void DasherDexCon(String name, int type) throws SQLException {
        DBFacade addPokemon = new DBFacade();
        System.out.println(type);
        addPokemon.DBFacade(name,type);
    }
    public void DasherDexCon(int pid) throws SQLException {
        DBFacade deletePokemon = new DBFacade();
        deletePokemon.DBFacade(pid);
    }

    public static void main(String[] args) throws SQLException {

    }
}
