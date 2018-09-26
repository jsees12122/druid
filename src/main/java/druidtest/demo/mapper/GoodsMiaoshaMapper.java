package druidtest.demo.mapper;

import druidtest.demo.vo.GoodsMiaosha;
import druidtest.demo.vo.GoodsMiaoshaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsMiaoshaMapper {
    int countByExample(GoodsMiaoshaExample example);

    int deleteByExample(GoodsMiaoshaExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsMiaosha record);

    int insertSelective(GoodsMiaosha record);

    List<GoodsMiaosha> selectByExample(GoodsMiaoshaExample example);

    GoodsMiaosha selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsMiaosha record, @Param("example") GoodsMiaoshaExample example);

    int updateByExample(@Param("record") GoodsMiaosha record, @Param("example") GoodsMiaoshaExample example);

    int updateByPrimaryKeySelective(GoodsMiaosha record);

    int updateByPrimaryKey(GoodsMiaosha record);
}