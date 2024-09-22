class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void print() {
        System.out.println(this);
    }
}

class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line from " + start + " to " + end;
    }

    public void print() {
        System.out.println(this);
    }
}


class ColorLine extends Line {
    private String color;

    public ColorLine(Point start, Point end, String color) {
        super(start, end);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", Color: " + color;
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
public class pr2_lesson6 {
    public static void main(String[] args) {
        Line[] lines = new Line[4];

        lines[0] = new Line(new Point(0, 0), new Point(10, 7));
        lines[1] = new Line(new Point(5, -1), new Point(3, 5));
        lines[2] = new ColorLine(new Point(40, 4), new Point(52, 5), "Purple");
        lines[3] = new ColorLine(new Point(-45, 6), new Point(32, 7), "Cyan");

        for (Line line : lines) {
            line.print();
        }
    }
}
