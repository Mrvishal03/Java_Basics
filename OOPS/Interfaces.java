package OOPS;

interface EE // Interface does not heve constructor and we are not able to crate object
             // Takes less meory.
             //Contains only undefine function.
{
  void fun();   //undefined function
                //interface only contain defined function using static and default keyword

                static void sun()
                {

                }

                default void sun2()
                {

                }

            
 
}
interface GG  {

}

public class Interfaces implements EE , GG {
 
    public void fun(){

    }
    
    public static void main(String[] args) {

        EE obj =new Interfaces(); 

        

    }
}
