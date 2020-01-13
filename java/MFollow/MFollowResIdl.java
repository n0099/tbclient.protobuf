package tbclient.MFollow;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes9.dex */
public final class MFollowResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private MFollowResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<MFollowResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(MFollowResIdl mFollowResIdl) {
            super(mFollowResIdl);
            if (mFollowResIdl != null) {
                this.error = mFollowResIdl.error;
                this.data = mFollowResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MFollowResIdl build(boolean z) {
            return new MFollowResIdl(this, z);
        }
    }
}
