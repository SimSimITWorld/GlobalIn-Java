package newHomework_1;

import java.awt.*;
import javax.swing.*;

public class Menubar extends JFrame {

	private MenuBar mb = new MenuBar();
	
	private Menu Function = new Menu("기능(F)");
	
	private MenuItem save = new CheckboxMenuItem("저장하기(S)");
	private MenuItem load = new CheckboxMenuItem("불러오기(L)");

	public MenuBar getMb() {
		return mb;
	}

	public void setMb(MenuBar mb) {
		this.mb = mb;
	}

	public Menu getFunction() {
		return Function;
	}

	public void setFunction(Menu function) {
		Function = function;
	}

	public MenuItem getSave() {
		return save;
	}

	public void setSave(MenuItem save) {
		this.save = save;
	}

	public MenuItem getLoad() {
		return load;
	}

	public void setLoad(MenuItem load) {
		this.load = load;
	}

	public Menubar() {
		setMenuBar(mb);
		mb.add(Function);
		Function.add(save);
		Function.add(load);
	}
}
