package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes22.dex */
public final class ForumRule extends Message {
    public static final List<PbContent> DEFAULT_CONTENT = Collections.emptyList();
    public static final Integer DEFAULT_STATUS = 0;
    public static final String DEFAULT_TITLE = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<PbContent> content;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer status;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    private ForumRule(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.content == null) {
                this.content = DEFAULT_CONTENT;
            } else {
                this.content = immutableCopyOf(builder.content);
            }
            if (builder.status == null) {
                this.status = DEFAULT_STATUS;
                return;
            } else {
                this.status = builder.status;
                return;
            }
        }
        this.title = builder.title;
        this.content = immutableCopyOf(builder.content);
        this.status = builder.status;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<ForumRule> {
        public List<PbContent> content;
        public Integer status;
        public String title;

        public Builder() {
        }

        public Builder(ForumRule forumRule) {
            super(forumRule);
            if (forumRule != null) {
                this.title = forumRule.title;
                this.content = ForumRule.copyOf(forumRule.content);
                this.status = forumRule.status;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumRule build(boolean z) {
            return new ForumRule(this, z);
        }
    }
}
