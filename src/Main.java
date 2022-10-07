import business.CategoryManager;
import core.logging.DatabaseLogger;
import core.logging.Logger;
import dataAccess.BaseDao;
import dataAccess.HibernateDao;
import dataAccess.JdbcDao;
import entity.Category;
import entity.Course;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course course = new Course(1, "JAVA", 1000);
//        BaseDao baseDao=new JdbcDao();
//        baseDao.addCategory(new Category(1,"random"));
        Category category = new Category(1, "Java Camp");
        List<Logger> loggers = new ArrayList<>();
        loggers.add(new DatabaseLogger());

//        CategoryManager categoryManager=new CategoryManager(new HibernateDao(),loggers);
//        categoryManager.add(category);

    }
}
