package tbclient.GetHotGameList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class GetHotGameListResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ GetHotGameListResIdl(Builder builder, boolean z, GetHotGameListResIdl getHotGameListResIdl) {
        this(builder, z);
    }

    private GetHotGameListResIdl(Builder builder, boolean z) {
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
    public final class Builder extends Message.Builder<GetHotGameListResIdl> {
        public DataRes data;
        public Error error;

        public Builder(GetHotGameListResIdl getHotGameListResIdl) {
            super(getHotGameListResIdl);
            if (getHotGameListResIdl != null) {
                this.error = getHotGameListResIdl.error;
                this.data = getHotGameListResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetHotGameListResIdl build(boolean z) {
            return new GetHotGameListResIdl(this, z, null);
        }
    }
}
