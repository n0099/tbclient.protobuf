package tbclient.KillAd;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class KillAdResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ KillAdResIdl(Builder builder, boolean z, KillAdResIdl killAdResIdl) {
        this(builder, z);
    }

    private KillAdResIdl(Builder builder, boolean z) {
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
    public static final class Builder extends Message.Builder<KillAdResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(KillAdResIdl killAdResIdl) {
            super(killAdResIdl);
            if (killAdResIdl != null) {
                this.error = killAdResIdl.error;
                this.data = killAdResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public KillAdResIdl build(boolean z) {
            return new KillAdResIdl(this, z, null);
        }
    }
}
