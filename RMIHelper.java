import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.awt.GraphicsEnvironment;
import javax.swing.JOptionPane;

public class RMIHelper {
    public static PatientFileManager getRemoteService() {
        try {
            Registry registry = LocateRegistry.getRegistry(1099);
            return (PatientFileManager) registry.lookup("PatientService");
        } catch (Exception e) {
            if (!GraphicsEnvironment.isHeadless()) {
                JOptionPane.showMessageDialog(null, 
                    "Server connection failed: " + e.getMessage(), 
                    "Connection Error", 
                    JOptionPane.ERROR_MESSAGE);
            } else {
                System.err.println("Server connection failed: " + e.getMessage());
            }
            return null;
        }
    }
}