//package org.itstep.j2_16;
//
//import java.util.Arrays;
//import java.util.List;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.itstep.j2_16.config.HibernateConfig;
//import org.itstep.j2_16.dao.StudentDao;
//import org.itstep.j2_16.dao.StudentDaoUniversal;
//import org.itstep.j2_16.entity.Adress;
//import org.itstep.j2_16.service.StudentService;
//import org.itstep.j2_16.service.StudentServiceUniversal;
//import org.itstep.j2_16.util.HrDepartment;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.stereotype.Component;
//
//import static java.lang.System.getProperty;
//import static org.apache.commons.lang3.StringUtils.isEmpty;
//import static org.apache.commons.lang3.StringUtils.join;
//import static org.apache.commons.lang3.SystemUtils.LINE_SEPARATOR;
//import static org.itstep.j2_16.config.StartHsqlDbManager.startDBManager;
//@Component
//public class AppUniversal {
//
//
//    private static HrDepartment hrDepartment;
//    @Autowired
//    public AppUniversal(HrDepartment hrDepartment) {
//        AppUniversal.hrDepartment =  hrDepartment;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("== START ==");
//
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
//
//       Adress studentKuzma = (Adress) context.getBean("studentMike");
//        Adress studentSecond = (Adress) context.getBean("studentSecond");
//        List<Adress> studentsForSaving = Arrays.asList( studentSecond, studentKuzma );
//             //   new Adress("Oleh", "Pinta"),
//             //   new Adress("Alex", "Kochetyga"),
//
//
////        // define hibernate config to use
////        SessionFactory sessionFactory;
////        String is_xml = getProperty("is_xml");
////        if (isEmpty(is_xml) || is_xml.equals("false")) {
////            System.out.println("-- run NO xml --");
////            sessionFactory = HibernateConfig.getSessionFactory();
////        } else {
////            System.out.println("-- run xml --");
////            sessionFactory = new Configuration().configure().buildSessionFactory();
////        }
//      //  SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
//
//        // initialization process
////        StudentDao studentDao = new StudentDaoUniversal(sessionFactory);
////        StudentService studentService = new StudentServiceUniversal(studentDao);
////        HrDepartment hrDepartment = new HrDepartment(studentService);
//
//        // save students
//        studentsForSaving.forEach(hrDepartment::saveStudent);
//
//        // get all students
//        List<Adress> students = hrDepartment.getAllStudents();
//        System.out.println(join(students, LINE_SEPARATOR));
//
////        in memory db
//        startDBManager();
//
//        System.out.println("== END ==");
//    }
//}
