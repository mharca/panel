package panel;
import panel.controller.*;
import panel.model.*;
import panel.view.*;

public class Main {

	public static void main(String[] args) {
		View v = new View();
		Model m = new Model();
		Sql sql = new Sql();
		Controller control = new Controller(v, m);
	}

}
