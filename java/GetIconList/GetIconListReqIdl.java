package tbclient.GetIconList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetIconListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final ReqData data;

    /* synthetic */ GetIconListReqIdl(Builder builder, boolean z, GetIconListReqIdl getIconListReqIdl) {
        this(builder, z);
    }

    private GetIconListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GetIconListReqIdl> {
        public ReqData data;

        public Builder() {
        }

        public Builder(GetIconListReqIdl getIconListReqIdl) {
            super(getIconListReqIdl);
            if (getIconListReqIdl != null) {
                this.data = getIconListReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetIconListReqIdl build(boolean z) {
            return new GetIconListReqIdl(this, z, null);
        }
    }
}
