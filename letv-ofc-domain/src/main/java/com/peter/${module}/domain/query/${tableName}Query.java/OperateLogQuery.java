package com.peter.pms.domain.query;
/**
*
*@author 自动生成
*OperateLog
*
*/
public class OperateLogQuery{
	
		/**
	 	* 
	 	*/
		private Integer oprateId;
		/**
	 	*操作类型 1：添加，2：删除，3：修改 
	 	*/
		private Integer oprateType;
		/**
	 	*操作表明 
	 	*/
		private String tableName;
		/**
	 	*操作数据 
	 	*/
		private String data;
		/**
	 	*已推送服务id  ^ 分隔 
	 	*/
		private String serverIds;
		/**
	 	*状态 1：完成 0：未完成 
	 	*/
		private Integer status;
		/**
	 	*操作时间 
	 	*/
		private java.util.Date oprateAt;
		/**
	 	*由order_id+@+operate_type+@+remark生成的唯一标示 
	 	*/
		private String uuid;
		/**
	 	*ID 
	 	*/
		private Long id;
		/**
	 	*订单号 
	 	*/
		private String orderId;
		/**
	 	*日志类型 
	 	*/
		private Integer operateType;
		/**
	 	*操作人ID 
	 	*/
		private String operateId;
		/**
	 	*操作人 
	 	*/
		private String operator;
		/**
	 	*操作时间 
	 	*/
		private java.util.Date operateTime;
		/**
	 	* 
	 	*/
		private String remark;
		/**
	 	*创建时间 
	 	*/
		private java.util.Date createTime;
		/**
	 	*更新时间 
	 	*/
		private java.util.Date updateTime;
		/**
	 	*是否有效 
	 	*/
		private Integer yn;
		/**
	 	*是否成功 
	 	*/
		private Integer isSucceed;
		/**
	 	*失败原因 
	 	*/
		private String failCode;
		/**
	 	*由order_id+@+operate_type+@+remark生成的唯一标示 
	 	*/
		private String uuid;
		/**
	 	*主键id 
	 	*/
		private Long id;
		/**
	 	*订单号 
	 	*/
		private String orderNo;
		/**
	 	*操作人编号 
	 	*/
		private String operateNo;
		/**
	 	*操作 
	 	*/
		private Integer operator;
		/**
	 	*操作时间 
	 	*/
		private java.util.Date operateDate;
		/**
	 	*备注 
	 	*/
		private String logContent;
		/**
	 	*操作url 
	 	*/
		private String urlAddress;
		/**
	 	*操作参数 
	 	*/
		private String operateParameter;
		/**
	 	*创建人 
	 	*/
		private String createUser;
		/**
	 	*创建人编号 
	 	*/
		private String createNo;
		/**
	 	*创建时间 
	 	*/
		private java.util.Date createTime;
		/**
	 	*修改人 
	 	*/
		private String updateUser;
		/**
	 	*修改人编号 
	 	*/
		private String updateNo;
		/**
	 	*修改时间 
	 	*/
		private java.util.Date updateTime;
		/**
	 	*是否有效 
	 	*/
		private Integer yn;
		/**
	 	*操作人名称 
	 	*/
		private String operateName;
	
	
		/**
		 *  
		 * @return oprateId
	 	*/
		private Integer getOprateId(){
			return oprateId;
		}

		/**
		 *  
	 	 * @param oprateId
		*/
		public void setOprateId(Integer oprateId) {
			this.oprateId = oprateId;
		}
		/**
		 * 操作类型 1：添加，2：删除，3：修改 
		 * @return oprateType
	 	*/
		private Integer getOprateType(){
			return oprateType;
		}

		/**
		 * 操作类型 1：添加，2：删除，3：修改 
	 	 * @param oprateType
		*/
		public void setOprateType(Integer oprateType) {
			this.oprateType = oprateType;
		}
		/**
		 * 操作表明 
		 * @return tableName
	 	*/
		private String getTableName(){
			return tableName;
		}

