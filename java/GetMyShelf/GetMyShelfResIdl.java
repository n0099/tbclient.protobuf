package tbclient.GetMyShelf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class GetMyShelfResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ GetMyShelfResIdl(Builder builder, boolean z, GetMyShelfResIdl getMyShelfResIdl) {
        this(builder, z);
    }

    private GetMyShelfResIdl(Builder builder, boolean z) {
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
    public static final class Builder extends Message.Builder<GetMyShelfResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetMyShelfResIdl getMyShelfResIdl) {
            super(getMyShelfResIdl);
            if (getMyShelfResIdl != null) {
                this.error = getMyShelfResIdl.error;
                this.data = getMyShelfResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetMyShelfResIdl build(boolean z) {
            return new GetMyShelfResIdl(this, z, null);
        }
    }
}
