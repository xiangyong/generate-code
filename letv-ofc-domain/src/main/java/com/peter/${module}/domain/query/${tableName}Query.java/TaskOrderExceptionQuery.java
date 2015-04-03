package com.peter.pms.domain.query;
/**
*
*@author 自动生成
*TaskOrderException
*
*/
public class TaskOrderExceptionQuery{
	
		/**
	 	*ID 
	 	*/
		private Long taskId;
		/**
	 	*执行次数 
	 	*/
		private Integer executeCount;
		/**
	 	*执行时间 
	 	*/
		private java.util.Date executeTime;
		/**
	 	*队列标识 
	 	*/
		private String queueId;
		/**
	 	*唯一标识 
	 	*/
		private String fingerprint;
		/**
	 	*创建时间 
	 	*/
		private java.util.Date createTime;
		/**
	 	*更新时间 
	 	*/
		private java.util.Date updateTime;
		/**
	 	*任务状态 
	 	*/
		private Integer taskStatus;
		/**
	 	*关键字1--订单号 
	 	*/
		private String keyword1;
		/**
	 	*关键字2--接口类型 
	 	*/
		private String keyword2;
		/**
	 	*任务类型 
	 	*/
		private Integer taskType;
		/**
	 	*内容 
	 	*/
		private String body;
		/**
	 	*OwnSign 
	 	*/
		private String ownSign;
		/**
	 	*优先级 
	 	*/
		private Integer priority;
		/**
	 	*是否有效 
	 	*/
		private Integer yn;
	
	
		/**
		 * ID 
		 * @return taskId
	 	*/
		private Long getTaskId(){
			return taskId;
		}

		/**
		 * ID 
	 	 * @param taskId
		*/
		public void setTaskId(Long taskId) {
			this.taskId = taskId;
		}
		/**
		 * 执行次数 
		 * @return executeCount
	 	*/
		private Integer getExecuteCount(){
			return executeCount;
		}

		/**
		 * 执行次数 
	 	 * @param executeCount
		*/
		public void setExecuteCount(Integer executeCount) {
			this.executeCount = executeCount;
		}
		/**
		 * 执行时间 
		 * @return executeTime
	 	*/
		private java.util.Date getExecuteTime(){
			return executeTime;
		}

		/**
		 * 执行时间 
	 	 * @param executeTime
		*/
		public void setExecuteTime(java.util.Date executeTime) {
			this.executeTime = executeTime;
		}
		/**
		 * 队列标识 
		 * @return queueId
	 	*/
		private String getQueueId(){
			return queueId;
		}

		/**
		 * 队列标识 
	 	 * @param queueId
		*/
		public void setQueueId(String queueId) {
			this.queueId = queueId;
		}
		/**
		 * 唯一标识 
		 * @return fingerprint
	 	*/
		private String getFingerprint(){
			return fingerprint;
		}

		/**
		 * 唯一标识 
	 	 * @param fingerprint
		*/
		public void setFingerprint(String fingerprint) {
			this.fingerprint = fingerprint;
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
		 * 任务状态 
		 * @return taskStatus
	 	*/
		private Integer getTaskStatus(){
			return taskStatus;
		}

		/**
		 * 任务状态 
	 	 * @param taskStatus
		*/
		public void setTaskStatus(Integer taskStatus) {
			this.taskStatus = taskStatus;
		}
		/**
		 * 关键字1--订单号 
		 * @return keyword1
	 	*/
		private String getKeyword1(){
			return keyword1;
		}

		/**
		 * 关键字1--订单号 
	 	 * @param keyword1
		*/
		public void setKeyword1(String keyword1) {
			this.keyword1 = keyword1;
		}
		/**
		 * 关键字2--接口类型 
		 * @return keyword2
	 	*/
		private String getKeyword2(){
			return keyword2;
		}

		/**
		 * 关键字2--接口类型 
	 	 * @param keyword2
		*/
		public void setKeyword2(String keyword2) {
			this.keyword2 = keyword2;
		}
		/**
		 * 任务类型 
		 * @return taskType
	 	*/
		private Integer getTaskType(){
			return taskType;
		}

		/**
		 * 任务类型 
	 	 * @param taskType
		*/
		public void setTaskType(Integer taskType) {
			this.taskType = taskType;
		}
		/**
		 * 内容 
		 * @return body
	 	*/
		private String getBody(){
			return body;
		}

		/**
		 * 内容 
	 	 * @param body
		*/
		public void setBody(String body) {
			this.body = body;
		}
		/**
		 * OwnSign 
		 * @return ownSign
	 	*/
		private String getOwnSign(){
			return ownSign;
		}

		/**
		 * OwnSign 
	 	 * @param ownSign
		*/
		public void setOwnSign(String ownSign) {
			this.ownSign = ownSign;
		}
		/**
		 * 优先级 
		 * @return priority
	 	*/
		private Integer getPriority(){
			return priority;
		}

		/**
		 * 优先级 
	 	 * @param priority
		*/
		public void setPriority(Integer priority) {
			this.priority = priority;
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