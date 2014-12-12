package tbclient.DelMyGame;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class DelMyGameResIdl extends Message {
    @ProtoField(tag = 2)
    public final ResData data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ DelMyGameResIdl(Builder builder, boolean z, DelMyGameResIdl delMyGameResIdl) {
        this(builder, z);
    }

    private DelMyGameResIdl(Builder builder, boolean z) {
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
    public final class Builder extends Message.Builder<DelMyGameResIdl> {
        public ResData data;
        public Error error;

        public Builder(DelMyGameResIdl delMyGameResIdl) {
            super(delMyGameResIdl);
            if (delMyGameResIdl != null) {
                this.error = delMyGameResIdl.error;
                this.data = delMyGameResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DelMyGameResIdl build(boolean z) {
            return new DelMyGameResIdl(this, z, null);
        }
    }
}
