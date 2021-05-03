package dragNdrops;

import javax.swing.JFrame;

public class MyFrame extends JFrame{

    DragPanel dragPanel = new DragPanel(); //instância a classe DragPanel

    MyFrame() {

        this.add(dragPanel); // insere o conteudo de DragPanel no frame
        this.setTitle("Drag & Drop demo");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}