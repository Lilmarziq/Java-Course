// Superclass for Engine
abstract class Engine {
    public abstract String getType();
}

// Subclass for Combustion Engine
class CombustionEngine extends Engine {
    @Override
    public String getType() {
        return "Combustion Engine";
    }
}

// Subclass for Electric Engine
class ElectricEngine extends Engine {
    @Override
    public String getType() {
        return "Electric Engine";
    }
}

// Subclass for Hybrid Engine
class HybridEngine extends Engine {
    @Override
    public String getType() {
        return "Hybrid Engine";
    }
}

// Class for Manufacture
class Manufacture {
    private String name;
    private String country;

    // Setters and Getters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}

// Superclass for Vehicle
abstract class Vehicle {
    private Manufacture manufacture;
    private Engine engine;

    public Vehicle(Manufacture manufacture, Engine engine) {
        this.manufacture = manufacture;
        this.engine = engine;
    }

    public Manufacture getManufacture() {
        return manufacture;
    }

    public Engine getEngine() {
        return engine;
    }

    // Abstract method to show characteristics
    public abstract void showCharacteristics();
}

// Subclass for ICEV (Internal Combustion Engine Vehicle)
class ICEV extends Vehicle {
    public ICEV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    @Override
    public void showCharacteristics() {
        System.out.println("ICEV Characteristics:");
        System.out.println("Manufacturer: " + getManufacture().getName());
        System.out.println("Country: " + getManufacture().getCountry());
        System.out.println("Engine Type: " + getEngine().getType());
    }
}

// Subclass for BEV (Battery Electric Vehicle)
class BEV extends Vehicle {
    public BEV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    @Override
    public void showCharacteristics() {
        System.out.println("BEV Characteristics:");
        System.out.println("Manufacturer: " + getManufacture().getName());
        System.out.println("Country: " + getManufacture().getCountry());
        System.out.println("Engine Type: " + getEngine().getType());
    }
}

// Subclass for Hybrid Vehicle
class HybridV extends Vehicle {
    public HybridV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    @Override
    public void showCharacteristics() {
        System.out.println("Hybrid Vehicle Characteristics:");
        System.out.println("Manufacturer: " + getManufacture().getName());
        System.out.println("Country: " + getManufacture().getCountry());
        System.out.println("Engine Type: " + getEngine().getType());
    }
}

// Main class to demonstrate the functionality
public class problem_1 {
    public static void main(String[] args) {
        // Create manufacturers
        Manufacture toyota = new Manufacture();
        toyota.setName("Toyota");
        toyota.setCountry("Japan");

        Manufacture tesla = new Manufacture();
        tesla.setName("Tesla");
        tesla.setCountry("USA");

        Manufacture ford = new Manufacture();
        ford.setName("Ford");
        ford.setCountry("USA");

        // Create engines
        Engine combustionEngine = new CombustionEngine();
        Engine electricEngine = new ElectricEngine();
        Engine hybridEngine = new HybridEngine();

        // Create vehicles
        Vehicle[] vehicles = new Vehicle[]{
            new ICEV(toyota, combustionEngine),
            new BEV(tesla, electricEngine),
            new HybridV(ford, hybridEngine)
        };

        // Show characteristics of each vehicle
        for (Vehicle vehicle : vehicles) {
            vehicle.showCharacteristics();
            System.out.println();
        }
    }
}
