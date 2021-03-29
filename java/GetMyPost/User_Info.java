package tbclient.GetMyPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.BaijiahaoInfo;
import tbclient.BusinessAccountInfo;
import tbclient.GodInfo;
import tbclient.NewGodInfo;
/* loaded from: classes7.dex */
public final class User_Info extends Message {
    public static final String DEFAULT_BAWU_TYPE = "";
    public static final String DEFAULT_FANS_NICKNAME = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_NAME_SHOW = "";
    public static final String DEFAULT_PORTRAIT = "";
    @ProtoField(tag = 18)
    public final BaijiahaoInfo baijiahao_info;
    @ProtoField(tag = 12)
    public final Balv balv;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String bawu_type;
    @ProtoField(tag = 20)
    public final BusinessAccountInfo business_account_info;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String fans_nickname;
    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer fans_num;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer gender;
    @ProtoField(tag = 13)
    public final GodInfo god_data;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer is_bawu;
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
    @ProtoField(tag = 19)
    public final NewGodInfo new_god_data;
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
    public static final Integer DEFAULT_FANS_NUM = 0;
    public static final Integer DEFAULT_IS_BAWU = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<User_Info> {
        public BaijiahaoInfo baijiahao_info;
        public Balv balv;
        public String bawu_type;
        public BusinessAccountInfo business_account_info;
        public String fans_nickname;
        public Integer fans_num;
        public Integer gender;
        public GodInfo god_data;
        public Long id;
        public Integer is_bawu;
        public Integer is_login;
        public Integer is_manager;
        public Integer is_mem;
        public Integer is_select_tail;
        public String name;
        public String name_show;
        public NewGodInfo new_god_data;
        public String portrait;
        public Integer type;
        public Integer userhide;

        public Builder() {
        }

        public Builder(User_Info user_Info) {
            super(user_Info);
            if (user_Info == null) {
                return;
            }
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
            this.fans_num = user_Info.fans_num;
            this.fans_nickname = user_Info.fans_nickname;
            this.is_bawu = user_Info.is_bawu;
            this.bawu_type = user_Info.bawu_type;
            this.baijiahao_info = user_Info.baijiahao_info;
            this.new_god_data = user_Info.new_god_data;
            this.business_account_info = user_Info.business_account_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public User_Info build(boolean z) {
            return new User_Info(this, z);
        }
    }

    public User_Info(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.is_login;
            if (num == null) {
                this.is_login = DEFAULT_IS_LOGIN;
            } else {
                this.is_login = num;
            }
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.name_show;
            if (str2 == null) {
                this.name_show = "";
            } else {
                this.name_show = str2;
            }
            String str3 = builder.portrait;
            if (str3 == null) {
                this.portrait = "";
            } else {
                this.portrait = str3;
            }
            Integer num2 = builder.gender;
            if (num2 == null) {
                this.gender = DEFAULT_GENDER;
            } else {
                this.gender = num2;
            }
            Integer num3 = builder.type;
            if (num3 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num3;
            }
            Integer num4 = builder.is_manager;
            if (num4 == null) {
                this.is_manager = DEFAULT_IS_MANAGER;
            } else {
                this.is_manager = num4;
            }
            Integer num5 = builder.is_mem;
            if (num5 == null) {
                this.is_mem = DEFAULT_IS_MEM;
            } else {
                this.is_mem = num5;
            }
            Integer num6 = builder.is_select_tail;
            if (num6 == null) {
                this.is_select_tail = DEFAULT_IS_SELECT_TAIL;
            } else {
                this.is_select_tail = num6;
            }
            Integer num7 = builder.userhide;
            if (num7 == null) {
                this.userhide = DEFAULT_USERHIDE;
            } else {
                this.userhide = num7;
            }
            this.balv = builder.balv;
            this.god_data = builder.god_data;
            Integer num8 = builder.fans_num;
            if (num8 == null) {
                this.fans_num = DEFAULT_FANS_NUM;
            } else {
                this.fans_num = num8;
            }
            String str4 = builder.fans_nickname;
            if (str4 == null) {
                this.fans_nickname = "";
            } else {
                this.fans_nickname = str4;
            }
            Integer num9 = builder.is_bawu;
            if (num9 == null) {
                this.is_bawu = DEFAULT_IS_BAWU;
            } else {
                this.is_bawu = num9;
            }
            String str5 = builder.bawu_type;
            if (str5 == null) {
                this.bawu_type = "";
            } else {
                this.bawu_type = str5;
            }
            this.baijiahao_info = builder.baijiahao_info;
            this.new_god_data = builder.new_god_data;
            this.business_account_info = builder.business_account_info;
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
        this.fans_num = builder.fans_num;
        this.fans_nickname = builder.fans_nickname;
        this.is_bawu = builder.is_bawu;
        this.bawu_type = builder.bawu_type;
        this.baijiahao_info = builder.baijiahao_info;
        this.new_god_data = builder.new_god_data;
        this.business_account_info = builder.business_account_info;
    }
}
