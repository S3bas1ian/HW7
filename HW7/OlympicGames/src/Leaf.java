import java.util.ArrayList;
import java.util.List;

public class Leaf implements Component {

	private String name;
	private int numberOfAthletes;
	private int numberOfGold;
	List<Leaf> children = new ArrayList<Leaf>();

	public Leaf(String name, int numberOfAthletes, int numberOfGold) {
		this.name = name;
		this.numberOfAthletes = numberOfAthletes;
		this.numberOfGold = numberOfGold;
	}

	public List<Leaf> getChildren() {
		return children;
	}

	public void add(Leaf c) {
		children.add(c);
	}

	public void remove(Component c) {
		children.remove(c);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getNumberAthletes() {
		// TODO Auto-generated method stub
		return numberOfAthletes;
	}

	@Override
	public int getGoldMedals() {
		// TODO Auto-generated method stub
		return numberOfGold;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		if (children.isEmpty()) {
			System.out.println(name + " " + numberOfAthletes + "  " + numberOfGold);
		} else {
			for (Leaf child : children) {
				child.execute();
			}
		}
	}
}
