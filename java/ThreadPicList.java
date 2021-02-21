package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class ThreadPicList extends Message {
    public static final String DEFAULT_PIC = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String pic;

    private ThreadPicList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.pic == null) {
                this.pic = "";
                return;
            } else {
                this.pic = builder.pic;
                return;
            }
        }
        this.pic = builder.pic;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ThreadPicList> {
        public String pic;

        public Builder() {
        }

        public Builder(ThreadPicList threadPicList) {
            super(threadPicList);
            if (threadPicList != null) {
                this.pic = threadPicList.pic;
            }
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
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
