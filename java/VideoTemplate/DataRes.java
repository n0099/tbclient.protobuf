package tbclient.VideoTemplate;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.VideoTemplateContent;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_ACTIVITY_URL = "";
    public static final String DEFAULT_BACK_URL = "";
    public static final String DEFAULT_TOPIC_NAME = "";
    public static final String DEFAULT_VIDEO_TEMPLATE_URL = "";
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String activity_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String back_url;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer topic_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String topic_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<VideoTemplateContent> video_template_content;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String video_template_url;
    public static final List<VideoTemplateContent> DEFAULT_VIDEO_TEMPLATE_CONTENT = Collections.emptyList();
    public static final Integer DEFAULT_TOPIC_ID = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public String activity_url;
        public String back_url;
        public Integer topic_id;
        public String topic_name;
        public List<VideoTemplateContent> video_template_content;
        public String video_template_url;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.video_template_content = Message.copyOf(dataRes.video_template_content);
            this.topic_id = dataRes.topic_id;
            this.topic_name = dataRes.topic_name;
            this.back_url = dataRes.back_url;
            this.video_template_url = dataRes.video_template_url;
            this.activity_url = dataRes.activity_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<VideoTemplateContent> list = builder.video_template_content;
            if (list == null) {
                this.video_template_content = DEFAULT_VIDEO_TEMPLATE_CONTENT;
            } else {
                this.video_template_content = Message.immutableCopyOf(list);
            }
            Integer num = builder.topic_id;
            if (num == null) {
                this.topic_id = DEFAULT_TOPIC_ID;
            } else {
                this.topic_id = num;
            }
            String str = builder.topic_name;
            if (str == null) {
                this.topic_name = "";
            } else {
                this.topic_name = str;
            }
            String str2 = builder.back_url;
            if (str2 == null) {
                this.back_url = "";
            } else {
                this.back_url = str2;
            }
            String str3 = builder.video_template_url;
            if (str3 == null) {
                this.video_template_url = "";
            } else {
                this.video_template_url = str3;
            }
            String str4 = builder.activity_url;
            if (str4 == null) {
                this.activity_url = "";
                return;
            } else {
                this.activity_url = str4;
                return;
            }
        }
        this.video_template_content = Message.immutableCopyOf(builder.video_template_content);
        this.topic_id = builder.topic_id;
        this.topic_name = builder.topic_name;
        this.back_url = builder.back_url;
        this.video_template_url = builder.video_template_url;
        this.activity_url = builder.activity_url;
    }
}
