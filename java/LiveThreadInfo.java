package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class LiveThreadInfo extends Message {
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 6)
    public final AlaLiveAttr ala_live_attr;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long thread_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long user_ip;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_USER_IP = 0L;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<LiveThreadInfo> {
        public AlaLiveAttr ala_live_attr;
        public Long forum_id;
        public Long thread_id;
        public String title;
        public Long user_id;
        public Long user_ip;

        public Builder() {
        }

        public Builder(LiveThreadInfo liveThreadInfo) {
            super(liveThreadInfo);
            if (liveThreadInfo == null) {
                return;
            }
            this.forum_id = liveThreadInfo.forum_id;
            this.thread_id = liveThreadInfo.thread_id;
            this.title = liveThreadInfo.title;
            this.user_id = liveThreadInfo.user_id;
            this.user_ip = liveThreadInfo.user_ip;
            this.ala_live_attr = liveThreadInfo.ala_live_attr;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LiveThreadInfo build(boolean z) {
            return new LiveThreadInfo(this, z);
        }
    }

    public LiveThreadInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            Long l2 = builder.thread_id;
            if (l2 == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l2;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            Long l3 = builder.user_id;
            if (l3 == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l3;
            }
            Long l4 = builder.user_ip;
            if (l4 == null) {
                this.user_ip = DEFAULT_USER_IP;
            } else {
                this.user_ip = l4;
            }
            this.ala_live_attr = builder.ala_live_attr;
            return;
        }
        this.forum_id = builder.forum_id;
        this.thread_id = builder.thread_id;
        this.title = builder.title;
        this.user_id = builder.user_id;
        this.user_ip = builder.user_ip;
        this.ala_live_attr = builder.ala_live_attr;
    }
}
