package co.grandcircus.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.recipe.dao.RecipeDao;
import co.grandcircus.recipe.entities.Recipe;
import co.grandcircus.recipe.entities.Results;


@Controller
public class RecipeController {
	
	@Autowired
	RecipeDao recipedao;
	
	//store application Id in a variable(recipeId)
	private static final String recipeId = "cc3cb3be";
	
	@Value("${recipe_key}")
	private static final String RECIPE_KEY = "d7666da86ac6b1d0fa76521b73849016";
	
//	@RequestMapping("/")
//		public ModelAndView showRecipes() {
//		ModelAndView mav = new ModelAndView("index");
//		return mav;
		
	@RequestMapping("/")
	public ModelAndView showRecipes() {
		ModelAndView mav = new ModelAndView("index");
//		
//		
		// Create a rest template
		RestTemplate restTemplate = new RestTemplate();
//		
		// Set url  //ADDED searchq=label (still not working)
		String url = "https://api.edamam.com/search?q=chicken&app_id=" + recipeId + "&app_key=" + RECIPE_KEY;
//		
//
		// Make the Request.
		ResponseEntity<Results> response = restTemplate.exchange(url, HttpMethod.GET,
				new HttpEntity<>(null), Results.class);
//
		// Extract body from response.
		
		Results result = response.getBody();
		
		System.out.println("yay");
		System.out.println(result.getHits());
		mav.addObject("result", result.getHits());
		return mav;
//	}

}
}	
