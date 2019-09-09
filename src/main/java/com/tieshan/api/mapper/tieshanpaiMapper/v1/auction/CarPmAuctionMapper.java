package com.tieshan.api.mapper.tieshanpaiMapper.v1.auction;

import com.tieshan.api.po.tieshanpaiPo.v1.auction.AuctionCar;
import com.tieshan.api.po.tieshanpaiPo.v1.auction.CarPmDeal;
import com.tieshan.api.po.tieshanpaiPo.v1.auction.Paimai;
import com.tieshan.api.vo.tieshanpaiVo.v1.auction.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CarPmAuctionMapper{

    List<CarPmAuctionVo> findAuction(CarPmAuctionVo auction);

    Integer findAuctionTotal(CarPmAuctionVo auction);

    CarPmAuctionVo getAuctionInfo(String id);

    List<Paimai> getPaimaiListByPage(PaimaiVo paimai);

    int getPaimaiListTotal(PaimaiVo paimai);

    List<AuctionCar> getAuctionCarList(String pmhId,String pmOrderBy);

    int updateSinglePiece(@Param("smap")Map smap);

    CarPmAuctionVo getAuctionInfoByWS(@Param("auctionNo")String auctionNo);

    int getHeightPrice(@Param("auctionId")String auctionId);

    List<CarPmResultVo> getIngPaiPin();

    List<CarPmResultVo> getIngPmh();

    List<StartVO> getStartResult();

    String getMembers(@Param("ppNo")String dealTime);

    DealVO getAuctionDealInfo(@Param("dealId")String id);

    int addDealOrder(CarPmDeal cd);

    List<CarPmDeal> getPmOrderByMemberId(@Param("mid")String mid);
}