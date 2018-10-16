package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
/* loaded from: classes4.dex */
public final class UserGodInfo extends Message {
    public static final String DEFAULT_ADDRESS = "";
    public static final String DEFAULT_TOTAL_THREAD = "";
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String address;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer age;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer cur_page;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<ForumGodDetailInfo> forum_god_list;
    @ProtoField(tag = 2)
    public final GodDetailInfo god_info;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer god_type;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer sex;
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<ThreadInfo> thread_list;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String total_thread;
    public static final Integer DEFAULT_GOD_TYPE = 0;
    public static final List<ForumGodDetailInfo> DEFAULT_FORUM_GOD_LIST = Collections.emptyList();
    public static final Integer DEFAULT_SEX = 0;
    public static final Integer DEFAULT_AGE = 0;
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final Integer DEFAULT_CUR_PAGE = 0;

    private UserGodInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.god_type == null) {
                this.god_type = DEFAULT_GOD_TYPE;
            } else {
                this.god_type = builder.god_type;
            }
            this.god_info = builder.god_info;
            if (builder.forum_god_list == null) {
                this.forum_god_list = DEFAULT_FORUM_GOD_LIST;
            } else {
                this.forum_god_list = immutableCopyOf(builder.forum_god_list);
            }
            if (builder.sex == null) {
                this.sex = DEFAULT_SEX;
            } else {
                this.sex = builder.sex;
            }
            if (builder.age == null) {
                this.age = DEFAULT_AGE;
            } else {
                this.age = builder.age;
            }
            if (builder.address == null) {
                this.address = "";
            } else {
                this.address = builder.address;
            }
            if (builder.thread_list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = immutableCopyOf(builder.thread_list);
            }
            if (builder.cur_page == null) {
                this.cur_page = DEFAULT_CUR_PAGE;
            } else {
                this.cur_page = builder.cur_page;
            }
            if (builder.total_thread == null) {
                this.total_thread = "";
                return;
            } else {
                this.total_thread = builder.total_thread;
                return;
            }
        }
        this.god_type = builder.god_type;
        this.god_info = builder.god_info;
        this.forum_god_list = immutableCopyOf(builder.forum_god_list);
        this.sex = builder.sex;
        this.age = builder.age;
        this.address = builder.address;
        this.thread_list = immutableCopyOf(builder.thread_list);
        this.cur_page = builder.cur_page;
        this.total_thread = builder.total_thread;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<UserGodInfo> {
        public String address;
        public Integer age;
        public Integer cur_page;
        public List<ForumGodDetailInfo> forum_god_list;
        public GodDetailInfo god_info;
        public Integer god_type;
        public Integer sex;
        public List<ThreadInfo> thread_list;
        public String total_thread;

        public Builder() {
        }

        public Builder(UserGodInfo userGodInfo) {
            super(userGodInfo);
            if (userGodInfo != null) {
                this.god_type = userGodInfo.god_type;
                this.god_info = userGodInfo.god_info;
                this.forum_god_list = UserGodInfo.copyOf(userGodInfo.forum_god_list);
                this.sex = userGodInfo.sex;
                this.age = userGodInfo.age;
                this.address = userGodInfo.address;
                this.thread_list = UserGodInfo.copyOf(userGodInfo.thread_list);
                this.cur_page = userGodInfo.cur_page;
                this.total_thread = userGodInfo.total_thread;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserGodInfo build(boolean z) {
            return new UserGodInfo(this, z);
        }
    }
}
