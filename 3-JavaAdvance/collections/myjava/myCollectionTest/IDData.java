/*A.========================================================================
---------------------- START OF IMPLIMENTATION FILE
==========================================================================*/
package myjava.myCollectionTest;

import java.util.Map;


/*============================================================================*/

public class IDData implements Map.Entry {

    public int myID;
    public Data myData;
    public IDData(){
        myData=new Data();
    }

    //public int myID;
    /* (non-Javadoc)
     * @see java.util.Map.Entry#getKey()
     */
    @Override
    public Object getKey() {
        // TODO Auto-generated method stub
        return myID;
    }
    /* (non-Javadoc)
     * @see java.util.Map.Entry#getValue()
     */
    @Override
    public Object getValue() {
        // TODO Auto-generated method stub
        return myData;
    }
    /* (non-Javadoc)
     * @see java.util.Map.Entry#setValue(java.lang.Object)
     */
    @Override
    public Object setValue(Object value) {
        // TODO Auto-generated method stub
        myData=(Data)value;
        return (Object)myData;
    }
    
}

