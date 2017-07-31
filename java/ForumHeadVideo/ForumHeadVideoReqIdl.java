package tbclient.ForumHeadVideo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ForumHeadVideoReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private ForumHeadVideoReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<ForumHeadVideoReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(ForumHeadVideoReqIdl forumHeadVideoReqIdl) {
            super(forumHeadVideoReqIdl);
            if (forumHeadVideoReqIdl != null) {
                this.data = forumHeadVideoReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumHeadVideoReqIdl build(boolean z) {
            return new ForumHeadVideoReqIdl(this, z);
        }
    }
}
