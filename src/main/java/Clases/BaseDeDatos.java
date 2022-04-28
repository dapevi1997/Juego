package Clases;
import javax.swing.table.DefaultTableModel;
import java.sql.*;


public class BaseDeDatos {
  public static Connection conex(){
      Connection con = null;
      try {
          Class.forName("org.sqlite.JDBC");
          con =  DriverManager.getConnection("jdbc:sqlite:base_de_datos/juego.db");
          return con;
      } catch (ClassNotFoundException | SQLException e) {
          throw new RuntimeException(e);
      }

  }
  public static ResultSet obtDatos(String consulta){
      Connection con = conex() ;
      Statement st;
      ResultSet datos=null;
      try {
          st=con.createStatement();
          datos=st.executeQuery(consulta);
          conex().close();

      }catch (Exception e){}
      return datos;

  }
  public static void insert(String nombre, int puntaje){
      Connection con = conex();

      PreparedStatement ps = null;
      try {
          String sql = "INSERT INTO jugadores(nombre,puntaje) VALUES(?,?)";
          ps = con.prepareStatement(sql);
          ps.setString(1,nombre);
          ps.setInt(2,puntaje);
          ps.execute();
          con.close();

      }catch (SQLException e){}
  }




}
