package tbclient.GetADList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes4.dex */
public final class GetADListResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private GetADListResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<GetADListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetADListResIdl getADListResIdl) {
            super(getADListResIdl);
            if (getADListResIdl != null) {
                this.error = getADListResIdl.error;
                this.data = getADListResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetADListResIdl build(boolean z) {
            return new GetADListResIdl(this, z);
        }
    }
}
