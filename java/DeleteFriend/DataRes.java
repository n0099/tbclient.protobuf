package tbclient.DeleteFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static final Long DEFAULT_FRIEND_ID = 0L;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long friend_id;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Long friend_id;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.friend_id = dataRes.friend_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.friend_id;
            if (l == null) {
                this.friend_id = DEFAULT_FRIEND_ID;
                return;
            } else {
                this.friend_id = l;
                return;
            }
        }
        this.friend_id = builder.friend_id;
    }
}