		/**
		 * 操作表明 
	 	 * @param tableName
		*/
		public void setTableName(String tableName) {
			this.tableName = tableName;
		}
		/**
		 * 操作数据 
		 * @return data
	 	*/
		private String getData(){
			return data;
		}

		/**
		 * 操作数据 
	 	 * @param data
		*/
		public void setData(String data) {
			this.data = data;
		}
		/**
		 * 已推送服务id  ^ 分隔 
		 * @return serverIds
	 	*/
		private String getServerIds(){
			return serverIds;
		}

		/**
		 * 已推送服务id  ^ 分隔 
	 	 * @param serverIds
		*/
		public void setServerIds(String serverIds) {
			this.serverIds = serverIds;
		}
		/**
		 * 状态 1：完成 0：未完成 
		 * @return status
	 	*/
		private Integer getStatus(){
			return status;
		}

		/**
		 * 状态 1：完成 0：未完成 
	 	 * @param status
		*/
		public void setStatus(Integer status) {
			this.status = status;
		}
		/**
		 * 操作时间 
		 * @return oprateAt
	 	*/
		private java.util.Date getOprateAt(){
			return oprateAt;
		}

		/**
		 * 操作时间 
	 	 * @param oprateAt
		*/
		public void setOprateAt(java.util.Date oprateAt) {
			this.oprateAt = oprateAt;
		}
		/**
		 * 由order_id+@+operate_type+@+remark生成的唯一标示 
		 * @return uuid
	 	*/
		private String getUuid(){
			return uuid;
		}

		/**
		 * 由order_id+@+operate_type+@+remark生成的唯一标示 
	 	 * @param uuid
		*/
		public void setUuid(String uuid) {
			this.uuid = uuid;
		}
		/**
		 * ID 
		 * @return id
	 	*/
		private Long getId(){
			return id;
		}

		/**
		 * ID 
	 	 * @param id
		*/
		public void setId(Long id) {
			this.id = id;
		}
		/**
		 * 订单号 
		 * @return orderId
	 	*/
		private String getOrderId(){
			return orderId;
		}

