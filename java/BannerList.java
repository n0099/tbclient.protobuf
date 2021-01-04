package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class BannerList extends Message {
    public static final String DEFAULT_APPLIST = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<App> app;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String applist;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FeedForumInfo> feed_forum;
    @ProtoField(tag = 3)
    public final RecomTopicInfo hot_topic;
    @ProtoField(tag = 5)
    public final App pb_banner_ad;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<App> video_recommend_ad;
    public static final List<App> DEFAULT_APP = Collections.emptyList();
    public static final List<FeedForumInfo> DEFAULT_FEED_FORUM = Collections.emptyList();
    public static final List<App> DEFAULT_VIDEO_RECOMMEND_AD = Collections.emptyList();

    private BannerList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.app == null) {
                this.app = DEFAULT_APP;
            } else {
                this.app = immutableCopyOf(builder.app);
            }
            if (builder.feed_forum == null) {
                this.feed_forum = DEFAULT_FEED_FORUM;
            } else {
                this.feed_forum = immutableCopyOf(builder.feed_forum);
            }
            this.hot_topic = builder.hot_topic;
            if (builder.applist == null) {
                this.applist = "";
            } else {
                this.applist = builder.applist;
            }
            this.pb_banner_ad = builder.pb_banner_ad;
            if (builder.video_recommend_ad == null) {
                this.video_recommend_ad = DEFAULT_VIDEO_RECOMMEND_AD;
                return;
            } else {
                this.video_recommend_ad = immutableCopyOf(builder.video_recommend_ad);
                return;
            }
        }
        this.app = immutableCopyOf(builder.app);
        this.feed_forum = immutableCopyOf(builder.feed_forum);
        this.hot_topic = builder.hot_topic;
        this.applist = builder.applist;
        this.pb_banner_ad = builder.pb_banner_ad;
        this.video_recommend_ad = immutableCopyOf(builder.video_recommend_ad);
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<BannerList> {
        public List<App> app;
        public String applist;
        public List<FeedForumInfo> feed_forum;
        public RecomTopicInfo hot_topic;
        public App pb_banner_ad;
        public List<App> video_recommend_ad;

        public Builder() {
        }

        public Builder(BannerList bannerList) {
            super(bannerList);
            if (bannerList != null) {
                this.app = BannerList.copyOf(bannerList.app);
                this.feed_forum = BannerList.copyOf(bannerList.feed_forum);
                this.hot_topic = bannerList.hot_topic;
                this.applist = bannerList.applist;
                this.pb_banner_ad = bannerList.pb_banner_ad;
                this.video_recommend_ad = BannerList.copyOf(bannerList.video_recommend_ad);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BannerList build(boolean z) {
            return new BannerList(this, z);
        }
    }
}
