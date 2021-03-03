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
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "CTP_ATTACHMENT")
public class CtpAttachment implements Serializable {

    public static final String COL_ID = "ID";
    public static final String COL_REFERENCE = "REFERENCE";
    public static final String COL_SUB_REFERENCE = "SUB_REFERENCE";
    public static final String COL_CATEGORY = "CATEGORY";
    public static final String COL_TYPE = "TYPE";
    public static final String COL_FILENAME = "FILENAME";
    public static final String COL_FILE_URL = "FILE_URL";
    public static final String COL_MIME_TYPE = "MIME_TYPE";
    public static final String COL_CREATEDATE = "CREATEDATE";
    public static final String COL_ATTACHMENT_SIZE = "ATTACHMENT_SIZE";
    public static final String COL_DESCRIPTION = "DESCRIPTION";
    public static final String COL_GENESIS_ID = "GENESIS_ID";
    public static final String COL_SORT = "SORT";
    private static final long serialVersionUID = 1L;
    @TableId(value = "ID", type = IdType.INPUT)
    private Long id;

    @TableField(value = "REFERENCE")
    private Long reference;

    @TableField(value = "SUB_REFERENCE")
    private Long subReference;

    @TableField(value = "CATEGORY")
    private Integer category;

    @TableField(value = "`TYPE`")
    private Integer type;

    @TableField(value = "FILENAME")
    private String filename;

    @TableField(value = "FILE_URL")
    private Long fileUrl;

    @TableField(value = "MIME_TYPE")
    private String mimeType;

    @TableField(value = "CREATEDATE")
    private Date createdate;

    @TableField(value = "ATTACHMENT_SIZE")
    private Long attachmentSize;

    @TableField(value = "DESCRIPTION")
    private String description;

    @TableField(value = "GENESIS_ID")
    private Long genesisId;

    @TableField(value = "SORT")
    private Integer sort;
}