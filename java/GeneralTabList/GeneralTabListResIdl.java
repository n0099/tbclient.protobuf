package tbclient.GeneralTabList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes4.dex */
public final class GeneralTabListResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private GeneralTabListResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<GeneralTabListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GeneralTabListResIdl generalTabListResIdl) {
            super(generalTabListResIdl);
            if (generalTabListResIdl != null) {
                this.error = generalTabListResIdl.error;
                this.data = generalTabListResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GeneralTabListResIdl build(boolean z) {
            return new GeneralTabListResIdl(this, z);
        }
    }
}
