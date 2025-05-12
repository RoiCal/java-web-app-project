package il.ac.hit.costmanager;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CostManagerModelTest {

    CostManagerModel model;

    @BeforeEach
    void setUp() throws CostManagerException {
        model = new CostManagerModel();
    }

    @AfterEach
    void tearDown() {
        model = null;
    }

    @Test
    void addCost() throws CostManagerException {
        Category category = new Category("category");
        CostItem item = new CostItem(category, "something expensive", 7, "doge coin", new Date(2021/01/01));
        assertTrue(model.getCostsItems().isEmpty());
        model.addCost(item);
        assertFalse(model.getCostsItems().isEmpty());
        assertTrue(model.getCostsItems().contains(item));
    }

    @Test
    void addCategory() throws CostManagerException {
        Category category = new Category("category");
        assertTrue(model.getCategoryItems().isEmpty());
        model.addCategory(category);
        assertFalse(model.getCategoryItems().isEmpty());
        assertTrue(model.getCategoryItems().contains(category));
    }

}