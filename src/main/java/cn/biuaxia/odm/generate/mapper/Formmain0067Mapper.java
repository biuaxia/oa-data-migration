package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0067;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0067Mapper extends BaseMapper<Formmain0067> {
    int batchInsert(@Param("list") List<Formmain0067> list);

    int insertOrUpdate(Formmain0067 record);

    int insertOrUpdateSelective(Formmain0067 record);
}