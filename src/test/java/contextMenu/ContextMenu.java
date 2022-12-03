package contextMenu;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenu extends BaseTests {
    @Test
    public void testContextMenuClick(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.contextClick();
        String text = contextMenuPage.alert_getText();
        contextMenuPage.alert_clickToAccept();
        assertEquals(text,"You selected a context menu","The result doesn't match");
    }
}
