package tbclient.GetSkin;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes8.dex */
public final class GetSkinResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    private GetSkinResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
            return;
        }
        this.data = builder.data;
        this.error = builder.error;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<GetSkinResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetSkinResIdl getSkinResIdl) {
            super(getSkinResIdl);
            if (getSkinResIdl != null) {
                this.data = getSkinResIdl.data;
                this.error = getSkinResIdl.error;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetSkinResIdl build(boolean z) {
            return new GetSkinResIdl(this, z);
        }
    }
}
