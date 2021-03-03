package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0020;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0020Mapper extends BaseMapper<Formmain0020> {
    int batchInsert(@Param("list") List<Formmain0020> list);

    int insertOrUpdate(Formmain0020 record);

    int insertOrUpdateSelective(Formmain0020 record);
}