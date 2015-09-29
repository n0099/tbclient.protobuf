package tbclient.GetThemeList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ThemeCarousel extends Message {
    public static final String DEFAULT_ACTIVE_URL = "";
    public static final String DEFAULT_PIC_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String active_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String pic_url;

    /* synthetic */ ThemeCarousel(Builder builder, boolean z, ThemeCarousel themeCarousel) {
        this(builder, z);
    }

    private ThemeCarousel(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.pic_url == null) {
                this.pic_url = "";
            } else {
                this.pic_url = builder.pic_url;
            }
            if (builder.active_url == null) {
                this.active_url = "";
                return;
            } else {
                this.active_url = builder.active_url;
                return;
            }
        }
        this.pic_url = builder.pic_url;
        this.active_url = builder.active_url;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<ThemeCarousel> {
        public String active_url;
        public String pic_url;

        public Builder() {
        }

        public Builder(ThemeCarousel themeCarousel) {
            super(themeCarousel);
            if (themeCarousel != null) {
                this.pic_url = themeCarousel.pic_url;
                this.active_url = themeCarousel.active_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThemeCarousel build(boolean z) {
            return new ThemeCarousel(this, z, null);
        }
    }
}
