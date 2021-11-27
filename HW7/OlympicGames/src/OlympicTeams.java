import java.util.ArrayList;
import java.util.List;

public class OlympicTeams {

	List<Leaf> children = new ArrayList<Leaf>();

	public OlympicTeams() {
		init();

		for (Leaf child : children) {
			child.execute();
		}
	}

	private void init() {

		// Add Teams to Olympic Teams
		children.add(new Leaf("Asia Team", 10, 0));
		children.add(new Leaf("Africa Team", 10, 0));
		children.add(new Leaf("Europe Team", 10, 0));
		children.add(new Leaf("South America Team", 10, 0));

		// Add Teams to Asia
		children.get(0).add(new Leaf("China Team", 10, 0));
		children.get(0).add(new Leaf("Afghanistan Team", 10, 0));

		// Add Teams to China
		children.get(0).getChildren().get(0).add(new Leaf("Womens Team", 10, 0));
		children.get(0).getChildren().get(0).add(new Leaf("Mens Team", 10, 0));

		children.get(0).getChildren().get(0).getChildren().get(0).add(new Leaf("Teakwondo", 10, 0));
		children.get(0).getChildren().get(0).getChildren().get(0).add(new Leaf("Waterpolo", 10, 0));
		children.get(0).getChildren().get(0).getChildren().get(0).add(new Leaf("Artistic Gymnastic", 10, 0));

		children.get(0).getChildren().get(0).getChildren().get(1).add(new Leaf("Shooting", 10, 0));

		// Add Europe Teams
		children.get(2).add(new Leaf("Germany Team", 10, 0));
		children.get(2).add(new Leaf("Italy Team", 10, 0));

		children.get(2).getChildren().get(0).add(new Leaf("Womens Team", 10, 0));
		children.get(2).getChildren().get(0).add(new Leaf("Mens Team", 10, 0));

		children.get(2).getChildren().get(0).getChildren().get(0).add(new Leaf("Cycling", 10, 0));
		children.get(2).getChildren().get(0).getChildren().get(0).add(new Leaf("Tennis", 10, 0));

		children.get(2).getChildren().get(0).getChildren().get(1).add(new Leaf("Table Tennis", 10, 0));
		children.get(2).getChildren().get(0).getChildren().get(1).add(new Leaf("Football", 10, 0));
	}
}
