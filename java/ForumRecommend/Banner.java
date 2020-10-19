package tbclient.ForumRecommend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
public final class Banner extends Message {
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_PIC_URL = "";
    public static final String DEFAULT_TAG_NAME_URL = "";
    public static final String DEFAULT_TAG_NAME_WH = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String tag_name_url;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String tag_name_wh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;

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
            } else {
                this.title = builder.title;
            }
            if (builder.tag_name_url == null) {
                this.tag_name_url = "";
            } else {
                this.tag_name_url = builder.tag_name_url;
            }
            if (builder.tag_name_wh == null) {
                this.tag_name_wh = "";
                return;
            } else {
                this.tag_name_wh = builder.tag_name_wh;
                return;
            }
        }
        this.link = builder.link;
        this.pic_url = builder.pic_url;
        this.title = builder.title;
        this.tag_name_url = builder.tag_name_url;
        this.tag_name_wh = builder.tag_name_wh;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<Banner> {
        public String link;
        public String pic_url;
        public String tag_name_url;
        public String tag_name_wh;
        public String title;

        public Builder() {
        }

        public Builder(Banner banner) {
            super(banner);
            if (banner != null) {
                this.link = banner.link;
                this.pic_url = banner.pic_url;
                this.title = banner.title;
                this.tag_name_url = banner.tag_name_url;
                this.tag_name_wh = banner.tag_name_wh;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Banner build(boolean z) {
            return new Banner(this, z);
        }
    }
}
