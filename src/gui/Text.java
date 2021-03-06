package gui;

import java.awt.Font;
import java.io.InputStream;
 
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
 
import org.newdawn.slick.Color;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.util.ResourceLoader;

public class Text {
	private TrueTypeFont font;

    private boolean antiAlias = true;
	
    public void init(String fontDirection, float fontSize) {
        try {
            InputStream inputStream = ResourceLoader.getResourceAsStream(fontDirection);
             
            Font awtFont = Font.createFont(Font.TRUETYPE_FONT, inputStream);
            awtFont = awtFont.deriveFont(fontSize); // set font size
            font = new TrueTypeFont(awtFont, antiAlias);
             
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void render(float x, float y, String whatchars) {
        font.drawString(x, y, whatchars);
    }
}
