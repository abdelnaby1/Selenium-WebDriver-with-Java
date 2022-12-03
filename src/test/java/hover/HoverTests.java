package hover;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTests extends BaseTests {
    @Test
    public void testHoverUser1(){
        HoversPage hoversPage = homePage.clickHovers();
        var figureCaption =  hoversPage.hoverOverFigure(1);
        assertTrue(figureCaption.isCaptionDisplayed(),"Caption is not displayed");
        assertEquals(figureCaption.getTitle(),"name: user1","Caption title is incorrect");
        assertTrue(figureCaption.getLink().endsWith("/users/1"),"Caption links is incorrect");
        assertEquals(figureCaption.getLinkText(),"View profile","Caption link text is incorrect");
    }
    @Test
    public void testHoverUser2(){
        HoversPage hoversPage = homePage.clickHovers();
        var figureCaption =  hoversPage.hoverOverFigure(2);
        assertTrue(figureCaption.isCaptionDisplayed(),"Caption is not displayed");
        assertEquals(figureCaption.getTitle(),"name: user2","Caption title is incorrect");
        assertTrue(figureCaption.getLink().endsWith("/users/2"),"Caption links is incorrect");
        assertEquals(figureCaption.getLinkText(),"View profile","Caption link text is incorrect");
    }
    @Test
    public void testHoverUser3(){
        HoversPage hoversPage = homePage.clickHovers();
        var figureCaption =  hoversPage.hoverOverFigure(3);
        assertTrue(figureCaption.isCaptionDisplayed(),"Caption is not displayed");
        assertEquals(figureCaption.getTitle(),"name: user3","Caption title is incorrect");
        assertTrue(figureCaption.getLink().endsWith("/users/3"),"Caption links is incorrect");
        assertEquals(figureCaption.getLinkText(),"View profile","Caption link text is incorrect");
    }

}
