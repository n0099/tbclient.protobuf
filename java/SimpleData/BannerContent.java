package tbclient.SimpleData;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class BannerContent extends Message {
    public static final String DEFAULT_EXTRA_JSON = "";
    public static final String DEFAULT_EXTRA_PARAM = "";
    @ProtoField(tag = 1)
    public final AdCommon ad_common;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<BannerShowUrl> click_urls;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer empty_goods;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String extra_json;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String extra_param;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<Operate> operate;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<BannerShowUrl> show_urls;
    @ProtoField(tag = 5)
    public final Video video;
    public static final List<BannerShowUrl> DEFAULT_SHOW_URLS = Collections.emptyList();
    public static final List<BannerShowUrl> DEFAULT_CLICK_URLS = Collections.emptyList();
    public static final List<Operate> DEFAULT_OPERATE = Collections.emptyList();
    public static final Integer DEFAULT_EMPTY_GOODS = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<BannerContent> {
        public AdCommon ad_common;
        public List<BannerShowUrl> click_urls;
        public Integer empty_goods;
        public String extra_json;
        public String extra_param;
        public List<Operate> operate;
        public List<BannerShowUrl> show_urls;
        public Video video;

        public Builder() {
        }

        public Builder(BannerContent bannerContent) {
            super(bannerContent);
            if (bannerContent == null) {
                return;
            }
            this.ad_common = bannerContent.ad_common;
            this.show_urls = Message.copyOf(bannerContent.show_urls);
            this.click_urls = Message.copyOf(bannerContent.click_urls);
            this.operate = Message.copyOf(bannerContent.operate);
            this.video = bannerContent.video;
            this.extra_json = bannerContent.extra_json;
            this.empty_goods = bannerContent.empty_goods;
            this.extra_param = bannerContent.extra_param;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BannerContent build(boolean z) {
            return new BannerContent(this, z);
        }
    }

    public BannerContent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.ad_common = builder.ad_common;
            List<BannerShowUrl> list = builder.show_urls;
            if (list == null) {
                this.show_urls = DEFAULT_SHOW_URLS;
            } else {
                this.show_urls = Message.immutableCopyOf(list);
            }
            List<BannerShowUrl> list2 = builder.click_urls;
            if (list2 == null) {
                this.click_urls = DEFAULT_CLICK_URLS;
            } else {
                this.click_urls = Message.immutableCopyOf(list2);
            }
            List<Operate> list3 = builder.operate;
            if (list3 == null) {
                this.operate = DEFAULT_OPERATE;
            } else {
                this.operate = Message.immutableCopyOf(list3);
            }
            this.video = builder.video;
            String str = builder.extra_json;
            if (str == null) {
                this.extra_json = "";
            } else {
                this.extra_json = str;
            }
            Integer num = builder.empty_goods;
            if (num == null) {
                this.empty_goods = DEFAULT_EMPTY_GOODS;
            } else {
                this.empty_goods = num;
            }
            String str2 = builder.extra_param;
            if (str2 == null) {
                this.extra_param = "";
                return;
            } else {
                this.extra_param = str2;
                return;
            }
        }
        this.ad_common = builder.ad_common;
        this.show_urls = Message.immutableCopyOf(builder.show_urls);
        this.click_urls = Message.immutableCopyOf(builder.click_urls);
        this.operate = Message.immutableCopyOf(builder.operate);
        this.video = builder.video;
        this.extra_json = builder.extra_json;
        this.empty_goods = builder.empty_goods;
        this.extra_param = builder.extra_param;
    }
}
