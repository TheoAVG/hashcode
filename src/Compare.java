import java.util.HashSet;

public class Compare {

    public int compare(String[] a, String[] b) {
        int side_a = 0;
        int common = 0;
        int size_b = 0;
        HashSet<String> hash = new HashSet<String>();
        for(String tag : a) {
            hash.add(tag);
        }
        for(String tag : b) {
            if(hash.find(tag))
                common++;
            size_b++;
        }
        return 5;
    }
}