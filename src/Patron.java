import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Patron {
    Image img;
    Image img2;
    private int x=200,y=200;
    private int x1=120,y1=120;
    public Patron(){
        try {
            img = ImageIO.read(new File("Images/patron.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            img2 = ImageIO.read(new File("Images/patron2.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void draw(Graphics g){
        g.drawImage(img, x,y,50,25,null);
    }
    public void draw1(Graphics g){
        g.drawImage(img2, x1,y1,50,25,null);
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Image getImg2() {
        return img2;
    }

    public void setImg2(Image img2) {
        this.img2 = img2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }
}
