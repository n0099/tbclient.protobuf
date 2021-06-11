package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class DailyTopic extends Message {
    public static final String DEFAULT_TOPIC_ABSTRACT = "";
    public static final String DEFAULT_TOPIC_PIC = "";
    public static final String DEFAULT_TOPIC_RANK_URL = "";
    public static final String DEFAULT_TOPIC_TITLE = "";
    public static final String DEFAULT_TOPIC_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String topic_abstract;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String topic_pic;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String topic_rank_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String topic_title;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String topic_url;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DailyTopic> {
        public String topic_abstract;
        public String topic_pic;
        public String topic_rank_url;
        public String topic_title;
        public String topic_url;

        public Builder() {
        }

        public Builder(DailyTopic dailyTopic) {
            super(dailyTopic);
            if (dailyTopic == null) {
                return;
            }
            this.topic_title = dailyTopic.topic_title;
            this.topic_abstract = dailyTopic.topic_abstract;
            this.topic_pic = dailyTopic.topic_pic;
            this.topic_url = dailyTopic.topic_url;
            this.topic_rank_url = dailyTopic.topic_rank_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DailyTopic build(boolean z) {
            return new DailyTopic(this, z);
        }
    }

    public DailyTopic(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.topic_title;
            if (str == null) {
                this.topic_title = "";
            } else {
                this.topic_title = str;
            }
            String str2 = builder.topic_abstract;
            if (str2 == null) {
                this.topic_abstract = "";
            } else {
                this.topic_abstract = str2;
            }
            String str3 = builder.topic_pic;
            if (str3 == null) {
                this.topic_pic = "";
            } else {
                this.topic_pic = str3;
            }
            String str4 = builder.topic_url;
            if (str4 == null) {
                this.topic_url = "";
            } else {
                this.topic_url = str4;
            }
            String str5 = builder.topic_rank_url;
            if (str5 == null) {
                this.topic_rank_url = "";
                return;
            } else {
                this.topic_rank_url = str5;
                return;
            }
        }
        this.topic_title = builder.topic_title;
        this.topic_abstract = builder.topic_abstract;
        this.topic_pic = builder.topic_pic;
        this.topic_url = builder.topic_url;
        this.topic_rank_url = builder.topic_rank_url;
    }
}
