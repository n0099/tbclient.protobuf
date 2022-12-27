package tbclient.GetBigday;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class GetBigdayReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GetBigdayReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetBigdayReqIdl getBigdayReqIdl) {
            super(getBigdayReqIdl);
            if (getBigdayReqIdl == null) {
                return;
            }
            this.data = getBigdayReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetBigdayReqIdl build(boolean z) {
            return new GetBigdayReqIdl(this, z);
        }
    }

    public GetBigdayReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
