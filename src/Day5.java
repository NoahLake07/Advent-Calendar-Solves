import FFM.FileMaster;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Day5 extends FileMaster {

   public static File crateData = new File("res/CrateData.txt");

   public void doStacks(){
      // initialize the scanner for crates
      Scanner scr = null;
      try {
         scr = new Scanner(crateData);
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      }

      // initialize all stacks
      Stack[] stacks = new Stack[9];
      for (int i = 0; i < stacks.length-1; i++) {
         stacks[i] = new Stack();
      }

      // read the crates
      FileMaster.printList(FileMaster.fileToList(crateData.getPath()));

      // start performing functions

      }

   }


