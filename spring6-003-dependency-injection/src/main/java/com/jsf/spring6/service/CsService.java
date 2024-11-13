package com.jsf.spring6.service;

import com.jsf.spring6.dao.CsDao;

/**
 * @Description
 * @FileName CsService
 * @Author JSF
 * @date 2024-05-07
 **/
public class CsService {
    CsDao csDao;

    public CsService(CsDao csDao) {
        this.csDao = csDao;
    }

    public void delete(){
        csDao.delete();
    }
}
