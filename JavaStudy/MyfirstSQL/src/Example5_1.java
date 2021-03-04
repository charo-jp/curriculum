import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example5_1 {

 /* 定数 */
 /** ドライバーのクラス名 */
 private static final String POSTGRES_DRIVER = "org.postgresql.Driver";
 /** ・JDMC接続先情報 */
 private static final String JDBC_CONNECTION = "jdbc:postgresql://localhost:5432/lesson_db";
 /** ・ユーザー名 */
 private static final String USER = "postgres";
 /** ・パスワード */
 private static final String PASS = "postgres";

 public static void main(String[] args) {
// SQLの実行には以下の3つの文が必要になってくる
 Connection connection = null;
 // StatementはSQLの実行に利用される
 Statement statement = null;
 ResultSet resultSet = null;

 try {
 Class.forName(POSTGRES_DRIVER);
 connection = DriverManager.getConnection(JDBC_CONNECTION, USER, PASS);
//StatementはSQLの実行する時に利用される　実行する時は.executeQuery("SQLの実行文");
 statement = connection.createStatement();
 String SQL = "SELECT * FROM Goods";
//実行結果はResultSetインターフェイス型で帰ってくる。
//Update, insert, delete文ではexecuteQuery()の代わりにexecuteUpdateを用いる。
 resultSet = statement.executeQuery(SQL);
// getString, getInt, getDateなどデータ型の種類によってgetの後が異なる。
//　また、最初にresultSet.next()をすることでカラムの名前を出力しなくすることが出来る
 while (resultSet.next()) {
 String column1 = resultSet.getString("GoodsName");
 String column2 = resultSet.getString("UnitPrice");
 String column3 = resultSet.getString("UpdateDate");

 System.out.print(column1 + ",");
 System.out.print(column2 + ",");
 System.out.println(column3);
 }

  // forName()で例外発生
 } catch (ClassNotFoundException e) {
 e.printStackTrace();

  // getConnection()、createStatement()、executeQuery()で例外発生
 } catch (SQLException e) {
 e.printStackTrace();

 } finally {
 try {
 if (resultSet != null) {
 resultSet.close();
 }
 if (statement != null) {
 statement.close();
 }
 if (connection != null) {
 connection.close();
 }

 } catch (SQLException e) {
 e.printStackTrace();
 }
 }
 }
}
