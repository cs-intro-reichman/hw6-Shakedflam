 import java.awt.Color;
public class Editor4 {
    public static void main(String[] args) {
        String newFile= args[0];
        int transform= Integer.parseInt(args[1]);
        Color[][] image = Runigram.read(newFile);
        Color[][] grayImage= Runigram.grayScaled(image);
        Runigram.setCanvas(image);
        Runigram.morph(image, grayImage, transform);
    }
}

