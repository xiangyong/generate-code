package com.peter.${module}.domain.query;
/**
*
*@author 自动生成
*${table.tableName}
*${table.tableComment}
*/
public class ${table.tableName}Query{
	
	<#list table.columnList as column>
		/**
	 	*${column.columnComment} 
	 	*/
		private ${column.columnType} ${column.columnName};
	</#list>
	
	
	<#list table.columnList as column>
		/**
		 * ${column.columnComment} 
		 * @return ${column.columnName}
	 	*/
		private ${column.columnType} get${column.columnName?cap_first}(){
			return ${column.columnName};
		}

		/**
		 * ${column.columnComment} 
	 	 * @param ${column.columnName}
		*/
		public void set${column.columnName?cap_first}(${column.columnType} ${column.columnName}) {
			this.${column.columnName} = ${column.columnName};
		}
	</#list>
	
}