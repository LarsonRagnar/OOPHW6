package tree;

public class Cube implements iShape, iVolume{
    private int edge;
    public Cube(int edge) {
    this.edge = edge;
}
@Override
    public double area() {
        return 6 * edge * edge;
    }
@Override
public double volume() {
    return edge * edge * edge;
}

}
