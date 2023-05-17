package tbclient.ForumGuide;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class ForumGuideReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ForumGuideReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(ForumGuideReqIdl forumGuideReqIdl) {
            super(forumGuideReqIdl);
            if (forumGuideReqIdl == null) {
                return;
            }
            this.data = forumGuideReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumGuideReqIdl build(boolean z) {
            return new ForumGuideReqIdl(this, z);
        }
    }

    public ForumGuideReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
