package myjava.libcollection;
/*A.========================================================================
---------------------- START OF IMPLIMENTATION FILE
==========================================================================*/

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import myjava.myCollectionTest.IDData;

public class ControlHashMap {
    public ControlHashMap(ArrayList<IDData> dataArray, String outFile) {
        try {
            BufferedWriter fp_out = new BufferedWriter(new FileWriter(outFile + "_o_" +"HashMap"));
            fp_out.write("============== HashMap ============ \n");
            fp_out.write("[       ]grade: name \n");
            // collA:생성
            HashMap<Integer, IDData> mapA = new HashMap<Integer, IDData>();

            // collA:채우기
            for (int i = 0; i < dataArray.size(); i++)
                mapA.put(((IDData)dataArray.get(i)).myID, (IDData)dataArray.get(i));

            // collA:coll구하기: map은 collection interface를 안 가지고 있다.
            Collection<IDData> collA = mapA.values();
            // collA:itr구하기
            Iterator<IDData> itrA = collA.iterator();

            // collB:생성
            HashMap<Integer, IDData> mapB = new HashMap<Integer, IDData>();
            // collB에 dummy를 채운다.
            // mapB.put(1, dataArray.get(1));

            // collB:coll구하기: map은 collection interface를 안 가지고 있다.
            Collection<IDData> collB = mapB.values();

            // collB:채우기, 80점 이상만
            IDData dataA, dataB;
            while (itrA.hasNext()) {
                dataA = itrA.next();
                if (dataA.myData.myGrade >= 80) mapB.put(dataA.myData.myGrade, dataA);
                fp_out.write("[pushB  ]" + dataA.myData.myGrade + ":" + dataA.myData.myName);
                if (collB.contains(dataA)) 
                    fp_out.write("     in B \n");
                else 
                    fp_out.write(" not in B \n");
            }
            //get 함수 추가바람.
            

            // collA,collB: compare
            if (collA.containsAll(collB)) {
                fp_out.write("[compare]IDData" + "A contains B \n");
                if (collA.equals(collB)==false)
                    fp_out.write("[compare]collection" + " is not same to B \n");
                fp_out.write("[compare]Hashcode" + collA.hashCode() + " : " + collB.hashCode() +"\n");
                
                //collA도 80정 이상만 남기기
                collA.retainAll(collB);
                if (collA.equals(collB)==true)
                    fp_out.write("[compare] collection" + " is same to B \n");
                fp_out.write("[compare]Hashcode" + collA.hashCode() + " : " + collB.hashCode() +"\n");
                

            }
            

            // collB:itr구하기, collB에 data가 있을때만 획득가능
            Iterator<IDData> itrB = collB.iterator();
            // collB:remove
            while (itrB.hasNext()) {
                dataB = itrB.next();
                fp_out.write("[removeB]" + dataB.myData.myGrade + ":" + dataB.myData.myName );
                itrB.remove();
                if (collB.contains(dataB) == false)
                    fp_out.write(" not in B \n");
            }
            if (collB.isEmpty())
                fp_out.write("[removeB]" + "B is now empty \n");
            collA.clear();
            if (collA.isEmpty())
                fp_out.write("[removeA]" + "A is now empty \n");

            fp_out.close();
        } catch (FileNotFoundException filenotfoundexxption) {
            System.out.println("[error] file open");
        } catch (IOException ioexception) {
            ioexception.printStackTrace();
        }
    }
}
