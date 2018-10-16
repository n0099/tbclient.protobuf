package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class StarVoice extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_VOICE_MD5 = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String voice_md5;

    private StarVoice(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.avatar == null) {
                this.avatar = "";
            } else {
                this.avatar = builder.avatar;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.desc == null) {
                this.desc = "";
            } else {
                this.desc = builder.desc;
            }
            if (builder.voice_md5 == null) {
                this.voice_md5 = "";
                return;
            } else {
                this.voice_md5 = builder.voice_md5;
                return;
            }
        }
        this.avatar = builder.avatar;
        this.title = builder.title;
        this.desc = builder.desc;
        this.voice_md5 = builder.voice_md5;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<StarVoice> {
        public String avatar;
        public String desc;
        public String title;
        public String voice_md5;

        public Builder() {
        }

        public Builder(StarVoice starVoice) {
            super(starVoice);
            if (starVoice != null) {
                this.avatar = starVoice.avatar;
                this.title = starVoice.title;
                this.desc = starVoice.desc;
                this.voice_md5 = starVoice.voice_md5;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public StarVoice build(boolean z) {
            return new StarVoice(this, z);
        }
    }
}
