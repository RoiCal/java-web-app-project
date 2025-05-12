package il.ac.hit.costmanager;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class CostManagerView implements IView {

    private IViewModel vm;
    private JFrame frame;
    private JPanel northPanel, southPanel, centerPanel, westPanel, eastPanel;

    //Log in components
    private JLabel loginTitle;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JButton loginBtn;
    private JButton LoginRegisterBtn;
    private JTextField usernameLoginField;
    private JPasswordField passwordLoginField;

    //Register in components
    private JLabel registerTitle;
    private JLabel userRegisterLabel;
    private JLabel passwordRegisterLabel;
    private JTextField usernameRegisterField;
    private JTextField passwordRegisterField;
    private JButton regRegisterBtn;

    //main menu components
    private JButton addCostBtn;
    private JButton editCostBtn;
    private JButton addCategoryBtn;
    private JButton editCategoryBtn;
    private JButton printReportBtn;
    private JLabel selectDateLabel;
    private JTextArea fromDateTF;
    private JTextArea toDateTF;
    private JPopupMenu categorySelectMenu;
    private JTextArea activityArea;
    private JLabel mainTitle;


    public CostManagerView() {
    }

    public void init() {
        //main window
        frame = new JFrame();
        northPanel = new JPanel();
        southPanel = new JPanel();
        centerPanel = new JPanel();
        westPanel = new JPanel();
        eastPanel = new JPanel();

        //Login
        loginTitle = new JLabel("My Cost Manager");
        usernameLabel = new JLabel("Username");
        passwordLabel = new JLabel("Password");
        loginBtn = new JButton("Login");
        LoginRegisterBtn = new JButton("Register");
        usernameLoginField = new JTextField(10);
        passwordLoginField = new JPasswordField(10);

        //register
        registerTitle = new JLabel("Register");
        userRegisterLabel = new JLabel("Enter Username");
        passwordRegisterLabel = new JLabel("Enter Password");
        usernameRegisterField = new JTextField(10);
        passwordRegisterField = new JTextField(10);
        regRegisterBtn = new JButton("Create Account");

        //main menu
        mainTitle = new JLabel("My Cost Manager");
        addCostBtn = new JButton("Add Cost");
        editCostBtn = new JButton("Edit Cost");
        addCategoryBtn = new JButton("Add Category");
        editCategoryBtn = new JButton("Edit Category");
        printReportBtn = new JButton("View Report");
        selectDateLabel = new JLabel("Select dates");
        fromDateTF = new JTextArea("from date",1,10);
        toDateTF = new JTextArea("to date",1,10);
        categorySelectMenu = new JPopupMenu("Select Category");
        activityArea = new JTextArea(10,10);


    }

    public void start() {
        //main ..window
        frame.setTitle("My Cost Manager");
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout(75, 75));
        frame.setVisible(true);
        frame.add(northPanel, BorderLayout.NORTH);
        frame.add(southPanel, BorderLayout.SOUTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(westPanel, BorderLayout.WEST);
        frame.add(eastPanel, BorderLayout.EAST);
        centerPanel.setLayout(new FlowLayout());
        northPanel.setLayout(new FlowLayout());
        southPanel.setLayout(new FlowLayout());

        //Login Screen
      /*  northPanel.add(loginTitle);
        loginTitle.setFont(new Font("Ariel", Font.BOLD, 32));
        centerPanel.add(usernameLabel);
        centerPanel.add(usernameLoginField);
        centerPanel.add(Box.createHorizontalStrut(400));
        centerPanel.add(passwordLabel);
        centerPanel.add(passwordLoginField);
        southPanel.add(loginBtn);
        southPanel.add(Box.createHorizontalStrut(10));
        southPanel.add(LoginRegisterBtn);*/

        //Register Screen
        /*northPanel.add(registerTitle);
        registerTitle.setFont(new Font("Ariel", Font.BOLD, 32));
        centerPanel.add(userRegisterLabel);
        centerPanel.add(usernameRegisterField);
        centerPanel.add(Box.createHorizontalStrut(200));
        centerPanel.add(passwordRegisterLabel);
        centerPanel.add(passwordRegisterField);
        southPanel.add(regRegisterBtn);*/

        //Main Screen
        northPanel.add(mainTitle);
        mainTitle.setFont(new Font("Ariel", Font.BOLD, 32));
        westPanel.setLayout(new BoxLayout(westPanel, BoxLayout.Y_AXIS));
        eastPanel.setLayout(new BoxLayout(eastPanel, BoxLayout.Y_AXIS));
        northPanel.setLayout(new BoxLayout(northPanel, BoxLayout.Y_AXIS));
        northPanel.add(selectDateLabel);
        northPanel.add(fromDateTF,BoxLayout.LINE_AXIS);
        northPanel.add(Box.createHorizontalStrut(100));
        northPanel.add(toDateTF,BoxLayout.LINE_AXIS);
        westPanel.add(printReportBtn);
        westPanel.add(addCostBtn);
        westPanel.add(editCostBtn);
        westPanel.add(addCategoryBtn);
        westPanel.add(editCategoryBtn);
        eastPanel.add(categorySelectMenu);
        centerPanel.add(Box.createHorizontalStrut(100));
        eastPanel.add(activityArea);


    }

    @Override
    public void showItems(Collection<CostItem> items) {
        // TODO
    }


    @Override
    public void setIViewModel(IViewModel vm) {
        this.vm = vm;
    }
}
