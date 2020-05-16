import java.awt.*;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;

public class BgPanel extends JPanel {
		Image imageBg = null ;
		public BgPanel()
	{
		URL urlBg = BgPanel.class.getResource("images/background.jpg");
		try{
			imageBg = ImageIO.read(urlBg);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		@Override
		protected void paintComponent(Graphics g)
		{
			int width = this.getWidth();
			int height = this.getHeight();
			g.clearRect(0, 0, width, height);
			// »­±³¾°Í¼
			g.drawImage(imageBg, 0, 0, width, height, null);
		}
}
