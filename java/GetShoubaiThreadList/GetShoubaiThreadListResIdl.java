package tbclient.GetShoubaiThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes9.dex */
public final class GetShoubaiThreadListResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GetShoubaiThreadListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetShoubaiThreadListResIdl getShoubaiThreadListResIdl) {
            super(getShoubaiThreadListResIdl);
            if (getShoubaiThreadListResIdl == null) {
                return;
            }
            this.error = getShoubaiThreadListResIdl.error;
            this.data = getShoubaiThreadListResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetShoubaiThreadListResIdl build(boolean z) {
            return new GetShoubaiThreadListResIdl(this, z);
        }
    }

    public GetShoubaiThreadListResIdl(Builder builder, boolean z) {
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
