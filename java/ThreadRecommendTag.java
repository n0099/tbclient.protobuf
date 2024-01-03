package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ThreadRecommendTag extends Message {
    public static final String DEFAULT_TEXT = "";
    @ProtoField(tag = 3)
    public final ThemeColorInfo background_color;
    @ProtoField(tag = 4)
    public final ThemeColorInfo boundary_color;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 2)
    public final ThemeColorInfo text_color;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ThreadRecommendTag> {
        public ThemeColorInfo background_color;
        public ThemeColorInfo boundary_color;
        public String text;
        public ThemeColorInfo text_color;

        public Builder() {
        }

        public Builder(ThreadRecommendTag threadRecommendTag) {
            super(threadRecommendTag);
            if (threadRecommendTag == null) {
                return;
            }
            this.text = threadRecommendTag.text;
            this.text_color = threadRecommendTag.text_color;
            this.background_color = threadRecommendTag.background_color;
            this.boundary_color = threadRecommendTag.boundary_color;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThreadRecommendTag build(boolean z) {
            return new ThreadRecommendTag(this, z);
        }
    }

    public ThreadRecommendTag(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.text;
            if (str == null) {
                this.text = "";
            } else {
                this.text = str;
            }
            this.text_color = builder.text_color;
            this.background_color = builder.background_color;
            this.boundary_color = builder.boundary_color;
            return;
        }
        this.text = builder.text;
        this.text_color = builder.text_color;
        this.background_color = builder.background_color;
        this.boundary_color = builder.boundary_color;
    }
}
