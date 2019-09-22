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
public class Demo_Concatnation3 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("BrandName", "Apple99");
		map.put("Id", "102");
		map.put("LaptopName", "Macpro");
		
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("Features:", "");
		map1.put("Features:", "644GB RAM");
		
		int count =0;
		
		String str = "{";
//		String str1 = "";
		
		for(Map.Entry<String, String> ele: map.entrySet()){
			
			if(count==0){
				
				str = str + ele.getKey() + " "+ele.getValue();
				
			}else if (count == map.size()-1) {
				
			}else{
				
				
			}
			
			count = count + 1;
		}
		
	
	}
}
