package Utilities.TestModeller;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GetScreenShot {

    public static String captureAsImage(WebDriver driver,String screenShotName) throws IOException
    {
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String dest = "report/"  +"/ErrorScreenshots/"+screenShotName+".png";
        File destination = new File(dest);
        FileUtils.copyFile(source, destination);

        return "ErrorScreenshots/"+screenShotName+".png";
    }

    public static String captureAsBase64(WebDriver driver)
    {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
    }
}