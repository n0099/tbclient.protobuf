package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class GodInfo extends Message {
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_INTRO = "";
    public static final String DEFAULT_RECOMMEND_REASON = "";
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer can_send_msg;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long fid;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer followed;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String intro;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String recommend_reason;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Long DEFAULT_ID = 0L;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Long DEFAULT_FID = 0L;
    public static final Integer DEFAULT_FOLLOWED = 0;
    public static final Integer DEFAULT_CAN_SEND_MSG = 0;

    private GodInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.intro == null) {
                this.intro = "";
            } else {
                this.intro = builder.intro;
            }
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.fid == null) {
                this.fid = DEFAULT_FID;
            } else {
                this.fid = builder.fid;
            }
            if (builder.followed == null) {
                this.followed = DEFAULT_FOLLOWED;
            } else {
                this.followed = builder.followed;
            }
            if (builder.recommend_reason == null) {
                this.recommend_reason = "";
            } else {
                this.recommend_reason = builder.recommend_reason;
            }
            if (builder.forum_name == null) {
                this.forum_name = "";
            } else {
                this.forum_name = builder.forum_name;
            }
            if (builder.can_send_msg == null) {
                this.can_send_msg = DEFAULT_CAN_SEND_MSG;
                return;
            } else {
                this.can_send_msg = builder.can_send_msg;
                return;
            }
        }
        this.id = builder.id;
        this.intro = builder.intro;
        this.type = builder.type;
        this.fid = builder.fid;
        this.followed = builder.followed;
        this.recommend_reason = builder.recommend_reason;
        this.forum_name = builder.forum_name;
        this.can_send_msg = builder.can_send_msg;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<GodInfo> {
        public Integer can_send_msg;
        public Long fid;
        public Integer followed;
        public String forum_name;
        public Long id;
        public String intro;
        public String recommend_reason;
        public Integer type;

        public Builder() {
        }

        public Builder(GodInfo godInfo) {
            super(godInfo);
            if (godInfo != null) {
                this.id = godInfo.id;
                this.intro = godInfo.intro;
                this.type = godInfo.type;
                this.fid = godInfo.fid;
                this.followed = godInfo.followed;
                this.recommend_reason = godInfo.recommend_reason;
                this.forum_name = godInfo.forum_name;
                this.can_send_msg = godInfo.can_send_msg;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GodInfo build(boolean z) {
            return new GodInfo(this, z);
        }
    }
}
