package screensaver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.*;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by misha on 17.02.17.
 */
@org.springframework.stereotype.Component
public abstract class ColorFrame extends JFrame {

    public ColorFrame() throws HeadlessException {
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void showOnRandomPlace() {
        Random random = new Random();
        setLocation(random.nextInt(1200), random.nextInt(700));
        getContentPane().setBackground(getColor());
        repaint();
    }

    protected abstract Color getColor();
}
