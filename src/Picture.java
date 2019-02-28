import java.util.Arrays;
public class Picture
{
    String type;
    int len;
    String[] tags;
    public Picture(String data)
    {
        //System.out.println("HERE");
        String[] p = data.split(" ");
        this.type = p[0];
        //this.len = Integer.parseInt(p[1]);
        //System.out.println(p.length);
        //this.tags = Arrays.copyOfRange(p,2,p.length);
    }
}