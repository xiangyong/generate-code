package com.peter.pms.domain.query;
/**
*
*@author 自动生成
*OrderForcedIssued
*
*/
public class OrderForcedIssuedQuery{
	
		/**
	 	* 
	 	*/
		private Long id;
		/**
	 	* 
	 	*/
		private String orderCode;
		/**
	 	* 
	 	*/
		private String forcedReason;
		/**
	 	*操作类型：1，手动提交；2，批量导入 
	 	*/
		private Integer operateType;
		/**
	 	*创建时间 
	 	*/
		private java.util.Date createTime;
		/**
	 	*创建人 
	 	*/
		private String createUser;
		/**
	 	*更新时间 
	 	*/
		private java.util.Date updateTime;
		/**
	 	*更新人 
	 	*/
		private String updateUser;
		/**
	 	*备注 
	 	*/
		private String remark;
		/**
	 	*是否有效
            0:否
            1:是 
	 	*/
		private Integer yn;
	
	
		/**
		 *  
		 * @return id
	 	*/
		private Long getId(){
			return id;
		}

		/**
		 *  
	 	 * @param id
		*/
		public void setId(Long id) {
			this.id = id;
		}
		/**
		 *  
		 * @return orderCode
	 	*/
		private String getOrderCode(){
			return orderCode;
		}

		/**
		 *  
	 	 * @param orderCode
		*/
		public void setOrderCode(String orderCode) {
			this.orderCode = orderCode;
		}
		/**
		 *  
		 * @return forcedReason
	 	*/
		private String getForcedReason(){
			return forcedReason;
		}

		/**
		 *  
	 	 * @param forcedReason
		*/
		public void setForcedReason(String forcedReason) {
			this.forcedReason = forcedReason;
		}
		/**
		 * 操作类型：1，手动提交；2，批量导入 
		 * @return operateType
	 	*/
		private Integer getOperateType(){
			return operateType;
		}

		/**
		 * 操作类型：1，手动提交；2，批量导入 
	 	 * @param operateType
		*/
		public void setOperateType(Integer operateType) {
			this.operateType = operateType;
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
		 * 创建人 
		 * @return createUser
	 	*/
		private String getCreateUser(){
			return createUser;
		}

		/**
		 * 创建人 
	 	 * @param createUser
		*/
		public void setCreateUser(String createUser) {
			this.createUser = createUser;
		}
		/**
		 * 更新时间 
		 * @return updateTime
	 	*/
		private java.util.Date getUpdateTime(){
			return updateTime;
		}

		/**
		 * 更新时间 
	 	 * @param updateTime
		*/
		public void setUpdateTime(java.util.Date updateTime) {
			this.updateTime = updateTime;
		}
		/**
		 * 更新人 
		 * @return updateUser
	 	*/
		private String getUpdateUser(){
			return updateUser;
		}

		/**
		 * 更新人 
	 	 * @param updateUser
		*/
		public void setUpdateUser(String updateUser) {
			this.updateUser = updateUser;
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
		 * 是否有效
            0:否
            1:是 
		 * @return yn
	 	*/
		private Integer getYn(){
			return yn;
		}

		/**
		 * 是否有效
            0:否
            1:是 
	 	 * @param yn
		*/
		public void setYn(Integer yn) {
			this.yn = yn;
		}
	
}