package tbclient.GetUserBfbInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.UserBfbInfo;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 1)
    public final UserBfbInfo bfb;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.bfb = builder.bfb;
        } else {
            this.bfb = builder.bfb;
        }
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public UserBfbInfo bfb;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.bfb = dataRes.bfb;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
