/**  
 * Copyright © 2016 幻月科技. All rights reserved.
 *
 * @Title: DeleteLogicByIdsPlugin.java
 * @Prject: com.mysql.generator
 * @Package: org.mybatis.generator.plugins
 * @Description: TODO
 * @author: Jerry  
 * @date: 2016年10月31日 上午11:43:26
 * @version: V1.0  
 */
package org.mybatis.generator.plugins;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

/**
 * @ClassName: DeleteLogicByIdsPlugin
 * @Description: TODO
 * @author: Jerry
 * @date: 2016年10月31日 上午11:43:26
 * @version: V1.0
 */
public class DeleteLogicByIdsPlugin extends PluginAdapter {

	/**
	 * {@inheritDoc}
	 */
	public boolean validate(List<String> warnings) {
		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean clientSelectByExampleWithBLOBsMethodGenerated(Method method,
			Interface interfaze, IntrospectedTable introspectedTable) {

			interfaze.addMethod(generateDeleteLogicByIds(method,
					introspectedTable));

		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean clientSelectByExampleWithoutBLOBsMethodGenerated(
			Method method, Interface interfaze,
			IntrospectedTable introspectedTable) {

			interfaze.addMethod(generateDeleteLogicByIds(method,
					introspectedTable));

		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean clientSelectByExampleWithBLOBsMethodGenerated(Method method,
			TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		
			topLevelClass.addMethod(generateDeleteLogicByIds(method,
					introspectedTable));
		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean clientSelectByExampleWithoutBLOBsMethodGenerated(
			Method method, TopLevelClass topLevelClass,
			IntrospectedTable introspectedTable) {
		
			topLevelClass.addMethod(generateDeleteLogicByIds(method,
					introspectedTable));
		return true;
	}
	
	@Override
	public boolean sqlMapDocumentGenerated(Document document, IntrospectedTable introspectedTable) {
		
		String tableName = introspectedTable.getAliasedFullyQualifiedTableNameAtRuntime();//数据库表名  
		
		XmlElement parentElement = document.getRootElement();

		// 产生分页语句前半部分
		XmlElement deleteLogicByIdsElement = new XmlElement("update");
		deleteLogicByIdsElement.addAttribute(new Attribute("id", "deleteLogicByIds"));
		
		deleteLogicByIdsElement.addElement(
				new TextElement(
				"update " + tableName + " set deleteFlag = #{deleteFlag,jdbcType=INTEGER} where id in "
				+ " <foreach item=\"item\" index=\"index\" collection=\"ids\" open=\"(\" separator=\",\" close=\")\">#{item}</foreach> "
				));
		
		parentElement.addElement(deleteLogicByIdsElement);

		return super.sqlMapDocumentGenerated(document, introspectedTable);
	}

	private Method generateDeleteLogicByIds(Method method, IntrospectedTable introspectedTable) {
		
		Method m = new Method("deleteLogicByIds");
		
		m.setVisibility(method.getVisibility());
		
		m.setReturnType(FullyQualifiedJavaType.getIntInstance());

		m.addParameter(new Parameter(FullyQualifiedJavaType.getIntInstance(), "deleteFlag", "@Param(\"deleteFlag\")"));
		m.addParameter(new Parameter(new FullyQualifiedJavaType("Integer[]"), "ids", "@Param(\"ids\")"));

		context.getCommentGenerator().addGeneralMethodComment(m,
				introspectedTable);
		return m;
	}

}
