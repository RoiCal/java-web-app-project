package il.ac.hit.costmanager;

import java.sql.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.*;

public class CostManagerModel implements IModel {

    private final String username = "admin";
    private final String password = "admin";
    private final String sqlUrl = "jdbc:mysql://localhost:3306/admin";


    public CostManagerModel() throws CostManagerException {

        //???
    }


    @Override

    public void addCost(CostItem item) throws CostManagerException {
        Connection connection = null;
        try {

            addCategory(item.getCategory());
            //setting a prepared statement string

            String SQL_INSERT = "INSERT INTO costitems(desption,cost,currency,category,date) values (?,?,?,?,?)";
            //creating a connection object
            connection = DriverManager.getConnection(sqlUrl, username, password);

            //getting a prepared statement object
            PreparedStatement statement = connection.prepareStatement(SQL_INSERT);

            statement.setString(1, item.getDescription());
            statement.setFloat(2, item.getCost());
            statement.setString(3, item.getCurrency());
            statement.setString(4, item.getCategory().getName());
            statement.setDate(5, Date.valueOf(item.getDate()));

            statement.executeUpdate();


        } catch (SQLException e) {
            throw new CostManagerException("Problem with inserting cost item", e);
        } finally {
            try {
                assert connection != null;
                connection.close();
            } catch (SQLException e) {
                throw new CostManagerException("Problem with closing connection", e);
            }
        }
    }

    @Override
    public void addCategory(Category item) throws CostManagerException {
        Connection connection = null;
        try {
            //setting a prepared statement string

            String SQL_INSERT = "INSERT INTO category(name) values(?)";

            //creating a connection object
            connection = DriverManager.getConnection(sqlUrl, username, password);

            //getting a prepared statement object
            PreparedStatement statement = connection.prepareStatement(SQL_INSERT);

            statement.setString(1, item.getName());

            statement.executeUpdate();

        } catch (SQLException e) {
            throw new CostManagerException("Problem with inserting a category", e);
        } finally {
            try {
                assert connection != null;
                connection.close();
            } catch (SQLException e) {
                throw new CostManagerException("Problem with closing connection", e);
            }
        }
    }

    @Override
    public void editCost(CostItem item) throws CostManagerException {
        Connection connection = null;
        try {
            //setting a prepared statement string

            String SQL_INSERT = "UPDATE costitems(desption,cost,currency,category,date) values (?,?,?,?,?)";
            //creating a connection object
            connection = DriverManager.getConnection(sqlUrl, username, password);

            //getting a prepared statement object
            PreparedStatement statement = connection.prepareStatement(SQL_INSERT);

            // TODO set instead of get
            /*statement.setString(1, item.getDescription());
            statement.setFloat(2, item.getCost());
            statement.setString(3, item.getCurrency());
            statement.setString(4, item.getCategory().getName());
            statement.setDate(5, Date.valueOf(LocalDate.now()));*/

            //statement.executeUpdate();


        } catch (SQLException e) {
            throw new CostManagerException("Problem with updating cost item", e);
        } finally {
            try {
                assert connection != null;
                connection.close();
            } catch (SQLException e) {
                throw new CostManagerException("Problem with closing connection", e);
            }
        }
    }

    @Override
    public void editCategory(Category item) throws CostManagerException {
        Connection connection = null;
        try {
            //setting a prepared statement string
            String SQL_INSERT = "UPDATE category(name) values(?)";

            //creating a connection object
            connection = DriverManager.getConnection(sqlUrl, username, password);

            //getting a prepared statement object
            PreparedStatement statement = connection.prepareStatement(SQL_INSERT);

            // TODO set instead of get

            //statement.setString(1, item.getName());

            //statement.executeUpdate();

        } catch (SQLException e) {
            throw new CostManagerException("Problem with updating a category", e);
        } finally {
            try {
                assert connection != null;
                connection.close();
            } catch (SQLException e) {
                throw new CostManagerException("Problem with closing connection", e);
            }
        }
    }

    @Override
    public Collection<CostItem> getCostsItems() throws CostManagerException {
        Connection connection = null;
        try {
            //creating a connection object
            connection = DriverManager.getConnection(sqlUrl, username, password);

            //getting a statement object
            Statement statement = connection.createStatement();

            //perform simple query
            ResultSet rs = statement.executeQuery("SELECT * FROM costitem");
            Collection<CostItem> costItemList = new LinkedList<>();
            while (rs.next()) {
                String temp = rs.getString("description");
                costItemList.add(new CostItem(temp));
                System.out.println("temp=" + temp);
            }
            return costItemList;

        } catch (SQLException e) {
            throw new CostManagerException("Problem with getting items", e);
        } finally {
            try {
                assert connection != null;
                connection.close();
            } catch (SQLException e) {
                throw new CostManagerException("Problem with closing connection", e);
            }
        }
    }

    @Override
    public Collection<Category> getCategoryItems() throws CostManagerException {
        Connection connection = null;
        try {
            //creating a connection object
            connection = DriverManager.getConnection(sqlUrl, username, password);

            //getting a statement object
            Statement statement = connection.createStatement();

            //perform simple query
            ResultSet rs = statement.executeQuery("SELECT * FROM category");

            Collection<Category> categoryList = new LinkedList<>();
            while (rs.next()) {
                String temp = rs.getString("name");
                categoryList.add(new Category(temp));
                System.out.println("temp=" + temp);
            }
            return categoryList;

        } catch (SQLException e) {
            throw new CostManagerException("Problem with getting items", e);
        } finally {
            try {
                assert connection != null;
                connection.close();
            } catch (SQLException e) {
                throw new CostManagerException("Problem with closing connection", e);
            }
        }
    }

    @Override
    public void deleteCost() throws CostManagerException {
        //TODO
        throw new CostManagerException("TODO");
    }

    @Override
    public void deleteCategory() throws CostManagerException {
        //TODO
        throw new CostManagerException("TODO");
    }

    @Override
    public void printReport() throws CostManagerException {
        //TODO
        throw new CostManagerException("TODO");
    }
}
