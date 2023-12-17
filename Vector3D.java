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

    public String ToString() {
        return super.ToString() + " and Z = " + z;
    }

    public boolean Equals(Vector3D other) {
        return super.Equals(other) && this.z == other.getZ();
    }

    @Override
    public double Norm() {
        return Math.sqrt(getX() * getX() + getY() * getY() + z * z);
    }
}
