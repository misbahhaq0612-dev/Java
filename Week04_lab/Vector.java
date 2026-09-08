public class Vector {
    private double dx;
    private double dy;

    public Vector(Line line) {
        // a vector is the CHANGE from start to end
        this.dx = line.getX2() - line.getX1();
        this.dy = line.getY2() - line.getY1();
    }

    public double magnitude() {
        // this is just the distance formula 
        return Math.sqrt(this.dx * this.dx + this.dy * this.dy);
    }

    public double dotProduct(Vector obj) {
        // multiply matching components and adding them up tells us how much
        // two vectors point in the same direction 
        return this.dx * obj.dx + this.dy * obj.dy;
    }

    public double projectionOnto(Vector obj) {
        // "obj" is the length of the shadow that "this" vector casts on it
        return this.dotProduct(obj) / obj.magnitude();
    }

    public double angleWith(Vector obj) {
    // rearranging the dot product formula (a·b = |a||b|cos(theta)) to solve for theta
        double cosTheta = this.dotProduct(obj) / (this.magnitude() * obj.magnitude());
        return Math.toDegrees(Math.acos(cosTheta));
    }
}