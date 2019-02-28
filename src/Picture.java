public class Picture
{
    char type;
    int len;
    String[] tags;
    public Picture(String data)
    {
        String[] p = data.split(" ");
        this.type = p[0].charAt(0);
        this.len = Integer.parseInt(p[1]);
        this.tags = p[2];
    }
}