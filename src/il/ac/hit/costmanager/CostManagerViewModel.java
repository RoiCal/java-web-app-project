package il.ac.hit.costmanager;

import javax.swing.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.*;

public class CostManagerViewModel implements IViewModel {

    private IModel model;
    private IView view;
    private ExecutorService service;

    CostManagerViewModel() {
        this.service = Executors.newFixedThreadPool(3);
    }

    @Override
    public void setView(IView view) {
        this.view = view;
    }

    @Override
    public void setModel(IModel model) {
        this.model = model;
    }

    @Override
    public void addCost(CostItem item) {
        //TODO
    }

    @Override
    public void addCategory(Category item) {
        //TODO
    }

    @Override
    public void editCost(CostItem item) {
        //TODO
    }

    @Override
    public void editCategory(Category item) {
        //TODO
    }

    @Override
    public void deleteCost() {
        //TODO
    }

    @Override
    public void deleteCategory() {

    }

    @Override
    public void printReport() {

    }
}
