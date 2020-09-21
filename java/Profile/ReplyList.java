package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes21.dex */
public final class ReplyList extends Message {
    public static final String DEFAULT_MESSAGE = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long friend_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String message;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer time;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_FRIEND_ID = 0L;
    public static final Integer DEFAULT_TIME = 0;

    private ReplyList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.friend_id == null) {
                this.friend_id = DEFAULT_FRIEND_ID;
            } else {
                this.friend_id = builder.friend_id;
            }
            if (builder.message == null) {
                this.message = "";
            } else {
                this.message = builder.message;
            }
            if (builder.time == null) {
                this.time = DEFAULT_TIME;
                return;
            } else {
                this.time = builder.time;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.friend_id = builder.friend_id;
        this.message = builder.message;
        this.time = builder.time;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<ReplyList> {
        public Long friend_id;
        public String message;
        public Integer time;
        public Long user_id;

        public Builder() {
        }

        public Builder(ReplyList replyList) {
            super(replyList);
            if (replyList != null) {
                this.user_id = replyList.user_id;
                this.friend_id = replyList.friend_id;
                this.message = replyList.message;
                this.time = replyList.time;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReplyList build(boolean z) {
            return new ReplyList(this, z);
        }
    }
}
