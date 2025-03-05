public class q6 {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(5);
        sphere.calculateVolume();
        sphere.calculateSurfaceArea();

        Cube cube = new Cube(4);
        cube.calculateVolume();
        cube.calculateSurfaceArea();
    }
}

abstract class Shape3D {
    abstract void calculateVolume();
    abstract void calculateSurfaceArea();
}

class Sphere extends Shape3D {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    void calculateVolume() {
        double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume of Sphere: " + volume);
    }

    void calculateSurfaceArea() {
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        System.out.println("Surface Area of Sphere: " + surfaceArea);
    }
}

class Cube extends Shape3D {
    double side;

    Cube(double side) {
        this.side = side;
    }

    void calculateVolume() {
        double volume = Math.pow(side, 3);
        System.out.println("Volume of Cube: " + volume);
    }

    void calculateSurfaceArea() {
        double surfaceArea = 6 * Math.pow(side, 2);
        System.out.println("Surface Area of Cube: " + surfaceArea);
    }
}