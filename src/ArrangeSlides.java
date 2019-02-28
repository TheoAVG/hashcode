import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrangeSlides {
    ArrayList<Slide> slides = new ArrayList<Slide>();
    ArrayList<Slide> newArrangement = new ArrayList<Slide>();
    int min = 0;
    int goodI;
    int goodJ;
    String ourSOLUTION;

    public ArrangeSlides(ArrayList<Slide> slides) {
        this.slides = slides;
    }

    public void compSlides() {
        int cmp;
        min = 0;
        goodI = -1;
        goodJ = -1;
        while(slides.size() > 0) {
            if (newArrangement.size() == 0) {
                for (int i = 0; i < this.slides.size(); i++) {
                    for (int j = 0; j < this.slides.size(); j++) {
                        if (i != j) {
                            cmp = Compare.compare(this.slides.get(i).tags, this.slides.get(j).tags);
                            if (cmp > min) {
                                cmp = min;
                                goodI = i;
                                goodJ = j;
                            }
                        }
                    }
                }
                newArrangement.add(slides.get(goodI));
                slides.remove(goodI);
                goodI = 0;
            } else {
                min = 0;
                for (int j = 0; j < this.slides.size(); j++) {
                    cmp = Compare.compare(this.newArrangement.get(goodI).tags, this.slides.get(j).tags);
                    if (cmp > min) {
                        cmp = min;
                        goodJ = j;
                    }
                }
                newArrangement.add(slides.get(goodJ));
                slides.remove(goodJ);
                goodI++;
            }
        }
    }

    public void writeToFile() throws IOException {
        final String FILENAME = "submission.txt";
        FileWriter file = new FileWriter(FILENAME);
        BufferedWriter buf = new BufferedWriter(file);
        ourSOLUTION = new String();
        ourSOLUTION += newArrangement.size();
        ourSOLUTION += "\n";
        for(int i=0; i<newArrangement.size(); i++)
        {
            if(newArrangement.get(i).indexes[1] == -1) {
                ourSOLUTION += newArrangement.get(i).indexes[0];
                ourSOLUTION += "\n";
            } else if(newArrangement.get(i).indexes[1] != -1) {
                ourSOLUTION += newArrangement.get(i).indexes[0];
                ourSOLUTION += " ";
                ourSOLUTION += newArrangement.get(i).indexes[1];
                ourSOLUTION += "\n";
            }
        }
        buf.write(ourSOLUTION);
        buf.close();
        file.close();
    }
}
