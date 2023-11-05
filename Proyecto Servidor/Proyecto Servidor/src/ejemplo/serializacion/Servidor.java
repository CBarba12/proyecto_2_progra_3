package ejemplo.serializacion;


import IDENTIDADES.*;
import com.app.socket.conexion.conexion;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import laboratorio.*;

public class Servidor implements Runnable {

    com.mysql.jdbc.PreparedStatement ps;
    ResultSet rs;
    private List<DataOutputStream> clientesOut = new ArrayList<>();
    
    public static void main(String[] args) {
        Thread serverThread = new Thread(new Servidor());
        serverThread.start();
    }

    @Override
    public void run() {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Servidor esperando clientes...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Conectado con cliente de " + clientSocket.getInetAddress());

                Thread clientThread = new Thread(() -> {
                    try (
                        Socket socket = clientSocket;    
                        DataInputStream in = new DataInputStream(socket.getInputStream());
                        DataOutputStream out = new DataOutputStream(socket.getOutputStream())) {
                      
                    synchronized (clientesOut) {
                       clientesOut.add(out);
                    }
                 
                        String mensaje_1 = in.readUTF();

                        switch (mensaje_1) {
                            case "guardarTipoInstrumentos":
                                guardarTipoInstrumentos(in, out);
                                break;
                            case "borrarTipoInstrumentos":
                                borrarTipoInstrumentos(in, out);
                                break;
                            case "guardarTipoInstrumentos_UPDATE":
                                actualizarTipoInstrumentos(in, out);
                                break;
                            case "guardarInstrumento":
                                guardarInstrumento(in, out);
                                break;
                            default:
                                System.out.println("NO HAY COINCIDENCIA");
                        }
                        
                    enviarMensajeAsincronico("Se ha realizado un cambio en los datos.");
                        
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (SQLException ex) {
                        Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                });

                clientThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void guardarTipoInstrumentos(DataInputStream in, DataOutputStream out) throws SQLException {
        try {
            String mensaje_2 = in.readUTF();
            String mensaje_3 = in.readUTF();
            String mensaje_4 = in.readUTF();
            TipoInstrumentos tipo_instru = new TipoInstrumentos(mensaje_2, mensaje_3, mensaje_4);
            String resultado = guardarTipoInstrumentos_BASE(tipo_instru);
            out.writeUTF(resultado);
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
            out.writeUTF(resultado);
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
            out.writeUTF(resultado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void guardarInstrumento(DataInputStream in, DataOutputStream out) throws SQLException {
        try {
            String mensaje_2 = in.readUTF();
            String mensaje_3 = in.readUTF();
            String mensaje_4 = in.readUTF();
            String mensaje_5 = in.readUTF();
            String mensaje_6 = in.readUTF();
            String mensaje_7 = in.readUTF();

            Instrumento tipo_instru = new Instrumento(mensaje_2, mensaje_3, Integer.parseInt(mensaje_4), Integer.parseInt(mensaje_5), Integer.parseInt(mensaje_6));
            String resultado = guardarInstrumentos_BASE(mensaje_7, tipo_instru);
            out.writeUTF(resultado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
   
    
    
private void enviarMensajeAsincronico(String mensaje) {
    synchronized (clientesOut) {
        for (DataOutputStream out : clientesOut) {
            try {
                out.writeUTF(mensaje);
                out.flush();
            } catch (IOException e) {
                // Manejar cualquier excepción al enviar el mensaje a un cliente
                e.printStackTrace();
            }
        }
    }
}



    


    public String guardarTipoInstrumentos_BASE( Object OBJ) throws SQLException { // returnar un mensaje

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
                System.out.println("TiposInstrumentos guardada");
                cone.close();
                return "TiposInstrumentos guardada";
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

    public String guardarInstrumentos_BASE(String foreingkey_tipo, Object OBJ) throws SQLException { // returnar un mensaje

        Connection cone = null;
        Instrumento instrumentos = (Instrumento) OBJ;
        try {
            cone = conexion.getConnection();
            ps = (com.mysql.jdbc.PreparedStatement) (PreparedStatement) cone.prepareStatement("insert into proyecto_progra_3.TiposInstrumentos(NumeroSerie,TipoCodigo,Descripcion,RangoMinimo,RangoMaximo,Tolerancia) value (?,?,?,?,?)");

     
            ps.setString(1, instrumentos.getSerie());
            ps.setString(2, foreingkey_tipo);
            ps.setString(3, instrumentos.getDescripcion());
            ps.setInt(4, instrumentos.getMaximo());
            ps.setInt(5, instrumentos.getMinimo());
            ps.setInt(6, instrumentos.getTolerancia());

            int res = ps.executeUpdate();
            if (res > 0) {
                System.out.println("TiposInstrumentos guardada");
                cone.close();
                return "TiposInstrumentos guardada";
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

    
    
    
    
}
