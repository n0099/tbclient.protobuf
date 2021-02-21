package tbclient;

import com.baidu.live.tbadk.core.sharedpref.SharedPrefConfig;
import com.baidu.tbadk.core.atomData.BigdayActivityConfig;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class McnAdInfo extends Message {
    public static final String DEFAULT_BUTTON_TITLE = "";
    public static final String DEFAULT_CARD_TITLE = "";
    public static final String DEFAULT_JUMP_URL = "";
    public static final String DEFAULT_PIC_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long ad_end_time;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long ad_start_time;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String button_title;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String card_title;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long effect_time;
    @ProtoField(tag = 8, type = Message.Datatype.INT64)
    public final Long expire_time;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pic_url;
    public static final Long DEFAULT_AD_START_TIME = 0L;
    public static final Long DEFAULT_AD_END_TIME = 0L;
    public static final Long DEFAULT_EFFECT_TIME = 0L;
    public static final Long DEFAULT_EXPIRE_TIME = 0L;

    private McnAdInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.ad_start_time == null) {
                this.ad_start_time = DEFAULT_AD_START_TIME;
            } else {
                this.ad_start_time = builder.ad_start_time;
            }
            if (builder.ad_end_time == null) {
                this.ad_end_time = DEFAULT_AD_END_TIME;
            } else {
                this.ad_end_time = builder.ad_end_time;
            }
            if (builder.pic_url == null) {
                this.pic_url = "";
            } else {
                this.pic_url = builder.pic_url;
            }
            if (builder.jump_url == null) {
                this.jump_url = "";
            } else {
                this.jump_url = builder.jump_url;
            }
            if (builder.card_title == null) {
                this.card_title = "";
            } else {
                this.card_title = builder.card_title;
            }
            if (builder.button_title == null) {
                this.button_title = "";
            } else {
                this.button_title = builder.button_title;
            }
            if (builder.effect_time == null) {
                this.effect_time = DEFAULT_EFFECT_TIME;
            } else {
                this.effect_time = builder.effect_time;
            }
            if (builder.expire_time == null) {
                this.expire_time = DEFAULT_EXPIRE_TIME;
                return;
            } else {
                this.expire_time = builder.expire_time;
                return;
            }
        }
        this.ad_start_time = builder.ad_start_time;
        this.ad_end_time = builder.ad_end_time;
        this.pic_url = builder.pic_url;
        this.jump_url = builder.jump_url;
        this.card_title = builder.card_title;
        this.button_title = builder.button_title;
        this.effect_time = builder.effect_time;
        this.expire_time = builder.expire_time;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("startTime = " + this.ad_start_time);
        sb.append(",   ad_end_time = " + this.ad_end_time);
        sb.append(",   pic_url = " + this.pic_url);
        sb.append(",   card_title = " + this.card_title);
        sb.append(",   button_title = " + this.button_title);
        return sb.toString();
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<McnAdInfo> {
        public Long ad_end_time;
        public Long ad_start_time;
        public String button_title;
        public String card_title;
        public Long effect_time;
        public Long expire_time;
        public String jump_url;
        public String pic_url;

        public Builder() {
        }

        public Builder(McnAdInfo mcnAdInfo) {
            super(mcnAdInfo);
            if (mcnAdInfo != null) {
                this.ad_start_time = mcnAdInfo.ad_start_time;
                this.ad_end_time = mcnAdInfo.ad_end_time;
                this.pic_url = mcnAdInfo.pic_url;
                this.jump_url = mcnAdInfo.jump_url;
                this.card_title = mcnAdInfo.card_title;
                this.button_title = mcnAdInfo.button_title;
                this.effect_time = mcnAdInfo.effect_time;
                this.expire_time = mcnAdInfo.expire_time;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public McnAdInfo build(boolean z) {
            return new McnAdInfo(this, z);
        }
    }

    public static McnAdInfo parseFromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        builder.ad_start_time = Long.valueOf(jSONObject.optLong(SharedPrefConfig.AD_START_TIME));
        builder.ad_end_time = Long.valueOf(jSONObject.optLong(SharedPrefConfig.AD_END_TIME));
        builder.pic_url = jSONObject.optString("pic_url");
        builder.jump_url = jSONObject.optString(BigdayActivityConfig.JUMP_URL);
        builder.card_title = jSONObject.optString("card_title");
        builder.button_title = jSONObject.optString("button_title");
        builder.effect_time = Long.valueOf(jSONObject.optLong("effect_time"));
        builder.expire_time = Long.valueOf(jSONObject.optLong("expire_time"));
        return builder.build(false);
    }

    public static JSONObject toJson(McnAdInfo mcnAdInfo) {
        if (mcnAdInfo == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(SharedPrefConfig.AD_START_TIME, mcnAdInfo.ad_start_time);
            jSONObject.put(SharedPrefConfig.AD_END_TIME, mcnAdInfo.ad_end_time);
            jSONObject.put("pic_url", mcnAdInfo.pic_url);
            jSONObject.put(BigdayActivityConfig.JUMP_URL, mcnAdInfo.jump_url);
            jSONObject.put("card_title", mcnAdInfo.card_title);
            jSONObject.put("button_title", mcnAdInfo.button_title);
            jSONObject.put("effect_time", mcnAdInfo.effect_time);
            jSONObject.put("expire_time", mcnAdInfo.expire_time);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
