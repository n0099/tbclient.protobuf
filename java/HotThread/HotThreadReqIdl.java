package tbclient.HotThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class HotThreadReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<HotThreadReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(HotThreadReqIdl hotThreadReqIdl) {
            super(hotThreadReqIdl);
            if (hotThreadReqIdl == null) {
                return;
            }
            this.data = hotThreadReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotThreadReqIdl build(boolean z) {
            return new HotThreadReqIdl(this, z);
        }
    }

    public HotThreadReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
