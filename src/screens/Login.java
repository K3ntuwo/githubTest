package screens;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;

import javax.swing.JFrame;
import javax.swing.JPanel;

import jComponents.CustomizedFrame;

public class Login extends JFrame{

	public Login() {
		int width = 400;
		int height = 500;
		
		CustomizedFrame mainFrame = new CustomizedFrame(width, height);
		
		setSize(width, height);
		setLocationRelativeTo(null);
		setResizable(false);
		setUndecorated(true);
		setBackground(new Color(0, 0, 0, 0));
		
		
		
		JPanel panel = new JPanel() {

			public void paintComponent(Graphics g) {
				// getting the width and height of the text
				String text = "Welcome", text1 = "Please enter your credentials";
				AffineTransform affinetransform = new AffineTransform();
				FontRenderContext frc = new FontRenderContext(affinetransform, true, true);
				Font font = new Font("Arial", Font.PLAIN, 25);
				Font font1 = new Font("Arial", Font.PLAIN, 13);
				int textwidth = (int) (font.getStringBounds(text, frc).getWidth());
				int textwidth1 = (int) (font1.getStringBounds(text1, frc).getWidth());
				int textheight = (int) (font.getStringBounds(text, frc).getHeight());

				Graphics2D g2 = (Graphics2D) g;

				g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
				g2.setColor(Color.black);
				g2.setFont(font);
				g2.drawString(text, width / 2 - textwidth / 2, height / 5);
				g2.setFont(font1);
				g2.drawString(text1, width / 2 - textwidth1 / 2, height / 5 + textheight);
				super.paintComponent(g);
			}

		};
		panel.setOpaque(false);
		panel.setBounds(0, 0, width, height);
		add(panel);
		add(mainFrame);
		
	}

}
