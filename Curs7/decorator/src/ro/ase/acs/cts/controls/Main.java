package ro.ase.acs.cts.controls;

public class Main {

	public static void main(String[] args) {
			AbstractVisualControl btnLogin = new Button ("\n\tLogin", 1);
			AbstractVisualControl btnLogout = new Button ("\n\tLogout", 2);
			
			btnLogin.click();
			btnLogout.click();
			
			//we want to add new attibutes only to the logout button without changing the class
			Button3DDecorator button3DDec = new Button3DDecorator(btnLogout, "3d effect");
			button3DDec.click();
			
			//even better:
			btnLogin = new Button3DDecorator(btnLogin, "3d effect but better");
			btnLogin = new ImproveClickDecorator(btnLogin);
			btnLogin.click();
			
			//making a downcast:
			btnLogout = new MouseHoverDecorator(btnLogout);
			//btnLogout.mouseHover(); --this won't work (can't decorate with new methods, only with new attributes)
			if (btnLogout instanceof MouseHoverDecorator)
			{
				((MouseHoverDecorator) btnLogout).mouseHover();
			}
	}

}
