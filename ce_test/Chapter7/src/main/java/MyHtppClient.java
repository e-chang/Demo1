/**
 * @Auther: wang
 * @Date: 2019/7/18 13:24
 */

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @author:
 * @date:
 */
public class MyHtppClient {
    @Test
    public void test1() throws IOException {
        String result;
        //get请求
        HttpGet get=new HttpGet("http://www.baidu.com");
        //httpclient执行get请求
        HttpClient client=new DefaultHttpClient();
        HttpResponse response=client.execute(get);
        //响应结果定义为string类型
        result=EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);

    }

}
