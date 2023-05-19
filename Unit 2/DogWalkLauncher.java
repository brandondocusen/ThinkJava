//Java DogWalkLauncher class to test Dog and DogOwner class
public class DogWalkLauncher {
    // main() method
    public static void main(String[] args) {
        // object of DogOwner class
        DogOwner owner = new DogOwner();
        // objects of Dog class
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        // calling method setDrinkTime()
        dog1.setDrinkTime(5);
        dog2.setDrinkTime(6);
        // call method takeForWalk()
        System.out.println(owner.takeForWalk(dog1));
        System.out.println(owner.takeForWalk(dog2));

    }

}