package il.ac.hit.costmanager;

public interface IViewModel {

    void setView(IView view);

    void setModel(IModel model);

    void addCost(CostItem item);

    void addCategory(Category item);

    void editCost(CostItem item);

    void editCategory(Category item);

    void deleteCost();

    void deleteCategory();

    void printReport();

}
