package com.tieshan.api.mapper.chegujiaMapper.v1;

import com.tieshan.api.po.chegujiaPo.v1.TieshangjCarPieces;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TieshangjCarPiecesMapper {


    int insertSelective(TieshangjCarPieces record);

    TieshangjCarPieces selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TieshangjCarPieces record);

    //根据车型查看件
    List<TieshangjCarPieces> selectEr(@Param("tiema") String tiema,@Param("fuId") String fuId);
    //查询车型拆车件 变速箱价格 or 发动机总成价格 是否为空
    String selectMoneyNullBorF(@Param("chejianId") String chejianId, @Param("tiema") String tiema,@Param("chaiorjiu") String chaiorjiu);
    //查询拆车件发动机总成价格为空，拆车件变速箱价格不为空||查询拆车件变速箱价格为空，拆车件发动机总长价格不为空
    //旧车件发动机总成价格为空，旧车件(自动)变速箱价格不为空，旧车件(手动)变速箱价格为空
    String selectSumMoneyOne(@Param("chejianId1") String chejianId1,@Param("chejianId2") String chejianId2,@Param("chejianId3") String chejianId3,@Param("tiema") String tiema,@Param("chaiorjiu") String chaiorjiu);
    //查询拆车件发动机总成价格为空，拆车件变速箱价格为空
    //旧车件（自动）变速箱价格为空，旧车件(手动)变速箱价格为空，旧车件发动机总长价格不为空
    String selectSumMoneyTwo(@Param("chejianId1") String chejianId1,@Param("chejianId2") String chejianId2,@Param("chejianId3")String chejianId3,@Param("chejianId4")String chejianId4,@Param("tiema") String tiema,@Param("chaiorjiu") String chaiorjiu);
    //拆车件变速箱价格不为空，拆车件发动机总成价格不为空
    //旧车件发动机总成价格为空，旧车件（自动）变速箱价格为空，旧车件(手动)变速箱价格为空
    String selectSumMoneyThree(@Param("chejianId1") String chejianId1,@Param("chejianId2") String chejianId2,@Param("chejianId3") String chejianId3,@Param("tiema") String tiema,@Param("chaiorjiu") String chaiorjiu);
    //旧车件(自动)变速箱价格不为空，旧车件(手动)变速箱价格为空，旧车件发动机总成价格不为空
    String selectSumMoneyFour(@Param("chejianId1") String chejianId1,@Param("chejianId2") String chejianId2,@Param("chejianId3")String chejianId3,@Param("chejianId4")String chejianId4,@Param("tiema") String tiema,@Param("chaiorjiu") String chaiorjiu);
    String selectSumMoneyFive(@Param("chejianId1") String chejianId1,@Param("chejianId2") String chejianId2,@Param("chejianId3")String chejianId3,@Param("chejianId4")String chejianId4,@Param("tiema") String tiema,@Param("chaiorjiu") String chaiorjiu);
    String selectSumMoneySix(@Param("chejianId1") String chejianId1,@Param("chejianId2") String chejianId2,@Param("chejianId3")String chejianId3,@Param("chejianId4")String chejianId4,@Param("chejianId5")String chejianId5,@Param("tiema") String tiema,@Param("chaiorjiu") String chaiorjiu);
    //查询废料价格之和
    String selectMoneyWaste(String tiema);
    //批量修改
    Long updateHytemplateBatch(@Param(value = "hytemplateList")List<TieshangjCarPieces> hytemplateList);

    Integer countSelectTiema(String tiema);
}