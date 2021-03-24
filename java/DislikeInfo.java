package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class DislikeInfo extends Message {
    public static final Integer DEFAULT_DISLIKE_ID = 0;
    public static final String DEFAULT_DISLIKE_REASON = "";
    public static final String DEFAULT_EXTRA = "";
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public Integer dislike_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public String dislike_reason;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String extra;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DislikeInfo> {
        public Integer dislike_id;
        public String dislike_reason;
        public String extra;

        public Builder() {
        }

        public Builder(DislikeInfo dislikeInfo) {
            super(dislikeInfo);
            if (dislikeInfo == null) {
                return;
            }
            this.dislike_reason = dislikeInfo.dislike_reason;
            this.dislike_id = dislikeInfo.dislike_id;
            this.extra = dislikeInfo.extra;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DislikeInfo build(boolean z) {
            return new DislikeInfo(this, z);
        }
    }

    public DislikeInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.dislike_reason;
            if (str == null) {
                this.dislike_reason = "";
            } else {
                this.dislike_reason = str;
            }
            Integer num = builder.dislike_id;
            if (num == null) {
                this.dislike_id = DEFAULT_DISLIKE_ID;
            } else {
                this.dislike_id = num;
            }
            String str2 = builder.extra;
            if (str2 == null) {
                this.extra = "";
                return;
            } else {
                this.extra = str2;
                return;
            }
        }
        this.dislike_reason = builder.dislike_reason;
        this.dislike_id = builder.dislike_id;
        this.extra = builder.extra;
    }

    public void parseJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.dislike_reason = jSONObject.optString("dislike_reason");
        this.dislike_id = Integer.valueOf(jSONObject.optInt("dislike_id"));
    }
}
