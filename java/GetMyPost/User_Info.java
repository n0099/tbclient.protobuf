package tbclient.GetMyPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.GodInfo;
/* loaded from: classes.dex */
public final class User_Info extends Message {
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_NAME_SHOW = "";
    public static final String DEFAULT_PORTRAIT = "";
    @ProtoField(tag = 12)
    public final Balv balv;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer gender;
    @ProtoField(tag = 13)
    public final GodInfo god_data;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_login;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer is_manager;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer is_mem;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer is_select_tail;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String name_show;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer userhide;
    public static final Integer DEFAULT_IS_LOGIN = 0;
    public static final Long DEFAULT_ID = 0L;
    public static final Integer DEFAULT_GENDER = 0;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_IS_MANAGER = 0;
    public static final Integer DEFAULT_IS_MEM = 0;
    public static final Integer DEFAULT_IS_SELECT_TAIL = 0;
    public static final Integer DEFAULT_USERHIDE = 0;

    /* synthetic */ User_Info(Builder builder, boolean z, User_Info user_Info) {
        this(builder, z);
    }

    private User_Info(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.is_login == null) {
                this.is_login = DEFAULT_IS_LOGIN;
            } else {
                this.is_login = builder.is_login;
            }
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.name_show == null) {
                this.name_show = "";
            } else {
                this.name_show = builder.name_show;
            }
            if (builder.portrait == null) {
                this.portrait = "";
            } else {
                this.portrait = builder.portrait;
            }
            if (builder.gender == null) {
                this.gender = DEFAULT_GENDER;
            } else {
                this.gender = builder.gender;
            }
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.is_manager == null) {
                this.is_manager = DEFAULT_IS_MANAGER;
            } else {
                this.is_manager = builder.is_manager;
            }
            if (builder.is_mem == null) {
                this.is_mem = DEFAULT_IS_MEM;
            } else {
                this.is_mem = builder.is_mem;
            }
            if (builder.is_select_tail == null) {
                this.is_select_tail = DEFAULT_IS_SELECT_TAIL;
            } else {
                this.is_select_tail = builder.is_select_tail;
            }
            if (builder.userhide == null) {
                this.userhide = DEFAULT_USERHIDE;
            } else {
                this.userhide = builder.userhide;
            }
            this.balv = builder.balv;
            this.god_data = builder.god_data;
            return;
        }
        this.is_login = builder.is_login;
        this.id = builder.id;
        this.name = builder.name;
        this.name_show = builder.name_show;
        this.portrait = builder.portrait;
        this.gender = builder.gender;
        this.type = builder.type;
        this.is_manager = builder.is_manager;
        this.is_mem = builder.is_mem;
        this.is_select_tail = builder.is_select_tail;
        this.userhide = builder.userhide;
        this.balv = builder.balv;
        this.god_data = builder.god_data;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<User_Info> {
        public Balv balv;
        public Integer gender;
        public GodInfo god_data;
        public Long id;
        public Integer is_login;
        public Integer is_manager;
        public Integer is_mem;
        public Integer is_select_tail;
        public String name;
        public String name_show;
        public String portrait;
        public Integer type;
        public Integer userhide;

        public Builder() {
        }

        public Builder(User_Info user_Info) {
            super(user_Info);
            if (user_Info != null) {
                this.is_login = user_Info.is_login;
                this.id = user_Info.id;
                this.name = user_Info.name;
                this.name_show = user_Info.name_show;
                this.portrait = user_Info.portrait;
                this.gender = user_Info.gender;
                this.type = user_Info.type;
                this.is_manager = user_Info.is_manager;
                this.is_mem = user_Info.is_mem;
                this.is_select_tail = user_Info.is_select_tail;
                this.userhide = user_Info.userhide;
                this.balv = user_Info.balv;
                this.god_data = user_Info.god_data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public User_Info build(boolean z) {
            return new User_Info(this, z, null);
        }
    }
}
