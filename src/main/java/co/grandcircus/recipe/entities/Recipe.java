package co.grandcircus.recipe.entities;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="recipe")
public class Recipe{
	@Id
	private String uri;
	private String label;
	private String image;
	private String url;
	
	
	public Recipe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Recipe(String label, String image, String url, String uri) {
		super();
		this.label = label;
		this.image = image;
		this.url = url;
		this.uri = uri;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	@Override
	public String toString() {
		return "Recipe [label=" + label + ", image=" + image + ", url=" + url + ", uri=" + uri + "]";
	}
	
	
	


}
