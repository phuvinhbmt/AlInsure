// - Move verify method to Controller
// - Create a function selectCustomerByUserNameorPass(String...value): varargs 
//

package all_insure;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public final class Model {
    private static int totalCustomer = 1;
    private static int totalInsurance = 1;
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement stmt = null;
    private ResultSet resultSet = null;
    
//    sample statement
    private static final String selectCust = "select * from CUSTOMER ";
    public Model() {
        connect();
    }
    public void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:derby://localhost:1527/csit214", "csit214", "csit214"); //jdbc:mysql://localhost:1527/sample
            System.out.println("Database connection succeeds");
            statement = connect.createStatement();
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.printf("- No database server found\n- You should find a database server");
        }
    }
    
    public ResultSet selectCustomerByUsernamePassword(String... param) throws SQLException {
        String query = selectCust;
        query += "where username = ? ";
        switch (param.length) {
            case 1:
                stmt = connect.prepareStatement(query);
                stmt.setString(1, param[0]);
                break;
            case 2:
                query += "and password = ?";
                stmt = connect.prepareStatement(query);
                stmt.setString(1, param[0]);
                stmt.setString(2, param[1]);
                break;
        }
        return stmt.executeQuery();
        
    }
    
    public ResultSet selectStaffByUsernamePassword(String...param) throws SQLException {
        String query = "select * from STAFF "; 
        switch (param.length) {
            case 1:
                query += "where username = ?";
                stmt = connect.prepareStatement(query);
                stmt.setString(1, param[0]);
                break;
            case 2:
                query += "where username = ? and password = ?";
                stmt = connect.prepareStatement(query);
                stmt.setString(1, param[0]);
                stmt.setString(2, param[1]);
                break;
        }
        return stmt.executeQuery();
                
    }
    
   
//    public ResultSet selectCustomer(String... param) throws SQLException {
//        String selectQuery = selectCust;
//        for(int i = 0; i < param.length; i++) {
//            if(i%2 == 0) {
//                selectQuery += (param[i] + " = ");
//            } else if (i%2 != 0) {
//                
//            }
//        }
//        
//    }
    
    public ResultSet selectCustomerByUsername(String username) throws SQLException {
        String selectQuery = String.format("select * from CUSTOMER where username = '?'");
        stmt = connect.prepareStatement(selectQuery);
        stmt.setString(1, username);
        ResultSet rs = stmt.executeQuery(selectQuery);
        return rs;
    }

    public ResultSet selectCustomerById(String id) throws SQLException {
        String selectQuery = String.format("select * from CUSTOMER where id = %s order by id", id);
        ResultSet rs = statement.executeQuery(selectQuery);
        
        
        return rs;
    }
    
    public ResultSet selectCustomerByFname(String fname) throws SQLException {
        String selectQuery = String.format("select * from CUSTOMER where fname like '%%%s%%' order by id", fname);
        System.out.println("query = " + selectQuery);
        ResultSet rs = statement.executeQuery(selectQuery);
        return rs;
    }
    
    public ResultSet selectCustomerByLname(String lname) throws SQLException {
        String selectQuery = String.format("select * from CUSTOMER where lname like '%%%s%%' order by id", lname);
        return statement.executeQuery(selectQuery);
    }
    
    public ResultSet selectInsuranceByCustId(String id) throws SQLException {
        String selectQuery = String.format("select * from insurance where customer = %s", id);
        return statement.executeQuery(selectQuery);
    }

    public void updateCustomer(String custId, String address, String email, String phone) throws SQLException {
        String updateQuery = String.format("update customer set address = '%s', email = '%s', phone = %s where id = %s", address, email, phone, custId);
        System.out.println(updateQuery);
        statement.executeUpdate(updateQuery);
    }
    
    public void insertCustomer( String fname, String lname, String username, String password, String dob, String mail, int phone ) throws SQLException {
        //find total number of customers to create an id for new customer
        String totalId = String.format("select max(id) as \"total\" from customer ");
        resultSet = statement.executeQuery(totalId);
        while (resultSet.next()) {
            totalCustomer = Integer.parseInt(resultSet.getString("total")) ;
        }
        
        // Insert user into database
//        String insertQuery = String.format("insert into Customer(id,fname, lname,username,password,dob,email,phone) "
//            + "values(%d, '%s','%s','%s','%s', '%s','%s',%d)", totalCustomer + 1, fname, lname, username, password, toSqlDate(dob),mail, phone);
//        statement.executeUpdate(insertQuery);
        
        
        String insertQuery = "insert into Customer(id,fname, lname,username,password,dob,email,phone) values (?, ?, ? , ? , ?, ?, ?, ?) ";
        PreparedStatement stmt = connect.prepareStatement(insertQuery);
        stmt.setInt(1, totalCustomer + 1);
        stmt.setString(2, fname);
        stmt.setString(3, lname);
        stmt.setString(4, username);
        stmt.setString(5, password);
        stmt.setString(6, toSqlDate(dob).toString());
        stmt.setString(7, mail);
        stmt.setInt(8, phone);
        stmt.executeUpdate();
    }
    
    public void insertPayment(long cnumber, String mth, String yr,int cvv, int custId) throws SQLException {
        // find card holder name by id
        String fname = "";
        String lname = "";
        String selectQuery = String.format("select fname,lname  from customer where id = %d", custId);
        resultSet = statement.executeQuery(selectQuery);
        while(resultSet.next()) {
            fname = resultSet.getString("fname");
            lname = resultSet.getString("lname");
        }
        String cardHolder = fname + " " + lname;
        // make sql date format string
        String expDate = "00/"+mth+"/"+yr;
        String insertQuery = String.format("insert into card values(%d, %d, '%s', %d, '%s')",cnumber, cvv, toSqlDate(expDate),custId,cardHolder);
        statement.executeUpdate(insertQuery);
    }
    
    // add insurance purchased into db
    public void insertInsurance(int customerId, Insurance prchsInsrce) throws SQLException {

        // find insurance 
        //  +++ find total number of insurance
        String totalId = String.format("select count(*) as \"total\" from insurance ");
        resultSet = statement.executeQuery(totalId);
        while (resultSet.next()) {
            totalInsurance = Integer.parseInt(resultSet.getString("total"));
        }

        //  +++ make insurance id
        String insuranceId = String.valueOf(totalInsurance);
        switch (prchsInsrce.getInsurance_type()) {
            case "Home":
                insuranceId += "H";
                break;
            case "Content":
                insuranceId += "Con";
                break;
            case "Car":
                insuranceId += "Car";
                break;
            default:
                insuranceId += "H";
                break;
        }

        // insert into insurance table
        String insertQuery = String.format("insert into insurance(customer, insurance_type, insurance_id, price) values(%d, '%s', '%s', %f)", customerId, prchsInsrce.getInsurance_type(), insuranceId, prchsInsrce.getPrice());
        statement.executeUpdate(insertQuery);

    }

    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (SQLException e) {
        }
    }

    public static java.sql.Date toSqlDate(String dateString) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        java.sql.Date sqlDate;
        java.util.Date utilDate;
        try {
            utilDate = format.parse(dateString);
            sqlDate = new java.sql.Date(utilDate.getTime());
        } catch (ParseException e) {
            sqlDate = new java.sql.Date(1980, 01, 01);
        }
        return sqlDate;
    }
    
}
