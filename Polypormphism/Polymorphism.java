// 								Polymorphism --> One thing have many forms
/* dummy values of computer is avoided when we create the constructor and initialize some values by our own */
/*			Polymorphism Types--> Compiletime (Method Overloading)  , Runtime (Method Overriding).
Method Overloading -> Independent of method signature & return type Note: Can be followed on Constructor (No Inheritance)
Method Overriding  --> Depends on method signature and return type  Note: Can't be followed on Constructor (Inheriance).

Note: (Constructors can't be overrided because in overriding we use inheritance and  there will be no same constructor
	   in parent child created i.e constructor is created by class names )*/

class CompileTimePolymorphism{
    int a=10, b=20;

    public void add() {
        System.out.println(a+b+" (f1: no argument)");
    }
    public void add(int a) {
        System.out.println((a+b)+" (f2: one argument)");
    }
    public void add(int a, int b) {
        System.out.println((a+b)+" (f3: two arguments) (int,int)");
    }
    public void add(float a, int b) {
        System.out.println((a+b)+" (f4: two arguments)");
    }
//
    public void add(int a, double b) {
	/*
	If float is used as return type of one add() method then compiler gets confused which method we are going to call
	by using (.) operator either it's return types or void that's why shows an error if one method have same body and
	arguments onlyhave different return types.*/
    }

}

class RuntimePolymorphismClass1{
    public void display() {
        System.out.println("Parent class Method is called");
    }
}


class RuntimePolymorphismClass2 extends RuntimePolymorphismClass1{
    public void display() {
        System.out.println("Child class Method is called");
    }
}

class Polymorphism {

    public static void main(String[] args) {

        CompileTimePolymorphism overloading= new CompileTimePolymorphism();
        overloading.add();
        overloading.add(3);
        overloading.add(3, 4);
        overloading.add(3.6f, 4);

        RuntimePolymorphismClass2 overriding= new RuntimePolymorphismClass2();
        overriding.display();
    }
}
