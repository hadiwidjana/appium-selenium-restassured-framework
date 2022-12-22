package Gokomodo.Integration;

import Gokomodo.GlobalMethod.Integration.APIClient;
import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class TestRailAPI
{

    public static Gokomodo.GlobalMethod.Integration.APIClient client()
    {
        // TODO make this read from settings/config file
        Gokomodo.GlobalMethod.Integration.APIClient client = new Gokomodo.GlobalMethod.Integration.APIClient("https://qagokomodo.testrail.io");
        client.setUser("gunar.kasimir@gokomodo.com");
        client.setPassword("Gokomodo2022!");

        return client;
    }

    public static JSONObject getCase(int p_caseId) throws Exception
    {
        Gokomodo.GlobalMethod.Integration.APIClient client = Gokomodo.GlobalMethod.Integration.TestRailAPI.client();
        JSONObject c = (JSONObject) client.sendGet("get_case/" + p_caseId);

        return c;
    }

    public static JSONObject addResult(int p_statusId, String p_comment, int p_runId, int p_caseId) throws Exception
    {
        APIClient client = Gokomodo.GlobalMethod.Integration.TestRailAPI.client();
        Map data = new HashMap();
        data.put("status_id", new Integer(p_statusId));
        data.put("comment", p_comment);
        JSONObject r = (JSONObject) client.sendPost("add_result_for_case/" + p_runId + "/" + p_caseId, data);

        return r;
    }


}
