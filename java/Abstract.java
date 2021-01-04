package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class Abstract extends Message {
    public static final String DEFAULT_DURING_TIME = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_SRC = "";
    public static final String DEFAULT_TEXT = "";
    public static final Integer DEFAULT_TYPE = 0;
    public static final String DEFAULT_UN = "";
    public static final String DEFAULT_VOICE_MD5 = "";
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String during_time;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String src;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String un;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String voice_md5;

    private Abstract(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.text == null) {
                this.text = "";
            } else {
                this.text = builder.text;
            }
            if (builder.link == null) {
                this.link = "";
            } else {
                this.link = builder.link;
            }
            if (builder.src == null) {
                this.src = "";
            } else {
                this.src = builder.src;
            }
            if (builder.un == null) {
                this.un = "";
            } else {
                this.un = builder.un;
            }
            if (builder.during_time == null) {
                this.during_time = "";
            } else {
                this.during_time = builder.during_time;
            }
            if (builder.voice_md5 == null) {
                this.voice_md5 = "";
                return;
            } else {
                this.voice_md5 = builder.voice_md5;
                return;
            }
        }
        this.type = builder.type;
        this.text = builder.text;
        this.link = builder.link;
        this.src = builder.src;
        this.un = builder.un;
        this.during_time = builder.during_time;
        this.voice_md5 = builder.voice_md5;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<Abstract> {
        public String during_time;
        public String link;
        public String src;
        public String text;
        public Integer type;
        public String un;
        public String voice_md5;

        public Builder() {
        }

        public Builder(Abstract r2) {
            super(r2);
            if (r2 != null) {
                this.type = r2.type;
                this.text = r2.text;
                this.link = r2.link;
                this.src = r2.src;
                this.un = r2.un;
                this.during_time = r2.during_time;
                this.voice_md5 = r2.voice_md5;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Abstract build(boolean z) {
            return new Abstract(this, z);
        }
    }
}
