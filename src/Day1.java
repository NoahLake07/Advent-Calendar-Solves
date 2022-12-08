import FFM.FileMaster;

import java.io.File;
import java.util.ArrayList;

public class Day1 extends FileMaster {

    public void start(){
        ArrayList<String> scannedData = fileToList("res/ElfCaloriesData");
        ArrayList<Integer> summedData = new ArrayList<>();


        }


    private int greatestValue(ArrayList<Integer> data){
        int winning = -1;
        for (int i = 0; i < data.size(); i++) {
            if(data.get(i) > winning){
                winning = i;
            }
        }
        System.out.println("WINNING INDEX IS " + winning);
        return winning;
    }

}
