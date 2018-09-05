package co.grandcircus.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.recipe.dao.RecipeDao;
import co.grandcircus.recipe.entities.Recipe;


@Controller
public class RecipeController {
	
	@Autowired
	RecipeDao recipedao;
	
	//store application Id in a variable(recipeId)
	private static final String recipeId = "cc3cb3be";
	
	@Value("${recipe_key}")
	private static final String RECIPE_KEY = "d7666da86ac6b1d0fa76521b73849016";
	
	@RequestMapping("/")
		public ModelAndView showRecipes() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
		
//	@RequestMapping("/")
//	public ModelAndView showRecipes() {
//		ModelAndView mav = new ModelAndView("index");
//		
//		
//		// Create a rest template
//		RestTemplate restTemplate = new RestTemplate();
//		
//		// Set url
//		String url = "https://api.edamam.com/search&app_id=" + recipeId + "&app_key=" + RECIPE_KEY;
//				
//				//https://api.edamam.com/search&app_id=${YOUR_APP_ID}&app_key=${YOUR_APP_KEY}
//
//		// Make the Request.
//		ResponseEntity<Recipe> response = restTemplate.exchange(url, HttpMethod.GET,
//				null, Recipe.class);
//
//		// Extract body from response.
//		Recipe result = response.getBody();
//		
//		mav.addObject("recipe", result.getLabel());
//		return mav;
//	}

}
}	
