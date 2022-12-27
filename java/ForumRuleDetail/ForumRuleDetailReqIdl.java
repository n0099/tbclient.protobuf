package tbclient.ForumRuleDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ForumRuleDetailReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ForumRuleDetailReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(ForumRuleDetailReqIdl forumRuleDetailReqIdl) {
            super(forumRuleDetailReqIdl);
            if (forumRuleDetailReqIdl == null) {
                return;
            }
            this.data = forumRuleDetailReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumRuleDetailReqIdl build(boolean z) {
            return new ForumRuleDetailReqIdl(this, z);
        }
    }

    public ForumRuleDetailReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
