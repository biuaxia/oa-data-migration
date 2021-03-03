package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0014;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0014Mapper extends BaseMapper<Formmain0014> {
    int batchInsert(@Param("list") List<Formmain0014> list);

    int insertOrUpdate(Formmain0014 record);

    int insertOrUpdateSelective(Formmain0014 record);
}