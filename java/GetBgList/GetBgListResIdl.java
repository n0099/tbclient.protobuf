package tbclient.GetBgList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes2.dex */
public final class GetBgListResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<GetBgListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetBgListResIdl getBgListResIdl) {
            super(getBgListResIdl);
            if (getBgListResIdl == null) {
                return;
            }
            this.data = getBgListResIdl.data;
            this.error = getBgListResIdl.error;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetBgListResIdl build(boolean z) {
            return new GetBgListResIdl(this, z);
        }
    }

    public GetBgListResIdl(Builder builder, boolean z) {
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
