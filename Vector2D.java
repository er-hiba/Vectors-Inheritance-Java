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
