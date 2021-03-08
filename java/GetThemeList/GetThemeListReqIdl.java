package tbclient.GetThemeList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class GetThemeListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GetThemeListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<GetThemeListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetThemeListReqIdl getThemeListReqIdl) {
            super(getThemeListReqIdl);
            if (getThemeListReqIdl != null) {
                this.data = getThemeListReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetThemeListReqIdl build(boolean z) {
            return new GetThemeListReqIdl(this, z);
        }
    }
}
