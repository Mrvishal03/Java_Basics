package OOPS;

// Constructor: It is a function whose name is same as the name of the class name.Use to initilize the object.
// It does not have any return type. Not even void.They area called automatically whenever crate an object.
// Can be public or private or default.
//Types of Constructor: 1)Default. 2)Paramaterized Constructor
//Same name many form;

public class Constructor {

    Constructor(float y) { // Default
        System.out.println("Hello");
    }

    Constructor(int x) {   //Parametrerized
        System.out.println("Hii " + x);
    }


    public static void main(String[] args) {

        Constructor obj = new Constructor(90.6f);

        

    }

}
