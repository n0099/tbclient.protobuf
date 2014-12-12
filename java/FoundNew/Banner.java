package tbclient.FoundNew;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Banner extends Message {
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_PIC_URL = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;

    /* synthetic */ Banner(Builder builder, boolean z, Banner banner) {
        this(builder, z);
    }

    private Banner(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.link == null) {
                this.link = "";
            } else {
                this.link = builder.link;
            }
            if (builder.pic_url == null) {
                this.pic_url = "";
            } else {
                this.pic_url = builder.pic_url;
            }
            if (builder.title == null) {
                this.title = "";
                return;
            } else {
                this.title = builder.title;
                return;
            }
        }
        this.link = builder.link;
        this.pic_url = builder.pic_url;
        this.title = builder.title;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<Banner> {
        public String link;
        public String pic_url;
        public String title;

        public Builder(Banner banner) {
            super(banner);
            if (banner != null) {
                this.link = banner.link;
                this.pic_url = banner.pic_url;
                this.title = banner.title;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Banner build(boolean z) {
            return new Banner(this, z, null);
        }
    }
}
