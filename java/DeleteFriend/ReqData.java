package tbclient.DeleteFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ReqData extends Message {
    public static final Long DEFAULT_FRIEND_ID = 0L;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long friend_id;

    /* synthetic */ ReqData(Builder builder, boolean z, ReqData reqData) {
        this(builder, z);
    }

    private ReqData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.friend_id == null) {
                this.friend_id = DEFAULT_FRIEND_ID;
                return;
            } else {
                this.friend_id = builder.friend_id;
                return;
            }
        }
        this.friend_id = builder.friend_id;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<ReqData> {
        public Long friend_id;

        public Builder(ReqData reqData) {
            super(reqData);
            if (reqData != null) {
                this.friend_id = reqData.friend_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReqData build(boolean z) {
            return new ReqData(this, z, null);
        }
    }
}
