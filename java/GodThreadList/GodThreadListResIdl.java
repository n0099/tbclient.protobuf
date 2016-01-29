package tbclient.GodThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class GodThreadListResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ GodThreadListResIdl(Builder builder, boolean z, GodThreadListResIdl godThreadListResIdl) {
        this(builder, z);
    }

    private GodThreadListResIdl(Builder builder, boolean z) {
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
    public static final class Builder extends Message.Builder<GodThreadListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GodThreadListResIdl godThreadListResIdl) {
            super(godThreadListResIdl);
            if (godThreadListResIdl != null) {
                this.error = godThreadListResIdl.error;
                this.data = godThreadListResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GodThreadListResIdl build(boolean z) {
            return new GodThreadListResIdl(this, z, null);
        }
    }
}
