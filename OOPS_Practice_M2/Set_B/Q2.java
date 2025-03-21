// Base class
class Spacecraft {
    String name;
    int launchYear;

    // Constructor
    public Spacecraft(String name, int launchYear) {
        this.name = name;
        this.launchYear = launchYear;
    }

    // Display method
    void display() {
        System.out.println("Spacecraft Name: " + name);
        System.out.println("Launch Year: " + launchYear);
    }
}

// Derived class (inherits from Spacecraft)
class MannedMission extends Spacecraft {
    int crewSize;

    // Constructor
    public MannedMission(String name, int launchYear, int crewSize) {
        super(name, launchYear);
        this.crewSize = crewSize;
    }

    // Override display method
    @Override
    void display() {
        super.display();
        System.out.println("Crew Size: " + crewSize);
    }
}

// Subclass (inherits from MannedMission)
class MoonMission extends MannedMission {
    int daysOnMoon;

    // Constructor
    public MoonMission(String name, int launchYear, int crewSize, int daysOnMoon) {
        super(name, launchYear, crewSize);
        this.daysOnMoon = daysOnMoon;
    }

    // Override display method
    @Override
    void display() {
        super.display();
        System.out.println("Days on Moon: " + daysOnMoon);
    }
}

// Main class
public class Q2 {
    public static void main(String[] args) {
        // Creating an object of MoonMission
        MoonMission mission = new MoonMission("Apollo 11", 1969, 3, 8);

        // Display details
        mission.display();
    }
}
