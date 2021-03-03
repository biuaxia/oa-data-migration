package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0808;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0808Mapper extends BaseMapper<Formmain0808> {
    int updateBatch(List<Formmain0808> list);

    int updateBatchSelective(List<Formmain0808> list);

    int batchInsert(@Param("list") List<Formmain0808> list);

    int insertOrUpdate(Formmain0808 record);

    int insertOrUpdateSelective(Formmain0808 record);
}