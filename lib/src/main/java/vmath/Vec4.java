package vmath;

public class Vec4 {
    private final float x, y, z, w;

    public Vec4() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public Vec4(float x, float y, float z, float w) {
        if (Float.isNaN(x) || Float.isNaN(y) || Float.isNaN(z) || Float.isNaN(w)) {
            throw new ArithmeticException();
        }

        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public float x() {
        return x;
    }

    public float y() {
        return y;
    }

    public float z() {
        return z;
    }

    public float w() {
        return w;
    }

    public float mag() {
        return (float) Math.sqrt(x*x + y*y + z*z + w*w);
    }

    public Vec4 norm() {
        return null; // TODO
    }

    public Vec4 add(Vec4 other) {
        return null; // TODO
    }

    public Vec4 sub(Vec4 other) {
        return null; // TODO
    }

    public Vec4 mul(float scalar) {
        return null; // TODO
    }

    public float dot(Vec4 other) {
        return 0.0f; // TODO
    }

    public String toString() {
        return ""; // TODO
    }
}