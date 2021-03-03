package cn.biuaxia.odm.generate.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "FORM_RESOURCE")
public class FormResource implements Serializable {
    
    @TableId(value = "ID", type = IdType.INPUT)
    private Long id;

    @TableField(value = "FORM_ID")
    private Long formId;

    @TableField(value = "RESOURCE_NAME")
    private String resourceName;

    @TableField(value = "CONTENT")
    private String content;

    @TableField(value = "PROPERTY_TYPE")
    private Short propertyType;

    @TableField(value = "PROPERTY_NAME")
    private String propertyName;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "ID";

    public static final String COL_FORM_ID = "FORM_ID";

    public static final String COL_RESOURCE_NAME = "RESOURCE_NAME";

    public static final String COL_CONTENT = "CONTENT";

    public static final String COL_PROPERTY_TYPE = "PROPERTY_TYPE";

    public static final String COL_PROPERTY_NAME = "PROPERTY_NAME";
}