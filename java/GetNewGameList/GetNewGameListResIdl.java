package tbclient.GetNewGameList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class GetNewGameListResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* synthetic */ GetNewGameListResIdl(Builder builder, boolean z, GetNewGameListResIdl getNewGameListResIdl) {
        this(builder, z);
    }

    private GetNewGameListResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
            return;
        }
        this.data = builder.data;
        this.error = builder.error;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<GetNewGameListResIdl> {
        public DataRes data;
        public Error error;

        public Builder(GetNewGameListResIdl getNewGameListResIdl) {
            super(getNewGameListResIdl);
            if (getNewGameListResIdl != null) {
                this.data = getNewGameListResIdl.data;
                this.error = getNewGameListResIdl.error;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetNewGameListResIdl build(boolean z) {
            return new GetNewGameListResIdl(this, z, null);
        }
    }
}
