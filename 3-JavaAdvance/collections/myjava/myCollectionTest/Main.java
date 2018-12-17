/* 
* A.========================================================================= 
* ---------------------- START OF IMPLIMENTATION FILE 
 
* ===========================================================================
*/

package myjava.myCollectionTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import myjava.libcollection.ControlArrayList;
import myjava.libcollection.ControlHashMap;
import myjava.libcollection.ControlHashSet;


/*G.=========================================================================
---------------------- LOCAL FUNCTION DEFINITIONS FROM HERE
============================================================================*/

public class Main {
 
    private static final int NUMBER_OF_INPUTLINE = 10;
    private static final int WIDTH_OF_LINELENGTH = 100;

 
    public static void main(String[] args) {// only void return possible

         StringBuilder inputFile = new StringBuilder(args[0]);
        if (args.length != 1) {
            System.out.println("[Warning] plz input file name, or ArrayIndexOutOfBoundsException will occur");
            inputFile.append("data.in");
            //System.exit(1);// return 1
            //should define this
            //Run Configuration: $PROJECT_DIR$
            //Run Arguments: data.in
        }
        System.out.println("[Status] input file is: " + inputFile.toString());

    /* StringBuilder takes the args
        for(int i= 0; i<= args.length-1; i++){
            StringBuilder input = new StringBuilder();
            input.append(args[i]);
            System.out.println(args[i]);
        }
    */


        try 
        {
            BufferedReader fp_in  = new BufferedReader(new FileReader(inputFile.toString()));
            
            Scanner fileIn = new Scanner(fp_in);

            IDData dataArrayTemp;
            ArrayList<IDData> dataArray= new ArrayList<IDData>(NUMBER_OF_INPUTLINE);

            while (fileIn.hasNext()) { // 파일의 마지막인지 검사 필요
                dataArrayTemp = new IDData(); 
                dataArrayTemp.myID=fileIn.nextInt();
                dataArrayTemp.myData.myGrade=fileIn.nextInt();
                dataArrayTemp.myData.myName=fileIn.next();
                dataArray.add(dataArrayTemp);
                
                System.out.println(dataArrayTemp.myID+":"
                +dataArrayTemp.myData.myGrade+":"+dataArrayTemp.myData.myName);
            }

            // ------------------- 화면출력
            System.out.println("which collection do you want to see ? :");
            System.out.println(
                            "11:HashMap\n"+
                            "21:Set\n"+
                            "31:List\n"+
                            "4:Queue\n"+
                            "5:Stack"
            );
            
            Scanner input = new Scanner(System.in);
            int reply = input.nextInt();


            // test 객체 선택
            switch(reply){
            case 11:
                ControlHashMap goMyMap = new ControlHashMap(dataArray, args[0]);
                break;
            case 21:
                ControlHashSet goMySet = new ControlHashSet(dataArray, args[0]);
                break;
            case 31:
                ControlArrayList goMyList = new ControlArrayList(dataArray, args[0]);
                break;
            default:
                System.out.println("Let's go to collection");
            }
          
            // system("pause");
            input.nextLine(); // new Scanner(System.in).nextLine();

            fp_in.close();


        } catch (FileNotFoundException filenotfoundexxption) {
            System.out.println("[error] file open");
        } catch (IOException ioexception) {
            ioexception.printStackTrace();
        }

        System.exit(0);// return
    }
}
