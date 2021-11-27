package de.uni.koeln.sse.se;

import java.util.List;

public class PriceCalculator implements Visitor {

	private List<HouseholdItem> householdItems;

	public PriceCalculator(List<HouseholdItem> householdItems) {
		this.householdItems = householdItems;
		calcPrice(householdItems);
	}

	private void calcPrice(List<HouseholdItem> householdItems) {
		for (HouseholdItem h : householdItems) {
			h.accept(this);
		}

	}

	@Override
	public void visitGlass(Glass g) {
		// TODO Auto-generated method stub
		if (g.getTickness() == 1) {
			System.out.println("Total cost for " + g.getName() + " is: " + 2 * g.getLenght() + " €");
		} else if (g.getTickness() == 2) {
			System.out.println("Total cost for " + g.getName() + " is: " + 1.2 * g.getLenght() + " €");
		} else {
			System.out.println("Total cost for " + g.getName() + " is: " + 0.7 * g.getLenght() + " €");
		}
	}

	@Override
	public void visitFurniture(Furniture f) {
		// TODO Auto-generated method stub
		System.out.println("Total cost for " + f.getName() + " is: " + 0.25 * f.getWeight() + " €");
	}

	@Override
	public void visitElectronic(Electronic e) {
		// TODO Auto-generated method stub
		if (e.getFragile()) {
			System.out.println("Total cost for " + e.getName() + " is: " + 0.5 * e.getWeight() + " €");
		} else {
			System.out.println("Total cost for " + e.getName() + " is: " + e.getWeight() / 3 + " €");
		}
	}

}
