package tbclient.Tabfeedlist;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class TabfeedlistReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private TabfeedlistReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<TabfeedlistReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(TabfeedlistReqIdl tabfeedlistReqIdl) {
            super(tabfeedlistReqIdl);
            if (tabfeedlistReqIdl != null) {
                this.data = tabfeedlistReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TabfeedlistReqIdl build(boolean z) {
            return new TabfeedlistReqIdl(this, z);
        }
    }
}
