package tbclient.GetUserInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.User;
/* loaded from: classes21.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 1)
    public final User user;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.user = builder.user;
        } else {
            this.user = builder.user;
        }
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public User user;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.user = dataRes.user;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
