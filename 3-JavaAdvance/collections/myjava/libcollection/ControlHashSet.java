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
import java.util.HashSet;
import java.util.Iterator;

import myjava.myCollectionTest.Data;
import myjava.myCollectionTest.IDData;

public class ControlHashSet {
    public ControlHashSet(ArrayList<IDData> dataArray, String outFile) {
        try {
            BufferedWriter fp_out = new BufferedWriter(new FileWriter(outFile + "_o_" +"HashSet"));
            fp_out.write("============== HashSet ============ \n");
            fp_out.write("[       ]grade: name \n");
            // collA:생성
            HashSet<Data> setA = new HashSet<Data>();

            // collA:채우기
            for (int i = 0; i < dataArray.size(); i++)
                setA.add(dataArray.get(i).myData);

            // collA:coll구하기: map은 collection interface를 안 가지고 있다.
            Collection<Data> collA = setA;
            // collA:itr구하기
            Iterator<Data> itrA = collA.iterator();

            // collB:생성
            HashSet<Data> setB = new HashSet<Data>();
            // collB에 dummy를 채운다.
            // setB.put(1, dataArray.get(1));

            // collB:coll구하기: map은 collection interface를 안 가지고 있다.
            Collection<Data> collB = setB;

            // collB:채우기, 80점 이상만
            Data dataA, dataB;
            while (itrA.hasNext()) {
                dataA = itrA.next();
                if (dataA.myGrade >= 80) setB.add(dataA);
                fp_out.write("[pushB  ]" + dataA.myGrade + ":" + dataA.myName);
                if (collB.contains(dataA)) 
                    fp_out.write("     in B \n");
                else 
                    fp_out.write(" not in B \n");
            }

            // collA,collB: compare
            if (collA.containsAll(collB)) {
                fp_out.write("[compare]Data" + "A contains B \n");
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
            Iterator<Data> itrB = collB.iterator();
            // collB:remove
            while (itrB.hasNext()) {
                dataB = itrB.next();
                fp_out.write("[removeB]" + dataB.myGrade + ":" + dataB.myName );
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
