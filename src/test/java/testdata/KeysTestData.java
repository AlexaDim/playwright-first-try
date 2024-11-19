package testdata;

	import org.testng.annotations.DataProvider;

	public class KeysTestData {
	    @DataProvider //(name = "other-key-presses")
	    public static Object[][] pressKeysTestData() {
	        Object[][] testdata = new Object[3][2];

	        testdata[0][0] = "PageUp";
	        testdata[0][1] = "PAGE_UP";
	        
	        testdata[1][0] = "ArrowLeft";
	        testdata[1][1] = "LEFT";

	        testdata[2][0] = "CapsLock";
	        testdata[2][1] = "CAPS_LOCK";

	        return testdata;
	    }
	}

