package tbclient;

import java.io.Serializable;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class DeleteThreadInfo implements Serializable {
    public int text_id;
    public String text_info;

    public void parserJson(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.text_id = jSONObject.optInt("text_id");
            this.text_info = jSONObject.optString("text_info");
        }
    }
}
