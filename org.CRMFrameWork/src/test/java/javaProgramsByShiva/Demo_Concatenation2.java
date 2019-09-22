/**
 * 
 */
package javaProgramsByShiva;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lenovo
 *
 */
public class Demo_Concatenation2 {

	public static void main(String[] args) {

		// List<String> list = new ArrayList<String>();

		Map<String, String> map = new HashMap<String, String>();
		map.put("BrandName:", "Apple99");
		map.put("Id:", "102");
		map.put("LaptopName:", "MacPro");
		map.put("username:", "Mohan");
		map.put("password:", "123");

		int count = 0;
		String str = "{";

		for (Map.Entry<String, String> ele : map.entrySet()) {
			if (count == 0) {

				str = str + ele.getKey() + "" + ele.getValue();

			} else if (count == map.size() - 1) {

				str = str + ","+ ele.getKey() + "" + ele.getValue()+"}";

			} else {

				str = str + ","+ ele.getKey() + "" + ele.getValue();
			}
			count = count + 1;

		}
		System.out.println(str);
	}

}
