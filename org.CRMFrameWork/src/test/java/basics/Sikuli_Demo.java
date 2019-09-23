/**
 * 
 */
package basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

/**
 * @author Lenovo
 *
 */
public class Sikuli_Demo {

	@Test
	public void test() throws FindFailed, InterruptedException, AWTException {

		// Thread.sleep(2000);

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_WINDOWS);
		r.keyPress(KeyEvent.VK_D);
		
		r.keyRelease(KeyEvent.VK_WINDOWS);
		r.keyRelease(KeyEvent.VK_D);

		Screen s = new Screen();

		s.doubleClick("F:\\Sikuli\\Capture.PNG");

	}

}
