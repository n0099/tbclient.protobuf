package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes8.dex */
public final class ThreadPicList extends Message {
    public static final String DEFAULT_PIC = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String pic;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<ThreadPicList> {
        public String pic;

        public Builder() {
        }

        public Builder(ThreadPicList threadPicList) {
            super(threadPicList);
            if (threadPicList == null) {
                return;
            }
            this.pic = threadPicList.pic;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThreadPicList build(boolean z) {
            return new ThreadPicList(this, z);
        }
    }

    public static ThreadPicList parseFromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        builder.pic = jSONObject.optString("pic");
        return builder.build(false);
    }

    public static JSONObject toJson(ThreadPicList threadPicList) {
        if (threadPicList == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pic", threadPicList.pic);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public ThreadPicList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.pic;
            if (str == null) {
                this.pic = "";
                return;
            } else {
                this.pic = str;
                return;
            }
        }
        this.pic = builder.pic;
    }
}
