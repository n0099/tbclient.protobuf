package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ForumShowInfo extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final Long DEFAULT_SHOW_TYPE = 0L;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long show_type;
    @ProtoField(tag = 2)
    public final ForumShowInfoTag tag;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ForumShowInfo> {
        public String content;
        public Long show_type;
        public ForumShowInfoTag tag;

        public Builder() {
        }

        public Builder(ForumShowInfo forumShowInfo) {
            super(forumShowInfo);
            if (forumShowInfo == null) {
                return;
            }
            this.content = forumShowInfo.content;
            this.tag = forumShowInfo.tag;
            this.show_type = forumShowInfo.show_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumShowInfo build(boolean z) {
            return new ForumShowInfo(this, z);
        }
    }

    public ForumShowInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.content;
            if (str == null) {
                this.content = "";
            } else {
                this.content = str;
            }
            this.tag = builder.tag;
            Long l = builder.show_type;
            if (l == null) {
                this.show_type = DEFAULT_SHOW_TYPE;
                return;
            } else {
                this.show_type = l;
                return;
            }
        }
        this.content = builder.content;
        this.tag = builder.tag;
        this.show_type = builder.show_type;
    }
}
