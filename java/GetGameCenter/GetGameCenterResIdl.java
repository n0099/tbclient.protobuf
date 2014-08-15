package tbclient.GetGameCenter;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class GetGameCenterResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ GetGameCenterResIdl(Builder builder, boolean z, GetGameCenterResIdl getGameCenterResIdl) {
        this(builder, z);
    }

    private GetGameCenterResIdl(Builder builder, boolean z) {
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
    public final class Builder extends Message.Builder<GetGameCenterResIdl> {
        public DataRes data;
        public Error error;

        public Builder(GetGameCenterResIdl getGameCenterResIdl) {
            super(getGameCenterResIdl);
            if (getGameCenterResIdl != null) {
                this.error = getGameCenterResIdl.error;
                this.data = getGameCenterResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetGameCenterResIdl build(boolean z) {
            return new GetGameCenterResIdl(this, z, null);
        }
    }
}
