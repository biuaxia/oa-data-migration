package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0019;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0019Mapper extends BaseMapper<Formmain0019> {
    int batchInsert(@Param("list") List<Formmain0019> list);

    int insertOrUpdate(Formmain0019 record);

    int insertOrUpdateSelective(Formmain0019 record);
}