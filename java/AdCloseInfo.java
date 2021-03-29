package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes7.dex */
public final class AdCloseInfo extends Message {
    public static final String DEFAULT_CONFIRM_TITLE = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 5)
    public final ActionControl action_control;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String confirm_title;
    @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.STRING)
    public final List<String> reasons;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer support_close;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    public static final Integer DEFAULT_SUPPORT_CLOSE = 0;
    public static final List<String> DEFAULT_REASONS = Collections.emptyList();

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<AdCloseInfo> {
        public ActionControl action_control;
        public String confirm_title;
        public List<String> reasons;
        public Integer support_close;
        public String title;

        public Builder() {
        }

        public Builder(AdCloseInfo adCloseInfo) {
            super(adCloseInfo);
            if (adCloseInfo == null) {
                return;
            }
            this.support_close = adCloseInfo.support_close;
            this.title = adCloseInfo.title;
            this.reasons = Message.copyOf(adCloseInfo.reasons);
            this.confirm_title = adCloseInfo.confirm_title;
            this.action_control = adCloseInfo.action_control;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AdCloseInfo build(boolean z) {
            return new AdCloseInfo(this, z);
        }
    }

    public static AdCloseInfo parseFromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        builder.support_close = Integer.valueOf(jSONObject.optInt("support_close"));
        builder.title = jSONObject.optString("title");
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("reasons");
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                arrayList.add(optJSONArray.getString(i));
            } catch (Exception unused) {
            }
        }
        builder.reasons = arrayList;
        builder.confirm_title = jSONObject.optString("confirm_title");
        builder.action_control = ActionControl.parseFromJson(jSONObject.optJSONObject("action_control"));
        return builder.build(false);
    }

    public static JSONObject toJson(AdCloseInfo adCloseInfo) {
        if (adCloseInfo == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("support_close", adCloseInfo.support_close);
            jSONObject.put("title", adCloseInfo.title);
            JSONArray jSONArray = new JSONArray();
            for (String str : adCloseInfo.reasons) {
                jSONArray.put(str);
            }
            jSONObject.put("reasons", jSONArray);
            jSONObject.put("confirm_title", adCloseInfo.confirm_title);
            jSONObject.put("action_control", ActionControl.toJson(adCloseInfo.action_control));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public AdCloseInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.support_close;
            if (num == null) {
                this.support_close = DEFAULT_SUPPORT_CLOSE;
            } else {
                this.support_close = num;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            List<String> list = builder.reasons;
            if (list == null) {
                this.reasons = DEFAULT_REASONS;
            } else {
                this.reasons = Message.immutableCopyOf(list);
            }
            String str2 = builder.confirm_title;
            if (str2 == null) {
                this.confirm_title = "";
            } else {
                this.confirm_title = str2;
            }
            this.action_control = builder.action_control;
            return;
        }
        this.support_close = builder.support_close;
        this.title = builder.title;
        this.reasons = Message.immutableCopyOf(builder.reasons);
        this.confirm_title = builder.confirm_title;
        this.action_control = builder.action_control;
    }
}
