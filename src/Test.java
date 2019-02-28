import java.util.List;
import java.io.IOException;
class Test
{
    public static void main(String[] args) throws IOException
    {
        Reader reader = new Reader("/home/theoavg/Desktop/Programming/hashcode/src/landscapes.txt");
        List<Picture> pics = reader.read();
        int i = 0;
        for(Picture pic : pics)
        {
            i++;
        }
        System.out.println("Num counted:"+i);
    }
}