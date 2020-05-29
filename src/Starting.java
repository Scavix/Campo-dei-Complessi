import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Starting extends Application {
		public void start(Stage stage){
			stage.setTitle("CmplxClcltr");
			FlowPane panel = new FlowPane();
			TextField txt1 = new TextField("Re(1)");
			TextField txt2 = new TextField("Im(1)");
			TextField txt3 = new TextField("Re(2)");
			TextField txt4 = new TextField("Im(2)");
			TextField txt5 = new TextField("Sum");
			TextField txt6 = new TextField("Sub");
			TextField txt7 = new TextField("Mul");
			TextField txt8 = new TextField("Div");
			txt5.setEditable(false);
			txt6.setEditable(false);
			txt7.setEditable(false);
			txt8.setEditable(false);
			Button b1 = new Button("Inserisci");
			b1.setMinSize(300, 25);
			b1.setOnAction(event -> {
				int a = Integer.valueOf(txt1.getText());
				int b = Integer.valueOf(txt2.getText());
				int c = Integer.valueOf(txt3.getText());
				int d = Integer.valueOf(txt4.getText());
				Num primo = new Num(a,b);
				Num secondo = new Num(c,d);
				txt5.setText(String.valueOf(primo.sum(secondo)));
				txt6.setText(String.valueOf(primo.sub(secondo)));
				txt7.setText(String.valueOf(primo.mol(secondo)));
				txt8.setText(String.valueOf(primo.div(secondo)));
			});
			b1.setAlignment(Pos.CENTER);
			txt1.setAlignment(Pos.CENTER);
			txt2.setAlignment(Pos.CENTER);
			txt3.setAlignment(Pos.CENTER);
			txt4.setAlignment(Pos.CENTER);
			txt5.setAlignment(Pos.CENTER);
			txt6.setAlignment(Pos.CENTER);
			txt7.setAlignment(Pos.CENTER);
			txt8.setAlignment(Pos.CENTER);
			panel.getChildren().addAll(txt1,txt2,txt3,txt4,b1,txt5,txt6,txt7,txt8);
			Scene scene = new Scene(panel,300,126);
			stage.setScene(scene);
			stage.show();
		}
}