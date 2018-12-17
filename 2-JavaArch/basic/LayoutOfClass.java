public class LayoutOfClass {
    int layoutSize;

    public LayoutOfClass(String name) {
        // This constructor has one parameter, name.
        System.out.println("Name chosen is :" + name );
    }

    public void setSize( int size ) {
        layoutSize = size;
    }

    public int getSize( ) {
        System.out.println("LayoutOfClass is :" + layoutSize );
        return layoutSize;
    }

    public static void main(String []args) {
      /* Object creation */
        LayoutOfClass myLayout = new LayoutOfClass( "tommy" );

      /* Call class method to set LayoutOfClass's layoutSize */
        myLayout.setSize( 2 );

      /* Call another class method to get LayoutOfClass's layoutSize */
        myLayout.getSize( );

      /* You can access instance variable as follows as well */
        System.out.println("Variable Value :" + myLayout.layoutSize );
    }
}