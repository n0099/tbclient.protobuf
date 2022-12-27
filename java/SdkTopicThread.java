package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class SdkTopicThread extends Message {
    public static final String DEFAULT_PIC_URL = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer need_topic;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long post_num;
    @ProtoField(tag = 5, type = Message.Datatype.UINT64)
    public final Long tid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long zan_num;
    public static final Long DEFAULT_POST_NUM = 0L;
    public static final Long DEFAULT_ZAN_NUM = 0L;
    public static final Long DEFAULT_TID = 0L;
    public static final Integer DEFAULT_NEED_TOPIC = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<SdkTopicThread> {
        public Integer need_topic;
        public String pic_url;
        public Long post_num;
        public Long tid;
        public String title;
        public Long zan_num;

        public Builder() {
        }

        public Builder(SdkTopicThread sdkTopicThread) {
            super(sdkTopicThread);
            if (sdkTopicThread == null) {
                return;
            }
            this.pic_url = sdkTopicThread.pic_url;
            this.title = sdkTopicThread.title;
            this.post_num = sdkTopicThread.post_num;
            this.zan_num = sdkTopicThread.zan_num;
            this.tid = sdkTopicThread.tid;
            this.need_topic = sdkTopicThread.need_topic;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SdkTopicThread build(boolean z) {
            return new SdkTopicThread(this, z);
        }
    }

    public SdkTopicThread(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.pic_url;
            if (str == null) {
                this.pic_url = "";
            } else {
                this.pic_url = str;
            }
            String str2 = builder.title;
            if (str2 == null) {
                this.title = "";
            } else {
                this.title = str2;
            }
            Long l = builder.post_num;
            if (l == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = l;
            }
            Long l2 = builder.zan_num;
            if (l2 == null) {
                this.zan_num = DEFAULT_ZAN_NUM;
            } else {
                this.zan_num = l2;
            }
            Long l3 = builder.tid;
            if (l3 == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l3;
            }
            Integer num = builder.need_topic;
            if (num == null) {
                this.need_topic = DEFAULT_NEED_TOPIC;
                return;
            } else {
                this.need_topic = num;
                return;
            }
        }
        this.pic_url = builder.pic_url;
        this.title = builder.title;
        this.post_num = builder.post_num;
        this.zan_num = builder.zan_num;
        this.tid = builder.tid;
        this.need_topic = builder.need_topic;
    }
}
