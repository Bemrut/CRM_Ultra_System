package org.itstep.j2_16.service;

import java.util.List;
import org.itstep.j2_16.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceUniversal implements StudentService {
    private StudentDao studentDao;

    @Autowired
    public StudentServiceUniversal(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<org.itstep.j2_16.entity.Adress> getAll() {
        return studentDao.getAll();
    }

    @Override
    public org.itstep.j2_16.entity.Adress save(org.itstep.j2_16.entity.Adress adress) {
        return studentDao.save(adress);
    }
}
