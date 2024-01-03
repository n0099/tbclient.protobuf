package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
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

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ReplyList> {
        public Long friend_id;
        public String message;
        public Integer time;
        public Long user_id;

        public Builder() {
        }

        public Builder(ReplyList replyList) {
            super(replyList);
            if (replyList == null) {
                return;
            }
            this.user_id = replyList.user_id;
            this.friend_id = replyList.friend_id;
            this.message = replyList.message;
            this.time = replyList.time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReplyList build(boolean z) {
            return new ReplyList(this, z);
        }
    }

    public ReplyList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            Long l2 = builder.friend_id;
            if (l2 == null) {
                this.friend_id = DEFAULT_FRIEND_ID;
            } else {
                this.friend_id = l2;
            }
            String str = builder.message;
            if (str == null) {
                this.message = "";
            } else {
                this.message = str;
            }
            Integer num = builder.time;
            if (num == null) {
                this.time = DEFAULT_TIME;
                return;
            } else {
                this.time = num;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.friend_id = builder.friend_id;
        this.message = builder.message;
        this.time = builder.time;
    }
}
