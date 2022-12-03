package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("E:\\javaprojects\\SeleniumWebDriverWithJava\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getUploadedFiles(),"chromedriver.exe","Uploaded files are incorrect");
    }
}
