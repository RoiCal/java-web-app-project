package il.ac.hit.costmanager;

import java.util.Collection;

public interface IModel {

    void addCost(CostItem item) throws CostManagerException;


    void addCategory(Category item) throws CostManagerException;

    void editCost(CostItem item) throws CostManagerException;

    void editCategory(Category item) throws CostManagerException;

    Collection<CostItem> getCostsItems() throws CostManagerException;

    Collection<Category> getCategoryItems() throws CostManagerException;

    void deleteCost() throws CostManagerException;

    void deleteCategory() throws CostManagerException;

    void printReport() throws CostManagerException;

}
