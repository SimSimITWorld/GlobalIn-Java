package practice_3;

import java.io.IOException;

public abstract class GameSet {

	int x;
	
	abstract void move () throws IOException;
	abstract void field();
	abstract void treasure();
}
