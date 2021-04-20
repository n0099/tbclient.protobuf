package tbclient.RelateRecThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class RelateRecThreadReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<RelateRecThreadReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(RelateRecThreadReqIdl relateRecThreadReqIdl) {
            super(relateRecThreadReqIdl);
            if (relateRecThreadReqIdl == null) {
                return;
            }
            this.data = relateRecThreadReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RelateRecThreadReqIdl build(boolean z) {
            return new RelateRecThreadReqIdl(this, z);
        }
    }

    public RelateRecThreadReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
