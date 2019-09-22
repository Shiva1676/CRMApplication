/**
 * 
 *//*
package javaProgramsByShiva;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

*//**
 * @author Lenovo
 *
 *//*
public class Demo_Concatnation3 {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, List<String>> map1 = new HashMap<String, List<String>>();
		
		map.put("BrandName", "Apple99");
		map.put("Features", map1);
		map.put("Id", "102");
		map.put("LaptopName", "Macpro");
		
		
		List<String> stList = new ArrayList<String>();
		stList.add("644GB RAM");
		stList.add("322TB Hard Drive");
		map1.put("Feature", stList);
		
		int count =0;
		
		String str = "{";
//		String str1 = "";
		
		for(Map.Entry<String, Object> ele: map.entrySet()){
			
			if(count==0){
				
				str = str + ele.getKey() + " : "+ele.getValue();
				
			}else if (count == map.size()-1) {
				str = str + ","+ ele.getKey() + " : " + ele.getValue()+"}";
				
			}else{
				if("Features".equalsIgnoreCase(ele.getKey())) {
					str = str + ","+ ele.getKey() + " : {";
					Map<String, List<String>> map2 = (Map<String, List<String>>) ele.getValue();
					for(Map.Entry<String, List<String>> ele2: map2.entrySet()){
						
						str = str + ele2.getKey() + " : ";
						for(String :)
						
					}
				} 
				str = str + ","+ ele.getKey() + " : " + ele.getValue();
				
			}
			
			count = count + 1;
		}
		System.out.println(str);
	
	}
}
*/