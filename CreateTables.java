/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque1bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTables {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/prueba";
        String user = "root";
        String password = "1234";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            String createEmpleado = "CREATE TABLE Empleado (" + "id INT AUTO_INCREMENT PRIMARY KEY, " + "name VARCHAR(20), " + "birth_day DATE, " +
                                    "gender TINYINT(1), "+ "hire_date DATE)";
            stmt.executeUpdate(createEmpleado);

            String createDepartamento = "CREATE TABLE Departamento (" +  "id INT AUTO_INCREMENT PRIMARY KEY, " + "name VARCHAR(20))";
            stmt.executeUpdate(createDepartamento);

            System.out.println("Tables created successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
