import java.util.HashMap;

public class Playlist{
    public static void main(String[] args) {
        HashMap<String, String> playlist = new HashMap<>();
        playlist.put("Dancing in the Moonlight", "We get it almost every night. When that moon is big and bright. It's a supernatural delight. Everybody's dancin' in the moonlight");
        playlist.put("Bohemian Rhapsody", "Is this the real life? Is this just fantasy? Caught in a landslide, No escape from reality.");
        playlist.put("Imagine", "Imagine there's no heaven It's easy if you try No hell below us Above us only sky");
        playlist.put("Shape of You", "he club isn't the best place to find a lover Me and my friends at the table doing shots Drinking fast and then we talk slow");

        System.out.println(playlist.get("Dancing in the Moonlight"));
    }
}