package tbclient.HotForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class HotForumResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* synthetic */ HotForumResIdl(Builder builder, boolean z, HotForumResIdl hotForumResIdl) {
        this(builder, z);
    }

    private HotForumResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
            return;
        }
        this.data = builder.data;
        this.error = builder.error;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<HotForumResIdl> {
        public DataRes data;
        public Error error;

        public Builder(HotForumResIdl hotForumResIdl) {
            super(hotForumResIdl);
            if (hotForumResIdl != null) {
                this.data = hotForumResIdl.data;
                this.error = hotForumResIdl.error;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotForumResIdl build(boolean z) {
            return new HotForumResIdl(this, z, null);
        }
    }
}
