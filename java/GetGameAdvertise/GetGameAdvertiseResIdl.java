package tbclient.GetGameAdvertise;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class GetGameAdvertiseResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* synthetic */ GetGameAdvertiseResIdl(Builder builder, boolean z, GetGameAdvertiseResIdl getGameAdvertiseResIdl) {
        this(builder, z);
    }

    private GetGameAdvertiseResIdl(Builder builder, boolean z) {
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
    public final class Builder extends Message.Builder<GetGameAdvertiseResIdl> {
        public DataRes data;
        public Error error;

        public Builder(GetGameAdvertiseResIdl getGameAdvertiseResIdl) {
            super(getGameAdvertiseResIdl);
            if (getGameAdvertiseResIdl != null) {
                this.data = getGameAdvertiseResIdl.data;
                this.error = getGameAdvertiseResIdl.error;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetGameAdvertiseResIdl build(boolean z) {
            return new GetGameAdvertiseResIdl(this, z, null);
        }
    }
}
