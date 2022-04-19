package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @author WuYaozhao
 * @create 2022-04-14 22:14
 */
@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{

    @Override
    public String select() {
        return "Hibernate";
    }

}
