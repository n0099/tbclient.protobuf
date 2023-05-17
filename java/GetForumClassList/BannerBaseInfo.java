package tbclient.GetForumClassList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class BannerBaseInfo extends Message {
    public static final String DEFAULT_IMAGE_URL = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_TAG = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String image_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer rank;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tag;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Integer DEFAULT_RANK = 0;
    public static final Integer DEFAULT_TYPE = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<BannerBaseInfo> {
        public String image_url;
        public String link;
        public Integer rank;
        public String tag;
        public String title;
        public Integer type;

        public Builder() {
        }

        public Builder(BannerBaseInfo bannerBaseInfo) {
            super(bannerBaseInfo);
            if (bannerBaseInfo == null) {
                return;
            }
            this.title = bannerBaseInfo.title;
            this.tag = bannerBaseInfo.tag;
            this.link = bannerBaseInfo.link;
            this.image_url = bannerBaseInfo.image_url;
            this.rank = bannerBaseInfo.rank;
            this.type = bannerBaseInfo.type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BannerBaseInfo build(boolean z) {
            return new BannerBaseInfo(this, z);
        }
    }

    public BannerBaseInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.tag;
            if (str2 == null) {
                this.tag = "";
            } else {
                this.tag = str2;
            }
            String str3 = builder.link;
            if (str3 == null) {
                this.link = "";
            } else {
                this.link = str3;
            }
            String str4 = builder.image_url;
            if (str4 == null) {
                this.image_url = "";
            } else {
                this.image_url = str4;
            }
            Integer num = builder.rank;
            if (num == null) {
                this.rank = DEFAULT_RANK;
            } else {
                this.rank = num;
            }
            Integer num2 = builder.type;
            if (num2 == null) {
                this.type = DEFAULT_TYPE;
                return;
            } else {
                this.type = num2;
                return;
            }
        }
        this.title = builder.title;
        this.tag = builder.tag;
        this.link = builder.link;
        this.image_url = builder.image_url;
        this.rank = builder.rank;
        this.type = builder.type;
    }
}
