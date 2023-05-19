//Java class DogOwner extends Dog
public class DogOwner extends Dog {
    // method takeForWalk()
    public boolean takeForWalk(Dog d) {
        if (d.needsToGo()) {
            return true;
        } else {
            return false;
        }
    }

}