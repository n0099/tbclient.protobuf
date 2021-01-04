package tbclient.GodThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class GodThreadListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GodThreadListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<GodThreadListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GodThreadListReqIdl godThreadListReqIdl) {
            super(godThreadListReqIdl);
            if (godThreadListReqIdl != null) {
                this.data = godThreadListReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GodThreadListReqIdl build(boolean z) {
            return new GodThreadListReqIdl(this, z);
        }
    }
}
