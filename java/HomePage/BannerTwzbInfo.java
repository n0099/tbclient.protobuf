package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class BannerTwzbInfo extends Message {
    public static final String DEFAULT_LINK_URL = "";
    public static final String DEFAULT_PIC_URL = "";
    public static final Long DEFAULT_TID = 0L;
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String link_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long tid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    /* synthetic */ BannerTwzbInfo(Builder builder, boolean z, BannerTwzbInfo bannerTwzbInfo) {
        this(builder, z);
    }

    private BannerTwzbInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.tid == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = builder.tid;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.pic_url == null) {
                this.pic_url = "";
            } else {
                this.pic_url = builder.pic_url;
            }
            if (builder.link_url == null) {
                this.link_url = "";
                return;
            } else {
                this.link_url = builder.link_url;
                return;
            }
        }
        this.tid = builder.tid;
        this.title = builder.title;
        this.pic_url = builder.pic_url;
        this.link_url = builder.link_url;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<BannerTwzbInfo> {
        public String link_url;
        public String pic_url;
        public Long tid;
        public String title;

        public Builder() {
        }

        public Builder(BannerTwzbInfo bannerTwzbInfo) {
            super(bannerTwzbInfo);
            if (bannerTwzbInfo != null) {
                this.tid = bannerTwzbInfo.tid;
                this.title = bannerTwzbInfo.title;
                this.pic_url = bannerTwzbInfo.pic_url;
                this.link_url = bannerTwzbInfo.link_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BannerTwzbInfo build(boolean z) {
            return new BannerTwzbInfo(this, z, null);
        }
    }
}
