package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class SdkTopicThread extends Message {
    public static final String DEFAULT_PIC_URL = "";
    public static final String DEFAULT_TITLE = "";
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

    /* synthetic */ SdkTopicThread(Builder builder, boolean z, SdkTopicThread sdkTopicThread) {
        this(builder, z);
    }

    private SdkTopicThread(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.pic_url == null) {
                this.pic_url = "";
            } else {
                this.pic_url = builder.pic_url;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.post_num == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = builder.post_num;
            }
            if (builder.zan_num == null) {
                this.zan_num = DEFAULT_ZAN_NUM;
            } else {
                this.zan_num = builder.zan_num;
            }
            if (builder.tid == null) {
                this.tid = DEFAULT_TID;
                return;
            } else {
                this.tid = builder.tid;
                return;
            }
        }
        this.pic_url = builder.pic_url;
        this.title = builder.title;
        this.post_num = builder.post_num;
        this.zan_num = builder.zan_num;
        this.tid = builder.tid;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<SdkTopicThread> {
        public String pic_url;
        public Long post_num;
        public Long tid;
        public String title;
        public Long zan_num;

        public Builder() {
        }

        public Builder(SdkTopicThread sdkTopicThread) {
            super(sdkTopicThread);
            if (sdkTopicThread != null) {
                this.pic_url = sdkTopicThread.pic_url;
                this.title = sdkTopicThread.title;
                this.post_num = sdkTopicThread.post_num;
                this.zan_num = sdkTopicThread.zan_num;
                this.tid = sdkTopicThread.tid;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SdkTopicThread build(boolean z) {
            return new SdkTopicThread(this, z, null);
        }
    }
}
