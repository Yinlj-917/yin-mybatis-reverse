package com.yin.reverse.generator;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.PropertyRegistry;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import static org.mybatis.generator.internal.util.StringUtility.isTrue;

/**
 * 重写逆向工程生成文件的注释信息.
 *
 * @author lijian.yin@hand-china.com
 * @date 2018/8/11
 **/
public class CustomCommentGenerator implements CommentGenerator {

    private Properties properties;
    private Properties systemPro;
    private boolean suppressDate;
    private boolean suppressAllComments;
    private String currentDateStr;


    public CustomCommentGenerator() {
        super();
        properties = new Properties();
        systemPro = System.getProperties();
        suppressDate = false;
        suppressAllComments = false;
        currentDateStr = (new SimpleDateFormat("yyyy-MM-dd")).format(new Date());
    }

    @Override
    public void addJavaFileComment(CompilationUnit compilationUnit) {
        return;
    }

    @Override
    public void addComment(XmlElement xmlElement) {
        return;
    }

    @Override
    public void addRootComment(XmlElement rootElement) {
        return;
    }

    /**
     * init 参数.
     *
     * @param properties 参数
     */
    @Override
    public void addConfigurationProperties(Properties properties) {
        this.properties.putAll(properties);

        suppressDate = isTrue(properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_DATE));

        suppressAllComments = isTrue(properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_ALL_COMMENTS));
    }

    protected String getDateString() {
        String result = null;
        if (!suppressDate) {
            result = currentDateStr;
        }
        return result;
    }

    /**
     * 添加内部类类注释.
     *
     * @param innerClass        内部类信息
     * @param introspectedTable 表信息
     */
    @Override
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
        if (suppressAllComments) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        innerClass.addJavaDocLine("/**");
        sb.append(" * ");
        sb.append(introspectedTable.getFullyQualifiedTable());
        sb.append(" ");
        sb.append(getDateString());
        innerClass.addJavaDocLine(sb.toString());
        innerClass.addJavaDocLine(" */");
    }

    /**
     * 添加枚举注释.
     *
     * @param innerEnum         枚举信息
     * @param introspectedTable 表信息
     */
    @Override
    public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {
        customFiledComment(innerEnum, introspectedTable);
    }

    /**
     * DTO 属性注释.
     *
     * @param field              属性（字段）
     * @param introspectedTable  表信息
     * @param introspectedColumn 表字段信息
     */
    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable,
                                IntrospectedColumn introspectedColumn) {
        if (suppressAllComments) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        field.addJavaDocLine("/**");
        sb.append(" * ");
        sb.append(introspectedColumn.getRemarks());
        field.addJavaDocLine(sb.toString() + " (" + introspectedColumn.getActualColumnName() + ")");
        field.addJavaDocLine(" */");
    }

    /**
     * Example属性注释.
     *
     * @param field             属性
     * @param introspectedTable 表信息
     */
    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
        customFiledComment(field, introspectedTable);
    }

    /**
     * Example setter/getter 注释.
     * TODO
     *
     * @param method            方法
     * @param introspectedTable 表信息
     */
    @Override
    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {

    }

    /**
     * DTO getter方法注释.
     *
     * @param method             方法(注解在哪个方法上)
     * @param introspectedTable  表信息
     * @param introspectedColumn 列信息
     */
    @Override
    public void addGetterComment(Method method, IntrospectedTable introspectedTable,
                                 IntrospectedColumn introspectedColumn) {
        if (suppressAllComments) {
            return;
        }

        method.addJavaDocLine("/**");

        StringBuilder sb = new StringBuilder();
        sb.append(" * ");
        sb.append(introspectedColumn.getRemarks());
        method.addJavaDocLine(sb.toString());

        sb.setLength(0);
        sb.append(" * @return ");
        sb.append(introspectedColumn.getActualColumnName());
        sb.append(" ");
        sb.append(introspectedColumn.getRemarks());
        method.addJavaDocLine(sb.toString());
        method.addJavaDocLine(" */");
    }

    /**
     * DTO setter注释.
     *
     * @param method             方法(注解在哪个方法上)
     * @param introspectedTable  表信息
     * @param introspectedColumn 列信息
     */
    @Override
    public void addSetterComment(Method method, IntrospectedTable introspectedTable,
                                 IntrospectedColumn introspectedColumn) {
        if (suppressAllComments) {
            return;
        }

        method.addJavaDocLine("/**");
        StringBuilder sb = new StringBuilder();
        sb.append(" * ");
        sb.append(introspectedColumn.getRemarks());
        method.addJavaDocLine(sb.toString());

        Parameter parm = method.getParameters().get(0);
        sb.setLength(0);
        sb.append(" * @param ");
        sb.append(parm.getName());
        sb.append(" ");
        sb.append(introspectedColumn.getRemarks());
        method.addJavaDocLine(sb.toString());

        method.addJavaDocLine(" */");
    }

    /**
     * 内部类注释信息(GeneratedCriteria).
     *
     * @param innerClass        DTO类信息
     * @param introspectedTable 表信息
     * @param markAsDoNotDelete 标记为不删除
     */
    @Override
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {
        customAddClassComment(innerClass, introspectedTable);
    }

    /**
     * DTO 类注释.
     *
     * @param topLevelClass     DTO类信息
     * @param introspectedTable 表信息
     */
    @Override
    public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        customAddClassComment(topLevelClass, introspectedTable);
    }

    /**
     * 类的注释信息.
     *
     * @param innerClass        DTO类信息
     * @param introspectedTable 表信息
     */
    private void customAddClassComment(JavaElement innerClass, IntrospectedTable introspectedTable) {
        if (suppressAllComments) {
            return;
        }

        StringBuilder sb = new StringBuilder();
        innerClass.addJavaDocLine("/**");
        sb.append(" * " + "\n");
        sb.append(" * @author ");
        sb.append(systemPro.getProperty("user.name"));
        sb.append(" ");
        sb.append("\n * @date " + currentDateStr);
        innerClass.addJavaDocLine(sb.toString());
        innerClass.addJavaDocLine(" */");
    }

    /**
     * 添加属性注释.
     *
     * @param field             属性信息
     * @param introspectedTable 表信息
     */
    private void customFiledComment(JavaElement field, IntrospectedTable introspectedTable) {
        if (suppressAllComments) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        field.addJavaDocLine("/**");
        sb.append(" * ");
        sb.append(introspectedTable.getFullyQualifiedTable());
        field.addJavaDocLine(sb.toString());
        field.addJavaDocLine(" */");
    }
}
