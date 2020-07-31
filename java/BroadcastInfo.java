package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes16.dex */
public final class BroadcastInfo extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_CTR = "";
    public static final String DEFAULT_PIC_URL = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer audit_status;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long bcast_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String ctr;
    @ProtoField(tag = 5)
    public final RecommendForumInfo forum_info;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer publish_time;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer pushuser_cnt;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer pv;
    @ProtoField(tag = 10)
    public final ThreadInfo thread_infos;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    public static final Long DEFAULT_BCAST_ID = 0L;
    public static final Integer DEFAULT_PUBLISH_TIME = 0;
    public static final Integer DEFAULT_PUSHUSER_CNT = 0;
    public static final Integer DEFAULT_PV = 0;
    public static final Integer DEFAULT_AUDIT_STATUS = 0;

    private BroadcastInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.bcast_id == null) {
                this.bcast_id = DEFAULT_BCAST_ID;
            } else {
                this.bcast_id = builder.bcast_id;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.content == null) {
                this.content = "";
            } else {
                this.content = builder.content;
            }
            this.forum_info = builder.forum_info;
            if (builder.publish_time == null) {
                this.publish_time = DEFAULT_PUBLISH_TIME;
            } else {
                this.publish_time = builder.publish_time;
            }
            if (builder.pushuser_cnt == null) {
                this.pushuser_cnt = DEFAULT_PUSHUSER_CNT;
            } else {
                this.pushuser_cnt = builder.pushuser_cnt;
            }
            if (builder.pv == null) {
                this.pv = DEFAULT_PV;
            } else {
                this.pv = builder.pv;
            }
            if (builder.ctr == null) {
                this.ctr = "";
            } else {
                this.ctr = builder.ctr;
            }
            this.thread_infos = builder.thread_infos;
            if (builder.audit_status == null) {
                this.audit_status = DEFAULT_AUDIT_STATUS;
            } else {
                this.audit_status = builder.audit_status;
            }
            if (builder.pic_url == null) {
                this.pic_url = "";
                return;
            } else {
                this.pic_url = builder.pic_url;
                return;
            }
        }
        this.bcast_id = builder.bcast_id;
        this.title = builder.title;
        this.content = builder.content;
        this.forum_info = builder.forum_info;
        this.publish_time = builder.publish_time;
        this.pushuser_cnt = builder.pushuser_cnt;
        this.pv = builder.pv;
        this.ctr = builder.ctr;
        this.thread_infos = builder.thread_infos;
        this.audit_status = builder.audit_status;
        this.pic_url = builder.pic_url;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<BroadcastInfo> {
        public Integer audit_status;
        public Long bcast_id;
        public String content;
        public String ctr;
        public RecommendForumInfo forum_info;
        public String pic_url;
        public Integer publish_time;
        public Integer pushuser_cnt;
        public Integer pv;
        public ThreadInfo thread_infos;
        public String title;

        public Builder() {
        }

        public Builder(BroadcastInfo broadcastInfo) {
            super(broadcastInfo);
            if (broadcastInfo != null) {
                this.bcast_id = broadcastInfo.bcast_id;
                this.title = broadcastInfo.title;
                this.content = broadcastInfo.content;
                this.forum_info = broadcastInfo.forum_info;
                this.publish_time = broadcastInfo.publish_time;
                this.pushuser_cnt = broadcastInfo.pushuser_cnt;
                this.pv = broadcastInfo.pv;
                this.ctr = broadcastInfo.ctr;
                this.thread_infos = broadcastInfo.thread_infos;
                this.audit_status = broadcastInfo.audit_status;
                this.pic_url = broadcastInfo.pic_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BroadcastInfo build(boolean z) {
            return new BroadcastInfo(this, z);
        }
    }
}
