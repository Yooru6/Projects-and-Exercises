package CommandPdfExample;

public class TestLight{
public static void main(String[] args){
Light lamp = new Light();
Command switchUp = new FlipUpCommand(lamp);
Command switchDown = new FlipDownCommand(lamp);
WallButton button1 = new WallButton(switchUp);
WallButton button2 = new WallButton(switchDown);
button1.push();
button2.push();
}
}
