package homework;

import java.io.IOException;

public abstract class GameCommand {

    int x;
	
    abstract void move() throws IOException;
	abstract void field();
	abstract void treasure();
	abstract void monster();
}
