package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ForumShowInfoTag extends Message {
    public static final String DEFAULT_TEXT = "";
    @ProtoField(tag = 3)
    public final ThemeColorInfo bg_color;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 2)
    public final ThemeColorInfo text_color;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ForumShowInfoTag> {
        public ThemeColorInfo bg_color;
        public String text;
        public ThemeColorInfo text_color;

        public Builder() {
        }

        public Builder(ForumShowInfoTag forumShowInfoTag) {
            super(forumShowInfoTag);
            if (forumShowInfoTag == null) {
                return;
            }
            this.text = forumShowInfoTag.text;
            this.text_color = forumShowInfoTag.text_color;
            this.bg_color = forumShowInfoTag.bg_color;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumShowInfoTag build(boolean z) {
            return new ForumShowInfoTag(this, z);
        }
    }

    public ForumShowInfoTag(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.text;
            if (str == null) {
                this.text = "";
            } else {
                this.text = str;
            }
            this.text_color = builder.text_color;
            this.bg_color = builder.bg_color;
            return;
        }
        this.text = builder.text;
        this.text_color = builder.text_color;
        this.bg_color = builder.bg_color;
    }
}
