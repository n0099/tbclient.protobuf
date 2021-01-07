package tbclient.GetIconList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes9.dex */
public final class GetIconListResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private GetIconListResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GetIconListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetIconListResIdl getIconListResIdl) {
            super(getIconListResIdl);
            if (getIconListResIdl != null) {
                this.error = getIconListResIdl.error;
                this.data = getIconListResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetIconListResIdl build(boolean z) {
            return new GetIconListResIdl(this, z);
        }
    }
}
