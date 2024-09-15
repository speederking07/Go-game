package client.gui;

import java.awt.GridLayout;
import javax.swing.*;
import java.util.*;
import java.util.ArrayList;
import java.awt.event.*;

public class ChooseGame extends JFrame implements ActionListener
{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JPanel games;
    JScrollPane scroll;
    List<JButton> repeats;
    public ChooseGame()
    {
        repeats = new ArrayList<>();
        scroll = new JScrollPane();
        games = new JPanel();
        games.setLayout(new BoxLayout(games, BoxLayout.Y_AXIS));
        
        for(int i=0; i<50; i++)
        {
            repeats.add(new JButton("Odtworz"));
            games.add(new JLabel("game: "+i));
        }
        games.setLayout(new GridLayout(50,2));
        scroll.setViewportView(games);
        add(scroll);

        pack();
        setSize(getWidth(),400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

    }

    public void actionPerformed(ActionEvent e)
    {
        for(int i=0; i<repeats.size(); i++)
            if(e.getSource().equals(repeats.get(i)))
            {
                //TODO
            }
    }
}