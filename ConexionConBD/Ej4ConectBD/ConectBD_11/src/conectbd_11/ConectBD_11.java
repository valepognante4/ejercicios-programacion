/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conectbd_11;

import javax.swing.SwingUtilities;

/*🔹 Ejercicio 6: Sistema de Gestión de Cursos (con eliminación)
Crea un sistema para administrar cursos en una universidad.
Cada curso tiene:
ID
Nombre
Profesor
Créditos
Funcionalidades mínimas:
Listar cursos
Agregar nuevo curso
Buscar curso por nombre
Eliminar curso por ID
 */
public class ConectBD_11 {

    public static void main(String[] args) {
       SwingUtilities.invokeLater(() -> {
            new CursoUI().setVisible(true);
        });
    }
    
}
