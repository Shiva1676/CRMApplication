/**
 * 
 */
package dataProviderFactory;

/**
 * @author Lenovo
 *
 */
public class ObjectFactory {

	
	public static ConfigurationFile getConfig(){
		
		ConfigurationFile config = new ConfigurationFile();
		
		return config;
		
	}
	
	public static ExcelDataProvider getExcelInfo(){
		
		ExcelDataProvider excel = new ExcelDataProvider();
		
		return excel;
	}
}
