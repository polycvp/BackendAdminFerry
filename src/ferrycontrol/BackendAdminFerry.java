package ferrycontrol;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Ferry;

public class BackendAdminFerry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This is a demo application. It demonstrates a running implementation of the assigned contract."
                + " Press any key to start.");
        Controller c = new Controller();
        try {
        boolean addFerry = c.addFerry(400, "medium");
        if (addFerry)
            System.out.println("New ferry added. Press any key to continue.");
        else System.out.println("An error occured. Press any key to continue.");
        System.in.read();
        Ferry ferry = (Ferry) c.getFerry("1");
        if (ferry!=null)
            System.out.println("Ferry 1 retrieved from list. Press any key to continue.");
        else System.out.println("An error occured. Press any key to continue.");
        System.in.read();
        boolean updateFerry = c.updateFerry("1", 412, "medium");
        if (updateFerry)
            System.out.println("Ferry 1 updated. Press any key to continue.");
        else System.out.println("An error occured. Press any key to continue.");
        System.in.read();
        boolean deleteFerry = c.deleteFerry("1");
        if (deleteFerry)
            System.out.println("Ferry 1 deleted. Press any key to continue.");
        else System.out.println("An error occured. Press any key to continue.");
        System.in.read();
        boolean addTrip = c.addTrip("1", "land");
        if (addTrip)
            System.out.println("Trip 1 added. Press any key to continue.");
        else System.out.println("An error occured. Press any key to continue.");
        System.in.read();
        boolean deleteTrip = c.deleteTrip("1");
        if (deleteTrip)
            System.out.println("Trip 1 deleted. Press any key to continue.");
        else System.out.println("An error occured. Press any key to continue.");
            System.out.println("End of demo.");
        System.in.read();
        }
        catch (Exception e) {
            System.out.println("Error messsage: "+ e.getMessage());
            try {
                System.in.read();
            } catch (IOException ex) {
                Logger.getLogger(BackendAdminFerry.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
