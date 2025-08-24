public class Player {
    private Frame last;
    private UI ui;
    private Cache cache;

    public Player(UI ui, Cache cache){
        this.ui = ui;
        this.cache = cache;
    }

    void play(byte[] fileBytes){
        
        Frame f = new Frame(fileBytes);

        last = f;

        ui.draw(fileBytes);

        cache.doCache(last);

    }
}