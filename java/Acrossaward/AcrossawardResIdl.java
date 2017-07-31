package tbclient.Acrossaward;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class AcrossawardResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private AcrossawardResIdl(Builder builder, boolean z) {
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
    public static final class Builder extends Message.Builder<AcrossawardResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(AcrossawardResIdl acrossawardResIdl) {
            super(acrossawardResIdl);
            if (acrossawardResIdl != null) {
                this.error = acrossawardResIdl.error;
                this.data = acrossawardResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AcrossawardResIdl build(boolean z) {
            return new AcrossawardResIdl(this, z);
        }
    }
}
