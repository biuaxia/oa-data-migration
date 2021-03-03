package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0016;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0016Mapper extends BaseMapper<Formmain0016> {
    int batchInsert(@Param("list") List<Formmain0016> list);

    int insertOrUpdate(Formmain0016 record);

    int insertOrUpdateSelective(Formmain0016 record);
}