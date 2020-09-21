package tbclient.UnreadTip;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes21.dex */
public final class UnreadTipResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private UnreadTipResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<UnreadTipResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(UnreadTipResIdl unreadTipResIdl) {
            super(unreadTipResIdl);
            if (unreadTipResIdl != null) {
                this.error = unreadTipResIdl.error;
                this.data = unreadTipResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UnreadTipResIdl build(boolean z) {
            return new UnreadTipResIdl(this, z);
        }
    }
}
