public class ImageLoader {
    private static ImageLoader instance = null;

    private ImageLoader() {

    }

    public static ImageLoader getInstance() {
        if (instance == null) {
            instance = new ImageLoader();
        }
        return instance;
    }

    public static String loadImage() {
        return "Loaded successfully.";
    }

    public static void main(String[] args) {
        ImageLoader instance = ImageLoader.getInstance();
        System.out.println(instance.loadImage());
        System.out.println(ImageLoader.loadImage());

    }
}
