class Box
{
    double width, height, depth;
    Box(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }
    Box()
    {
        width = height = depth = 0;
    }
    Box(double len)
    {
        width = height = depth = len;
    }
    double volume()
    {
        return width * height * depth;
    }
}
class Test
{
    public static void main(String args[])
    {
        Box box1 = new Box(1, 25, 12);
        Box box2 = new Box();
        Box cube = new Box(5);
        double vol;
        vol = box1.volume();
        System.out.println(" Volume of box1 is " + vol);
        vol = box2.volume();
        System.out.println(" Volume of box2 is " + vol);
        vol = cube.volume();
        System.out.println(" Volume of cube is " + vol);
    }
}