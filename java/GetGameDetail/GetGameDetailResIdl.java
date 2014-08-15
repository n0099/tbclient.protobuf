package tbclient.GetGameDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class GetGameDetailResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ GetGameDetailResIdl(Builder builder, boolean z, GetGameDetailResIdl getGameDetailResIdl) {
        this(builder, z);
    }

    private GetGameDetailResIdl(Builder builder, boolean z) {
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
    public final class Builder extends Message.Builder<GetGameDetailResIdl> {
        public DataRes data;
        public Error error;

        public Builder(GetGameDetailResIdl getGameDetailResIdl) {
            super(getGameDetailResIdl);
            if (getGameDetailResIdl != null) {
                this.error = getGameDetailResIdl.error;
                this.data = getGameDetailResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetGameDetailResIdl build(boolean z) {
            return new GetGameDetailResIdl(this, z, null);
        }
    }
}
