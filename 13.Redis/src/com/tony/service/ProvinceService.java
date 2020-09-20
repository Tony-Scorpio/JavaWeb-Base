package com.tony.service;

import com.tony.domain.Province;

import java.util.List;

/**
 * Author: Tony
 * Blog: https://www.acming.net/
 * Date: 2020/9/17 10:32
 */

public interface ProvinceService {

    public List<Province> findAll();

    public String findAllJson();
}
