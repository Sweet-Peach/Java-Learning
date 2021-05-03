package jOptionPane;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        // JOptionPane = Pop up uma caixa de dialogo simples que solicita ao usuario um valor
        // 				 ou informa a ele alguma coisa

        //JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "here is more useless info :D", "title", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Really?", "title", JOptionPane.QUESTION_MESSAGE);
        //while(true) {
        //JOptionPane.showMessageDialog(null, "Your computer has a VIRUS!!!", "title", JOptionPane.WARNING_MESSAGE);
        //}
        //JOptionPane.showMessageDialog(null, "Call tec suport now or else", "title", JOptionPane.ERROR_MESSAGE);

        //int answer = JOptionPane.showConfirmDialog(null, "Are you sure about that?", "let me ask you,", JOptionPane.YES_NO_CANCEL_OPTION);
        //String name = JOptionPane.showInputDialog("What is your name? ");
        //System.out.println(name);

        String[] res = {"No, you're awesome!", "Thank you!", "*blush*"};

        ImageIcon imageI = new ImageIcon("ggg.png");
        Image image = imageI.getImage();
        Image newimg = image.getScaledInstance(50, 25,  java.awt.Image.SCALE_SMOOTH);
        imageI = new ImageIcon(newimg);

        JOptionPane.showOptionDialog(null, "You are awesome", "Secret Message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, imageI, res, 0);
    }

}