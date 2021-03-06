package com.tieshan.api.service.chegujiaService.v1.impl;

import com.tieshan.api.mapper.chegujiaMapper.v1.TieshangjCarPiecesMapper;
import com.tieshan.api.po.chegujiaPo.v1.TieshangjCarPieces;
import com.tieshan.api.service.chegujiaService.v1.TieshangjCarPiecesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TieshangjCarPiecesServiceImpl implements TieshangjCarPiecesService {
    @Autowired
    private TieshangjCarPiecesMapper tieshangjCarPiecesMapper;
    @Override
    public String selectMoneyNullBorF(String chejianId, String tiema,String chaiorjiu) {
        return tieshangjCarPiecesMapper.selectMoneyNullBorF(chejianId,tiema,chaiorjiu);
    }

    @Override
    public String selectSumMoneyOne(String chejianId1, String chejianId2, String chejianId3, String tiema, String chaiorjiu) {
        return tieshangjCarPiecesMapper.selectSumMoneyOne(chejianId1,chejianId2,chejianId3,tiema,chaiorjiu);
    }

    @Override
    public String selectSumMoneyTwo(String chejianId1, String chejianId2, String chejianId3, String chejianId4, String tiema, String chaiorjiu) {
        return tieshangjCarPiecesMapper.selectSumMoneyTwo(chejianId1,chejianId2,chejianId3,chejianId4,tiema,chaiorjiu);
    }

    @Override
    public String selectSumMoneyThree(String chejianId1, String chejianId2, String chejianId3, String tiema, String chaiorjiu) {
        return tieshangjCarPiecesMapper.selectSumMoneyThree(chejianId1,chejianId2,chejianId3,tiema,chaiorjiu);
    }

    @Override
    public String selectSumMoneyFour(String chejianId1, String chejianId2, String chejianId3, String chejianId4, String tiema, String chaiorjiu) {
        return tieshangjCarPiecesMapper.selectSumMoneyFour(chejianId1,chejianId2,chejianId3,chejianId4,tiema,chaiorjiu);
    }

    @Override
    public String selectSumMoneyFive(String chejianId1, String chejianId2, String chejianId3, String chejianId4, String tiema, String chaiorjiu) {
        return tieshangjCarPiecesMapper.selectSumMoneyFive(chejianId1,chejianId2,chejianId3,chejianId4,tiema,chaiorjiu);
    }

    @Override
    public String selectSumMoneySix(String chejianId1, String chejianId2, String chejianId3, String chejianId4, String chejianId5, String tiema, String chaiorjiu) {
        return tieshangjCarPiecesMapper.selectSumMoneySix(chejianId1,chejianId2,chejianId3,chejianId4,chejianId5,tiema,chaiorjiu);
    }


    @Override
    public String selectMoneyWaste(String tiema) {
        return tieshangjCarPiecesMapper.selectMoneyWaste(tiema);
    }

    @Override
    public List<TieshangjCarPieces> selectEr(String tiema, String fuId) {
        return tieshangjCarPiecesMapper.selectEr(tiema,fuId);
    }

    @Override
    public Long updateHytemplateBatch(List<TieshangjCarPieces> hytemplateList) {
        return tieshangjCarPiecesMapper.updateHytemplateBatch(hytemplateList);
    }

    @Override
    public Integer countSelectTiema(String tiema) {
        return tieshangjCarPiecesMapper.countSelectTiema(tiema);
    }

}
