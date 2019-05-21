/*
 * Modify this to manipulate the World.
 */
public class Initializer
{
    public static void initializeWorld()
    {
        kareltherobot.World.setSize(12, 12);
        kareltherobot.World.setDelay(50);
        //kareltherobot.World.readWorld("folder", "worldfile");
        //kareltherobot.World.showSpeedControl(true);
        // See the JavaDocs for class World
        //     for more options
        builder = new kareltherobot.WorldBuilder(true); 

        kareltherobot.World.setVisible(true);
    }

    static kareltherobot.WorldBuilder builder = null;
}
