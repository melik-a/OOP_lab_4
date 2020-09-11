import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
/**
 * JImageDisplay
 */
public class JImageDisplay extends javax.swing.JComponent {
    //image that we use to display
    private  BufferedImage displImage;
    
    //initializing display image with the specified parans
    JImageDisplay(int width, int height){
        //creating display image
        displImage = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        
        //set size of image
        java.awt.Dimension size = new java.awt.Dimension(width,height);
        setPreferredSize(size);
    }

    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);
        g.drawImage(displImage, 0, 0,displImage.getWidth(), displImage.getHeight(), null);
    }

    public void clearImage (Graphics g){
        g.setColor(Color.black);
        g.drawImage(displImage, 0, 0,displImage.getWidth(), displImage.getHeight(), null);
    }
    
    public void drawPixel(int x, int y, int rgbColor){
        Graphics g;
        g.drawImage(displImage, x, y, 1, 1, null);
    }
}