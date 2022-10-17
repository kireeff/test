import org.apache.http.client.methods.CloseableHttpResponse;
import org.json.JSONArray;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner command = new Scanner(System.in);
        while (true){
                switch (command.next().toLowerCase()) {
                    case RestApiConstants.GET_ALL_USERS:
                        getAllUsers();
                        break;
                    case RestApiConstants.GET_ALL_USER_TASKS:
                        System.out.print("Имя для поиска: ");
                        String name = command.next();
                        getAllUserTasks(name);
                        break;
                    case RestApiConstants.GET_ALL_USER_DOCS:
                        getAllUserDocs();
                        break;
                    case RestApiConstants.CREATE_NEW_POSITION:
                        createNewPosition();
                        break;
                    case RestApiConstants.CREATE_NEW_TASK:
                        createNewTask();
                        break;
                    default:
                        System.out.println("Incorrect command. Try again.");

            }
        }
    }

    protected static void getAllUsers() throws Exception {
        RestApiWorker restApiWorker = new RestApiWorker();
        CloseableHttpResponse session = restApiWorker.getSession();
        String stringSession = restApiWorker.getResult(session);
        CloseableHttpResponse usersResponse = restApiWorker.getAllUsers(stringSession);
        restApiWorker.logout(stringSession);
        String jsonResult = restApiWorker.getResult(usersResponse);
        System.out.printf("Json RESULT: %s%n", jsonResult);

        JSONArray jsonArray = new JSONArray(jsonResult);
        System.out.println(jsonArray);
    }
    protected static void getAllUserTasks(String name) throws Exception{
        RestApiWorker restApiWorker = new RestApiWorker();
        CloseableHttpResponse session = restApiWorker.getSession();
        String stringSession = restApiWorker.getResult(session);
        CloseableHttpResponse tasksResponse = restApiWorker.getUserTasks(stringSession, name);
        restApiWorker.logout(stringSession);
        String jsonResult = restApiWorker.getResult(tasksResponse);

        JSONArray jsonArray = new JSONArray(jsonResult);
        System.out.println(jsonArray);
    }
    protected static void getAllUserDocs() throws Exception{

    }
    protected static void createNewPosition() throws Exception{

    }
    protected static void createNewTask() throws Exception{

    }
}

