public class number {
    public static void main(String[] args) {
        //输出矩形图形及其属性
        Geometry FirstGeometry=new rectangle(12,20);
        FirstGeometry.draw();
        //输出圆形及其属性
        Geometry SecondGeometry=new circular(10);
        SecondGeometry.draw();
        //输出三角形机器属性
        Geometry ThirdGeometry=new triangle(10,20);
        ThirdGeometry.draw();
        //图形的成员变量都是private型，只能用get（）set（）方法进行访问与修改
        //访问矩形的周长
        System.out.println("矩形周长为："+FirstGeometry.getCircumference());
        //修改矩形的周长
        FirstGeometry.setCircumference(100);
        System.out.println("修改后的矩形周长为："+FirstGeometry.getCircumference());
    }
}


