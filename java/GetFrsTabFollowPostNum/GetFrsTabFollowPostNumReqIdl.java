package tbclient.GetFrsTabFollowPostNum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetFrsTabFollowPostNumReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ GetFrsTabFollowPostNumReqIdl(Builder builder, boolean z, GetFrsTabFollowPostNumReqIdl getFrsTabFollowPostNumReqIdl) {
        this(builder, z);
    }

    private GetFrsTabFollowPostNumReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GetFrsTabFollowPostNumReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetFrsTabFollowPostNumReqIdl getFrsTabFollowPostNumReqIdl) {
            super(getFrsTabFollowPostNumReqIdl);
            if (getFrsTabFollowPostNumReqIdl != null) {
                this.data = getFrsTabFollowPostNumReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetFrsTabFollowPostNumReqIdl build(boolean z) {
            return new GetFrsTabFollowPostNumReqIdl(this, z, null);
        }
    }
}
