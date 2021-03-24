package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
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

    /* loaded from: classes7.dex */
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
            if (bannerList == null) {
                return;
            }
            this.app = Message.copyOf(bannerList.app);
            this.feed_forum = Message.copyOf(bannerList.feed_forum);
            this.hot_topic = bannerList.hot_topic;
            this.applist = bannerList.applist;
            this.pb_banner_ad = bannerList.pb_banner_ad;
            this.video_recommend_ad = Message.copyOf(bannerList.video_recommend_ad);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BannerList build(boolean z) {
            return new BannerList(this, z);
        }
    }

    public BannerList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<App> list = builder.app;
            if (list == null) {
                this.app = DEFAULT_APP;
            } else {
                this.app = Message.immutableCopyOf(list);
            }
            List<FeedForumInfo> list2 = builder.feed_forum;
            if (list2 == null) {
                this.feed_forum = DEFAULT_FEED_FORUM;
            } else {
                this.feed_forum = Message.immutableCopyOf(list2);
            }
            this.hot_topic = builder.hot_topic;
            String str = builder.applist;
            if (str == null) {
                this.applist = "";
            } else {
                this.applist = str;
            }
            this.pb_banner_ad = builder.pb_banner_ad;
            List<App> list3 = builder.video_recommend_ad;
            if (list3 == null) {
                this.video_recommend_ad = DEFAULT_VIDEO_RECOMMEND_AD;
                return;
            } else {
                this.video_recommend_ad = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.app = Message.immutableCopyOf(builder.app);
        this.feed_forum = Message.immutableCopyOf(builder.feed_forum);
        this.hot_topic = builder.hot_topic;
        this.applist = builder.applist;
        this.pb_banner_ad = builder.pb_banner_ad;
        this.video_recommend_ad = Message.immutableCopyOf(builder.video_recommend_ad);
    }
}
