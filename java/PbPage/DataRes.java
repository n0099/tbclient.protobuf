package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Anti;
import tbclient.BannerList;
import tbclient.Lbs;
import tbclient.Page;
import tbclient.Post;
import tbclient.SimpleForum;
import tbclient.ThreadInfo;
import tbclient.User;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 5)
    public final AddPost add_post;
    @ProtoField(tag = 4)
    public final Anti anti;
    @ProtoField(tag = 12)
    public final BannerList banner_list;
    @ProtoField(tag = 2)
    public final SimpleForum forum;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer has_floor;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer is_new_url;
    @ProtoField(tag = 9)
    public final Lbs location;
    @ProtoField(tag = 15)
    public final NewsInfo news_info;
    @ProtoField(tag = 3)
    public final Page page;
    @ProtoField(label = Message.Label.REPEATED, tag = 11)
    public final List<PostBanner> post_banner;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<Post> post_list;
    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer server_time;
    @ProtoField(tag = 8)
    public final ThreadInfo thread;
    @ProtoField(tag = 1)
    public final User user;
    @ProtoField(label = Message.Label.REPEATED, tag = 13)
    public final List<User> user_list;
    public static final List<Post> DEFAULT_POST_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HAS_FLOOR = 0;
    public static final Integer DEFAULT_IS_NEW_URL = 0;
    public static final List<PostBanner> DEFAULT_POST_BANNER = Collections.emptyList();
    public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
    public static final Integer DEFAULT_SERVER_TIME = 0;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.user = builder.user;
            this.forum = builder.forum;
            this.page = builder.page;
            this.anti = builder.anti;
            this.add_post = builder.add_post;
            if (builder.post_list == null) {
                this.post_list = DEFAULT_POST_LIST;
            } else {
                this.post_list = immutableCopyOf(builder.post_list);
            }
            if (builder.has_floor == null) {
                this.has_floor = DEFAULT_HAS_FLOOR;
            } else {
                this.has_floor = builder.has_floor;
            }
            this.thread = builder.thread;
            this.location = builder.location;
            if (builder.is_new_url == null) {
                this.is_new_url = DEFAULT_IS_NEW_URL;
            } else {
                this.is_new_url = builder.is_new_url;
            }
            if (builder.post_banner == null) {
                this.post_banner = DEFAULT_POST_BANNER;
            } else {
                this.post_banner = immutableCopyOf(builder.post_banner);
            }
            this.banner_list = builder.banner_list;
            if (builder.user_list == null) {
                this.user_list = DEFAULT_USER_LIST;
            } else {
                this.user_list = immutableCopyOf(builder.user_list);
            }
            if (builder.server_time == null) {
                this.server_time = DEFAULT_SERVER_TIME;
            } else {
                this.server_time = builder.server_time;
            }
            this.news_info = builder.news_info;
            return;
        }
        this.user = builder.user;
        this.forum = builder.forum;
        this.page = builder.page;
        this.anti = builder.anti;
        this.add_post = builder.add_post;
        this.post_list = immutableCopyOf(builder.post_list);
        this.has_floor = builder.has_floor;
        this.thread = builder.thread;
        this.location = builder.location;
        this.is_new_url = builder.is_new_url;
        this.post_banner = immutableCopyOf(builder.post_banner);
        this.banner_list = builder.banner_list;
        this.user_list = immutableCopyOf(builder.user_list);
        this.server_time = builder.server_time;
        this.news_info = builder.news_info;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataRes> {
        public AddPost add_post;
        public Anti anti;
        public BannerList banner_list;
        public SimpleForum forum;
        public Integer has_floor;
        public Integer is_new_url;
        public Lbs location;
        public NewsInfo news_info;
        public Page page;
        public List<PostBanner> post_banner;
        public List<Post> post_list;
        public Integer server_time;
        public ThreadInfo thread;
        public User user;
        public List<User> user_list;

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.user = dataRes.user;
                this.forum = dataRes.forum;
                this.page = dataRes.page;
                this.anti = dataRes.anti;
                this.add_post = dataRes.add_post;
                this.post_list = DataRes.copyOf(dataRes.post_list);
                this.has_floor = dataRes.has_floor;
                this.thread = dataRes.thread;
                this.location = dataRes.location;
                this.is_new_url = dataRes.is_new_url;
                this.post_banner = DataRes.copyOf(dataRes.post_banner);
                this.banner_list = dataRes.banner_list;
                this.user_list = DataRes.copyOf(dataRes.user_list);
                this.server_time = dataRes.server_time;
                this.news_info = dataRes.news_info;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
