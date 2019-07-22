/**
 * @Auther: wang
 * @Date: 2019/7/22 14:43
 */


import com.sun.org.apache.xpath.internal.SourceTree;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;


import java.io.IOException;

/**
 * @author:
 * @date:
 */
public class httpClient_post {
    public static void main(String[] args) {
        //url
        String url = "https://t.finlean.com/fcplat/fc/login/login";

        //申明对象，执行post方法
        DefaultHttpClient client = new DefaultHttpClient();

        //申明方法
        HttpPost post = new HttpPost(url);

        //添加header，方法里面放header
        post.setHeader("Content-Type", "application/json; charset=UTF-8");

        //添加参数
        JSONObject param = new JSONObject();
        param.put("mblNo", "18113133187");
        param.put("password", "dad98b33a11250492f8a192038c9949a");

        //将参数放在post方法里
        StringEntity entity = new StringEntity(param.toString(), "utf-8");
        post.setEntity(entity);

        try {
            HttpResponse response = client.execute(post);
            //获取结果
            String result = EntityUtils.toString(response.getEntity());
            //System.out.println(result);
            JSONObject resultObject = new JSONObject(result.toString());
            JSONObject bodyObject = (JSONObject) resultObject.get("body");
            String sessionId = (String) bodyObject.get("sessionId");
            System.out.println(sessionId);


//            //断言
//            JSONObject resultJson = new JSONObject(result);
//            //获取结果值
//            String text1 =(String)resultJson.get("errMsg");
//
//            Assert.assertEquals("操作成功",text1);


        } catch (IOException pE) {
            pE.printStackTrace();
        }


    }


}
