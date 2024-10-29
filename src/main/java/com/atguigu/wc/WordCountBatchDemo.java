package com.atguigu.wc;
import org.apache.flink.api.java.operators.DataSource;
import org.apache.flink.api.java.ExecutionEnvironment;


public class WordCountBatchDemo {
    public static void main(String[] args) {
        //1.创建执行环境
        ExecutionEnvironment.getExecutionEnvironment();
        //2.读取数据
        DataSource<String> LineDS = env.readTextFile("input/word.txt");
        //3.处理数据,切分
        lineDS.flatMap(new FlatMapFunction<String, Tuple2<String, Integer>>() {


    }
}
