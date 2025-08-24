public class sampleCache implements Cache{

    @Override
    public void doCache(Frame frame) {
        System.out.println("Cached last frame? " + (frame!=null));
    }
    
}
