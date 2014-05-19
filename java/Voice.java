package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Voice extends Message {
    public static final String DEFAULT_VOICE_MD5 = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer during_time;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String voice_md5;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_DURING_TIME = 0;

    /* synthetic */ Voice(Builder builder, boolean z, Voice voice) {
        this(builder, z);
    }

    private Voice(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.during_time == null) {
                this.during_time = DEFAULT_DURING_TIME;
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
        this.during_time = builder.during_time;
        this.voice_md5 = builder.voice_md5;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<Voice> {
        public Integer during_time;
        public Integer type;
        public String voice_md5;

        public Builder(Voice voice) {
            super(voice);
            if (voice != null) {
                this.type = voice.type;
                this.during_time = voice.during_time;
                this.voice_md5 = voice.voice_md5;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Voice build(boolean z) {
            return new Voice(this, z, null);
        }
    }
}
