import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class Presentation {
    ArrayList<Slide> arr = new ArrayList<Slide>();
    ArrayList<Picture> V = new ArrayList<Picture>();

    public Presentation(List<Picture> pictures) {
        for (Picture x : pictures) {
            if(x.type.equals("H")){
                arr.add(new Slide(x));
            }
            else{
                V.add(x);
            }


            HashSet<String> hash=new HashSet<String>();
            while(V.size()>2){
                int size=0,saveI=0,saveJ=0;
                for(int i=0; i<V.size()-1; i++){
                    for(int j=i+1; j<V.size(); j++){
                        for(String p: V.get(i).tags)
                        {
                            hash.add(p);
                        }
                        for(String k: V.get(i).tags)
                        {
                            hash.add(k);
                        }
                        if(hash.size()>size){
                            saveI=i;
                            saveJ=j;
                            size=hash.size();
                        }

                    }
                }
                arr.add(new Slide(V.get(saveI),V.get(saveJ)));
                V.remove(saveI);
                if(saveI < saveJ)
                    saveJ--;
                V.remove(saveJ);
            }

        }

    }
}
