public class Area {
    public static void main(String[] args) throws Exception {
        double bottom = 10.0;
        double height = 5.0;
        double radius = 5.0;
        
        double triangleArea = calcTriangleArea(bottom,height);

        System.out.println("底辺" + bottom 
        + "cm, 高さ" + height
        + "cmの三角形の面積は" + triangleArea + "cm2");

        double circleArea = calcCircleArea(radius);

        System.out.println("半径 " + radius + "cmの円の面積は "
        + circleArea + "cm2です。");
    }

    public static double calcTriangleArea(double bottom, double height) {
        return(bottom * height / 2);
    }    
    
    public static double calcCircleArea(double radius) {
        return(radius * radius * 3.14);
    }
}