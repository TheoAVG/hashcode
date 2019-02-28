import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;
class Reader
{
    File file;
    FileReader reader;
    Scanner scan;
    List<Picture> data;
    int len;
    public Reader(String filename) throws IOException
    {    
        //this.file = new File(filename);
        this.reader = new FileReader(filename);
        this.scan = new Scanner(reader);
        this.len = 0;
    }
    public List<Picture> read() throws IOException
    {
        this.len = this.scan.nextInt();
        System.out.println(this.len);
        this.data = new ArrayList<Picture>(len);
        for(int i = 0;i < len;i++)
        {
            String read = this.scan.nextLine();
            Picture picture = new Picture(read);
            this.data.add(picture);
        }
        return this.data;
    }
    public int size()
    {
        return this.len;
    }
}