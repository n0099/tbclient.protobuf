package tbclient.Userlike;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.NewGodInfo;
import tbclient.ThreadInfo;
/* loaded from: classes22.dex */
public final class UserList extends Message {
    public static final String DEFAULT_INTRO = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_PREFIX = "";
    public static final String DEFAULT_RECOM_REASON = "";
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer fans_num;
    @ProtoField(tag = 8, type = Message.Datatype.UINT64)
    public final Long id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String intro;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer is_god;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer level;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 12)
    public final NewGodInfo new_god_data;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer post_num;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String prefix;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String recom_reason;
    @ProtoField(tag = 11)
    public final ThreadInfo thread_info;
    public static final Integer DEFAULT_FANS_NUM = 0;
    public static final Integer DEFAULT_POST_NUM = 0;
    public static final Long DEFAULT_ID = 0L;
    public static final Integer DEFAULT_IS_GOD = 0;
    public static final Integer DEFAULT_LEVEL = 0;

    private UserList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.prefix == null) {
                this.prefix = "";
            } else {
                this.prefix = builder.prefix;
            }
            if (builder.intro == null) {
                this.intro = "";
            } else {
                this.intro = builder.intro;
            }
            if (builder.fans_num == null) {
                this.fans_num = DEFAULT_FANS_NUM;
            } else {
                this.fans_num = builder.fans_num;
            }
            if (builder.post_num == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = builder.post_num;
            }
            if (builder.recom_reason == null) {
                this.recom_reason = "";
            } else {
                this.recom_reason = builder.recom_reason;
            }
            if (builder.portrait == null) {
                this.portrait = "";
            } else {
                this.portrait = builder.portrait;
            }
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.is_god == null) {
                this.is_god = DEFAULT_IS_GOD;
            } else {
                this.is_god = builder.is_god;
            }
            if (builder.level == null) {
                this.level = DEFAULT_LEVEL;
            } else {
                this.level = builder.level;
            }
            this.thread_info = builder.thread_info;
            this.new_god_data = builder.new_god_data;
            return;
        }
        this.name = builder.name;
        this.prefix = builder.prefix;
        this.intro = builder.intro;
        this.fans_num = builder.fans_num;
        this.post_num = builder.post_num;
        this.recom_reason = builder.recom_reason;
        this.portrait = builder.portrait;
        this.id = builder.id;
        this.is_god = builder.is_god;
        this.level = builder.level;
        this.thread_info = builder.thread_info;
        this.new_god_data = builder.new_god_data;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<UserList> {
        public Integer fans_num;
        public Long id;
        public String intro;
        public Integer is_god;
        public Integer level;
        public String name;
        public NewGodInfo new_god_data;
        public String portrait;
        public Integer post_num;
        public String prefix;
        public String recom_reason;
        public ThreadInfo thread_info;

        public Builder() {
        }

        public Builder(UserList userList) {
            super(userList);
            if (userList != null) {
                this.name = userList.name;
                this.prefix = userList.prefix;
                this.intro = userList.intro;
                this.fans_num = userList.fans_num;
                this.post_num = userList.post_num;
                this.recom_reason = userList.recom_reason;
                this.portrait = userList.portrait;
                this.id = userList.id;
                this.is_god = userList.is_god;
                this.level = userList.level;
                this.thread_info = userList.thread_info;
                this.new_god_data = userList.new_god_data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserList build(boolean z) {
            return new UserList(this, z);
        }
    }
}
