package tbclient.UserPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class PostContent extends Message {
    public static final String DEFAULT_BSIZE = "";
    public static final String DEFAULT_DURING_TIME = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_SRC = "";
    public static final String DEFAULT_TEXT = "";
    public static final Integer DEFAULT_TYPE = 0;
    public static final String DEFAULT_UN = "";
    public static final String DEFAULT_VOICE_MD5 = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String bsize;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String during_time;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String src;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String un;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String voice_md5;

    /* synthetic */ PostContent(Builder builder, boolean z, PostContent postContent) {
        this(builder, z);
    }

    private PostContent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.src == null) {
                this.src = "";
            } else {
                this.src = builder.src;
            }
            if (builder.bsize == null) {
                this.bsize = "";
            } else {
                this.bsize = builder.bsize;
            }
            if (builder.text == null) {
                this.text = "";
            } else {
                this.text = builder.text;
            }
            if (builder.during_time == null) {
                this.during_time = "";
            } else {
                this.during_time = builder.during_time;
            }
            if (builder.voice_md5 == null) {
                this.voice_md5 = "";
            } else {
                this.voice_md5 = builder.voice_md5;
            }
            if (builder.un == null) {
                this.un = "";
            } else {
                this.un = builder.un;
            }
            if (builder.link == null) {
                this.link = "";
                return;
            } else {
                this.link = builder.link;
                return;
            }
        }
        this.type = builder.type;
        this.src = builder.src;
        this.bsize = builder.bsize;
        this.text = builder.text;
        this.during_time = builder.during_time;
        this.voice_md5 = builder.voice_md5;
        this.un = builder.un;
        this.link = builder.link;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<PostContent> {
        public String bsize;
        public String during_time;
        public String link;
        public String src;
        public String text;
        public Integer type;
        public String un;
        public String voice_md5;

        public Builder(PostContent postContent) {
            super(postContent);
            if (postContent != null) {
                this.type = postContent.type;
                this.src = postContent.src;
                this.bsize = postContent.bsize;
                this.text = postContent.text;
                this.during_time = postContent.during_time;
                this.voice_md5 = postContent.voice_md5;
                this.un = postContent.un;
                this.link = postContent.link;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PostContent build(boolean z) {
            return new PostContent(this, z, null);
        }
    }
}
