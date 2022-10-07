package business;

import core.logging.Logger;
import dataAccess.BaseDao;
import entity.Instructor;

import java.util.List;

public class InstructorManager {
    private BaseDao baseDao;
    List<Logger> loggerList;

    public InstructorManager(BaseDao baseDao, List<Logger> loggerList) {
        this.baseDao = baseDao;
        this.loggerList = loggerList;
    }

    public void add(Instructor newInstructor) {

        baseDao.addInctructor(newInstructor);
        for (Logger logger : loggerList) {
            logger.log(newInstructor.getFirstName() + " " + newInstructor.getLastName());
        }
    }
}
