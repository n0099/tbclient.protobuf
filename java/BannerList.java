package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class BannerList extends Message {
    public static final List<App> DEFAULT_APP = Collections.emptyList();
    public static final List<FeedForumInfo> DEFAULT_FEED_FORUM = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<App> app;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FeedForumInfo> feed_forum;

    /* synthetic */ BannerList(Builder builder, boolean z, BannerList bannerList) {
        this(builder, z);
    }

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
                return;
            } else {
                this.feed_forum = immutableCopyOf(builder.feed_forum);
                return;
            }
        }
        this.app = immutableCopyOf(builder.app);
        this.feed_forum = immutableCopyOf(builder.feed_forum);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<BannerList> {
        public List<App> app;
        public List<FeedForumInfo> feed_forum;

        public Builder() {
        }

        public Builder(BannerList bannerList) {
            super(bannerList);
            if (bannerList != null) {
                this.app = BannerList.copyOf(bannerList.app);
                this.feed_forum = BannerList.copyOf(bannerList.feed_forum);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BannerList build(boolean z) {
            return new BannerList(this, z, null);
        }
    }
}
