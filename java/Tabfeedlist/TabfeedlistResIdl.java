package tbclient.Tabfeedlist;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes9.dex */
public final class TabfeedlistResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private TabfeedlistResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<TabfeedlistResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(TabfeedlistResIdl tabfeedlistResIdl) {
            super(tabfeedlistResIdl);
            if (tabfeedlistResIdl != null) {
                this.error = tabfeedlistResIdl.error;
                this.data = tabfeedlistResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TabfeedlistResIdl build(boolean z) {
            return new TabfeedlistResIdl(this, z);
        }
    }
}
