package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class ForumHeadIcon extends Message {
    public static final Integer DEFAULT_GRADE = 0;
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer grade;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ForumHeadIcon> {
        public Integer grade;
        public String url;

        public Builder() {
        }

        public Builder(ForumHeadIcon forumHeadIcon) {
            super(forumHeadIcon);
            if (forumHeadIcon == null) {
                return;
            }
            this.grade = forumHeadIcon.grade;
            this.url = forumHeadIcon.url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumHeadIcon build(boolean z) {
            return new ForumHeadIcon(this, z);
        }
    }

    public ForumHeadIcon(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.grade;
            if (num == null) {
                this.grade = DEFAULT_GRADE;
            } else {
                this.grade = num;
            }
            String str = builder.url;
            if (str == null) {
                this.url = "";
                return;
            } else {
                this.url = str;
                return;
            }
        }
        this.grade = builder.grade;
        this.url = builder.url;
    }
}
