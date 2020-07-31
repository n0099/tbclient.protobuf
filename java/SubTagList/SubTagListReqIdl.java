package tbclient.SubTagList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes17.dex */
public final class SubTagListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private SubTagListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes17.dex */
    public static final class Builder extends Message.Builder<SubTagListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(SubTagListReqIdl subTagListReqIdl) {
            super(subTagListReqIdl);
            if (subTagListReqIdl != null) {
                this.data = subTagListReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SubTagListReqIdl build(boolean z) {
            return new SubTagListReqIdl(this, z);
        }
    }
}
