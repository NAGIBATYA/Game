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
    /*private JPanel panel;
    Timer t = new Timer(5000,this);
    private Rectangle bounds;

    private final int WIDTH = 50;
    private final int HEIGHT = 50;
    private int x = 0;
    private int y = 0;*/

    private int xssize = (int) tk.getScreenSize().getWidth();            //1600
    private int yssize = (int) tk.getScreenSize().getHeight();           //900
    //BufferedImage image = ImageIO.read(new URL("https://gamerwall.pro/uploads/posts/2021-11/1637571551_12-gamerwall-pro-p-abstraktnie-treugolniki-krasivie-oboi-12.png"));
    //BufferedImage image1 = ImageIO.read(new File("src/img_2.png"));
    //Image person = new ImageIcon("src/img_1.png").getImage();
    //BufferedImage person1 = ImageIO.read(new URL("https://phonoteka.org/uploads/posts/2021-07/1625663703_35-phonoteka-org-p-soul-knait-razboinik-art-krasivo-36.png"));
    //private java.awt.event.ActionEvent e;

    public Window() throws IOException {
        super();
        //addKeyListener(this);
        //this.setTitle("Numbers");
        this.setUndecorated(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        //panel = new JPanel();
        //this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        getContentPane().add(new MyPanel());
        this.pack();
        this.setSize(xssize, yssize);
        //addWidgets();
        //this.setAlwaysOnTop(true);
        this.setLocation(0, 0);

    }

    public void run() {
        setVisible(true);
    }

    /*public void addWidgets(){
        ImageIcon person = new ImageIcon("src/img_2.png");
        JLabel person1 = new JLabel(person);
        person1.setLocation(x,y);
    }*/

    /*public void paint(Graphics g1) {
        actionPerformed(e);
        Graphics2D g = (Graphics2D)g1;
        super.paintComponents(g);
        bounds = new Rectangle();
        bounds.setLocation(x,y);
        bounds.getLocation();
        g.drawImage(person, bounds.x, bounds.y, WIDTH, HEIGHT, this); // see javadoc for more info on the parameters

    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
       //repaint(10000000);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_RIGHT){
        MyPanel.bounds.setLocation(MyPanel.bounds.x+1, MyPanel.bounds.y);
        MyPanel.x += 1;
        System.out.println(MyPanel.bounds.x);
        repaint();
    }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}