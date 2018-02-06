package tbclient.GetBawuInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes3.dex */
public final class GetBawuInfoResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    private GetBawuInfoResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
            return;
        }
        this.data = builder.data;
        this.error = builder.error;
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<GetBawuInfoResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetBawuInfoResIdl getBawuInfoResIdl) {
            super(getBawuInfoResIdl);
            if (getBawuInfoResIdl != null) {
                this.data = getBawuInfoResIdl.data;
                this.error = getBawuInfoResIdl.error;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetBawuInfoResIdl build(boolean z) {
            return new GetBawuInfoResIdl(this, z);
        }
    }
}
