import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
class Reader
{
    File file;
    FileReader reader;
    List<Picture> data;
    public Reader(String filename) throws IOException
    {    
        this.file = new File(filename);
        this.reader = new FileReader(file);
    }
    public List<Picture> read() throws IOException
    {
        int len = this.reader.read();
        this.data = new ArrayList<Picture>(len);
        for(int i = 0;i < len;i++)
        {
            System.out.println("Not yet there");    
        }
        return this.data;
    }
}