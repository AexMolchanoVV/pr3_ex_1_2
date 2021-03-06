package abc;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape(){
        color = "non";
        filled = false;
    };
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void isFilled(String color){

    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    abstract double getArea();
    abstract double getPerimeter();
    public abstract String toString();
}
