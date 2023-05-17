package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class ForumRuleStatus extends Message {
    public static final Integer DEFAULT_AUDIT_STATUS = 0;
    public static final Integer DEFAULT_HAS_FORUM_RULE = 0;
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer audit_status;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer has_forum_rule;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ForumRuleStatus> {
        public Integer audit_status;
        public Integer has_forum_rule;
        public String title;

        public Builder() {
        }

        public Builder(ForumRuleStatus forumRuleStatus) {
            super(forumRuleStatus);
            if (forumRuleStatus == null) {
                return;
            }
            this.title = forumRuleStatus.title;
            this.audit_status = forumRuleStatus.audit_status;
            this.has_forum_rule = forumRuleStatus.has_forum_rule;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumRuleStatus build(boolean z) {
            return new ForumRuleStatus(this, z);
        }
    }

    public ForumRuleStatus(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            Integer num = builder.audit_status;
            if (num == null) {
                this.audit_status = DEFAULT_AUDIT_STATUS;
            } else {
                this.audit_status = num;
            }
            Integer num2 = builder.has_forum_rule;
            if (num2 == null) {
                this.has_forum_rule = DEFAULT_HAS_FORUM_RULE;
                return;
            } else {
                this.has_forum_rule = num2;
                return;
            }
        }
        this.title = builder.title;
        this.audit_status = builder.audit_status;
        this.has_forum_rule = builder.has_forum_rule;
    }
}
