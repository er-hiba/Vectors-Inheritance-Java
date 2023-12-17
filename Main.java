public class Main {
    public static void main(String[] args) {
        // Creating objects of Vector2D and Vector3D classes
        Vector2D v1 = new Vector2D();
        Vector2D v2 = new Vector2D(-1, 0);
        Vector3D v3 = new Vector3D();
        Vector3D v4 = new Vector3D(1.5, 2, -2);

        // Displaying coordinates of the vectors
        System.out.println("Coordinates:");
        System.out.println("Vector 2D 1: " + v1.ToString());
        System.out.println("Vector 2D 2: " + v2.ToString());
        System.out.println("Vector 3D 1: " + v3.ToString());
        System.out.println("Vector 3D 2: " + v4.ToString());

        // Testing for vectors with identical coordinates
        System.out.println("\nChecking for vectors with matching coordinates:");
        System.out.println("Vector 2D 1 and Vector 2D 2: " + v1.Equals(v2));
        System.out.println("Vector 3D 1 and Vector 3D 2: " + v3.Equals(v4));

        // Getting the norms of vectors
        System.out.println("\nNorms of vectors:");
        System.out.println("Norm of Vector 2D 1: " + v1.Norm());
        System.out.println("Norm of Vector 3D 2: " + v2.Norm());

        // Setting new values to vectors
        v1.setX(5);
        v1.setY(7);
        v4.setZ(4);

        // Displaying updated coordinates
        System.out.println("\nUpdated vectors:");
        System.out.println("Vector 2D 1: " + v1.ToString());
        System.out.println("Vector 3D 2: " + v4.ToString());

        // Displaying the total count of vectors created
        System.out.println("\nTotal count of vectors created: " + Vector2D.getCounter());
    }
}
