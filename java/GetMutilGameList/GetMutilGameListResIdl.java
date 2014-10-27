package tbclient.GetMutilGameList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class GetMutilGameListResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ GetMutilGameListResIdl(Builder builder, boolean z, GetMutilGameListResIdl getMutilGameListResIdl) {
        this(builder, z);
    }

    private GetMutilGameListResIdl(Builder builder, boolean z) {
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
    public final class Builder extends Message.Builder<GetMutilGameListResIdl> {
        public DataRes data;
        public Error error;

        public Builder(GetMutilGameListResIdl getMutilGameListResIdl) {
            super(getMutilGameListResIdl);
            if (getMutilGameListResIdl != null) {
                this.error = getMutilGameListResIdl.error;
                this.data = getMutilGameListResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetMutilGameListResIdl build(boolean z) {
            return new GetMutilGameListResIdl(this, z, null);
        }
    }
}
