package tbclient.GetGameDetailNew;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class GetGameDetailNewResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ GetGameDetailNewResIdl(Builder builder, boolean z, GetGameDetailNewResIdl getGameDetailNewResIdl) {
        this(builder, z);
    }

    private GetGameDetailNewResIdl(Builder builder, boolean z) {
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
    public static final class Builder extends Message.Builder<GetGameDetailNewResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetGameDetailNewResIdl getGameDetailNewResIdl) {
            super(getGameDetailNewResIdl);
            if (getGameDetailNewResIdl != null) {
                this.error = getGameDetailNewResIdl.error;
                this.data = getGameDetailNewResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetGameDetailNewResIdl build(boolean z) {
            return new GetGameDetailNewResIdl(this, z, null);
        }
    }
}
