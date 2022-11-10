/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package vmath;

public class Vec2 {
    private float x, y;

    public Vec2() {
        this(0.0f, 0.0f);
    }

    public Vec2(float x, float y) {
        if (Float.isNaN(x)) throw new ArithmeticException();
        else if (Float.isNaN(y)) throw new ArithmeticException();
        this.x = x;
        this.y = y;
    }

    public float x() {
        return x;
    }

    public float y() {
        return y;
    }

    public float mag() {
        return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public Vec2 norm() {
        if(x != 0) x = 1;
        if(y != 0) y = 1;

        if(x == 0 && y == 0) throw new ArithmeticException();
        else return new Vec2(x, y);
    }

    public Vec2 add(Vec2 other) {
        x += other.x;
        y += other.y;
        return new Vec2(x, y);
    }

    public Vec2 sub(Vec2 other) {
        x -= other.x;
        y -= other.y;
        return new Vec2(x, y);
    }

    public Vec2 mul(float scalar) {
        x *= scalar;
        y *= scalar;
        return new Vec2(x, y);
    }

    public float dot(Vec2 other){
        return 0.0f;
    }

    @Override
    public String toString() {
        return "";
    }
}