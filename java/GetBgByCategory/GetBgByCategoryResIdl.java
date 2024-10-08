package tbclient.GetBgByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes2.dex */
public final class GetBgByCategoryResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<GetBgByCategoryResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetBgByCategoryResIdl getBgByCategoryResIdl) {
            super(getBgByCategoryResIdl);
            if (getBgByCategoryResIdl == null) {
                return;
            }
            this.data = getBgByCategoryResIdl.data;
            this.error = getBgByCategoryResIdl.error;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetBgByCategoryResIdl build(boolean z) {
            return new GetBgByCategoryResIdl(this, z);
        }
    }

    public GetBgByCategoryResIdl(Builder builder, boolean z) {
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
