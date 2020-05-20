
public abstract class Geometry{
    int Square;
    int Circumference;
    public abstract void draw();
    public Geometry(){}
    public Geometry(int Square,int Circumference)
    {
        this.Circumference=Circumference;
        this.Square=Square;
    }
    public void setSquare(int square) {
        Square = square;
    }

    public void setCircumference(int circumference) {
        Circumference = circumference;
    }

    public int getSquare() {
        return Square;
    }

    public int getCircumference() {
        return Circumference;
    }
}
class rectangle extends  Geometry{
    public rectangle(int Square,int Circumference){
        super(Square,Circumference);
    }
    public void draw(){
        System.out.println("画出矩形，面积为："+getSquare()+"周长为 ："+getCircumference());
    }
}
class circular extends  Geometry{
    private int radius;
    public circular(int radius){
        this.radius=radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw(){
        System.out.println("画出园形，半径为："+getRadius()+"面积为："+getRadius()*2*Math.PI+"周长为 ："+getRadius()*getRadius()*Math.PI);
    }
}
class triangle extends Geometry{
    public triangle(int Square,int Circumference){
        super(Square,Circumference);
    }
    public void draw(){
        System.out.println("画出三角形，面积为："+getSquare()+"周长为 ："+getCircumference());
    }
}