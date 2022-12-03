package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HorizontalSliderTests extends BaseTests {
    @Test
    public void testHorizontalSlider(){
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.changeRange(4);
        assertTrue(sliderPage.isDisplayed(),"The slider is not displayed");
        assertEquals(sliderPage.getResult(),"2","Range value is incorrect");
    }
}
