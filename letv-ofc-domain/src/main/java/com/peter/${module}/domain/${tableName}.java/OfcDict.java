package com.peter.pms.domain;
/**
*
*@author 自动生成
*OfcDict
*
*/
public class OfcDict{
	
		/**
	 	*主键标识 
	 	*/
		private Long id;
		/**
	 	*类型 
	 	*/
		private Integer type;
		/**
	 	*属性 
	 	*/
		private String attr;
		/**
	 	*值 
	 	*/
		private String value;
		/**
	 	*备注 
	 	*/
		private String remark;
		/**
	 	*创建时间 
	 	*/
		private java.util.Date createTime;
		/**
	 	*修改时间 
	 	*/
		private java.util.Date updateTime;
		/**
	 	*是否有效 
	 	*/
		private Integer yn;
	
	
		/**
		 * 主键标识 
		 * @return id
	 	*/
		private Long getId(){
			return id;
		}

		/**
		 * 主键标识 
	 	 * @param id
		*/
		public void setId(Long id) {
			this.id = id;
		}
		/**
		 * 类型 
		 * @return type
	 	*/
		private Integer getType(){
			return type;
		}

		/**
		 * 类型 
	 	 * @param type
		*/
		public void setType(Integer type) {
			this.type = type;
		}
		/**
		 * 属性 
		 * @return attr
	 	*/
		private String getAttr(){
			return attr;
		}

		/**
		 * 属性 
	 	 * @param attr
		*/
		public void setAttr(String attr) {
			this.attr = attr;
		}
		/**
		 * 值 
		 * @return value
	 	*/
		private String getValue(){
			return value;
		}

		/**
		 * 值 
	 	 * @param value
		*/
		public void setValue(String value) {
			this.value = value;
		}
		/**
		 * 备注 
		 * @return remark
	 	*/
		private String getRemark(){
			return remark;
		}

		/**
		 * 备注 
	 	 * @param remark
		*/
		public void setRemark(String remark) {
			this.remark = remark;
		}
		/**
		 * 创建时间 
		 * @return createTime
	 	*/
		private java.util.Date getCreateTime(){
			return createTime;
		}

		/**
		 * 创建时间 
	 	 * @param createTime
		*/
		public void setCreateTime(java.util.Date createTime) {
			this.createTime = createTime;
		}
		/**
		 * 修改时间 
		 * @return updateTime
	 	*/
		private java.util.Date getUpdateTime(){
			return updateTime;
		}

		/**
		 * 修改时间 
	 	 * @param updateTime
		*/
		public void setUpdateTime(java.util.Date updateTime) {
			this.updateTime = updateTime;
		}
		/**
		 * 是否有效 
		 * @return yn
	 	*/
		private Integer getYn(){
			return yn;
		}

		/**
		 * 是否有效 
	 	 * @param yn
		*/
		public void setYn(Integer yn) {
			this.yn = yn;
		}
	
}