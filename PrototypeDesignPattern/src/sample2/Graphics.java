package sample2;

public abstract class Graphics {

    private int height;

    public Graphics(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String toString() {
        return "Graphics{" +
                "height=" + height +
                '}';
    }

    public abstract Graphics clone();

}
