package forConnection;

public class DatabaseConfig {
  public static final String DB_URL_BASE = "jdbc:mariadb://localhost:3307/";
  public static final String DB_USERNAME = "root";
  public static final String DB_PASSWORD = "1234";

  public static String urlTo( String dbname ) {
    return DB_URL_BASE + dbname;
  }
}
