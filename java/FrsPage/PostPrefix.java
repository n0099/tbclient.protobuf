package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
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

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<PostPrefix> {
        public Integer mode;
        public String text;
        public String time;
        public String type;

        public Builder() {
        }

        public Builder(PostPrefix postPrefix) {
            super(postPrefix);
            if (postPrefix == null) {
                return;
            }
            this.mode = postPrefix.mode;
            this.text = postPrefix.text;
            this.type = postPrefix.type;
            this.time = postPrefix.time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PostPrefix build(boolean z) {
            return new PostPrefix(this, z);
        }
    }

    public PostPrefix(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.mode;
            if (num == null) {
                this.mode = DEFAULT_MODE;
            } else {
                this.mode = num;
            }
            String str = builder.text;
            if (str == null) {
                this.text = "";
            } else {
                this.text = str;
            }
            String str2 = builder.type;
            if (str2 == null) {
                this.type = "";
            } else {
                this.type = str2;
            }
            String str3 = builder.time;
            if (str3 == null) {
                this.time = "";
                return;
            } else {
                this.time = str3;
                return;
            }
        }
        this.mode = builder.mode;
        this.text = builder.text;
        this.type = builder.type;
        this.time = builder.time;
    }
}
