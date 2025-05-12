package il.ac.hit.costmanager;

import javax.swing.*;

public class Program {
    public static void main(String[] args) throws CostManagerException {

        IModel model = new CostManagerModel();
        IViewModel vm = new CostManagerViewModel();
        IView view = new CostManagerView();
        SwingUtilities.invokeLater(() -> {
            view.init();
            view.start();
        });
        vm.setModel(model);
        vm.setView(view);
        view.setIViewModel(vm);

    }
}
