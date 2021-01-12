package tbclient.GetHotGod;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes7.dex */
public final class GetHotGodResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private GetHotGodResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetHotGodResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetHotGodResIdl getHotGodResIdl) {
            super(getHotGodResIdl);
            if (getHotGodResIdl != null) {
                this.error = getHotGodResIdl.error;
                this.data = getHotGodResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetHotGodResIdl build(boolean z) {
            return new GetHotGodResIdl(this, z);
        }
    }
}
