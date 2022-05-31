import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.AttributedCharacterIterator;
import java.util.Map;

public class Window extends JFrame implements ActionListener, KeyListener {

    private Toolkit tk = Toolkit.getDefaultToolkit();
    private JPanel panel;
    Timer t = new Timer(5,this);

    private final int WIDTH = 50;
    private final int HEIGHT = 50;
    private int x = 0;
    private int y = 0;

    private int xssize = (int) tk.getScreenSize().getWidth();            //1600
    private int yssize = (int) tk.getScreenSize().getHeight();           //900
    BufferedImage image = ImageIO.read(new URL("https://gamerwall.pro/uploads/posts/2021-11/1637571551_12-gamerwall-pro-p-abstraktnie-treugolniki-krasivie-oboi-12.png"));
    BufferedImage image1 = ImageIO.read(new File("src/img_2.png"));
    BufferedImage person = ImageIO.read(new URL("https://phonoteka.org/uploads/posts/2021-07/1625663703_35-phonoteka-org-p-soul-knait-razboinik-art-krasivo-36.png"));
    public Window() throws IOException {
        super();
        //this.setTitle("Numbers");
        this.setUndecorated(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        panel = new JPanel();
        //this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        getContentPane().add(panel);
        this.pack();
        this.setSize(xssize, yssize);
        //this.setAlwaysOnTop(true);
        this.setLocation(0, 0);
    }

    public void run() {
        setVisible(true);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponents(g);
        g.drawImage(image1, 0, 0, this); // see javadoc for more info on the parameters
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_RIGHT){
            //person.setLocation(x+1, y);
            x += 1;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}