package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
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

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GodBanner> {
        public String intro;
        public String link_url;
        public String pic_url;

        public Builder() {
        }

        public Builder(GodBanner godBanner) {
            super(godBanner);
            if (godBanner == null) {
                return;
            }
            this.pic_url = godBanner.pic_url;
            this.link_url = godBanner.link_url;
            this.intro = godBanner.intro;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GodBanner build(boolean z) {
            return new GodBanner(this, z);
        }
    }

    public GodBanner(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.pic_url;
            if (str == null) {
                this.pic_url = "";
            } else {
                this.pic_url = str;
            }
            String str2 = builder.link_url;
            if (str2 == null) {
                this.link_url = "";
            } else {
                this.link_url = str2;
            }
            String str3 = builder.intro;
            if (str3 == null) {
                this.intro = "";
                return;
            } else {
                this.intro = str3;
                return;
            }
        }
        this.pic_url = builder.pic_url;
        this.link_url = builder.link_url;
        this.intro = builder.intro;
    }
}
