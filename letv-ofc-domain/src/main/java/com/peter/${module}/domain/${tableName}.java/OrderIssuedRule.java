package com.peter.pms.domain;
/**
*
*@author 自动生成
*OrderIssuedRule
*
*/
public class OrderIssuedRule{
	
		/**
	 	* 
	 	*/
		private Long id;
		/**
	 	* 
	 	*/
		private String ruleCode;
		/**
	 	* 
	 	*/
		private String ruleName;
		/**
	 	* 
	 	*/
		private Integer priority;
		/**
	 	*优先级名称 
	 	*/
		private String priorityName;
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
		private String orderSource;
		/**
	 	*订单来源名称 
	 	*/
		private String orderSourceName;
		/**
	 	* 
	 	*/
		private String orderType;
		/**
	 	*订单类型名称 
	 	*/
		private String orderTypeName;
		/**
	 	* 
	 	*/
		private String salesDep;
		/**
	 	*销售部门名称 
	 	*/
		private String salesDepName;
		/**
	 	* 
	 	*/
		private String payType;
		/**
	 	*支付方式名称 
	 	*/
		private String payTypeName;
		/**
	 	* 
	 	*/
		private String outlineCustomer;
		/**
	 	*线下客户名称 
	 	*/
		private String outlineCustomerName;
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
		 * @return ruleCode
	 	*/
		private String getRuleCode(){
			return ruleCode;
		}

		/**
		 *  
	 	 * @param ruleCode
		*/
		public void setRuleCode(String ruleCode) {
			this.ruleCode = ruleCode;
		}
		/**
		 *  
		 * @return ruleName
	 	*/
		private String getRuleName(){
			return ruleName;
		}

		/**
		 *  
	 	 * @param ruleName
		*/
		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}
		/**
		 *  
		 * @return priority
	 	*/
		private Integer getPriority(){
			return priority;
		}

		/**
		 *  
	 	 * @param priority
		*/
		public void setPriority(Integer priority) {
			this.priority = priority;
		}
		/**
		 * 优先级名称 
		 * @return priorityName
	 	*/
		private String getPriorityName(){
			return priorityName;
		}

		/**
		 * 优先级名称 
	 	 * @param priorityName
		*/
		public void setPriorityName(String priorityName) {
			this.priorityName = priorityName;
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
		 * @return orderSource
	 	*/
		private String getOrderSource(){
			return orderSource;
		}

		/**
		 *  
	 	 * @param orderSource
		*/
		public void setOrderSource(String orderSource) {
			this.orderSource = orderSource;
		}
		/**
		 * 订单来源名称 
		 * @return orderSourceName
	 	*/
		private String getOrderSourceName(){
			return orderSourceName;
		}

		/**
		 * 订单来源名称 
	 	 * @param orderSourceName
		*/
		public void setOrderSourceName(String orderSourceName) {
			this.orderSourceName = orderSourceName;
		}
		/**
		 *  
		 * @return orderType
	 	*/
		private String getOrderType(){
			return orderType;
		}

		/**
		 *  
	 	 * @param orderType
		*/
		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}
		/**
		 * 订单类型名称 
		 * @return orderTypeName
	 	*/
		private String getOrderTypeName(){
			return orderTypeName;
		}

		/**
		 * 订单类型名称 
	 	 * @param orderTypeName
		*/
		public void setOrderTypeName(String orderTypeName) {
			this.orderTypeName = orderTypeName;
		}
		/**
		 *  
		 * @return salesDep
	 	*/
		private String getSalesDep(){
			return salesDep;
		}

		/**
		 *  
	 	 * @param salesDep
		*/
		public void setSalesDep(String salesDep) {
			this.salesDep = salesDep;
		}
		/**
		 * 销售部门名称 
		 * @return salesDepName
	 	*/
		private String getSalesDepName(){
			return salesDepName;
		}

		/**
		 * 销售部门名称 
	 	 * @param salesDepName
		*/
		public void setSalesDepName(String salesDepName) {
			this.salesDepName = salesDepName;
		}
		/**
		 *  
		 * @return payType
	 	*/
		private String getPayType(){
			return payType;
		}

		/**
		 *  
	 	 * @param payType
		*/
		public void setPayType(String payType) {
			this.payType = payType;
		}
		/**
		 * 支付方式名称 
		 * @return payTypeName
	 	*/
		private String getPayTypeName(){
			return payTypeName;
		}

		/**
		 * 支付方式名称 
	 	 * @param payTypeName
		*/
		public void setPayTypeName(String payTypeName) {
			this.payTypeName = payTypeName;
		}
		/**
		 *  
		 * @return outlineCustomer
	 	*/
		private String getOutlineCustomer(){
			return outlineCustomer;
		}

		/**
		 *  
	 	 * @param outlineCustomer
		*/
		public void setOutlineCustomer(String outlineCustomer) {
			this.outlineCustomer = outlineCustomer;
		}
		/**
		 * 线下客户名称 
		 * @return outlineCustomerName
	 	*/
		private String getOutlineCustomerName(){
			return outlineCustomerName;
		}

		/**
		 * 线下客户名称 
	 	 * @param outlineCustomerName
		*/
		public void setOutlineCustomerName(String outlineCustomerName) {
			this.outlineCustomerName = outlineCustomerName;
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