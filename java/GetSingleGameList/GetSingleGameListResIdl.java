package tbclient.GetSingleGameList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class GetSingleGameListResIdl extends Message {
    @ProtoField(tag = 2)
    public final ResData data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ GetSingleGameListResIdl(Builder builder, boolean z, GetSingleGameListResIdl getSingleGameListResIdl) {
        this(builder, z);
    }

    private GetSingleGameListResIdl(Builder builder, boolean z) {
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
    public static final class Builder extends Message.Builder<GetSingleGameListResIdl> {
        public ResData data;
        public Error error;

        public Builder() {
        }

        public Builder(GetSingleGameListResIdl getSingleGameListResIdl) {
            super(getSingleGameListResIdl);
            if (getSingleGameListResIdl != null) {
                this.error = getSingleGameListResIdl.error;
                this.data = getSingleGameListResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetSingleGameListResIdl build(boolean z) {
            return new GetSingleGameListResIdl(this, z, null);
        }
    }
}
