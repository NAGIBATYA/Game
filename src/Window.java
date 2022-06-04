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

    private Toolkit tk = Toolkit.getDefaultToolkit();
    private JPanel panel;
    Timer t = new Timer(5000,this);
    private Rectangle bounds;

    private final int WIDTH = 50;
    private final int HEIGHT = 50;
    private int x = 775;
    private int y = 425;

    private int xssize = (int) tk.getScreenSize().getWidth();            //1600 W
    private int yssize = (int) tk.getScreenSize().getHeight();           //900  H
    BufferedImage image = ImageIO.read(new URL("https://gamerwall.pro/uploads/posts/2021-11/1637571551_12-gamerwall-pro-p-abstraktnie-treugolniki-krasivie-oboi-12.png"));
    BufferedImage image1 = ImageIO.read(new File("src/img_2.png"));
    Image person1 = new ImageIcon("src/img_1.png").getImage();
    BufferedImage person = ImageIO.read(new URL("https://phonoteka.org/uploads/posts/2021-07/1625663703_35-phonoteka-org-p-soul-knait-razboinik-art-krasivo-36.png"));
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
        bounds.setLocation(x,y);
        db.drawImage(image1,0,0,null);
        db.drawImage(person, bounds.x, bounds.y, WIDTH, HEIGHT, this);
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
            bounds.setLocation(bounds.x+1, bounds.y);
            x += 1;
        }if (e.getKeyCode()==KeyEvent.VK_A){ //LEFT
            bounds.setLocation(bounds.x-1, bounds.y);
            x -= 1;
        }if (e.getKeyCode()==KeyEvent.VK_S){ //DOWN
            bounds.setLocation(bounds.x, bounds.y+1);
            y += 1;
        }if (e.getKeyCode()==KeyEvent.VK_W){ //UP
            bounds.setLocation(bounds.x, bounds.y-1);
            y -= 1;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {

    }
}