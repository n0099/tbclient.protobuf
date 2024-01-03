package tbclient.HotForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes2.dex */
public final class HotForumResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<HotForumResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(HotForumResIdl hotForumResIdl) {
            super(hotForumResIdl);
            if (hotForumResIdl == null) {
                return;
            }
            this.data = hotForumResIdl.data;
            this.error = hotForumResIdl.error;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotForumResIdl build(boolean z) {
            return new HotForumResIdl(this, z);
        }
    }

    public HotForumResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
            return;
        }
        this.data = builder.data;
        this.error = builder.error;
    }
}
