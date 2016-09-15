package screenSaver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by Jeka on 15/09/2016.
 */
@Component
@Scope("singleton")
public class ColorFrame extends JFrame{
    @Autowired
    private Color color;

    @PostConstruct
    private void init() {
        setSize(200,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void moveToRandomLocation(){
        Random random = new Random();
        setLocation(random.nextInt(1200),random.nextInt(800));
        getContentPane().setBackground(color);
        repaint();
    }








}




