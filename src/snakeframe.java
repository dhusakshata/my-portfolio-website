import javax.swing.JFrame;
public class snakeframe extends JFrame{


snakeframe(){
	this.setTitle("SnakeGame");
	this.add(new snakepanel());
	this.setVisible(true);
	this.setResizable(false);
	this.pack();
}
}
