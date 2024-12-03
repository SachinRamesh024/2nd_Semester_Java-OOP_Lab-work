class Base {
    Base(){
        System.out.println("i am a constructor of base class");
    }
   Base(int x){
       System.out.println("i am an overloaded constructor with value of x as: "+x);
   }
}
class Derived extends Base {
    Derived() {
        System.out.println("i am constructor of derived class ");
    }

    Derived(int x, int y) {
       super(x);
        System.out.println("I am on overloaded constructor with value of y as: " + y);
    }
}

    class ChildOfDerive extends Derived {
        ChildOfDerive() {
            System.out.println("i am child of derived class ");
        }
        ChildOfDerive(int x, int y, int z){
            super(x, y);
            System.out.println("I am on overloaded constructor of ChildOfDerive value of z as: "+z);
        }

}
    public class Constructor_in_inheritance {


        public static void main(String[] args) {


            ChildOfDerive cd = new ChildOfDerive();
        }

    }

