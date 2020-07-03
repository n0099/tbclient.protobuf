package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class HottopicReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private HottopicReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<HottopicReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(HottopicReqIdl hottopicReqIdl) {
            super(hottopicReqIdl);
            if (hottopicReqIdl != null) {
                this.data = hottopicReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HottopicReqIdl build(boolean z) {
            return new HottopicReqIdl(this, z);
        }
    }
}
