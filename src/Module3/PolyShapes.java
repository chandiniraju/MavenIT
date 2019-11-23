package Module3;

public class PolyShapes {

    public  void rectangle(int l,int b)
    {
        int area =l*b;
        System.out.println(area);
    }

    public void rectangle(int l,float b)
    {
        float area=l*b;
        System.out.println(area);
    }

    public static void main(String[] args) {

        PolyShapes ps=new PolyShapes();
        ps.rectangle(20,30);
        ps.rectangle(20,30.5f);

    }

}
