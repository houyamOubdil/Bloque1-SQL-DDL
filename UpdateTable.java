/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloque1bd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/prueba";
        String user = "root";
        String password = "1234";

        try (Connection connec = DriverManager.getConnection(url, user, password);
             Statement stm = connec.createStatement()) {

            String alterEmpleado = "ALTER TABLE Empleado " + "ADD COLUMN departamento_id INT, " + "ADD CONSTRAINT fk_departamento " +
                                   "FOREIGN KEY (departamento_id) REFERENCES Departamento(id)";
            stm.executeUpdate(alterEmpleado);

            System.out.println("Table 'Empleado' updated successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
