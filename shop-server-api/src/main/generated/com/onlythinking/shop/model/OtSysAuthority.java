package com.onlythinking.shop.model;

import com.onlythinking.commons.core.interceptor.CreatedTime;
import com.onlythinking.commons.core.interceptor.LastModifiedTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * <p> This was generated by Ot Mybatis generator. </p>
 *
 * ot_sys_authority
 *
 * 系统API权限
 *
 * @author lixingping
 * Date 2020-05-08 10:48:23
 */
@Data
@ApiModel("系统API权限")
public class OtSysAuthority implements Serializable {
    /**
     * ID
     */
    @Id
    @ApiModelProperty(value = "ID")
    private String id;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @CreatedTime
    private Date createdTime;

    /**
     * 最后修改时间
     */
    @ApiModelProperty(value = "最后修改时间")
    @LastModifiedTime
    private Date lastModifiedTime;

    /**
     * 备注（修改记录)
     */
    @ApiModelProperty(value = "备注（修改记录)")
    private String remark;

    /**
     * 动作
     */
    @ApiModelProperty(value = "动作")
    private String action;

    /**
     * 权限名称
     */
    @NotBlank
    @ApiModelProperty(value = "权限名称", required = true)
    private String authorityName;

    /**
     * 排序
     */
    @ApiModelProperty(value = "排序")
    private Integer byOrder;

    /**
     * 业务
     */
    @ApiModelProperty(value = "业务")
    private String domain;

    /**
     * 权限模块
     */
    @NotBlank
    @ApiModelProperty(value = "权限模块", required = true)
    private String module;

    /**
     * 父节点ID
     */
    @ApiModelProperty(value = "父节点ID")
    private String parentId;

    private static final long serialVersionUID = 1L;
}
