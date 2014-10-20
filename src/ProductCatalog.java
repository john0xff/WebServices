import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * https://www.youtube.com/watch?v=u5cQkVgq6jE&index=12&list=PLWvdZOFzHXEv5IXQjl7GS6RLxwrsP56wg
 * 
 * @author BartBien
 *
 */

@WebService
public class ProductCatalog
{

	@WebMethod
	public List<String> getProductCategories()
	{
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}
}