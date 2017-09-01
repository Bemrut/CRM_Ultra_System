package org.itstep.j2_16.dao;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoUniversal implements StudentDao {
    private SessionFactory sessionFactory;

    @Autowired
    public StudentDaoUniversal(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<org.itstep.j2_16.entity.Adress> getAll() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<org.itstep.j2_16.entity.Adress> query = builder.createQuery(org.itstep.j2_16.entity.Adress.class);
        Root<org.itstep.j2_16.entity.Adress> variableRoot = query.from(org.itstep.j2_16.entity.Adress.class);
        query.select(variableRoot);
        List<org.itstep.j2_16.entity.Adress> adresses = session.createQuery(query).getResultList();

        session.getTransaction().commit();
        session.close();

        return adresses;
    }

    @Override
    public org.itstep.j2_16.entity.Adress save(org.itstep.j2_16.entity.Adress adress) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        org.itstep.j2_16.entity.Adress savedAdress = (org.itstep.j2_16.entity.Adress) session.merge(adress);

        session.getTransaction().commit();
        session.close();

        return savedAdress;
    }
}
