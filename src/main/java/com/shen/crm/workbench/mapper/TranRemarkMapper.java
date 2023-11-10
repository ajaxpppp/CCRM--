package com.shen.crm.workbench.mapper;

import com.shen.crm.workbench.domain.Tran;
import com.shen.crm.workbench.domain.TranRemark;

import java.util.List;

public interface TranRemarkMapper {
    int insertTranRemark(TranRemark tranRemark);

    int deleteTranRemarkById(String id);

    int updateTranRemark(TranRemark tranRemark);

    int deleteTranRemarkByTranIds(String[] tranId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tran_remark
     *
     * @mbggenerated Mon Jan 09 21:34:32 CST 2023
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tran_remark
     *
     * @mbggenerated Mon Jan 09 21:34:32 CST 2023
     */
    int insert(TranRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tran_remark
     *
     * @mbggenerated Mon Jan 09 21:34:32 CST 2023
     */
    int insertSelective(TranRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tran_remark
     *
     * @mbggenerated Mon Jan 09 21:34:32 CST 2023
     */
    TranRemark selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tran_remark
     *
     * @mbggenerated Mon Jan 09 21:34:32 CST 2023
     */
    int updateByPrimaryKeySelective(TranRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tran_remark
     *
     * @mbggenerated Mon Jan 09 21:34:32 CST 2023
     */
    int updateByPrimaryKey(TranRemark record);

    int insertTranRemarkByList(List<TranRemark> list);

    List<TranRemark> selectTranRemarkForDetailByTranId(String tranId);


}