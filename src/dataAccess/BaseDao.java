package dataAccess;

import entity.Category;
import entity.Course;
import entity.Instructor;

public interface BaseDao {
    void addCourse(Course course);

    void addInctructor(Instructor instructor);

    void addCategory(Category category);
}
