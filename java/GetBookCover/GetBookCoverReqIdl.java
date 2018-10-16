package tbclient.GetBookCover;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class GetBookCoverReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GetBookCoverReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<GetBookCoverReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetBookCoverReqIdl getBookCoverReqIdl) {
            super(getBookCoverReqIdl);
            if (getBookCoverReqIdl != null) {
                this.data = getBookCoverReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetBookCoverReqIdl build(boolean z) {
            return new GetBookCoverReqIdl(this, z);
        }
    }
}
