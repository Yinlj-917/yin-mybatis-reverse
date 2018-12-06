package com.yin.reverse;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lijian.yin@hand-china.com
 * @date 2018/8/11
 **/
public class app {

    public static void main(String[] ards) {
        try {
            List<String> list = new ArrayList<>();
            boolean overwrite = true;
            File configFile = new File("src/main/resources/mybatis-reverse.xml");
            ConfigurationParser cp = new ConfigurationParser(list);
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, list);
            myBatisGenerator.generate(null);
            System.out.println("=========== 生成成功 ===========");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("=========== 生成失败 ===========");
        }
    }
}
