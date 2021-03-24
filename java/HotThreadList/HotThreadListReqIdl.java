package tbclient.HotThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class HotThreadListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<HotThreadListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(HotThreadListReqIdl hotThreadListReqIdl) {
            super(hotThreadListReqIdl);
            if (hotThreadListReqIdl == null) {
                return;
            }
            this.data = hotThreadListReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotThreadListReqIdl build(boolean z) {
            return new HotThreadListReqIdl(this, z);
        }
    }

    public HotThreadListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
