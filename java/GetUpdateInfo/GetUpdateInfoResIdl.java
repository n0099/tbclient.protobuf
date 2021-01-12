package tbclient.GetUpdateInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes8.dex */
public final class GetUpdateInfoResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    private GetUpdateInfoResIdl(Builder builder, boolean z) {
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
    public static final class Builder extends Message.Builder<GetUpdateInfoResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetUpdateInfoResIdl getUpdateInfoResIdl) {
            super(getUpdateInfoResIdl);
            if (getUpdateInfoResIdl != null) {
                this.data = getUpdateInfoResIdl.data;
                this.error = getUpdateInfoResIdl.error;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetUpdateInfoResIdl build(boolean z) {
            return new GetUpdateInfoResIdl(this, z);
        }
    }
}
