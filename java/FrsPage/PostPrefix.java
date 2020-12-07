package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
public final class PostPrefix extends Message {
    public static final Integer DEFAULT_MODE = 0;
    public static final String DEFAULT_TEXT = "";
    public static final String DEFAULT_TIME = "";
    public static final String DEFAULT_TYPE = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer mode;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String time;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String type;

    private PostPrefix(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.mode == null) {
                this.mode = DEFAULT_MODE;
            } else {
                this.mode = builder.mode;
            }
            if (builder.text == null) {
                this.text = "";
            } else {
                this.text = builder.text;
            }
            if (builder.type == null) {
                this.type = "";
            } else {
                this.type = builder.type;
            }
            if (builder.time == null) {
                this.time = "";
                return;
            } else {
                this.time = builder.time;
                return;
            }
        }
        this.mode = builder.mode;
        this.text = builder.text;
        this.type = builder.type;
        this.time = builder.time;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<PostPrefix> {
        public Integer mode;
        public String text;
        public String time;
        public String type;

        public Builder() {
        }

        public Builder(PostPrefix postPrefix) {
            super(postPrefix);
            if (postPrefix != null) {
                this.mode = postPrefix.mode;
                this.text = postPrefix.text;
                this.type = postPrefix.type;
                this.time = postPrefix.time;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PostPrefix build(boolean z) {
            return new PostPrefix(this, z);
        }
    }
}
