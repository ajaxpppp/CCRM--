package com.shen.crm.workbench.mapper;

import com.shen.crm.workbench.domain.TranHistory;

import java.util.List;

public interface TranHistoryMapper {
    int deleteTranHistoryByTranIds(String[] tranId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tran_history
     *
     * @mbggenerated Tue Jan 10 16:38:33 CST 2023
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tran_history
     *
     * @mbggenerated Tue Jan 10 16:38:33 CST 2023
     */
    int insert(TranHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tran_history
     *
     * @mbggenerated Tue Jan 10 16:38:33 CST 2023
     */
    int insertSelective(TranHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tran_history
     *
     * @mbggenerated Tue Jan 10 16:38:33 CST 2023
     */
    TranHistory selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tran_history
     *
     * @mbggenerated Tue Jan 10 16:38:33 CST 2023
     */
    int updateByPrimaryKeySelective(TranHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tran_history
     *
     * @mbggenerated Tue Jan 10 16:38:33 CST 2023
     */
    int updateByPrimaryKey(TranHistory record);

    int insertTranHistory(TranHistory tranHistory);

    List<TranHistory> selectTranHistoryForDetailByTranId(String tranId);
}