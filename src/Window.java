import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Window extends JFrame implements ActionListener,KeyListener{

    BufferedImage image = ImageIO.read(new File("src/img_3.png"));
    BufferedImage person = ImageIO.read(new File("src/img_1.png"));
    private Toolkit tk = Toolkit.getDefaultToolkit();
    private JPanel panel;
    Timer t = new Timer(5000,this);
    private Rectangle bounds;
    private Rectangle map;
    private int xm = 0;
    private int ym = 0;
    private final int WIDTH = 50;
    private final int HEIGHT = 50;
    private int x = 775;
    private int y = 425;
    private int xssize = (int) tk.getScreenSize().getWidth();            //1600 W
    private int yssize = (int) tk.getScreenSize().getHeight();           //900  H
    private int xmulty = xssize * 3;
    private int ymulty = yssize * 4;
    private int xisize = image.getWidth(); //400 W
    private int yisize = image.getHeight();//400 H
    private int speedx = 10;
    private int speedy = 10;
    private Graphics g;

    public Window() throws IOException {
        super();
        addKeyListener(this);
        this.setTitle("Nate Higgers");
        this.setUndecorated(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        panel = new JPanel();
        getContentPane().add(panel);
        this.pack();
        this.setSize(xssize, yssize);
        this.setLocation(0, 0);
    }

    public void run() {
        setVisible(true);
    }
    public void update(Graphics g) {
        Image dbuffer = createImage(xssize,yssize);
        Graphics db = dbuffer.getGraphics();
        bounds = new Rectangle(WIDTH,HEIGHT);
        map = new Rectangle(xmulty,ymulty);
        bounds.setLocation(x,y);
        map.setLocation(xm,ym);

        db.drawImage(image, map.x, map.y, xisize, yisize, null);
        db.drawImage(image, map.x + xisize, map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 2), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 3), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 4), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 5), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 6), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 7), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 8), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 9), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 10),map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 11),map.y, xisize, yisize, null);

        db.drawImage(image, map.x, map.y + (yisize), xisize, yisize, null);
        db.drawImage(image, map.x + xisize, map.y + (yisize), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 2), map.y + (yisize), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 3), map.y + (yisize), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 4), map.y + (yisize), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 5), map.y + (yisize), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 6), map.y + (yisize), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 7), map.y + (yisize), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 8), map.y + (yisize), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 9), map.y + (yisize), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 10),map.y + (yisize), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 11),map.y + (yisize), xisize, yisize, null);

        db.drawImage(image, map.x, map.y + (yisize * 2), xisize, yisize, null);
        db.drawImage(image, map.x + xisize, map.y + (yisize * 2), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 2), map.y + (yisize * 2), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 3), map.y + (yisize * 2), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 4), map.y + (yisize * 2), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 5), map.y + (yisize * 2), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 6), map.y + (yisize * 2), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 7), map.y + (yisize * 2), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 8), map.y + (yisize * 2), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 9), map.y + (yisize * 2), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 10),map.y + (yisize * 2), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 11),map.y + (yisize * 2), xisize, yisize, null);

        db.drawImage(image, map.x, map.y + (yisize * 3), xisize, yisize, null);
        db.drawImage(image, map.x + xisize, map.y + (yisize * 3), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 2), map.y + (yisize * 3), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 3), map.y + (yisize * 3), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 4), map.y + (yisize * 3), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 5), map.y + (yisize * 3), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 6), map.y + (yisize * 3), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 7), map.y + (yisize * 3), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 8), map.y + (yisize * 3), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 9), map.y + (yisize * 3), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 10),map.y + (yisize * 3), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 11),map.y + (yisize * 3), xisize, yisize, null);

        db.drawImage(image, map.x, map.y + (yisize * 4), xisize, yisize, null);
        db.drawImage(image, map.x + xisize, map.y + (yisize * 4), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 2), map.y + (yisize * 4), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 3), map.y + (yisize * 4), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 4), map.y + (yisize * 4), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 5), map.y + (yisize * 4), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 6), map.y + (yisize * 4), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 7), map.y + (yisize * 4), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 8), map.y + (yisize * 4), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 9), map.y + (yisize * 4), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 10),map.y + (yisize * 4), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 11),map.y + (yisize * 4), xisize, yisize, null);

        db.drawImage(image, map.x, map.y + (yisize * 5), xisize, yisize, null);
        db.drawImage(image, map.x + xisize, map.y + (yisize * 5), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 2), map.y + (yisize * 5), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 3), map.y + (yisize * 5), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 4), map.y + (yisize * 5), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 5), map.y + (yisize * 5), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 6), map.y + (yisize * 5), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 7), map.y + (yisize * 5), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 8), map.y + (yisize * 5), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 9), map.y + (yisize * 5), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 10),map.y + (yisize * 5), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 11),map.y + (yisize * 5), xisize, yisize, null);

        db.drawImage(image, map.x, map.y + (yisize * 6), xisize, yisize, null);
        db.drawImage(image, map.x + xisize, map.y + (yisize * 6), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 2), map.y + (yisize * 6), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 3), map.y + (yisize * 6), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 4), map.y + (yisize * 6), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 5), map.y + (yisize * 6), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 6), map.y + (yisize * 6), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 7), map.y + (yisize * 6), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 8), map.y + (yisize * 6), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 9), map.y + (yisize * 6), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 10),map.y + (yisize * 6), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 11),map.y + (yisize * 6), xisize, yisize, null);

        db.drawImage(image, map.x, map.y + (yisize * 7), xisize, yisize, null);
        db.drawImage(image, map.x + xisize, map.y + (yisize * 7), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 2), map.y + (yisize * 7), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 3), map.y + (yisize * 7), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 4), map.y + (yisize * 7), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 5), map.y + (yisize * 7), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 6), map.y + (yisize * 7), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 7), map.y + (yisize * 7), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 8), map.y + (yisize * 7), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 9), map.y + (yisize * 7), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 10),map.y + (yisize * 7), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 11),map.y + (yisize * 7), xisize, yisize, null);

        db.drawImage(image, map.x, map.y + (yisize * 8), xisize, yisize, null);
        db.drawImage(image, map.x + xisize, map.y + (yisize * 8), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 2), map.y + (yisize * 8), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 3), map.y + (yisize * 8), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 4), map.y + (yisize * 8), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 5), map.y + (yisize * 8), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 6), map.y + (yisize * 8), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 7), map.y + (yisize * 8), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 8), map.y + (yisize * 8), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 9), map.y + (yisize * 8), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 10),map.y + (yisize * 8), xisize, yisize, null);
        db.drawImage(image, map.x + (xisize * 11),map.y + (yisize * 8), xisize, yisize, null);

        db.drawImage(person, bounds.x, bounds.y, WIDTH, HEIGHT, null);
        g.drawImage(dbuffer,0,0,xssize,yssize,null);
    }


    public void paint(Graphics g) {
        update(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode()==KeyEvent.VK_D){ //RIGHT
            if (xm > -3200) {
                map.setLocation(map.x-speedx, map.y);
                xm -= speedx;
                System.out.println(xm + " " + ym);
            } else if (xm == -3200) {
                if (x < 1555){
                    bounds.setLocation(bounds.x+speedx,bounds.y);
                    x += speedx;
                }else if (x == 1555){
                    map.setLocation(map.x, map.y);
                    bounds.setLocation(bounds.x, bounds.y);
                    xm -= 0;
                    x += 0;
                }

            }
            System.out.println(x + " " + y);
        }


        if (e.getKeyCode()==KeyEvent.VK_A){ //LEFT
            if (xm < 0) {
                map.setLocation(map.x+speedx, map.y);
                xm += speedx;
                System.out.println(xm + " " + ym);
            } else if (xm == 0) {
                if (x > 0){
                    bounds.setLocation(bounds.x-speedx,bounds.y);
                    x -= speedx;
                }else if (x == 0){
                    map.setLocation(map.x, map.y);
                    bounds.setLocation(bounds.x, bounds.y);
                    xm -= 0;
                    x += 0;
                }
            }
        }if (e.getKeyCode()==KeyEvent.VK_S){ //DOWN 2700
            if (ym > -2700) {
                map.setLocation(map.x, map.y-speedy);
                ym -= speedy;
                System.out.println(xm + " " + ym);
            } else if (ym == -2700) {
                if (y < 855){
                    bounds.setLocation(bounds.x,bounds.y+speedx);
                    y += speedx;
                }else if (x == 855){
                    map.setLocation(map.x, map.y);
                    bounds.setLocation(bounds.x, bounds.y);
                    xm -= 0;
                    x += 0;
                }
            }
        }if (e.getKeyCode()==KeyEvent.VK_W){ //UP 0
            if (ym > 0) {
                map.setLocation(map.x, map.y-speedy);
                ym -= speedy;
                System.out.println(xm + " " + ym);
            } else if (ym == 0) {
                if (y > 0){
                    bounds.setLocation(bounds.x,bounds.y-speedx);
                    y -= speedx;
                }else if (y == 0){
                    map.setLocation(map.x, map.y);
                    bounds.setLocation(bounds.x, bounds.y);
                    xm -= 0;
                    x += 0;
                }
            }
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {

    }
}