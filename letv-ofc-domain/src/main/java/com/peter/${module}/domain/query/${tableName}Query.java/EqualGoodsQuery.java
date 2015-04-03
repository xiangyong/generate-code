package com.peter.pms.domain.query;
/**
*
*@author 自动生成
*EqualGoods
*
*/
public class EqualGoodsQuery{
	
		/**
	 	* 
	 	*/
		private Long id;
		/**
	 	* 
	 	*/
		private String oldGoodsNo;
		/**
	 	* 
	 	*/
		private String equalGoodsNo;
		/**
	 	* 
	 	*/
		private String oldGoodsName;
		/**
	 	* 
	 	*/
		private String equalGoodsName;
		/**
	 	* 
	 	*/
		private java.util.Date startTime;
		/**
	 	* 
	 	*/
		private java.util.Date endTime;
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
		 * @return oldGoodsNo
	 	*/
		private String getOldGoodsNo(){
			return oldGoodsNo;
		}

		/**
		 *  
	 	 * @param oldGoodsNo
		*/
		public void setOldGoodsNo(String oldGoodsNo) {
			this.oldGoodsNo = oldGoodsNo;
		}
		/**
		 *  
		 * @return equalGoodsNo
	 	*/
		private String getEqualGoodsNo(){
			return equalGoodsNo;
		}

		/**
		 *  
	 	 * @param equalGoodsNo
		*/
		public void setEqualGoodsNo(String equalGoodsNo) {
			this.equalGoodsNo = equalGoodsNo;
		}
		/**
		 *  
		 * @return oldGoodsName
	 	*/
		private String getOldGoodsName(){
			return oldGoodsName;
		}

		/**
		 *  
	 	 * @param oldGoodsName
		*/
		public void setOldGoodsName(String oldGoodsName) {
			this.oldGoodsName = oldGoodsName;
		}
		/**
		 *  
		 * @return equalGoodsName
	 	*/
		private String getEqualGoodsName(){
			return equalGoodsName;
		}

		/**
		 *  
	 	 * @param equalGoodsName
		*/
		public void setEqualGoodsName(String equalGoodsName) {
			this.equalGoodsName = equalGoodsName;
		}
		/**
		 *  
		 * @return startTime
	 	*/
		private java.util.Date getStartTime(){
			return startTime;
		}

		/**
		 *  
	 	 * @param startTime
		*/
		public void setStartTime(java.util.Date startTime) {
			this.startTime = startTime;
		}
		/**
		 *  
		 * @return endTime
	 	*/
		private java.util.Date getEndTime(){
			return endTime;
		}

		/**
		 *  
	 	 * @param endTime
		*/
		public void setEndTime(java.util.Date endTime) {
			this.endTime = endTime;
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
	
}