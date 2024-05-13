package OOPS;

class PP {

     PP(){
        System.out.println("PP");
     }
}

                            
class WW extends PP {

         WW(){
            System.out.println("WW");
         }    
}

public class ConstructorChaining extends WW {
    
    public ConstructorChaining() {
    
        System.out.println("Child ");
    }

    public static void main(String[] args) {

        ConstructorChaining obj = new ConstructorChaining();


    }

  
}
