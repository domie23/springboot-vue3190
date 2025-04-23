package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 宠物挂号
 *
 * @author 
 * @email
 */
@TableName("guahao")
public class GuahaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GuahaoEntity() {

	}

	public GuahaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 宠物医生
     */
    @TableField(value = "yisheng_id")

    private Integer yishengId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 就诊识别码
     */
    @TableField(value = "guahao_uuid_number")

    private String guahaoUuidNumber;


    /**
     * 挂号时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "guahao_time")

    private Date guahaoTime;


    /**
     * 时间类型
     */
    @TableField(value = "guahao_types")

    private Integer guahaoTypes;


    /**
     * 挂号状态
     */
    @TableField(value = "guahao_status_types")

    private Integer guahaoStatusTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：宠物医生
	 */
    public Integer getYishengId() {
        return yishengId;
    }
    /**
	 * 获取：宠物医生
	 */

    public void setYishengId(Integer yishengId) {
        this.yishengId = yishengId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：就诊识别码
	 */
    public String getGuahaoUuidNumber() {
        return guahaoUuidNumber;
    }
    /**
	 * 获取：就诊识别码
	 */

    public void setGuahaoUuidNumber(String guahaoUuidNumber) {
        this.guahaoUuidNumber = guahaoUuidNumber;
    }
    /**
	 * 设置：挂号时间
	 */
    public Date getGuahaoTime() {
        return guahaoTime;
    }
    /**
	 * 获取：挂号时间
	 */

    public void setGuahaoTime(Date guahaoTime) {
        this.guahaoTime = guahaoTime;
    }
    /**
	 * 设置：时间类型
	 */
    public Integer getGuahaoTypes() {
        return guahaoTypes;
    }
    /**
	 * 获取：时间类型
	 */

    public void setGuahaoTypes(Integer guahaoTypes) {
        this.guahaoTypes = guahaoTypes;
    }
    /**
	 * 设置：挂号状态
	 */
    public Integer getGuahaoStatusTypes() {
        return guahaoStatusTypes;
    }
    /**
	 * 获取：挂号状态
	 */

    public void setGuahaoStatusTypes(Integer guahaoStatusTypes) {
        this.guahaoStatusTypes = guahaoStatusTypes;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Guahao{" +
            "id=" + id +
            ", yishengId=" + yishengId +
            ", yonghuId=" + yonghuId +
            ", guahaoUuidNumber=" + guahaoUuidNumber +
            ", guahaoTime=" + guahaoTime +
            ", guahaoTypes=" + guahaoTypes +
            ", guahaoStatusTypes=" + guahaoStatusTypes +
            ", createTime=" + createTime +
        "}";
    }
}
