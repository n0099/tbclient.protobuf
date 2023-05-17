package tbclient.GetPoisByLocation;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes10.dex */
public final class GetPoisByLocationResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<GetPoisByLocationResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetPoisByLocationResIdl getPoisByLocationResIdl) {
            super(getPoisByLocationResIdl);
            if (getPoisByLocationResIdl == null) {
                return;
            }
            this.error = getPoisByLocationResIdl.error;
            this.data = getPoisByLocationResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetPoisByLocationResIdl build(boolean z) {
            return new GetPoisByLocationResIdl(this, z);
        }
    }

    public GetPoisByLocationResIdl(Builder builder, boolean z) {
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
