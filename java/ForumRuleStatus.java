package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ForumRuleStatus extends Message {
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer audit_status;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_rule_id;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer has_forum_rule;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    public static final Long DEFAULT_FORUM_RULE_ID = 0L;
    public static final Integer DEFAULT_AUDIT_STATUS = 0;
    public static final Integer DEFAULT_HAS_FORUM_RULE = 0;

    private ForumRuleStatus(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.forum_rule_id == null) {
                this.forum_rule_id = DEFAULT_FORUM_RULE_ID;
            } else {
                this.forum_rule_id = builder.forum_rule_id;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.audit_status == null) {
                this.audit_status = DEFAULT_AUDIT_STATUS;
            } else {
                this.audit_status = builder.audit_status;
            }
            if (builder.has_forum_rule == null) {
                this.has_forum_rule = DEFAULT_HAS_FORUM_RULE;
                return;
            } else {
                this.has_forum_rule = builder.has_forum_rule;
                return;
            }
        }
        this.forum_rule_id = builder.forum_rule_id;
        this.title = builder.title;
        this.audit_status = builder.audit_status;
        this.has_forum_rule = builder.has_forum_rule;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ForumRuleStatus> {
        public Integer audit_status;
        public Long forum_rule_id;
        public Integer has_forum_rule;
        public String title;

        public Builder() {
        }

        public Builder(ForumRuleStatus forumRuleStatus) {
            super(forumRuleStatus);
            if (forumRuleStatus != null) {
                this.forum_rule_id = forumRuleStatus.forum_rule_id;
                this.title = forumRuleStatus.title;
                this.audit_status = forumRuleStatus.audit_status;
                this.has_forum_rule = forumRuleStatus.has_forum_rule;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumRuleStatus build(boolean z) {
            return new ForumRuleStatus(this, z);
        }
    }
}
