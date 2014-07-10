package tbclient.UserPost;

import com.baidu.tbadk.coreExtra.service.DealIntentService;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_COOKIE = "";
    public static final String DEFAULT_EMAIL = "";
    public static final String DEFAULT_IP_STR = "";
    public static final String DEFAULT_MOBILE = "";
    public static final String DEFAULT_MODULE_NAME = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer begin_time;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer check_login;
    @ProtoField(tag = 27)
    public final CommonReq common;
    @ProtoField(tag = 25, type = Message.Datatype.STRING)
    public final String cookie;
    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String email;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer end_time;
    @ProtoField(tag = 6, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 12, type = Message.Datatype.UINT32)
    public final Integer ip_int;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String ip_str;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer is_thread;
    @ProtoField(tag = 18, type = Message.Datatype.UINT32)
    public final Integer login;
    @ProtoField(tag = 23, type = Message.Datatype.STRING)
    public final String mobile;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String module_name;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer need_content;
    @ProtoField(tag = 21, type = Message.Datatype.UINT32)
    public final Integer no_un;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer offset;
    @ProtoField(tag = 26, type = Message.Datatype.UINT32)
    public final Integer pn;
    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer rn;
    @ProtoField(tag = 16, type = Message.Datatype.UINT32)
    public final Integer smile_grade;
    @ProtoField(tag = 15, type = Message.Datatype.UINT32)
    public final Integer st_param;
    @ProtoField(tag = DealIntentService.CLASS_TYPE_GROUP_EVENT, type = Message.Datatype.UINT32)
    public final Integer st_type;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer subtype;
    @ProtoField(tag = 17, type = Message.Datatype.UINT32)
    public final Integer support_noun;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long uid;
    @ProtoField(tag = 19, type = Message.Datatype.UINT32)
    public final Integer user_id;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String user_name;
    public static final Long DEFAULT_UID = 0L;
    public static final Integer DEFAULT_RN = 0;
    public static final Integer DEFAULT_OFFSET = 0;
    public static final Integer DEFAULT_IS_THREAD = 0;
    public static final Integer DEFAULT_NEED_CONTENT = 0;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_BEGIN_TIME = 0;
    public static final Integer DEFAULT_END_TIME = 0;
    public static final Integer DEFAULT_SUBTYPE = 0;
    public static final Integer DEFAULT_CHECK_LOGIN = 0;
    public static final Integer DEFAULT_IP_INT = 0;
    public static final Integer DEFAULT_ST_TYPE = 0;
    public static final Integer DEFAULT_ST_PARAM = 0;
    public static final Integer DEFAULT_SMILE_GRADE = 0;
    public static final Integer DEFAULT_SUPPORT_NOUN = 0;
    public static final Integer DEFAULT_LOGIN = 0;
    public static final Integer DEFAULT_USER_ID = 0;
    public static final Integer DEFAULT_NO_UN = 0;
    public static final Integer DEFAULT_PN = 0;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.uid == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = builder.uid;
            }
            if (builder.rn == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = builder.rn;
            }
            if (builder.offset == null) {
                this.offset = DEFAULT_OFFSET;
            } else {
                this.offset = builder.offset;
            }
            if (builder.is_thread == null) {
                this.is_thread = DEFAULT_IS_THREAD;
            } else {
                this.is_thread = builder.is_thread;
            }
            if (builder.need_content == null) {
                this.need_content = DEFAULT_NEED_CONTENT;
            } else {
                this.need_content = builder.need_content;
            }
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.begin_time == null) {
                this.begin_time = DEFAULT_BEGIN_TIME;
            } else {
                this.begin_time = builder.begin_time;
            }
            if (builder.end_time == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = builder.end_time;
            }
            if (builder.subtype == null) {
                this.subtype = DEFAULT_SUBTYPE;
            } else {
                this.subtype = builder.subtype;
            }
            if (builder.check_login == null) {
                this.check_login = DEFAULT_CHECK_LOGIN;
            } else {
                this.check_login = builder.check_login;
            }
            if (builder.ip_str == null) {
                this.ip_str = "";
            } else {
                this.ip_str = builder.ip_str;
            }
            if (builder.ip_int == null) {
                this.ip_int = DEFAULT_IP_INT;
            } else {
                this.ip_int = builder.ip_int;
            }
            if (builder.module_name == null) {
                this.module_name = "";
            } else {
                this.module_name = builder.module_name;
            }
            if (builder.st_type == null) {
                this.st_type = DEFAULT_ST_TYPE;
            } else {
                this.st_type = builder.st_type;
            }
            if (builder.st_param == null) {
                this.st_param = DEFAULT_ST_PARAM;
            } else {
                this.st_param = builder.st_param;
            }
            if (builder.smile_grade == null) {
                this.smile_grade = DEFAULT_SMILE_GRADE;
            } else {
                this.smile_grade = builder.smile_grade;
            }
            if (builder.support_noun == null) {
                this.support_noun = DEFAULT_SUPPORT_NOUN;
            } else {
                this.support_noun = builder.support_noun;
            }
            if (builder.login == null) {
                this.login = DEFAULT_LOGIN;
            } else {
                this.login = builder.login;
            }
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.user_name == null) {
                this.user_name = "";
            } else {
                this.user_name = builder.user_name;
            }
            if (builder.no_un == null) {
                this.no_un = DEFAULT_NO_UN;
            } else {
                this.no_un = builder.no_un;
            }
            if (builder.portrait == null) {
                this.portrait = "";
            } else {
                this.portrait = builder.portrait;
            }
            if (builder.mobile == null) {
                this.mobile = "";
            } else {
                this.mobile = builder.mobile;
            }
            if (builder.email == null) {
                this.email = "";
            } else {
                this.email = builder.email;
            }
            if (builder.cookie == null) {
                this.cookie = "";
            } else {
                this.cookie = builder.cookie;
            }
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = builder.pn;
            }
            this.common = builder.common;
            return;
        }
        this.uid = builder.uid;
        this.rn = builder.rn;
        this.offset = builder.offset;
        this.is_thread = builder.is_thread;
        this.need_content = builder.need_content;
        this.forum_id = builder.forum_id;
        this.begin_time = builder.begin_time;
        this.end_time = builder.end_time;
        this.subtype = builder.subtype;
        this.check_login = builder.check_login;
        this.ip_str = builder.ip_str;
        this.ip_int = builder.ip_int;
        this.module_name = builder.module_name;
        this.st_type = builder.st_type;
        this.st_param = builder.st_param;
        this.smile_grade = builder.smile_grade;
        this.support_noun = builder.support_noun;
        this.login = builder.login;
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.no_un = builder.no_un;
        this.portrait = builder.portrait;
        this.mobile = builder.mobile;
        this.email = builder.email;
        this.cookie = builder.cookie;
        this.pn = builder.pn;
        this.common = builder.common;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataReq> {
        public Integer begin_time;
        public Integer check_login;
        public CommonReq common;
        public String cookie;
        public String email;
        public Integer end_time;
        public Long forum_id;
        public Integer ip_int;
        public String ip_str;
        public Integer is_thread;
        public Integer login;
        public String mobile;
        public String module_name;
        public Integer need_content;
        public Integer no_un;
        public Integer offset;
        public Integer pn;
        public String portrait;
        public Integer rn;
        public Integer smile_grade;
        public Integer st_param;
        public Integer st_type;
        public Integer subtype;
        public Integer support_noun;
        public Long uid;
        public Integer user_id;
        public String user_name;

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.uid = dataReq.uid;
                this.rn = dataReq.rn;
                this.offset = dataReq.offset;
                this.is_thread = dataReq.is_thread;
                this.need_content = dataReq.need_content;
                this.forum_id = dataReq.forum_id;
                this.begin_time = dataReq.begin_time;
                this.end_time = dataReq.end_time;
                this.subtype = dataReq.subtype;
                this.check_login = dataReq.check_login;
                this.ip_str = dataReq.ip_str;
                this.ip_int = dataReq.ip_int;
                this.module_name = dataReq.module_name;
                this.st_type = dataReq.st_type;
                this.st_param = dataReq.st_param;
                this.smile_grade = dataReq.smile_grade;
                this.support_noun = dataReq.support_noun;
                this.login = dataReq.login;
                this.user_id = dataReq.user_id;
                this.user_name = dataReq.user_name;
                this.no_un = dataReq.no_un;
                this.portrait = dataReq.portrait;
                this.mobile = dataReq.mobile;
                this.email = dataReq.email;
                this.cookie = dataReq.cookie;
                this.pn = dataReq.pn;
                this.common = dataReq.common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}
