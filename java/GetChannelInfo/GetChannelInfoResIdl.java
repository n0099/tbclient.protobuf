package tbclient.GetChannelInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes3.dex */
public final class GetChannelInfoResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private GetChannelInfoResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<GetChannelInfoResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetChannelInfoResIdl getChannelInfoResIdl) {
            super(getChannelInfoResIdl);
            if (getChannelInfoResIdl != null) {
                this.error = getChannelInfoResIdl.error;
                this.data = getChannelInfoResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetChannelInfoResIdl build(boolean z) {
            return new GetChannelInfoResIdl(this, z);
        }
    }
}
