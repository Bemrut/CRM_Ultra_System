package org.itstep.j2_16.dao;

import java.util.List;

public interface StudentDao {

    List<org.itstep.j2_16.entity.Adress> getAll();

    org.itstep.j2_16.entity.Adress save(org.itstep.j2_16.entity.Adress adress);
}
