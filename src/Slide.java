import java.util.Arrays;
import java.util.HashSet;

public class Slide {
    int len;
    String[] tags;
    int[] indexes = new int[2];

    public Slide(Picture H) {
        this.indexes[0] = H.index;
        this.indexes[1] = -1;
        this.len=H.len;
        Arrays.sort(H.tags);
        this.tags=H.tags;
    }

    public Slide(Picture V1, Picture V2) {
        this.indexes[0] = V1.index;
        this.indexes[1] = V2.index;
        HashSet<String> hash=new HashSet<String>();
        for(String i: V1.tags){
            hash.add(i);
        }
        for(String i: V2.tags){
            hash.add(i);
        }
        this.tags=(String[])hash.toArray();
        this.len=this.tags.length;
    }

}
