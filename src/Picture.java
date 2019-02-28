import java.util.Arrays;
public class Picture
{
    public int index;
    String type;
    int len;
    String[] tags;
    public Picture(String data,int index)
    {
        this.index = index;
        String[] p = data.split(" ");
        this.type = p[0];
        this.len = Integer.parseInt(p[1]);
        this.tags = Arrays.copyOfRange(p,2,p.length);
    }
}