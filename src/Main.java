import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.HibernateDao;
import dataAccess.JdbcDao;
import entity.Category;
import entity.Course;
import entity.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Logger> loggerList = new ArrayList<>();
        loggerList.add(new DatabaseLogger());
        loggerList.add(new FileLogger());
        loggerList.add(new MailLogger());

        Category category = new Category(2, "Programlama");
        CategoryManager categoryManager = new CategoryManager(new HibernateDao(), loggerList);
        categoryManager.add(category);

        System.out.println("--------------------------------------------");
        Course course = new Course(1, "Yazılım Geliştirici Yetiştirme Kampı", 1000);

        CourseManager courseManager = new CourseManager(new JdbcDao(), loggerList);
        courseManager.add(course);

        System.out.println("--------------------------------------------");

        Instructor instructor = new Instructor(1, "Engin", "Demiroğ");
        InstructorManager instructorManager = new InstructorManager(new HibernateDao(), loggerList);
        instructorManager.add(instructor);

    }
}
