package airportsimulation;
import java.util.*;

public class AirportSimulation {

    public static void main(String[] args) {
        Queue<Integer> takeoffQueue = new LinkedList<>();
        Queue<Integer> landingQueue = new LinkedList<>();
        Boolean x = true;
        
        takeoffQueue.add(1);
        
        while(x)
        {
            Random rand = new Random();
            int randNum = rand.nextInt(100) + 1;
            
            //Adds a plane to the takeoff or landing queue or does nothing
            if(randNum >= 1 && randNum < 50 && takeoffQueue.size() != 10)
            {
                takeoffQueue.add(randNum);
                System.out.println("A plane is waiting to takeoff");
            }
            else if (randNum >= 50 && randNum < 100 && landingQueue.size() != 10)
            {
                landingQueue.add(randNum);
                System.out.println("A plane is ready to land");
            }
            else
                ;
            
            //Determines whether a plane can takeoff or land
            if(landingQueue.size() >= 1)
            {
                landingQueue.remove();
                System.out.println("A plane is landing");
            }
            else if(takeoffQueue.size() >= 1 && landingQueue.isEmpty())
            {
                takeoffQueue.remove();
                System.out.println("A plane is taking off");
            }
            
            if (takeoffQueue.isEmpty())
                x = false;
        }
    }
    
}
