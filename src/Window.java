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

    private Toolkit tk = Toolkit.getDefaultToolkit();
    BufferedImage image = ImageIO.read(new File("src/phon.png"));
    //BufferedImage person = ImageIO.read(new File("src/person.png"));
    private int xssize = (int) tk.getScreenSize().getWidth();            //1600 W
    private int yssize = (int) tk.getScreenSize().getHeight();           //900  H
    private JPanel panel;
    Timer t = new Timer(10,this);
    private Rectangle bounds;
    private Rectangle map;
    private int xm = 0;
    private int ym = 0;
    private final int WIDTH = 50;
    private final int HEIGHT = 64;
    private int x = (xssize - WIDTH) / 2;
    private int y = (yssize - HEIGHT) / 2;
    private int xmsize = xssize * 3;
    private int ymsize = yssize * 4;
    private int xisize = image.getWidth(); //400 W
    private int yisize = image.getHeight();//400 H
    private int speed = xssize / 160;
    private Graphics g;

    BufferedImage forward = ImageIO.read(new File("src/forward.png"));
    BufferedImage forwardrunleft = ImageIO.read(new File("src/forward_run_left.png"));
    BufferedImage forwardrunright = ImageIO.read(new File("src/forward_run_right.png"));
    BufferedImage behind = ImageIO.read(new File("src/behind.png"));
    BufferedImage behindrunleft = ImageIO.read(new File("src/behind_run_left.png"));
    BufferedImage behindrunright = ImageIO.read(new File("src/behind_run_right.png"));
    BufferedImage left = ImageIO.read(new File("src/left.png"));
    BufferedImage leftrunleft = ImageIO.read(new File("src/left_run_left.png"));
    BufferedImage leftrunright = ImageIO.read(new File("src/left_run_left.png"));
    BufferedImage right = ImageIO.read(new File("src/right.png"));
    BufferedImage rightrunleft = ImageIO.read(new File("src/right_run_left.png"));
    BufferedImage rightrunright = ImageIO.read(new File("src/right_run_right.png"));

    public Window() throws IOException {                                                        //!!!!!!!!!!!!!!!!new person is W 351 and H 451
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
        map = new Rectangle(xmsize,ymsize);
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

        db.drawImage(forward, bounds.x, bounds.y, WIDTH, HEIGHT, null);
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
                if (x < (xssize - (WIDTH / 2) / 2)){                                           // в центр
                    bounds.setLocation(bounds.x+speed,bounds.y);
                    x += speed;
                }else if (x == (xssize - (WIDTH / 2) / 2)){
                    map.setLocation(map.x-speed, map.y);
                    xm -= speed;
                    System.out.println(xm + " " + ym);
                }
            } else if (xm == -3200) {                                       //  край
                if (x < xssize - (WIDTH / 2)){
                    bounds.setLocation(bounds.x+speed,bounds.y);
                    x += speed;
                }else if (x == xssize - (WIDTH / 2)){
                    map.setLocation(map.x, map.y);
                    bounds.setLocation(bounds.x, bounds.y);
                    ym -= 0;
                    y += 0;
                }
            }
        }

        if (e.getKeyCode()==KeyEvent.VK_A){ //LEFT
               if (xm < 0) {
                if (x > (xssize - (WIDTH / 2)) / 2){                                           // в центр
                    bounds.setLocation(bounds.x-speed,bounds.y);
                    x -= speed;
                }else if (x == (xssize - (WIDTH / 2) / 2)){
                    map.setLocation(map.x+speed, map.y);
                    xm += speed;
                    System.out.println(xm + " " + ym);
                }
            } else if (xm == 0) {                                       //  край
                if (x > xssize - (xssize - (WIDTH / 2) / 2)){
                    bounds.setLocation(bounds.x-speed,bounds.y);
                    x -= speed;
                }else if (x == xssize - (xssize - (WIDTH / 2))){
                    map.setLocation(map.x, map.y);
                    bounds.setLocation(bounds.x, bounds.y);
                    ym -= 0;
                    y += 0;
                }
            }
        }

        if (e.getKeyCode()==KeyEvent.VK_S){ //DOWN 2700
            if (ym > -2700) {
                if (y < (yssize - (HEIGHT / 2)) / 2){
                    bounds.setLocation(bounds.x,bounds.y+speed);
                    y += speed;
                }else if (y == (yssize - (HEIGHT / 2)) / 2){
                    map.setLocation(map.x, map.y-speed);
                    ym -= speed;
                    System.out.println(xm + " " + ym);
                }
            } else if (ym == -2700) {
                if (y < yssize - (yssize - (HEIGHT / 2))){
                    bounds.setLocation(bounds.x,bounds.y+speed);
                    y += speed;
                }else if (y == yssize - (yssize - (HEIGHT / 2))){
                    map.setLocation(map.x, map.y);
                    bounds.setLocation(bounds.x, bounds.y);
                    ym -= 0;
                    y += 0;
                }
            }
        }

        if (e.getKeyCode()==KeyEvent.VK_W){ //UP 0
            if (ym < 0) {
                if (y > (yssize - (HEIGHT / 2)) / 2){
                    bounds.setLocation(bounds.x,bounds.y-speed);
                    y -= speed;
                }else if (y == (yssize - (HEIGHT / 2)) / 2){
                    map.setLocation(map.x, map.y+speed);
                    ym += speed;
                    System.out.println(xm + " " + ym);
                }
            } else if (ym == 0) {
                if (y > yssize - (yssize - (HEIGHT / 2))){
                    bounds.setLocation(bounds.x,bounds.y-speed);
                    y -= speed;
                }else if (y == yssize - (yssize - (HEIGHT / 2))){
                    map.setLocation(map.x, map.y);
                    bounds.setLocation(bounds.x, bounds.y);
                    ym -= 0;
                    y += 0;
                }
            }
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {

    }
}