package co.grandcircus.recipe.entities;

public class Hits {
	
	private Recipe recipe;

	public Hits() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hits(Recipe recipe) {
		super();
		this.recipe = recipe;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	@Override
	public String toString() {
		return "Hit [recipe=" + recipe + "]";
	}

}
