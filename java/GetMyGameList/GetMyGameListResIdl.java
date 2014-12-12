package tbclient.GetMyGameList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class GetMyGameListResIdl extends Message {
    @ProtoField(tag = 2)
    public final ResData data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ GetMyGameListResIdl(Builder builder, boolean z, GetMyGameListResIdl getMyGameListResIdl) {
        this(builder, z);
    }

    private GetMyGameListResIdl(Builder builder, boolean z) {
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
    public final class Builder extends Message.Builder<GetMyGameListResIdl> {
        public ResData data;
        public Error error;

        public Builder(GetMyGameListResIdl getMyGameListResIdl) {
            super(getMyGameListResIdl);
            if (getMyGameListResIdl != null) {
                this.error = getMyGameListResIdl.error;
                this.data = getMyGameListResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetMyGameListResIdl build(boolean z) {
            return new GetMyGameListResIdl(this, z, null);
        }
    }
}
