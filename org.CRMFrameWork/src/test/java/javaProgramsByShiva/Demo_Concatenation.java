/**
 * 
 */
package javaProgramsByShiva;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 *
 */
public class Demo_Concatenation {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Apple99");
		list.add("102");
		list.add("MacproAdvance");
		list.add("Mohan");
		list.add("Kumar");

		String str = "{ BrandName:";

		int count = 0;

		for (String ele : list) {

			if (count == 0) {

				str = str + ele;

			} else if (count == list.size() - 1) {

				str = str + " , BrandName:" + ele + "}";

			} else {

				str = str + " , BrandName:" + ele;
			}
			count = count + 1;
		}

		System.out.println(str);
	}

}
