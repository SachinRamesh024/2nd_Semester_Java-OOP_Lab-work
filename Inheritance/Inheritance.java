 class Animal {
    Animal(){
        System.out.println("i am a constructor of Animal class");
    }
    public void location(){
        System.out.println(" we live in jungle");
    }
}
    class Dog extends Animal{
    Dog(){
        System.out.println("i am constructor of dog class ");
    }
    public void speak(){
        System.out.println("Bow Bow");
    }

}
public class Inheritance {

    public static void main(String[] args) {
           Dog d = new Dog();
          d.location();
          d.speak();
    }
}