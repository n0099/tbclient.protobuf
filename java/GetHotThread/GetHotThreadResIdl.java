package tbclient.GetHotThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class GetHotThreadResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* synthetic */ GetHotThreadResIdl(Builder builder, boolean z, GetHotThreadResIdl getHotThreadResIdl) {
        this(builder, z);
    }

    private GetHotThreadResIdl(Builder builder, boolean z) {
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
    public static final class Builder extends Message.Builder<GetHotThreadResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetHotThreadResIdl getHotThreadResIdl) {
            super(getHotThreadResIdl);
            if (getHotThreadResIdl != null) {
                this.data = getHotThreadResIdl.data;
                this.error = getHotThreadResIdl.error;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetHotThreadResIdl build(boolean z) {
            return new GetHotThreadResIdl(this, z, null);
        }
    }
}