		/**
		 * 订单号 
	 	 * @param orderId
		*/
		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}
		/**
		 * 日志类型 
		 * @return operateType
	 	*/
		private Integer getOperateType(){
			return operateType;
		}

		/**
		 * 日志类型 
	 	 * @param operateType
		*/
		public void setOperateType(Integer operateType) {
			this.operateType = operateType;
		}
		/**
		 * 操作人ID 
		 * @return operateId
	 	*/
		private String getOperateId(){
			return operateId;
		}

		/**
		 * 操作人ID 
	 	 * @param operateId
		*/
		public void setOperateId(String operateId) {
			this.operateId = operateId;
		}
		/**
		 * 操作人 
		 * @return operator
	 	*/
		private String getOperator(){
			return operator;
		}

		/**
		 * 操作人 
	 	 * @param operator
		*/
		public void setOperator(String operator) {
			this.operator = operator;
		}
		/**
		 * 操作时间 
		 * @return operateTime
	 	*/
		private java.util.Date getOperateTime(){
			return operateTime;
		}

		/**
		 * 操作时间 
	 	 * @param operateTime
		*/
		public void setOperateTime(java.util.Date operateTime) {
			this.operateTime = operateTime;
		}
		/**
		 *  
		 * @return remark
	 	*/
		private String getRemark(){
			return remark;
		}

		/**
		 *  
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
		/**
		 * 是否成功 
		 * @return isSucceed
	 	*/
		private Integer getIsSucceed(){
			return isSucceed;
		}

		/**
		 * 是否成功 
	 	 * @param isSucceed
		*/
		public void setIsSucceed(Integer isSucceed) {
			this.isSucceed = isSucceed;
		}
		/**
		 * 失败原因 
		 * @return failCode
	 	*/
		private String getFailCode(){
			return failCode;
		}

		/**
		 * 失败原因 
	 	 * @param failCode
		*/
		public void setFailCode(String failCode) {
			this.failCode = failCode;
		}
		/**
		 * 由order_id+@+operate_type+@+remark生成的唯一标示 
		 * @return uuid
	 	*/
		private String getUuid(){
			return uuid;
		}

		/**
		 * 由order_id+@+operate_type+@+remark生成的唯一标示 
	 	 * @param uuid
		*/
		public void setUuid(String uuid) {
			this.uuid = uuid;
		}
		/**
		 * 主键id 
		 * @return id
	 	*/
		private Long getId(){
			return id;
		}

		/**
		 * 主键id 
	 	 * @param id
		*/
		public void setId(Long id) {
			this.id = id;
		}
		/**
		 * 订单号 
		 * @return orderNo
	 	*/
		private String getOrderNo(){
			return orderNo;
		}

		/**
		 * 订单号 
	 	 * @param orderNo
		*/
		public void setOrderNo(String orderNo) {
			this.orderNo = orderNo;
		}
		/**
		 * 操作人编号 
		 * @return operateNo
	 	*/
		private String getOperateNo(){
			return operateNo;
		}

		/**
		 * 操作人编号 
	 	 * @param operateNo
		*/
		public void setOperateNo(String operateNo) {
			this.operateNo = operateNo;
		}
		/**
		 * 操作 
		 * @return operator
	 	*/
		private Integer getOperator(){
			return operator;
		}

		/**
		 * 操作 
	 	 * @param operator
		*/
		public void setOperator(Integer operator) {
			this.operator = operator;
		}
		/**
		 * 操作时间 
		 * @return operateDate
	 	*/
		private java.util.Date getOperateDate(){
			return operateDate;
		}

		/**
		 * 操作时间 
	 	 * @param operateDate
		*/
		public void setOperateDate(java.util.Date operateDate) {
			this.operateDate = operateDate;
		}
		/**
		 * 备注 
		 * @return logContent
	 	*/
		private String getLogContent(){
			return logContent;
		}

		/**
		 * 备注 
	 	 * @param logContent
		*/
		public void setLogContent(String logContent) {
			this.logContent = logContent;
		}
		/**
		 * 操作url 
		 * @return urlAddress
	 	*/
		private String getUrlAddress(){
			return urlAddress;
		}

		/**
		 * 操作url 
	 	 * @param urlAddress
		*/
		public void setUrlAddress(String urlAddress) {
			this.urlAddress = urlAddress;
		}
		/**
		 * 操作参数 
		 * @return operateParameter
	 	*/
		private String getOperateParameter(){
			return operateParameter;
		}

		/**
		 * 操作参数 
	 	 * @param operateParameter
		*/
		public void setOperateParameter(String operateParameter) {
			this.operateParameter = operateParameter;
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
		 * 创建人编号 
		 * @return createNo
	 	*/
		private String getCreateNo(){
			return createNo;
		}

		/**
		 * 创建人编号 
	 	 * @param createNo
		*/
		public void setCreateNo(String createNo) {
			this.createNo = createNo;
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
		 * 修改人 
		 * @return updateUser
	 	*/
		private String getUpdateUser(){
			return updateUser;
		}

		/**
		 * 修改人 
	 	 * @param updateUser
		*/
		public void setUpdateUser(String updateUser) {
			this.updateUser = updateUser;
		}
		/**
		 * 修改人编号 
		 * @return updateNo
	 	*/
		private String getUpdateNo(){
			return updateNo;
		}

		/**
		 * 修改人编号 
	 	 * @param updateNo
		*/
		public void setUpdateNo(String updateNo) {
			this.updateNo = updateNo;
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
		/**
		 * 操作人名称 
		 * @return operateName
	 	*/
		private String getOperateName(){
			return operateName;
		}

		/**
		 * 操作人名称 
	 	 * @param operateName
		*/
		public void setOperateName(String operateName) {
			this.operateName = operateName;
		}
	
}