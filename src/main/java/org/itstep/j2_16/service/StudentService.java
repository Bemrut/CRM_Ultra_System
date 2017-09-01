package org.itstep.j2_16.service;

import java.util.List;

public interface StudentService {

    List<org.itstep.j2_16.entity.Adress> getAll();

    org.itstep.j2_16.entity.Adress save(org.itstep.j2_16.entity.Adress adress);
}
