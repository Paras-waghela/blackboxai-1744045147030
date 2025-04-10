import javax.swing.*;
import java.awt.*;

public class HospitalSystemTest {
    public static void main(String[] args) {
        try {
            // Check for existing RMI registry and kill if needed
            try {
                java.rmi.registry.LocateRegistry.getRegistry(1099).list();
                System.out.println("Existing RMI registry found - attempting to shutdown...");
                Runtime.getRuntime().exec("pkill -f rmiregistry");
                Thread.sleep(1000); // Wait for shutdown
            } catch (Exception e) {
                System.out.println("No existing RMI registry found");
            }

            // Start server in a separate thread
            new Thread(() -> {
                try {
                    Server.main(args);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();

            // Check for GUI support
            if (GraphicsEnvironment.isHeadless()) {
                System.err.println("No graphical environment available - running in console mode");
                JOptionPane.showMessageDialog(null, 
                    "Running in console mode\nUse a graphical environment for full functionality",
                    "Headless Warning", 
                    JOptionPane.WARNING_MESSAGE);
            } else {
                // Start client GUI
                MainForm.main(args);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
