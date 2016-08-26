package shapes

public interface Shape{
    public void moveTo(int x, int y);
    public void reDraw();
    public void update();
    public void scale( int dx, int dy);
    public void delete();
}

