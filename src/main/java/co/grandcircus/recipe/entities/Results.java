package co.grandcircus.recipe.entities;

import java.util.List;

//class names must match JSON array/object names exactly
public class Results {

 private List<Hits> hits;

public Results() {
	super();
	// TODO Auto-generated constructor stub
}

public Results(List<Hits> hits) {
	super();
	this.hits = hits;
}

public List<Hits> getHits() {
	return hits;
}

public void setHits(List<Hits> hits) {
	this.hits = hits;
}

@Override
public String toString() {
	return "Results [hits=" + hits + "]";
}
 


}
