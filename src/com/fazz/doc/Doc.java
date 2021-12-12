package com.fazz.doc;

/**
 * @Author: Fazzcloud
 * @Date: 2021/12/12 20:41
 * @version：1.0
 * @since：1.8
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class Doc {
    String name;

    /**
     * @author : fazzcloud 作者名
     * @version:1.0 版本号
     * @since:指明需要最早使用的jdk版本
     * @param : name 参数名
     * @return :name 返回值情况
     * @throws :Exception 异常抛出情况
     */
    public String test(String name)  throws  Exception{
        return name;
    }

    //命令行生成文档，javadoc -encoding UTF-8 -charset UTF-8 文件名
}
