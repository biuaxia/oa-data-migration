package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0099;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0099Mapper extends BaseMapper<Formmain0099> {
    int batchInsert(@Param("list") List<Formmain0099> list);

    int insertOrUpdate(Formmain0099 record);

    int insertOrUpdateSelective(Formmain0099 record);
}