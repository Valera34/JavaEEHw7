package AnikeenkoHw7;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.entities.Teacher;

@Transactional
public class WorkWithTeacher {
@Autowired
private TeachersDao teachersDao;
public Teacher addTeacher(Teacher teacher){
teachersDao.addTeacher(teacher);
System.out.println("Teacher has been added "+teacher.toString());
return teacher;
}
public Teacher getTeacherById(int id){
return teachersDao.getTeacherById(id);
}
public Teacher getTeacherValera(){
return teachersDao.getTeacherValera();
}
public List<Teacher> getTeacherAll() {
	return teachersDao.getTeacherAll();
}
public void saveTacher(Teacher teacher){
teachersDao.saveTacher(teacher);
System.out.println("Teacher has been saved "+teacher.toString());
}
}
