package tbclient.Acrossforum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class AcrossforumResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ AcrossforumResIdl(Builder builder, boolean z, AcrossforumResIdl acrossforumResIdl) {
        this(builder, z);
    }

    private AcrossforumResIdl(Builder builder, boolean z) {
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
    public static final class Builder extends Message.Builder<AcrossforumResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(AcrossforumResIdl acrossforumResIdl) {
            super(acrossforumResIdl);
            if (acrossforumResIdl != null) {
                this.error = acrossforumResIdl.error;
                this.data = acrossforumResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AcrossforumResIdl build(boolean z) {
            return new AcrossforumResIdl(this, z, null);
        }
    }
}
