public class Demo02 {
    public static void main(String[] args) {

        UI ui = new sampleUI();
        Cache cache = new sampleCache();

        Player p1 = new Player(ui, cache);

        p1.play(new byte[]{1,2,3,4});

    }
}
