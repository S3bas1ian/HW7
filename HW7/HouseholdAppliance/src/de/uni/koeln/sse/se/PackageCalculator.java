package de.uni.koeln.sse.se;

import java.util.List;

public class PackageCalculator implements Visitor {

	private List<HouseholdItem> householdItems;

	public PackageCalculator(List<HouseholdItem> householdItems) {
		// TODO Auto-generated constructor stub
		this.householdItems = householdItems;
		calcPackage(householdItems);
	}

	private void calcPackage(List<HouseholdItem> householdItems) {
		for (HouseholdItem h : householdItems) {
			h.accept(this);
		}

	}

	@Override
	public void visitGlass(Glass g) {
		// TODO Auto-generated method stub
		System.out.println(
				g.getName().toUpperCase() + "\t > Should be wrapped with bubble wraps in a box with dimension of "
						+ g.getHeight() + 1 + "x" + g.getWidth() + 1 + "x" + g.getLenght() + 1);

	}

	@Override
	public void visitFurniture(Furniture f) {
		// TODO Auto-generated method stub
		System.out.println(f.getName().toUpperCase() + "\t > Should be covered with waterproof covers with area of "
				+ f.getWidth() + "x" + f.getLenght());
	}

	@Override
	public void visitElectronic(Electronic e) {
		// TODO Auto-generated method stub
		System.out.println(e.getName().toUpperCase()
				+ "\t > Should be covered with polyethylen foam film and packed in a box with dimension of "
				+ e.getHeight() + 1 + "x" + e.getWidth() + 1 + "x" + e.getLenght() + 1);
	}

}
