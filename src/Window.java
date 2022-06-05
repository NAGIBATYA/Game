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
import java.net.URL;

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
    private int ys = 1;
    private int xs = 1;
    private final int WIDTH = 50;
    private final int HEIGHT = 50;
    private int x = 775;
    private int y = 425;
    private int xssize = (int) tk.getScreenSize().getWidth();            //1600 W
    private int yssize = (int) tk.getScreenSize().getHeight();           //900  H
    private int xmulty = xssize * 3;
    private int ymulty = yssize * 3;
    private int xisize = image.getWidth(); //400 W
    private int yisize = image.getHeight();//400 H
    private int xdivision = xmulty / xisize;
    private int ydivision = ymulty / yisize;
    private Graphics2D g;

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
        map = new Rectangle(xssize*3,yssize*3);
        bounds.setLocation(x,y);
        map.setLocation(xm,ym);

        db.drawImage(image, map.x, map.y, xisize, yisize, null);
        db.drawImage(image, map.x + xisize, map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 2), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 3), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 4), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 5), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 6), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 7), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 8), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 9), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 10),map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 11),map.y, xisize, yisize, null);

        db.drawImage(image, map.x, map.y + yisize, xisize, yisize, null);
        db.drawImage(image, map.x + xisize, map.y + yisize, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 2), map.y + yisize, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 3), map.y + yisize, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 4), map.y + yisize, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 5), map.y + yisize, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 6), map.y + yisize, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 7), map.y + yisize, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 8), map.y + yisize, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 9), map.y + yisize, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 10),map.y + yisize, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 11),map.y + yisize, xisize, yisize, null);

        db.drawImage(image, map.x, map.y + (yisize * 2), xisize, yisize, null);
        db.drawImage(image, map.x + xisize, map.y + (yisize * 2), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 2), map.y + (yisize * 2), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 3), map.y + (yisize * 2), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 4), map.y + (yisize * 2), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 5), map.y + (yisize * 2), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 6), map.y + (yisize * 2), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 7), map.y + (yisize * 2), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 8), map.y + (yisize * 2), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 9), map.y + (yisize * 2), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 10),map.y + (yisize * 2), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 11),map.y + (yisize * 2), xisize, yisize, null);

        db.drawImage(image, map.x, map.y + (yisize * 3), xisize, yisize, null);
        db.drawImage(image, map.x + xisize, map.y + (yisize * 3), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 2), map.y + (yisize * 3), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 3), map.y + (yisize * 3), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 4), map.y + (yisize * 3), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 5), map.y + (yisize * 3), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 6), map.y + (yisize * 3), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 7), map.y + (yisize * 3), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 8), map.y + (yisize * 3), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 9), map.y + (yisize * 3), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 10),map.y + (yisize * 3), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 11),map.y + (yisize * 3), xisize, yisize, null);

        db.drawImage(image, map.x, map.y + (yisize * 4), xisize, yisize, null);
        db.drawImage(image, map.x + xisize, map.y + (yisize * 4), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 2), map.y + (yisize * 4), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 3), map.y + (yisize * 4), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 4), map.y + (yisize * 4), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 5), map.y + (yisize * 4), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 6), map.y + (yisize * 4), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 7), map.y + (yisize * 4), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 8), map.y + (yisize * 4), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 9), map.y + (yisize * 4), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 10),map.y + (yisize * 4), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 11),map.y + (yisize * 4), xisize, yisize, null);

        db.drawImage(image, map.x, map.y + (yisize * 5), xisize, yisize, null);
        db.drawImage(image, map.x + xisize, map.y + (yisize * 5), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 2), map.y + (yisize * 5), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 3), map.y + (yisize * 5), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 4), map.y + (yisize * 5), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 5), map.y + (yisize * 5), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 6), map.y + (yisize * 5), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 7), map.y + (yisize * 5), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 8), map.y + (yisize * 5), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 9), map.y + (yisize * 5), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 10),map.y + (yisize * 5), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 11),map.y + (yisize * 5), xisize, yisize, null);

        db.drawImage(image, map.x, map.y + (yisize * 6), xisize, yisize, null);
        db.drawImage(image, map.x + xisize, map.y + (yisize * 6), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 2), map.y + (yisize * 6), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 3), map.y + (yisize * 6), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 4), map.y + (yisize * 6), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 5), map.y + (yisize * 6), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 6), map.y + (yisize * 6), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 7), map.y + (yisize * 6), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 8), map.y + (yisize * 6), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 9), map.y + (yisize * 6), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 10),map.y + (yisize * 6), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 11),map.y + (yisize * 6), xisize, yisize, null);

        db.drawImage(image, map.x, map.y + (yisize * 7), xisize, yisize, null);
        db.drawImage(image, map.x + xisize, map.y + (yisize * 7), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 2), map.y + (yisize * 7), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 3), map.y + (yisize * 7), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 4), map.y + (yisize * 7), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 5), map.y + (yisize * 7), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 6), map.y + (yisize * 7), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 7), map.y + (yisize * 7), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 8), map.y + (yisize * 7), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 9), map.y + (yisize * 7), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 10),map.y + (yisize * 7), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 11),map.y + (yisize * 7), xisize, yisize, null);

        db.drawImage(image, map.x, map.y + (yisize * 8), xisize, yisize, null);
        db.drawImage(image, map.x + xisize, map.y + (yisize * 8), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 2), map.y + (yisize * 8), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 3), map.y + (yisize * 8), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 4), map.y + (yisize * 8), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 5), map.y + (yisize * 8), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 6), map.y + (yisize * 8), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 7), map.y + (yisize * 8), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 8),map.y + (yisize * 8), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 9), map.y + (yisize * 8), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 10), map.y + (yisize * 8), xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 11), map.y + (yisize * 8), xisize, yisize, null);

        db.drawImage(image, map.x, map.y + (yisize * 9), xisize, yisize, null);
        db.drawImage(image, map.x + xisize, map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 2), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 3), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 4), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 5), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 6), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 7), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 8), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 9), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 10), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 11), map.y, xisize, yisize, null);

        db.drawImage(image, map.x, map.y, xisize, yisize, null);
        db.drawImage(image, map.x + xisize, map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 2), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 3), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 4), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 5), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 6), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 7), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 8), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 9), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 10), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 11), map.y, xisize, yisize, null);

        db.drawImage(image, map.x, map.y, xisize, yisize, null);
        db.drawImage(image, map.x + xisize, map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 2), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 3), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 4), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 5), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 6), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 7), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 8), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 9), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 10), map.y, xisize, yisize, null);
        db.drawImage(image, map.x + (xssize * 11), map.y, xisize, yisize, null);


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
            map.setLocation(map.x-1, map.y);
            xm -= 1;
        }if (e.getKeyCode()==KeyEvent.VK_A){ //LEFT
            map.setLocation(map.x+1, map.y);
            xm += 1;
        }if (e.getKeyCode()==KeyEvent.VK_S){ //DOWN
            map.setLocation(map.x, map.y-1);
            ym -= 1;
        }if (e.getKeyCode()==KeyEvent.VK_W){ //UP
            bounds.setLocation(map.x, map.y+1);
            ym += 1;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {

    }
}