package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AnchorInfo;
import tbclient.Anti;
import tbclient.Page;
import tbclient.ThreadInfo;
import tbclient.User;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_FORTUNE_DESC = "";
    @ProtoField(tag = 5)
    public final Anti anti;
    @ProtoField(label = Message.Label.REPEATED, tag = 21)
    public final List<ColorEgg> color_egg;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer ctime;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer fortune_bag;
    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String fortune_desc;
    @ProtoField(tag = 2)
    public final ForumInfo forum;
    @ProtoField(label = Message.Label.REPEATED, tag = 16)
    public final List<AnchorInfo> forum_livegroup_list;
    @ProtoField(tag = 3)
    public final StarInfo frs_star;
    @ProtoField(tag = 18)
    public final GconAccount gcon_account;
    @ProtoField(tag = 6)
    public final Group group;
    @ProtoField(tag = 15)
    public final Info info;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer is_new_url;
    @ProtoField(tag = 13, type = Message.Datatype.INT64)
    public final Long logid;
    @ProtoField(tag = 4)
    public final Page page;
    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer server_time;
    @ProtoField(label = Message.Label.REPEATED, tag = 20)
    public final List<StarEnter> star_enter;
    @ProtoField(label = Message.Label.REPEATED, tag = 8, type = Message.Datatype.INT64)
    public final List<Long> thread_id_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<ThreadInfo> thread_list;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer time;
    @ProtoField(tag = 1)
    public final User user;
    @ProtoField(label = Message.Label.REPEATED, tag = 17)
    public final List<User> user_list;
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final List<Long> DEFAULT_THREAD_ID_LIST = Collections.emptyList();
    public static final Integer DEFAULT_IS_NEW_URL = 0;
    public static final Integer DEFAULT_FORTUNE_BAG = 0;
    public static final Integer DEFAULT_TIME = 0;
    public static final Integer DEFAULT_CTIME = 0;
    public static final Long DEFAULT_LOGID = 0L;
    public static final Integer DEFAULT_SERVER_TIME = 0;
    public static final List<AnchorInfo> DEFAULT_FORUM_LIVEGROUP_LIST = Collections.emptyList();
    public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
    public static final List<StarEnter> DEFAULT_STAR_ENTER = Collections.emptyList();
    public static final List<ColorEgg> DEFAULT_COLOR_EGG = Collections.emptyList();

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.user = builder.user;
            this.forum = builder.forum;
            this.frs_star = builder.frs_star;
            this.page = builder.page;
            this.anti = builder.anti;
            this.group = builder.group;
            if (builder.thread_list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = immutableCopyOf(builder.thread_list);
            }
            if (builder.thread_id_list == null) {
                this.thread_id_list = DEFAULT_THREAD_ID_LIST;
            } else {
                this.thread_id_list = immutableCopyOf(builder.thread_id_list);
            }
            if (builder.is_new_url == null) {
                this.is_new_url = DEFAULT_IS_NEW_URL;
            } else {
                this.is_new_url = builder.is_new_url;
            }
            if (builder.fortune_bag == null) {
                this.fortune_bag = DEFAULT_FORTUNE_BAG;
            } else {
                this.fortune_bag = builder.fortune_bag;
            }
            if (builder.time == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = builder.time;
            }
            if (builder.ctime == null) {
                this.ctime = DEFAULT_CTIME;
            } else {
                this.ctime = builder.ctime;
            }
            if (builder.logid == null) {
                this.logid = DEFAULT_LOGID;
            } else {
                this.logid = builder.logid;
            }
            if (builder.server_time == null) {
                this.server_time = DEFAULT_SERVER_TIME;
            } else {
                this.server_time = builder.server_time;
            }
            this.info = builder.info;
            if (builder.forum_livegroup_list == null) {
                this.forum_livegroup_list = DEFAULT_FORUM_LIVEGROUP_LIST;
            } else {
                this.forum_livegroup_list = immutableCopyOf(builder.forum_livegroup_list);
            }
            if (builder.user_list == null) {
                this.user_list = DEFAULT_USER_LIST;
            } else {
                this.user_list = immutableCopyOf(builder.user_list);
            }
            this.gcon_account = builder.gcon_account;
            if (builder.fortune_desc == null) {
                this.fortune_desc = "";
            } else {
                this.fortune_desc = builder.fortune_desc;
            }
            if (builder.star_enter == null) {
                this.star_enter = DEFAULT_STAR_ENTER;
            } else {
                this.star_enter = immutableCopyOf(builder.star_enter);
            }
            if (builder.color_egg == null) {
                this.color_egg = DEFAULT_COLOR_EGG;
                return;
            } else {
                this.color_egg = immutableCopyOf(builder.color_egg);
                return;
            }
        }
        this.user = builder.user;
        this.forum = builder.forum;
        this.frs_star = builder.frs_star;
        this.page = builder.page;
        this.anti = builder.anti;
        this.group = builder.group;
        this.thread_list = immutableCopyOf(builder.thread_list);
        this.thread_id_list = immutableCopyOf(builder.thread_id_list);
        this.is_new_url = builder.is_new_url;
        this.fortune_bag = builder.fortune_bag;
        this.time = builder.time;
        this.ctime = builder.ctime;
        this.logid = builder.logid;
        this.server_time = builder.server_time;
        this.info = builder.info;
        this.forum_livegroup_list = immutableCopyOf(builder.forum_livegroup_list);
        this.user_list = immutableCopyOf(builder.user_list);
        this.gcon_account = builder.gcon_account;
        this.fortune_desc = builder.fortune_desc;
        this.star_enter = immutableCopyOf(builder.star_enter);
        this.color_egg = immutableCopyOf(builder.color_egg);
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataRes> {
        public Anti anti;
        public List<ColorEgg> color_egg;
        public Integer ctime;
        public Integer fortune_bag;
        public String fortune_desc;
        public ForumInfo forum;
        public List<AnchorInfo> forum_livegroup_list;
        public StarInfo frs_star;
        public GconAccount gcon_account;
        public Group group;
        public Info info;
        public Integer is_new_url;
        public Long logid;
        public Page page;
        public Integer server_time;
        public List<StarEnter> star_enter;
        public List<Long> thread_id_list;
        public List<ThreadInfo> thread_list;
        public Integer time;
        public User user;
        public List<User> user_list;

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.user = dataRes.user;
                this.forum = dataRes.forum;
                this.frs_star = dataRes.frs_star;
                this.page = dataRes.page;
                this.anti = dataRes.anti;
                this.group = dataRes.group;
                this.thread_list = DataRes.copyOf(dataRes.thread_list);
                this.thread_id_list = DataRes.copyOf(dataRes.thread_id_list);
                this.is_new_url = dataRes.is_new_url;
                this.fortune_bag = dataRes.fortune_bag;
                this.time = dataRes.time;
                this.ctime = dataRes.ctime;
                this.logid = dataRes.logid;
                this.server_time = dataRes.server_time;
                this.info = dataRes.info;
                this.forum_livegroup_list = DataRes.copyOf(dataRes.forum_livegroup_list);
                this.user_list = DataRes.copyOf(dataRes.user_list);
                this.gcon_account = dataRes.gcon_account;
                this.fortune_desc = dataRes.fortune_desc;
                this.star_enter = DataRes.copyOf(dataRes.star_enter);
                this.color_egg = DataRes.copyOf(dataRes.color_egg);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
