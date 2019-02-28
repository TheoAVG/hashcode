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
    public Reader(String filename) throws IOException
    {    
        this.file = new File(filename);
        this.reader = new FileReader(file);
        this.scan = new Scanner(reader);
    }
    public List<Picture> read() throws IOException
    {
        int len = this.scan.nextInt();
        this.data = new ArrayList<Picture>(len);
        for(int i = 0;i < len;i++)
        {
            Picture picture = new Picture(this.scan.nextLine());
            this.data.add(picture);
        }
        return this.data;
    }
}