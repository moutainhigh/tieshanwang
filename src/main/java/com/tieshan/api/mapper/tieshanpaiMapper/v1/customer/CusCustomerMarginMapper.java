package com.tieshan.api.mapper.tieshanpaiMapper.v1.customer;

import com.tieshan.api.po.tieshanpaiPo.v1.customer.CusCustomerMargin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author ningrz
 * @version 1.0
 * @date 2019/8/16 17:39
 */
@Repository
public interface CusCustomerMarginMapper {

    //获取用户实名认证状态
    Integer getRealNameState(@Param("mid")String mid);

    //冻结保证金
    int freezeCusCustomerMargin(CusCustomerMargin cusCustomerMargin);

    //解冻保证金
    int updateCusCustomerMarginUnlock(CusCustomerMargin cusCustomerMargin);

    //获取我的保证金余额
    CusCustomerMargin getCusCustomerMarginByMember(CusCustomerMargin cusCustomerMargin);
}
