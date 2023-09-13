import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame(){

        this.add(new GamePainel());
        this.setTitle("Jogo da Cobrinha");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(false); /*alterei para asdasdfalse porem é true */
        this.setLocationRelativeTo(null);
    }

}
