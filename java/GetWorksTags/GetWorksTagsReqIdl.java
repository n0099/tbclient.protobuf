package tbclient.GetWorksTags;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class GetWorksTagsReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<GetWorksTagsReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetWorksTagsReqIdl getWorksTagsReqIdl) {
            super(getWorksTagsReqIdl);
            if (getWorksTagsReqIdl == null) {
                return;
            }
            this.data = getWorksTagsReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetWorksTagsReqIdl build(boolean z) {
            return new GetWorksTagsReqIdl(this, z);
        }
    }

    public GetWorksTagsReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
