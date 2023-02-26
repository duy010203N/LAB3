package Bai4;
public class Vector {
    private double x; private double y; private double z;

public Vector(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
}

public Vector add(Vector other) {
    return new Vector(this.x + other.x, this.y + other.y, this.z + other.z);
}

public Vector subtract(Vector other) {
    return new Vector(this.x - other.x, this.y - other.y, this.z - other.z);
}

public Vector multiply(double scalar) {
    return new Vector(this.x * scalar, this.y * scalar, this.z * scalar);
}

public double dotProduct(Vector other) {
    return this.x * other.x + this.y * other.y + this.z * other.z;
}
}
