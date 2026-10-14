import java.util.Scanner;


class Box{
    double width;
    double height;
    double length;
    void readData()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length width and height: ");
        length = s.nextDouble();
        width = s.nextDouble();
        height = s.nextDouble();
    }
    void area()
    {
        System.out.println("Area of Rectangle box: " +(length*width));
    }
    void volume()
    {
        System.out.println("Volume of Rectangle box: " +(length*width*height));
    }
}
class RectangleDemo
{
    public static void main(String args[])
    {
        Box cuboid = new Box();
        cuboid.readData();
        cuboid.area();
        cuboid.volume();
    }
}
