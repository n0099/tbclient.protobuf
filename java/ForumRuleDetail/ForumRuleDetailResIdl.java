package tbclient.ForumRuleDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes2.dex */
public final class ForumRuleDetailResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ForumRuleDetailResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(ForumRuleDetailResIdl forumRuleDetailResIdl) {
            super(forumRuleDetailResIdl);
            if (forumRuleDetailResIdl == null) {
                return;
            }
            this.error = forumRuleDetailResIdl.error;
            this.data = forumRuleDetailResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumRuleDetailResIdl build(boolean z) {
            return new ForumRuleDetailResIdl(this, z);
        }
    }

    public ForumRuleDetailResIdl(Builder builder, boolean z) {
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
