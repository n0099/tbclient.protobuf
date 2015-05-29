package tbclient.Unlike;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class UnlikeResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ UnlikeResIdl(Builder builder, boolean z, UnlikeResIdl unlikeResIdl) {
        this(builder, z);
    }

    private UnlikeResIdl(Builder builder, boolean z) {
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
    public final class Builder extends Message.Builder<UnlikeResIdl> {
        public DataRes data;
        public Error error;

        public Builder(UnlikeResIdl unlikeResIdl) {
            super(unlikeResIdl);
            if (unlikeResIdl != null) {
                this.error = unlikeResIdl.error;
                this.data = unlikeResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UnlikeResIdl build(boolean z) {
            return new UnlikeResIdl(this, z, null);
        }
    }
}
