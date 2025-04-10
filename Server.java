import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.ExportException;

public class Server {
    public static void main(String[] args) {
        try {
            // Try to get existing registry or create new one
            Registry registry;
            try {
                registry = LocateRegistry.createRegistry(1099);
                System.out.println("Created new RMI registry on port 1099");
            } catch (ExportException e) {
                registry = LocateRegistry.getRegistry(1099);
                System.out.println("Connected to existing RMI registry on port 1099");
            }
            
            PatientFileManagerImpl service = new PatientFileManagerImpl();
            registry.rebind("PatientService", service);
            System.out.println("Server ready");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}