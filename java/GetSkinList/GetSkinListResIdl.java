package tbclient.GetSkinList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes7.dex */
public final class GetSkinListResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetSkinListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetSkinListResIdl getSkinListResIdl) {
            super(getSkinListResIdl);
            if (getSkinListResIdl == null) {
                return;
            }
            this.data = getSkinListResIdl.data;
            this.error = getSkinListResIdl.error;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetSkinListResIdl build(boolean z) {
            return new GetSkinListResIdl(this, z);
        }
    }

    public GetSkinListResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
            return;
        }
        this.data = builder.data;
        this.error = builder.error;
    }
}
