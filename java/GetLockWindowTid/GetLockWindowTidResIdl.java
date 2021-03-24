package tbclient.GetLockWindowTid;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class GetLockWindowTidResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetLockWindowTidResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetLockWindowTidResIdl getLockWindowTidResIdl) {
            super(getLockWindowTidResIdl);
            if (getLockWindowTidResIdl == null) {
                return;
            }
            this.error = getLockWindowTidResIdl.error;
            this.data = getLockWindowTidResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetLockWindowTidResIdl build(boolean z) {
            return new GetLockWindowTidResIdl(this, z);
        }
    }

    public GetLockWindowTidResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }
}
