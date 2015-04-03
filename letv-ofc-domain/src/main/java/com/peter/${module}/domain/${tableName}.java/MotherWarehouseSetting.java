package com.peter.pms.domain;
/**
*
*@author 自动生成
*MotherWarehouseSetting
*
*/
public class MotherWarehouseSetting{
	
		/**
	 	* 
	 	*/
		private Long id;
		/**
	 	* 
	 	*/
		private String motherWarehouseNo;
		/**
	 	* 
	 	*/
		private String childWarehouseNo;
		/**
	 	* 
	 	*/
		private String motherWarehouseName;
		/**
	 	* 
	 	*/
		private String childWarehouseName;
		/**
	 	* 
	 	*/
		private String expressNo;
		/**
	 	* 
	 	*/
		private Integer status;
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
	 	*承运商名称 
	 	*/
		private String expressName;
		/**
	 	*承运商id 
	 	*/
		private Long expressId;
	
	
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
		 * @return motherWarehouseNo
	 	*/
		private String getMotherWarehouseNo(){
			return motherWarehouseNo;
		}

		/**
		 *  
	 	 * @param motherWarehouseNo
		*/
		public void setMotherWarehouseNo(String motherWarehouseNo) {
			this.motherWarehouseNo = motherWarehouseNo;
		}
		/**
		 *  
		 * @return childWarehouseNo
	 	*/
		private String getChildWarehouseNo(){
			return childWarehouseNo;
		}

		/**
		 *  
	 	 * @param childWarehouseNo
		*/
		public void setChildWarehouseNo(String childWarehouseNo) {
			this.childWarehouseNo = childWarehouseNo;
		}
		/**
		 *  
		 * @return motherWarehouseName
	 	*/
		private String getMotherWarehouseName(){
			return motherWarehouseName;
		}

		/**
		 *  
	 	 * @param motherWarehouseName
		*/
		public void setMotherWarehouseName(String motherWarehouseName) {
			this.motherWarehouseName = motherWarehouseName;
		}
		/**
		 *  
		 * @return childWarehouseName
	 	*/
		private String getChildWarehouseName(){
			return childWarehouseName;
		}

		/**
		 *  
	 	 * @param childWarehouseName
		*/
		public void setChildWarehouseName(String childWarehouseName) {
			this.childWarehouseName = childWarehouseName;
		}
		/**
		 *  
		 * @return expressNo
	 	*/
		private String getExpressNo(){
			return expressNo;
		}

		/**
		 *  
	 	 * @param expressNo
		*/
		public void setExpressNo(String expressNo) {
			this.expressNo = expressNo;
		}
		/**
		 *  
		 * @return status
	 	*/
		private Integer getStatus(){
			return status;
		}

		/**
		 *  
	 	 * @param status
		*/
		public void setStatus(Integer status) {
			this.status = status;
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
		/**
		 * 承运商名称 
		 * @return expressName
	 	*/
		private String getExpressName(){
			return expressName;
		}

		/**
		 * 承运商名称 
	 	 * @param expressName
		*/
		public void setExpressName(String expressName) {
			this.expressName = expressName;
		}
		/**
		 * 承运商id 
		 * @return expressId
	 	*/
		private Long getExpressId(){
			return expressId;
		}

		/**
		 * 承运商id 
	 	 * @param expressId
		*/
		public void setExpressId(Long expressId) {
			this.expressId = expressId;
		}
	
}