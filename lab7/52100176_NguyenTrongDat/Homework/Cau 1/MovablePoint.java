public class MovablePoint implements Movable {
    int x, y;
    int xSpeed, ySpeed;

    public MovablePoint() {
        x = 0;
        y = 0;
        xSpeed = 0;
        ySpeed = 0;
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint [x=" + this.x + ", y=" + this.y + ", xSpeed=" + this.xSpeed + ", ySpeed=" + this.ySpeed
                + "]";
    }

    @Override
    public void moveUp() {
        this.y += this.ySpeed;
    }

    @Override
    public void moveDown() {
        this.y -= this.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x -= this.xSpeed;
    }

    @Override
    public void moveRight() {
        this.x += this.xSpeed;
    }
}
