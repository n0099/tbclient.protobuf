package tbclient.GetPrivateInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes7.dex */
public final class GetPrivateInfoResIdl extends Message {
    @ProtoField(tag = 1)
    public final ResData data;
    @ProtoField(tag = 2)
    public final Error error;

    private GetPrivateInfoResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
            return;
        }
        this.data = builder.data;
        this.error = builder.error;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetPrivateInfoResIdl> {
        public ResData data;
        public Error error;

        public Builder() {
        }

        public Builder(GetPrivateInfoResIdl getPrivateInfoResIdl) {
            super(getPrivateInfoResIdl);
            if (getPrivateInfoResIdl != null) {
                this.data = getPrivateInfoResIdl.data;
                this.error = getPrivateInfoResIdl.error;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetPrivateInfoResIdl build(boolean z) {
            return new GetPrivateInfoResIdl(this, z);
        }
    }
}
