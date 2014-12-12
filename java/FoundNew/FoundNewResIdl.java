package tbclient.FoundNew;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class FoundNewResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ FoundNewResIdl(Builder builder, boolean z, FoundNewResIdl foundNewResIdl) {
        this(builder, z);
    }

    private FoundNewResIdl(Builder builder, boolean z) {
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
    public final class Builder extends Message.Builder<FoundNewResIdl> {
        public DataRes data;
        public Error error;

        public Builder(FoundNewResIdl foundNewResIdl) {
            super(foundNewResIdl);
            if (foundNewResIdl != null) {
                this.error = foundNewResIdl.error;
                this.data = foundNewResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FoundNewResIdl build(boolean z) {
            return new FoundNewResIdl(this, z, null);
        }
    }
}
