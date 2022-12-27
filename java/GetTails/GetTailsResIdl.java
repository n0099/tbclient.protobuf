package tbclient.GetTails;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes9.dex */
public final class GetTailsResIdl extends Message {
    @ProtoField(tag = 1)
    public final ResData data;
    @ProtoField(tag = 2)
    public final Error error;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GetTailsResIdl> {
        public ResData data;
        public Error error;

        public Builder() {
        }

        public Builder(GetTailsResIdl getTailsResIdl) {
            super(getTailsResIdl);
            if (getTailsResIdl == null) {
                return;
            }
            this.data = getTailsResIdl.data;
            this.error = getTailsResIdl.error;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetTailsResIdl build(boolean z) {
            return new GetTailsResIdl(this, z);
        }
    }

    public GetTailsResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
            return;
        }
        this.data = builder.data;
        this.error = builder.error;
    }
}
