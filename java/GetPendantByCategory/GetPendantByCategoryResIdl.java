package tbclient.GetPendantByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes9.dex */
public final class GetPendantByCategoryResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GetPendantByCategoryResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetPendantByCategoryResIdl getPendantByCategoryResIdl) {
            super(getPendantByCategoryResIdl);
            if (getPendantByCategoryResIdl == null) {
                return;
            }
            this.error = getPendantByCategoryResIdl.error;
            this.data = getPendantByCategoryResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetPendantByCategoryResIdl build(boolean z) {
            return new GetPendantByCategoryResIdl(this, z);
        }
    }

    public GetPendantByCategoryResIdl(Builder builder, boolean z) {
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
