package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0063;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0063Mapper extends BaseMapper<Formmain0063> {
    int batchInsert(@Param("list") List<Formmain0063> list);

    int insertOrUpdate(Formmain0063 record);

    int insertOrUpdateSelective(Formmain0063 record);
}