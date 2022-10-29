import java.applet.Applet;
import java.awt.*;
public class lifecy extends Applet
{
	String s=" ";
	public void init()
	{
		setBackground(Color.white);
		setForeground(Color.blue);
		s=s+"init called bruh";
	}
	public void start()
	{
		s=s+"start called";
	}
	public void paint(Graphics g)
	{
		g.drawString(s,30,30);
	}
	public void stop()
	{
		s=s+"stop called"; //called when applet viewer window is minimised and then restored
	}
	public void destroy()
	{
		s=s+"destroyed!"; //called when it is closed
	}
}

/*
<applet code="myapp2.class" width=300 height=300
</applet>
*/