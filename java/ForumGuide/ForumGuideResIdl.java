package tbclient.ForumGuide;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes9.dex */
public final class ForumGuideResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ForumGuideResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(ForumGuideResIdl forumGuideResIdl) {
            super(forumGuideResIdl);
            if (forumGuideResIdl == null) {
                return;
            }
            this.error = forumGuideResIdl.error;
            this.data = forumGuideResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumGuideResIdl build(boolean z) {
            return new ForumGuideResIdl(this, z);
        }
    }

    public ForumGuideResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }
}
