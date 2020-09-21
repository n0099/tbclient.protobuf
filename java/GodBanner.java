package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes21.dex */
public final class GodBanner extends Message {
    public static final String DEFAULT_INTRO = "";
    public static final String DEFAULT_LINK_URL = "";
    public static final String DEFAULT_PIC_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String intro;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String link_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String pic_url;

    private GodBanner(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.pic_url == null) {
                this.pic_url = "";
            } else {
                this.pic_url = builder.pic_url;
            }
            if (builder.link_url == null) {
                this.link_url = "";
            } else {
                this.link_url = builder.link_url;
            }
            if (builder.intro == null) {
                this.intro = "";
                return;
            } else {
                this.intro = builder.intro;
                return;
            }
        }
        this.pic_url = builder.pic_url;
        this.link_url = builder.link_url;
        this.intro = builder.intro;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<GodBanner> {
        public String intro;
        public String link_url;
        public String pic_url;

        public Builder() {
        }

        public Builder(GodBanner godBanner) {
            super(godBanner);
            if (godBanner != null) {
                this.pic_url = godBanner.pic_url;
                this.link_url = godBanner.link_url;
                this.intro = godBanner.intro;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GodBanner build(boolean z) {
            return new GodBanner(this, z);
        }
    }
}
