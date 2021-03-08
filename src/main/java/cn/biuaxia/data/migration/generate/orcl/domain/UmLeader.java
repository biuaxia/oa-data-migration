package cn.biuaxia.data.migration.generate.orcl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "UM_LEADER")
public class UmLeader implements Serializable {
    @TableId(value = "LEAD_ID", type = IdType.INPUT)
    private Long leadId;

    @TableField(value = "INFERIOR_ID")
    private String inferiorId;

    @TableField(value = "DEPT_ID")
    private String deptId;

    private static final long serialVersionUID = 1L;

    public static final String COL_LEAD_ID = "LEAD_ID";

    public static final String COL_INFERIOR_ID = "INFERIOR_ID";

    public static final String COL_DEPT_ID = "DEPT_ID";
}