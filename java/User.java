package tbclient;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.baidu.sapi2.SapiAccountManager;
import com.baidu.tbadk.TbConfig;
import com.baidu.tbadk.coreExtra.service.DealIntentService;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class User extends Message {
    public static final String DEFAULT_BAWU_TYPE = "";
    public static final String DEFAULT_BDUSS = "";
    public static final String DEFAULT_BIMG_URL = "";
    public static final String DEFAULT_INTRO = "";
    public static final String DEFAULT_IOS_BIMG_FORMAT = "";
    public static final String DEFAULT_IP = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_NAME_SHOW = "";
    public static final String DEFAULT_PASSWD = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_PORTRAITH = "";
    public static final String DEFAULT_RANK = "";
    public static final String DEFAULT_TB_AGE = "";
    @ProtoField(tag = 29, type = Message.Datatype.STRING)
    public final String BDUSS;
    @ProtoField(tag = 10)
    public final Balv balv;
    @ProtoField(tag = 26, type = Message.Datatype.STRING)
    public final String bawu_type;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String bimg_url;
    @ProtoField(tag = 31, type = Message.Datatype.INT32)
    public final Integer concern_num;
    @ProtoField(tag = TbConfig.MAX_PRELOAD_PHOTO_NUM, type = Message.Datatype.INT32)
    public final Integer fans_num;
    @ProtoField(tag = 35, type = Message.Datatype.INT32)
    public final Integer has_concerned;
    @ProtoField(label = Message.Label.REPEATED, tag = 17)
    public final List<Icon> iconinfo;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(tag = 34, type = Message.Datatype.STRING)
    public final String intro;
    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String ios_bimg_format;
    @ProtoField(tag = 28, type = Message.Datatype.STRING)
    public final String ip;
    @ProtoField(tag = SapiAccountManager.VERSION_CODE, type = Message.Datatype.INT32)
    public final Integer is_bawu;
    @ProtoField(tag = 20, type = Message.Datatype.INT32)
    public final Integer is_coreuser;
    @ProtoField(tag = TbConfig.NOTIFY_LIVE_NOTIFY, type = Message.Datatype.INT32)
    public final Integer is_huinibuke;
    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer is_interestman;
    @ProtoField(tag = 24, type = Message.Datatype.INT32)
    public final Integer is_like;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_login;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer is_manager;
    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer is_verify;
    @ProtoField(tag = 23, type = Message.Datatype.INT32)
    public final Integer level_id;
    @ProtoField(tag = DealIntentService.CLASS_TYPE_GROUP_EVENT, type = Message.Datatype.INT32)
    public final Integer meizhi_level;
    @ProtoField(tag = 33, type = Message.Datatype.INT32)
    public final Integer my_like_num;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String name_show;
    @ProtoField(tag = 8)
    public final NewUser new_user_info;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer no_un;
    @ProtoField(tag = 36, type = Message.Datatype.STRING)
    public final String passwd;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 27, type = Message.Datatype.STRING)
    public final String portraith;
    @ProtoField(tag = 37, type = Message.Datatype.INT32)
    public final Integer post_num;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String rank;
    @ProtoField(tag = AccessibilityNodeInfoCompat.ACTION_LONG_CLICK, type = Message.Datatype.INT32)
    public final Integer sex;
    @ProtoField(tag = 38, type = Message.Datatype.STRING)
    public final String tb_age;
    @ProtoField(label = Message.Label.REPEATED, tag = 18)
    public final List<TshowInfo> tshow_icon;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 19, type = Message.Datatype.INT32)
    public final Integer user_type;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer userhide;
    public static final Integer DEFAULT_IS_LOGIN = 0;
    public static final Integer DEFAULT_ID = 0;
    public static final Integer DEFAULT_NO_UN = 0;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_USERHIDE = 0;
    public static final Integer DEFAULT_IS_MANAGER = 0;
    public static final Integer DEFAULT_MEIZHI_LEVEL = 0;
    public static final Integer DEFAULT_IS_VERIFY = 0;
    public static final Integer DEFAULT_IS_INTERESTMAN = 0;
    public static final List<Icon> DEFAULT_ICONINFO = Collections.emptyList();
    public static final List<TshowInfo> DEFAULT_TSHOW_ICON = Collections.emptyList();
    public static final Integer DEFAULT_USER_TYPE = 0;
    public static final Integer DEFAULT_IS_COREUSER = 0;
    public static final Integer DEFAULT_IS_HUINIBUKE = 0;
    public static final Integer DEFAULT_LEVEL_ID = 0;
    public static final Integer DEFAULT_IS_LIKE = 0;
    public static final Integer DEFAULT_IS_BAWU = 0;
    public static final Integer DEFAULT_FANS_NUM = 0;
    public static final Integer DEFAULT_CONCERN_NUM = 0;
    public static final Integer DEFAULT_SEX = 0;
    public static final Integer DEFAULT_MY_LIKE_NUM = 0;
    public static final Integer DEFAULT_HAS_CONCERNED = 0;
    public static final Integer DEFAULT_POST_NUM = 0;

    /* synthetic */ User(Builder builder, boolean z, User user) {
        this(builder, z);
    }

    private User(Builder builder, boolean z) {
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
            if (builder.no_un == null) {
                this.no_un = DEFAULT_NO_UN;
            } else {
                this.no_un = builder.no_un;
            }
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            this.new_user_info = builder.new_user_info;
            if (builder.userhide == null) {
                this.userhide = DEFAULT_USERHIDE;
            } else {
                this.userhide = builder.userhide;
            }
            this.balv = builder.balv;
            if (builder.is_manager == null) {
                this.is_manager = DEFAULT_IS_MANAGER;
            } else {
                this.is_manager = builder.is_manager;
            }
            if (builder.rank == null) {
                this.rank = "";
            } else {
                this.rank = builder.rank;
            }
            if (builder.bimg_url == null) {
                this.bimg_url = "";
            } else {
                this.bimg_url = builder.bimg_url;
            }
            if (builder.meizhi_level == null) {
                this.meizhi_level = DEFAULT_MEIZHI_LEVEL;
            } else {
                this.meizhi_level = builder.meizhi_level;
            }
            if (builder.is_verify == null) {
                this.is_verify = DEFAULT_IS_VERIFY;
            } else {
                this.is_verify = builder.is_verify;
            }
            if (builder.is_interestman == null) {
                this.is_interestman = DEFAULT_IS_INTERESTMAN;
            } else {
                this.is_interestman = builder.is_interestman;
            }
            if (builder.iconinfo == null) {
                this.iconinfo = DEFAULT_ICONINFO;
            } else {
                this.iconinfo = immutableCopyOf(builder.iconinfo);
            }
            if (builder.tshow_icon == null) {
                this.tshow_icon = DEFAULT_TSHOW_ICON;
            } else {
                this.tshow_icon = immutableCopyOf(builder.tshow_icon);
            }
            if (builder.user_type == null) {
                this.user_type = DEFAULT_USER_TYPE;
            } else {
                this.user_type = builder.user_type;
            }
            if (builder.is_coreuser == null) {
                this.is_coreuser = DEFAULT_IS_COREUSER;
            } else {
                this.is_coreuser = builder.is_coreuser;
            }
            if (builder.is_huinibuke == null) {
                this.is_huinibuke = DEFAULT_IS_HUINIBUKE;
            } else {
                this.is_huinibuke = builder.is_huinibuke;
            }
            if (builder.ios_bimg_format == null) {
                this.ios_bimg_format = "";
            } else {
                this.ios_bimg_format = builder.ios_bimg_format;
            }
            if (builder.level_id == null) {
                this.level_id = DEFAULT_LEVEL_ID;
            } else {
                this.level_id = builder.level_id;
            }
            if (builder.is_like == null) {
                this.is_like = DEFAULT_IS_LIKE;
            } else {
                this.is_like = builder.is_like;
            }
            if (builder.is_bawu == null) {
                this.is_bawu = DEFAULT_IS_BAWU;
            } else {
                this.is_bawu = builder.is_bawu;
            }
            if (builder.bawu_type == null) {
                this.bawu_type = "";
            } else {
                this.bawu_type = builder.bawu_type;
            }
            if (builder.portraith == null) {
                this.portraith = "";
            } else {
                this.portraith = builder.portraith;
            }
            if (builder.ip == null) {
                this.ip = "";
            } else {
                this.ip = builder.ip;
            }
            if (builder.BDUSS == null) {
                this.BDUSS = "";
            } else {
                this.BDUSS = builder.BDUSS;
            }
            if (builder.fans_num == null) {
                this.fans_num = DEFAULT_FANS_NUM;
            } else {
                this.fans_num = builder.fans_num;
            }
            if (builder.concern_num == null) {
                this.concern_num = DEFAULT_CONCERN_NUM;
            } else {
                this.concern_num = builder.concern_num;
            }
            if (builder.sex == null) {
                this.sex = DEFAULT_SEX;
            } else {
                this.sex = builder.sex;
            }
            if (builder.my_like_num == null) {
                this.my_like_num = DEFAULT_MY_LIKE_NUM;
            } else {
                this.my_like_num = builder.my_like_num;
            }
            if (builder.intro == null) {
                this.intro = "";
            } else {
                this.intro = builder.intro;
            }
            if (builder.has_concerned == null) {
                this.has_concerned = DEFAULT_HAS_CONCERNED;
            } else {
                this.has_concerned = builder.has_concerned;
            }
            if (builder.passwd == null) {
                this.passwd = "";
            } else {
                this.passwd = builder.passwd;
            }
            if (builder.post_num == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = builder.post_num;
            }
            if (builder.tb_age == null) {
                this.tb_age = "";
                return;
            } else {
                this.tb_age = builder.tb_age;
                return;
            }
        }
        this.is_login = builder.is_login;
        this.id = builder.id;
        this.name = builder.name;
        this.name_show = builder.name_show;
        this.portrait = builder.portrait;
        this.no_un = builder.no_un;
        this.type = builder.type;
        this.new_user_info = builder.new_user_info;
        this.userhide = builder.userhide;
        this.balv = builder.balv;
        this.is_manager = builder.is_manager;
        this.rank = builder.rank;
        this.bimg_url = builder.bimg_url;
        this.meizhi_level = builder.meizhi_level;
        this.is_verify = builder.is_verify;
        this.is_interestman = builder.is_interestman;
        this.iconinfo = immutableCopyOf(builder.iconinfo);
        this.tshow_icon = immutableCopyOf(builder.tshow_icon);
        this.user_type = builder.user_type;
        this.is_coreuser = builder.is_coreuser;
        this.is_huinibuke = builder.is_huinibuke;
        this.ios_bimg_format = builder.ios_bimg_format;
        this.level_id = builder.level_id;
        this.is_like = builder.is_like;
        this.is_bawu = builder.is_bawu;
        this.bawu_type = builder.bawu_type;
        this.portraith = builder.portraith;
        this.ip = builder.ip;
        this.BDUSS = builder.BDUSS;
        this.fans_num = builder.fans_num;
        this.concern_num = builder.concern_num;
        this.sex = builder.sex;
        this.my_like_num = builder.my_like_num;
        this.intro = builder.intro;
        this.has_concerned = builder.has_concerned;
        this.passwd = builder.passwd;
        this.post_num = builder.post_num;
        this.tb_age = builder.tb_age;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<User> {
        public String BDUSS;
        public Balv balv;
        public String bawu_type;
        public String bimg_url;
        public Integer concern_num;
        public Integer fans_num;
        public Integer has_concerned;
        public List<Icon> iconinfo;
        public Integer id;
        public String intro;
        public String ios_bimg_format;
        public String ip;
        public Integer is_bawu;
        public Integer is_coreuser;
        public Integer is_huinibuke;
        public Integer is_interestman;
        public Integer is_like;
        public Integer is_login;
        public Integer is_manager;
        public Integer is_verify;
        public Integer level_id;
        public Integer meizhi_level;
        public Integer my_like_num;
        public String name;
        public String name_show;
        public NewUser new_user_info;
        public Integer no_un;
        public String passwd;
        public String portrait;
        public String portraith;
        public Integer post_num;
        public String rank;
        public Integer sex;
        public String tb_age;
        public List<TshowInfo> tshow_icon;
        public Integer type;
        public Integer user_type;
        public Integer userhide;

        public Builder(User user) {
            super(user);
            if (user != null) {
                this.is_login = user.is_login;
                this.id = user.id;
                this.name = user.name;
                this.name_show = user.name_show;
                this.portrait = user.portrait;
                this.no_un = user.no_un;
                this.type = user.type;
                this.new_user_info = user.new_user_info;
                this.userhide = user.userhide;
                this.balv = user.balv;
                this.is_manager = user.is_manager;
                this.rank = user.rank;
                this.bimg_url = user.bimg_url;
                this.meizhi_level = user.meizhi_level;
                this.is_verify = user.is_verify;
                this.is_interestman = user.is_interestman;
                this.iconinfo = User.copyOf(user.iconinfo);
                this.tshow_icon = User.copyOf(user.tshow_icon);
                this.user_type = user.user_type;
                this.is_coreuser = user.is_coreuser;
                this.is_huinibuke = user.is_huinibuke;
                this.ios_bimg_format = user.ios_bimg_format;
                this.level_id = user.level_id;
                this.is_like = user.is_like;
                this.is_bawu = user.is_bawu;
                this.bawu_type = user.bawu_type;
                this.portraith = user.portraith;
                this.ip = user.ip;
                this.BDUSS = user.BDUSS;
                this.fans_num = user.fans_num;
                this.concern_num = user.concern_num;
                this.sex = user.sex;
                this.my_like_num = user.my_like_num;
                this.intro = user.intro;
                this.has_concerned = user.has_concerned;
                this.passwd = user.passwd;
                this.post_num = user.post_num;
                this.tb_age = user.tb_age;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public User build(boolean z) {
            return new User(this, z, null);
        }
    }
}
