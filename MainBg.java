import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class MainBg extends JPanel {
    //������ͼ

        Image image = null;
        public MainBg(){
            URL url = MainBg.class.getResource("/images/mainbg.jpg");
            try {
                image = ImageIO.read(url);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        protected void paintComponent(Graphics g)
        {
            int width = this.getWidth();
            int height = this.getHeight();
            g.clearRect(0, 0, width, height);

            // ������ͼ
            g.drawImage(image, 0, 0, width, height, null);

        }
}

