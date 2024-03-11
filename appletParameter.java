import java.applet.*;
import java.io.*;
import java.awt.*;
public class helper extends Applet {
    String fontName;
    int fontSize;
    float leading;
    boolean active;
    public void start()
    {
        String param;
        fontName = getParameter("fontName");
        if(fontName == null)
        {
            fontName = "non";
        }
        param = getParameter("fontSize");
        try {
            if(param != null)
            {
                fontSize = Integer.parseInt(param);
            }
            else {
                fontSize = 0;

            }
        }
        catch(NumberFormatException e)
        {fontSize = -1;


        }
        param = getParameter("leading");
        try {
            if(param != null)
            {
                leading = Float.valueOf(param).floatValue();


            }
            else {
                leading  = 0;
            }
        }
        catch(NumberFormatException e){
            leading = -1;
        }

        param = getParameter("active");

            if(param != null)
            {
                active = Boolean.valueOf(param ).booleanValue();
            }






    }
    public void paint(Graphics g)
    {
        g.drawString("FontName : " + fontName, 0, 10);
        g.drawString("FontSize : " + fontSize, 0, 26);
        g.drawString("leading : " + leading, 0, 42);
        g.drawString("Active : " + active, 0, 58);

    }


}
