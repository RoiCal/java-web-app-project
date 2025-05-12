package il.ac.hit.costmanager;

import java.util.*;

public interface IView {
    void showItems(Collection<CostItem> items);

    void setIViewModel(IViewModel vm);

    void init();

    void start();
}
