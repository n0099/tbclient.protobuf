package tbclient.PassFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 1)
    public final friendInfo friend_info;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.friend_info = builder.friend_info;
        } else {
            this.friend_info = builder.friend_info;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataRes> {
        public friendInfo friend_info;

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.friend_info = dataRes.friend_info;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
