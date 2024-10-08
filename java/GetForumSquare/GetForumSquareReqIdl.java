package tbclient.GetForumSquare;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class GetForumSquareReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<GetForumSquareReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetForumSquareReqIdl getForumSquareReqIdl) {
            super(getForumSquareReqIdl);
            if (getForumSquareReqIdl == null) {
                return;
            }
            this.data = getForumSquareReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetForumSquareReqIdl build(boolean z) {
            return new GetForumSquareReqIdl(this, z);
        }
    }

    public GetForumSquareReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
