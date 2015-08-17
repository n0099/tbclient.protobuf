package tbclient.GetGameCenter;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetGameCenterReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ GetGameCenterReqIdl(Builder builder, boolean z, GetGameCenterReqIdl getGameCenterReqIdl) {
        this(builder, z);
    }

    private GetGameCenterReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GetGameCenterReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetGameCenterReqIdl getGameCenterReqIdl) {
            super(getGameCenterReqIdl);
            if (getGameCenterReqIdl != null) {
                this.data = getGameCenterReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetGameCenterReqIdl build(boolean z) {
            return new GetGameCenterReqIdl(this, z, null);
        }
    }
}
