package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class LiveNormalConfig extends Message {
    public static final String DEFAULT_ICON_SCHEME = "";
    public static final String DEFAULT_ICON_URL_DAY = "";
    public static final String DEFAULT_ICON_URL_NIGHT = "";
    public static final Integer DEFAULT_SHOW_PAGE = 0;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon_scheme;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon_url_day;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon_url_night;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer show_page;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<LiveNormalConfig> {
        public String icon_scheme;
        public String icon_url_day;
        public String icon_url_night;
        public Integer show_page;

        public Builder() {
        }

        public Builder(LiveNormalConfig liveNormalConfig) {
            super(liveNormalConfig);
            if (liveNormalConfig == null) {
                return;
            }
            this.icon_url_day = liveNormalConfig.icon_url_day;
            this.icon_url_night = liveNormalConfig.icon_url_night;
            this.icon_scheme = liveNormalConfig.icon_scheme;
            this.show_page = liveNormalConfig.show_page;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LiveNormalConfig build(boolean z) {
            return new LiveNormalConfig(this, z);
        }
    }

    public LiveNormalConfig(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.icon_url_day;
            if (str == null) {
                this.icon_url_day = "";
            } else {
                this.icon_url_day = str;
            }
            String str2 = builder.icon_url_night;
            if (str2 == null) {
                this.icon_url_night = "";
            } else {
                this.icon_url_night = str2;
            }
            String str3 = builder.icon_scheme;
            if (str3 == null) {
                this.icon_scheme = "";
            } else {
                this.icon_scheme = str3;
            }
            Integer num = builder.show_page;
            if (num == null) {
                this.show_page = DEFAULT_SHOW_PAGE;
                return;
            } else {
                this.show_page = num;
                return;
            }
        }
        this.icon_url_day = builder.icon_url_day;
        this.icon_url_night = builder.icon_url_night;
        this.icon_scheme = builder.icon_scheme;
        this.show_page = builder.show_page;
    }
}
