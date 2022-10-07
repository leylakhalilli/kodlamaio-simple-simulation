import business.CategoryManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.HibernateDao;
import entity.Category;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Logger> loggerList = new ArrayList<>();
        loggerList.add(new DatabaseLogger());
        loggerList.add(new FileLogger());
        loggerList.add(new MailLogger());

        Category category = new Category(2, "Java React");
        CategoryManager categoryManager = new CategoryManager(new HibernateDao(), loggerList);
        categoryManager.add(category);
    }
}
