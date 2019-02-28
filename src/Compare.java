import java.util.HashSet;

import static java.lang.Math.min;

public class Compare {

    public int compare(String[] a, String[] b) {
        int side_a = 0;
        int common = 0;
        int side_b = 0;
        HashSet<String> hash = new HashSet<String>();
        for(String tag : a) {
            hash.add(tag);
        }
        for(String tag : b) {
            if(hash.contains(tag))
                common++;
            else
                side_b++;
        }
        hash.clear();
        for(String tag : b) {
            hash.add(tag);
        }
        for(String tag : a) {
            if(!hash.contains(tag))
                side_a++;
        }
        return Math.min(Math.min(side_a, side_b), common);
    }
}