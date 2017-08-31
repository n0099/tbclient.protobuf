package tbclient.GetVUserInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class GetVUserInfoResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private GetVUserInfoResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GetVUserInfoResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetVUserInfoResIdl getVUserInfoResIdl) {
            super(getVUserInfoResIdl);
            if (getVUserInfoResIdl != null) {
                this.error = getVUserInfoResIdl.error;
                this.data = getVUserInfoResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetVUserInfoResIdl build(boolean z) {
            return new GetVUserInfoResIdl(this, z);
        }
    }
}