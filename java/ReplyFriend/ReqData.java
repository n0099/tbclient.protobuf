package tbclient.ReplyFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class ReqData extends Message {
    public static final Long DEFAULT_FRIEND_ID = 0L;
    public static final String DEFAULT_MESSAGE = "";
    @ProtoField(tag = 4)
    public final CommonReq common;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long friend_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String message;

    private ReqData(Builder builder, boolean z) {
        super(builder);
        if (z) {
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
            this.common = builder.common;
            return;
        }
        this.friend_id = builder.friend_id;
        this.message = builder.message;
        this.common = builder.common;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<ReqData> {
        public CommonReq common;
        public Long friend_id;
        public String message;

        public Builder() {
        }

        public Builder(ReqData reqData) {
            super(reqData);
            if (reqData != null) {
                this.friend_id = reqData.friend_id;
                this.message = reqData.message;
                this.common = reqData.common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReqData build(boolean z) {
            return new ReqData(this, z);
        }
    }
}
