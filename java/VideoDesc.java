package tbclient;

import com.baidu.tieba.tbadkCore.videoupload.VideoFinishResult;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class VideoDesc extends Message {
    public static final String DEFAULT_VIDEO_HEIGHT = "";
    public static final Integer DEFAULT_VIDEO_ID = 0;
    public static final String DEFAULT_VIDEO_MD5 = "";
    public static final String DEFAULT_VIDEO_URL = "";
    public static final String DEFAULT_VIDEO_WIDTH = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String video_height;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer video_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String video_md5;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String video_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String video_width;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<VideoDesc> {
        public String video_height;
        public Integer video_id;
        public String video_md5;
        public String video_url;
        public String video_width;

        public Builder() {
        }

        public Builder(VideoDesc videoDesc) {
            super(videoDesc);
            if (videoDesc == null) {
                return;
            }
            this.video_id = videoDesc.video_id;
            this.video_md5 = videoDesc.video_md5;
            this.video_url = videoDesc.video_url;
            this.video_width = videoDesc.video_width;
            this.video_height = videoDesc.video_height;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VideoDesc build(boolean z) {
            return new VideoDesc(this, z);
        }
    }

    public static VideoDesc parseFromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        builder.video_id = Integer.valueOf(jSONObject.optInt("video_id"));
        builder.video_md5 = jSONObject.optString(VideoFinishResult.KEY_VIDEO_MD5);
        builder.video_url = jSONObject.optString("video_url");
        builder.video_width = jSONObject.optString("video_width");
        builder.video_height = jSONObject.optString("video_height");
        return builder.build(false);
    }

    public static JSONObject toJson(VideoDesc videoDesc) {
        if (videoDesc == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("video_id", videoDesc.video_id);
            jSONObject.put(VideoFinishResult.KEY_VIDEO_MD5, videoDesc.video_md5);
            jSONObject.put("video_url", videoDesc.video_url);
            jSONObject.put("video_width", videoDesc.video_width);
            jSONObject.put("video_height", videoDesc.video_height);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public VideoDesc(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.video_id;
            if (num == null) {
                this.video_id = DEFAULT_VIDEO_ID;
            } else {
                this.video_id = num;
            }
            String str = builder.video_md5;
            if (str == null) {
                this.video_md5 = "";
            } else {
                this.video_md5 = str;
            }
            String str2 = builder.video_url;
            if (str2 == null) {
                this.video_url = "";
            } else {
                this.video_url = str2;
            }
            String str3 = builder.video_width;
            if (str3 == null) {
                this.video_width = "";
            } else {
                this.video_width = str3;
            }
            String str4 = builder.video_height;
            if (str4 == null) {
                this.video_height = "";
                return;
            } else {
                this.video_height = str4;
                return;
            }
        }
        this.video_id = builder.video_id;
        this.video_md5 = builder.video_md5;
        this.video_url = builder.video_url;
        this.video_width = builder.video_width;
        this.video_height = builder.video_height;
    }
}
