class Vector2D {
    private static int counter = 0;
    private double x;
    private double y;

    public Vector2D() {
        this(2, 5);
    }
    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
        counter++;
    }
    public static int getCounter() {
        return counter;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return "X = " + x + " and Y = " + y;
    }

    public boolean equals(Vector2D other) {
        return this.x == other.getX() && this.y == other.getY();
    }

    public double norm() {
        return Math.sqrt(x * x + y * y);
    }
}

class Vector3D extends Vector2D {
    private double z;

    public Vector3D() {
        this(2, 5, 1);
    }
    public Vector3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }
    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }
    public String toString() {
        return super.toString() + " and Z = " + z;
    }
    public boolean equals(Vector3D other) {
        return super.equals(other) && this.z == other.getZ();
    }
    public double norm() {
        return Math.sqrt(getX() * getX() + getY() * getY() + z * z);
    }
}
class VectorOperations {
    public static void main(String[] args) {
        // Creating objects of Vector2D and Vector3D classes
        Vector2D v1 = new Vector2D();
        Vector2D v2 = new Vector2D(-1, 0);
        Vector3D v3 = new Vector3D();
        Vector3D v4 = new Vector3D(1.5, 2, -2);

        // Displaying coordinates of the vectors
        System.out.println("Coordinates:");
        System.out.println("Vector 2D 1: " + v1.toString());
        System.out.println("Vector 2D 2: " + v2.toString());
        System.out.println("Vector 3D 1: " + v3.toString());
        System.out.println("Vector 3D 2: " + v4.toString());

        // Testing for vectors with identical coordinates
        System.out.println("\nChecking for vectors with matching coordinates:");
        System.out.println("Vector 2D 1 and Vector 2D 2: " + v1.equals(v2));
        System.out.println("Vector 3D 1 and Vector 3D 2: " + v3.equals(v4));

        // Getting the norms of vectors
        System.out.println("\nNorms of vectors:");
        System.out.println("Norm of Vector 2D 1: " + v1.norm());
        System.out.println("Norm of Vector 3D 2: " + v2.norm());

        // Setting new values to vectors
        v1.setX(5);
        v1.setY(7);
        v4.setZ(4);

        // Displaying updated coordinates
        System.out.println("\nUpdated vectors:");
        System.out.println("Vector 2D 1: " + v1.toString());
        System.out.println("Vector 3D 2: " + v4.toString());

        // Displaying the total count of vectors created
        System.out.println("\nTotal count of vectors created: " + Vector2D.getCounter());
    }
}
