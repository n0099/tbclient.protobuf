package tbclient.Share;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes7.dex */
public final class ShareResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ShareResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(ShareResIdl shareResIdl) {
            super(shareResIdl);
            if (shareResIdl == null) {
                return;
            }
            this.error = shareResIdl.error;
            this.data = shareResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ShareResIdl build(boolean z) {
            return new ShareResIdl(this, z);
        }
    }

    public ShareResIdl(Builder builder, boolean z) {
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
