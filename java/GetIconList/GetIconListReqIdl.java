package tbclient.GetIconList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class GetIconListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final ReqData data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetIconListReqIdl> {
        public ReqData data;

        public Builder() {
        }

        public Builder(GetIconListReqIdl getIconListReqIdl) {
            super(getIconListReqIdl);
            if (getIconListReqIdl == null) {
                return;
            }
            this.data = getIconListReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetIconListReqIdl build(boolean z) {
            return new GetIconListReqIdl(this, z);
        }
    }

    public GetIconListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
