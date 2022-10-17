import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class RestApiWorker {
    private static final String BASE_URN = "http://localhost:80/app-portal/api/";

    public CloseableHttpResponse getSession() throws Exception {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(BASE_URN + "login");
        post.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");
        JSONObject resultJson = new JSONObject();
        resultJson.put("username", "admin");
        resultJson.put("password", "admin");
        resultJson.put("locale", "ru");
        StringEntity stringEntity = new StringEntity(resultJson.toString());
        post.setEntity(stringEntity);
        CloseableHttpResponse response = httpClient.execute(post);
        if (response.getStatusLine().getStatusCode() == 200) {
            return response;
        } else {
            return null;
        }
    }

    public String getResult(CloseableHttpResponse response) throws Exception {
        StringBuilder result = new StringBuilder();
        BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        return result.toString();
    }

    public CloseableHttpResponse getAllUsers(String session) throws Exception {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(BASE_URN + "query?s=" + session);
        post.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");
        JSONObject resultJson = new JSONObject();
        resultJson.put("entity", "sec$User");
        resultJson.put("query", "select e from sec$User e");
        resultJson.put("view", "_local");

        StringEntity stringEntity = new StringEntity(resultJson.toString());
        post.setEntity(stringEntity);

        CloseableHttpResponse response = httpClient.execute(post);
        if(response.getStatusLine().getStatusCode() == 200){
            return response;
        } else {
            return null;
        }
    }

    public CloseableHttpResponse getUserTasks(String session, String userName) throws Exception {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        String queryEntity = "&e=" + UrlEncode("tm$Task");
        String querySelect = "&q=" + UrlEncode(String.format("select e from tm$Task e where e.executor.lastName = '%s'", userName));
        String queryView = "&view="+ UrlEncode("_minimal");
        String encodeString = queryEntity + querySelect + queryView;
        HttpGet httpGet = new HttpGet(BASE_URN + "query.json?s=" + session + encodeString);


        CloseableHttpResponse response = httpClient.execute(httpGet);
        if(response.getStatusLine().getStatusCode() == 200){
            return response;
        } else {
            return null;
        }
    }

    public CloseableHttpResponse getUserAssignmentsDocs(String session, String userName) throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        String queryEntity = "&e=" + UrlEncode("df$Doc");
        String querySelect = "&q=" + UrlEncode(String.format("select e from df$Doc e where e.executor.lastName = '%s'", userName));
        String queryView = "&view="+ UrlEncode("_minimal");
        String encodeString = queryEntity + querySelect + queryView;
        HttpGet httpGet = new HttpGet(BASE_URN + "query.json?s=" + session + encodeString);


        CloseableHttpResponse response = httpClient.execute(httpGet);
        if(response.getStatusLine().getStatusCode() == 200){
            return response;
        } else {
            return null;
        }
    }

    public void logout(String session) throws Exception {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(BASE_URN + "logout");
        post.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");
        JSONObject resultJson = new JSONObject();
        resultJson.put("session", session);
        //select e.card.id from wf$Assignment e where e.user.id = 'b8dcf99c-f01b-eb9f-80f0-b059aefbfd7a'
        StringEntity stringEntity = new StringEntity(resultJson.toString());
        post.setEntity(stringEntity);
        httpClient.execute(post);
    }

    protected String UrlEncode(String url){
        url = url.replace("%", "%26");
        url = url.replace(" ", "%20");
        url = url.replace("$", "%24");
        url = url.replace("=", "%3D");
        url = url.replace("'", "%27");

        return url;
    }

}
