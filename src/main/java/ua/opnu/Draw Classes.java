package ua.opnu.draw;

public abstract class Figure {
    protected int x, y, width, height;

    public Figure(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public abstract String draw();
}

class Ellipse extends Figure {
    public Ellipse(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public String draw() {
        return "Малюю Еліпс в координатах (" + x + "," + y + ") розміром " + width + "x" + height;
    }
}