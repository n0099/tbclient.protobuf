package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ForumHeadIcon extends Message {
    public static final Integer DEFAULT_GRADE = 0;
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer grade;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    private ForumHeadIcon(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.grade == null) {
                this.grade = DEFAULT_GRADE;
            } else {
                this.grade = builder.grade;
            }
            if (builder.url == null) {
                this.url = "";
                return;
            } else {
                this.url = builder.url;
                return;
            }
        }
        this.grade = builder.grade;
        this.url = builder.url;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ForumHeadIcon> {
        public Integer grade;
        public String url;

        public Builder() {
        }

        public Builder(ForumHeadIcon forumHeadIcon) {
            super(forumHeadIcon);
            if (forumHeadIcon != null) {
                this.grade = forumHeadIcon.grade;
                this.url = forumHeadIcon.url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumHeadIcon build(boolean z) {
            return new ForumHeadIcon(this, z);
        }
    }
}
