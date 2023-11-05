/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

/**
 *
 * @author alexb
 */
import IDENTIDADES.TipoInstrumentos;
import com.app.socket.conexion.conexion;
import java.io.*;
import java.net.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {

    private static final List<ClientHandler> clients = new ArrayList<>();

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Servidor esperando clientes...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Conectado con cliente de " + clientSocket.getInetAddress());

                ClientHandler client = new ClientHandler(clientSocket);

                clients.add(client);

                new Thread(client).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        broadcastMessage("hola");

    }

    public static void broadcastMessage(String message) {
        for (ClientHandler client : clients) {
            client.sendMessage(message);
        }
    }
}


//----------------------------------------------------------------------------------------------------------------

class ClientHandler implements Runnable {

    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;
    
    
    com.mysql.jdbc.PreparedStatement ps;
    ResultSet rs;

    public ClientHandler(Socket socket) {
        try {
            this.socket = socket;
            this.in = new DataInputStream(socket.getInputStream());
            this.out = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(String message) {
        try {
            out.writeUTF(message);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMessageToAllClients(String message) {
        Server.broadcastMessage(message); // Llama al método broadcastMessage de la clase Server
    }

    @Override
    public void run() {
        try {
            while (true) {
                String mensaje_1 = in.readUTF();

                switch (mensaje_1) {
                    case "guardarTipoInstrumentos":
                        guardarTipoInstrumentos(in, out);
                        break;
                    case "borrarTipoInstrumentos":
                           borrarTipoInstrumentos(in, out);
                        break;
                    case "guardarTipoInstrumentos_UPDATE":
//                                actualizarTipoInstrumentos(in, out);
                        break;
                    case "guardarInstrumento":
//                                guardarInstrumento(in, out);
                        break;
                    default:
                        System.out.println("NO HAY COINCIDENCIA");
                }

                // Procesa y muestra el mensaje al usuario del cliente
//                System.out.println("Mensaje recibido: " + message);
            }
        } catch (IOException e) {
            // Maneja la desconexión del cliente
//            clients.remove(this);
        } catch (SQLException ex) {
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void guardarTipoInstrumentos(DataInputStream in, DataOutputStream out) throws SQLException {
        try {
            String mensaje_2 = in.readUTF();
            String mensaje_3 = in.readUTF();
            String mensaje_4 = in.readUTF();
            
            TipoInstrumentos tipo_instru = new TipoInstrumentos(mensaje_2, mensaje_3, mensaje_4);
            String resultado = guardarTipoInstrumentos_BASE(tipo_instru);
            
            if(resultado.equals("TiposInstrumentos guardado")){
                 sendMessageToAllClients(resultado);
                 sendMessageToAllClients(mensaje_2);
                 sendMessageToAllClients(mensaje_3);
                 sendMessageToAllClients(mensaje_4);
            }
            
            
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     private void borrarTipoInstrumentos(DataInputStream in, DataOutputStream out) {
        try {
            String mensaje_2 = in.readUTF();
            String mensaje_3 = in.readUTF();
            String mensaje_4 = in.readUTF();
            TipoInstrumentos tipo_instru = new TipoInstrumentos(mensaje_2, mensaje_3, mensaje_4);
            String resultado = borrarTipoInstrumentos_BASE(tipo_instru);
            
            if(resultado.equals("TiposInstrumentos eliminado")){
                 sendMessageToAllClients(resultado);  
            }
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void actualizarTipoInstrumentos(DataInputStream in, DataOutputStream out) {
        try {
            String mensaje_2 = in.readUTF();
            String mensaje_3 = in.readUTF();
            String mensaje_4 = in.readUTF();
            TipoInstrumentos tipo_instru = new TipoInstrumentos(mensaje_2, mensaje_3, mensaje_4);
            String resultado = Actualizar_TipoInstrumentos_BASE(tipo_instru);
          
            if(resultado.equals("TiposInstrumentos actualizado")){
                 sendMessageToAllClients(resultado);  
            }
                    
                    
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
    
    
    
    public String guardarTipoInstrumentos_BASE(Object OBJ) throws SQLException { // returnar un mensaje

        Connection cone = null;
        TipoInstrumentos tipoInstrumentos = (TipoInstrumentos) OBJ;
        try {
            cone = conexion.getConnection();
            ps = (com.mysql.jdbc.PreparedStatement) (PreparedStatement) cone.prepareStatement("insert into proyecto_progra_3.TiposInstrumentos(Codigo,Nombre,UnidadMedida) value (?,?,?)");

            ps.setString(1, tipoInstrumentos.getCodigoInstrumento());
            ps.setString(2, tipoInstrumentos.getNombreInstrumento());
            ps.setString(3, tipoInstrumentos.getUnidadInstrumento());

            int res = ps.executeUpdate();
            if (res > 0) {
                System.out.println("TiposInstrumentos guardado");
                cone.close();
                return "TiposInstrumentos guardado";
            } else {
                System.out.println("Error guardando TiposInstrumentos");
                cone.close();
                return "Error guardando TiposInstrumentos";

            }
        } catch (Exception e) {
            System.out.println("Error guardando TiposInstrumentos");
            return "Error guardando TiposInstrumentos";
        }
    }
     public String borrarTipoInstrumentos_BASE(Object OBJ) {
        Connection cone = null;
        TipoInstrumentos tipoInstrumentos = (TipoInstrumentos) OBJ;

        try {
            // Establecer la conexión a la base de datos
            cone = conexion.getConnection();

            // Preparar la sentencia SQL para la eliminación
            String sql = "DELETE FROM proyecto_progra_3.TiposInstrumentos WHERE Codigo = ?";
            PreparedStatement ps = cone.prepareStatement(sql);

            // Establecer el valor del parámetro
            ps.setString(1, tipoInstrumentos.getCodigoInstrumento());

            // Ejecutar la sentencia SQL
            int res = ps.executeUpdate();

            if (res > 0) {
                // Éxito al eliminar TiposInstrumentos
                System.out.println("TiposInstrumentos eliminado");
                return "TiposInstrumentos eliminado";
            } else {
                // No se encontró el registro para eliminar
                System.out.println("No se encontró el TipoInstrumentos para eliminar");
                return "No se encontró el TipoInstrumentos para eliminar";
            }
        } catch (SQLException e) {
            // Manejar cualquier excepción que pueda ocurrir
            System.out.println("Error al eliminar TiposInstrumentos: " + e.getMessage());
            return "Error al eliminar TiposInstrumentos: ";
        } finally {
            // Asegurarse de cerrar la conexión en el bloque finally
            if (cone != null) {
                try {
                    cone.close();
                } catch (SQLException e) {
                    // Manejar cualquier error al cerrar la conexión
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
    }
     public String Actualizar_TipoInstrumentos_BASE(Object OBJ) {
        Connection cone = null;
        TipoInstrumentos tipoInstrumentos = (TipoInstrumentos) OBJ;

        try {
            // Establecer la conexión a la base de datos
            cone = conexion.getConnection();

            // Preparar la sentencia SQL para la actualización
            String sql = "UPDATE proyecto_progra_3.TiposInstrumentos SET Nombre = ?, UnidadMedida = ? WHERE Codigo = ?";
            PreparedStatement ps = cone.prepareStatement(sql);

            // Establecer los nuevos valores de Nombre y UnidadMedida
            ps.setString(1, tipoInstrumentos.getNombreInstrumento());
            ps.setString(2, tipoInstrumentos.getUnidadInstrumento());

            // Establecer el valor del parámetro Codigo para identificar el registro a actualizar
            ps.setString(3, tipoInstrumentos.getCodigoInstrumento());

            // Ejecutar la sentencia SQL
            int res = ps.executeUpdate();

            if (res > 0) {
                // Éxito al actualizar TiposInstrumentos
                System.out.println("TiposInstrumentos actualizado");
                return "TiposInstrumentos actualizado";
            } else {
                // No se encontró el registro para actualizar
                System.out.println("No se encontró el TipoInstrumentos para actualizar");
                return "No se encontró el TipoInstrumentos para actualizar";
            }
        } catch (SQLException e) {
            // Manejar cualquier excepción que pueda ocurrir
            System.out.println("Error al actualizar TiposInstrumentos: " + e.getMessage());
            return "Error al actualizar TiposInstrumentos: " + e.getMessage();
        } finally {
            // Asegurarse de cerrar la conexión en el bloque finally
            if (cone != null) {
                try {
                    cone.close();
                } catch (SQLException e) {
                    // Manejar cualquier error al cerrar la conexión
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
    }
    
    
    
    
}
